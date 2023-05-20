package com.example.permanentie.services;


import com.example.permanentie.models.Group;
import com.example.permanentie.models.Rooster;
import com.example.permanentie.models.Timeslot;
import com.example.permanentie.models.User;
import com.example.permanentie.models.creationDTOs.RoosterCreationDTO;
import com.example.permanentie.models.creationDTOs.TimeslotCreationDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Set;

@Service
public class MultiService {
    private UserService userService;
    private GroupService groupService;
    private RoosterService roosterService;
    private TimeslotService timeslotService;

    public void isUserInGroup(User user, Group group){
        if (user.getGroup().equals(group)) throw new MultiException("User not in group");
    }

    public Set<Rooster> getRoosters(Integer userId, Integer groupId) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
        return group.getRoosters();
    }

    public Rooster getRooster(Integer userId, Integer groupId, LocalDate localDate) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
        return roosterService.getRooster(group, localDate);
    }

    public Set<Rooster> getRoostersUpcoming(Integer userId, Integer groupId) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
        return roosterService.getRoostersUpcoming(group);
    }

    public Rooster addRooster(Integer userId, Integer groupId, RoosterCreationDTO roosterCreationDTO) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
    }

    public Set<Timeslot> getTimeslots(Integer userId, Integer groupId, Integer roosterId) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
    }

    public Timeslot addTimeslot(Integer userId, Integer groupId, TimeslotCreationDTO timeslotCreationDTO) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
    }

    public Timeslot delTimeslot(Integer userId, Integer groupId, Integer timeslotId) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
    }

    public Timeslot addTimeslotUser(Integer userId, Integer groupId, Integer timeslotId) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
    }

    public Timeslot delTimeslotUser(Integer userId, Integer groupId, Integer timeslotId) {
        User user = userService.getUser(userId);
        Group group = groupService.getGroup(groupId);
        isUserInGroup(user, group);
    }



}
