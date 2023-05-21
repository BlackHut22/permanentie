package com.example.permanentie.services;


import com.example.permanentie.DTOMappers.RoosterDTOMapper;
import com.example.permanentie.DTOMappers.TimeslotDTOMapper;
import com.example.permanentie.DTOs.RoosterDTO;
import com.example.permanentie.DTOs.TimeslotDTO;
import com.example.permanentie.models.Group;
import com.example.permanentie.models.Rooster;
import com.example.permanentie.models.Timeslot;
import com.example.permanentie.models.User;
import com.example.permanentie.creationDTOs.RoosterCreationDTO;
import com.example.permanentie.creationDTOs.TimeslotCreationDTO;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class MultiService {
    private UserService userService;
    private GroupService groupService;
    private RoosterService roosterService;
    private TimeslotService timeslotService;

    private void isUserInGroup(User user, Group group){
        if (!user.getGroup().equals(group)) throw new MultiException("User not in group");
    }

    private void isRoosterInGroup(Rooster rooster, Group group){
        if (!rooster.getGroup().equals(group)) throw new MultiException("Rooster not in group");
    }

    private void isTimeslotInGroup(Timeslot timeslot, Group group){
        if (!timeslot.getRooster().getGroup().equals(group)) throw new MultiException("Timeslot not in group");
    }

    public Set<RoosterDTO> getRoosters(Integer userId, Integer groupId) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
        Set<Rooster> roosters = group.getRoosters();
        return roosters.stream().map(RoosterDTOMapper::toDTO).collect(Collectors.toSet());
    }

    public Set<RoosterDTO> getRoosters(Integer userId, Integer groupId, LocalDate localDate) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
        Set<Rooster> roosters = roosterService.getRoostersIncDate(group, localDate);
        return roosters.stream().map(RoosterDTOMapper::toDTO).collect(Collectors.toSet());
    }

    public Set<RoosterDTO> getRoostersUpcoming(Integer userId, Integer groupId) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
        Set<Rooster> roosters = roosterService.getRoostersUpcoming(group);
        return roosters.stream().map(RoosterDTOMapper::toDTO).collect(Collectors.toSet());
    }

    public RoosterDTO addRooster(Integer userId, Integer groupId, RoosterCreationDTO roosterCreationDTO) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
        Rooster rooster = RoosterDTOMapper.toEntity(roosterCreationDTO);
        isRoosterInGroup(rooster, group);
        group.getRoosters().add(rooster);
        roosterService.save(rooster);
        groupService.save(group);
        return RoosterDTOMapper.toDTO(rooster);
    }

    public RoosterDTO delRooster(Integer userId, Integer groupId, Integer roosterId) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
        Rooster rooster = roosterService.getRooster(roosterId);
        isRoosterInGroup(rooster, group);
        group.getRoosters().remove(rooster);
        roosterService.delete(rooster);
        groupService.save(group);
        return RoosterDTOMapper.toDTO(rooster);
    }

    public Set<TimeslotDTO> getTimeslots(Integer userId, Integer groupId, Integer roosterId) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
        Rooster rooster = roosterService.getRooster(roosterId);
        isRoosterInGroup(rooster, group);
        Set<Timeslot> timeslots = rooster.getTimeslots();
        return timeslots.stream().map(TimeslotDTOMapper::toDTO).collect(Collectors.toSet());
    }

    public TimeslotDTO addTimeslot(Integer userId, Integer groupId, TimeslotCreationDTO timeslotCreationDTO) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
        Rooster rooster = roosterService.getRooster(timeslotCreationDTO.roosterId());
        isRoosterInGroup(rooster, group);
        Timeslot timeslot = TimeslotDTOMapper.toEntity(timeslotCreationDTO);
        rooster.getTimeslots().add(timeslot);
        timeslotService.save(timeslot);
        roosterService.save(rooster);
        return TimeslotDTOMapper.toDTO(timeslot);
    }

    public TimeslotDTO delTimeslot(Integer userId, Integer groupId, Integer timeslotId) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
        Timeslot timeslot = timeslotService.getTimeslot(timeslotId);
        TimeslotDTO tDTO = TimeslotDTOMapper.toDTO(timeslot);
        isTimeslotInGroup(timeslot, group);
        timeslot.getRooster().getTimeslots().remove(timeslot);
        timeslotService.delete(timeslot);
        roosterService.save(timeslot.getRooster());
        return tDTO;
    }

    public TimeslotDTO addTimeslotUser(Integer userId, Integer groupId, Integer timeslotId) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
        Timeslot timeslot = timeslotService.getTimeslot(timeslotId);
        isTimeslotInGroup(timeslot, group);
        timeslot.getUsers().add(user);
        user.getTimeslots().add(timeslot);
        timeslotService.save(timeslot);
        userService.save(user);
        return TimeslotDTOMapper.toDTO(timeslot);
    }

    public TimeslotDTO delTimeslotUser(Integer userId, Integer groupId, Integer timeslotId) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
        Timeslot timeslot = timeslotService.getTimeslot(timeslotId);
        isTimeslotInGroup(timeslot, group);
        timeslot.getUsers().remove(user);
        user.getTimeslots().remove(timeslot);
        timeslotService.save(timeslot);
        userService.save(user);
        return TimeslotDTOMapper.toDTO(timeslot);
    }



}
