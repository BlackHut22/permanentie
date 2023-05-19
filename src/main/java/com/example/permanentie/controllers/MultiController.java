package com.example.permanentie.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MultiController {


    @GetMapping("/roosters/all")
    @GetMapping("/roosters/thisweek")
    @GetMapping("/roosters/nextweek")
    @GetMapping("/roosters/upcommingweeks")
    @GetMapping("/rooster/timeslots")
    @PutMapping("/timeslot/add")
    @DeleteMapping("/timeslot/del")
    @PutMapping("/timeslot/user/add")
    @DeleteMapping("/timeslot/user/del")


    //get roosters all
    //get roosters this week
    //get roosters next week
    //get roosters upcomming weeks
    //get timeslots for roosters
    //put timeslot for rooster
    //del timeslot for rooster
    //add user for timeslot
    //del user for timeslot
}
