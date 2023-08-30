package com.example.permanentie.controllers;

import com.example.permanentie.DTOs.RoosterDTO;
import com.example.permanentie.DTOs.TimeslotDTO;
import com.example.permanentie.creationDTOs.RoosterCreationDTO;
import com.example.permanentie.creationDTOs.TimeslotCreationDTO;
import com.example.permanentie.services.MultiException;
import com.example.permanentie.services.MultiService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class MultiController {

    private MultiService multiService;

    @GetMapping("/usernames")
    public Map<Integer, String> getUsernames(@RequestParam Integer userId, @RequestParam Integer groupId) {
        return multiService.getUsernames(userId, groupId);
    }

    @GetMapping("/roosters")
    public Set<RoosterDTO> getRoosters(@RequestParam Integer userId, @RequestParam Integer groupId) {
        return multiService.getRoosters(userId, groupId);
    }

    @GetMapping("/roosters/date")
    public RoosterDTO getRoostersIncDate(@RequestParam Integer userId, @RequestParam Integer groupId, @RequestParam LocalDate localDate) {
        return multiService.getRoosters(userId, groupId, localDate);
    }

    @GetMapping("/roosters/upcoming")
    public Set<RoosterDTO> getRoostersUpcoming(@RequestParam Integer userId, @RequestParam Integer groupId) {
        return multiService.getRoostersUpcoming(userId, groupId);
    }

    @PutMapping("/roosters/add")
    public RoosterDTO addRooster(@RequestParam Integer userId, @RequestParam Integer groupId, @RequestBody RoosterCreationDTO roosterCreationDTO) {
        return multiService.addRooster(userId, groupId, roosterCreationDTO);
    }

    @DeleteMapping("/roosters/del")
    public RoosterDTO delRooster(@RequestParam Integer userId, @RequestParam Integer groupId, @RequestParam Integer roosterId) {
        return multiService.delRooster(userId, groupId, roosterId);
    }

    @GetMapping("/rooster/timeslots")
    public Set<TimeslotDTO> getTimeslots(@RequestParam Integer userId, @RequestParam Integer groupId, @RequestParam Integer roosterId) {
        return multiService.getTimeslots(userId, groupId, roosterId);
    }

    @PutMapping("/timeslot/add")
    public TimeslotDTO addTimeslot(@RequestParam Integer userId, @RequestParam Integer groupId, @RequestBody TimeslotCreationDTO timeslotCreationDTO) {
        return multiService.addTimeslot(userId, groupId, timeslotCreationDTO);
    }

    @DeleteMapping("/timeslot/del")
    public TimeslotDTO delTimeslot(@RequestParam Integer userId, @RequestParam Integer groupId, @RequestParam Integer timeslotId) {
        return multiService.delTimeslot(userId, groupId, timeslotId);
    }

    @PutMapping("/timeslot/user/add")
    public TimeslotDTO addTimeslotUser(@RequestParam Integer userId, @RequestParam Integer groupId, @RequestParam Integer timeslotId) {
        return multiService.addTimeslotUser(userId, groupId,timeslotId);
    }

    @DeleteMapping("/timeslot/user/del")
    public TimeslotDTO delTimeslotUser(@RequestParam Integer userId, @RequestParam Integer groupId, @RequestParam Integer timeslotId) {
        return multiService.delTimeslotUser(userId, groupId, timeslotId);
    }





















    @ResponseStatus(HttpStatus.BAD_REQUEST )
    @ExceptionHandler({ MultiException.class})
    public String handleServiceExceptions(MultiException ex) {
        return ex.getMessage();
    }

}
