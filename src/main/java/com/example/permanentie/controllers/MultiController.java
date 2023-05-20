package com.example.permanentie.controllers;

import com.example.permanentie.models.Rooster;
import com.example.permanentie.models.Timeslot;
import com.example.permanentie.models.creationDTOs.RoosterCreationDTO;
import com.example.permanentie.models.creationDTOs.TimeslotCreationDTO;
import com.example.permanentie.services.MultiException;
import com.example.permanentie.services.MultiService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class MultiController {

    private MultiService multiService;

    @GetMapping("/roosters")
    public Set<Rooster> getRoosters(@RequestParam Integer userId, @RequestParam Integer groupId) {
        return multiService.getRoosters(userId, groupId);
    }

    @GetMapping("/roosters")
    public Rooster getRooster(@RequestParam Integer userId, @RequestParam Integer groupId, @RequestParam LocalDate localDate) {
        return multiService.getRooster(userId, groupId, localDate);
    }

    @GetMapping("/roosters/upcoming")
    public Set<Rooster> getRoostersUpcoming(@RequestParam Integer userId, @RequestParam Integer groupId) {
        return multiService.getRoostersUpcoming(userId, groupId);
    }

    @PutMapping("/roosters/add")
    public Rooster addRooster(@RequestParam Integer userId, @RequestParam Integer groupId, @RequestBody RoosterCreationDTO roosterCreationDTO) {
        return multiService.addRooster(userId, groupId, roosterCreationDTO);
    }

    @GetMapping("/rooster/timeslots")
    public Set<Timeslot> getTimeslots(@RequestParam Integer userId, @RequestParam Integer groupId, @RequestParam Integer roosterId) {
        return multiService.getTimeslots(userId, groupId, roosterId);
    }

    @PutMapping("/timeslot/add")
    public Timeslot addTimeslot(@RequestParam Integer userId, @RequestParam Integer groupId, @RequestBody TimeslotCreationDTO timeslotCreationDTO) {
        return multiService.addTimeslot(userId, groupId, timeslotCreationDTO);
    }

    @DeleteMapping("/timeslot/del")
    public Timeslot delTimeslot(@RequestParam Integer userId, @RequestParam Integer groupId, @RequestParam Integer timeslotId) {
        return multiService.delTimeslot(userId, groupId, timeslotId);
    }

    @PutMapping("/timeslot/user/add")
    public Timeslot addTimeslotUser(@RequestParam Integer userId, @RequestParam Integer groupId, @RequestParam Integer timeslotId) {
        return multiService.addTimeslotUser(userId, groupId,timeslotId);
    }

    @DeleteMapping("/timeslot/user/del")
    public Timeslot delTimeslotUser(@RequestParam Integer userId, @RequestParam Integer groupId, @RequestParam Integer timeslotId) {
        return multiService.delTimeslotUser(userId, groupId, timeslotId);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST )
    @ExceptionHandler({ MultiException.class})
    public String handleServiceExceptions(MultiException ex) {
        return ex.getMessage();
    }

}
