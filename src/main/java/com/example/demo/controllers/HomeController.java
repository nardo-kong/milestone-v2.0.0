package com.example.demo.controllers;
import com.example.demo.Entities.FinalTable;
import com.example.demo.Entities.Flight;
import com.example.demo.Entities.Step;
import com.example.demo.Repositories.FinalTableRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private FinalTableRepository finalTableRepository;

    // Create some dummy data
    /*
    List<Step> steps1 = Arrays.asList(
        new Step("awb_accept", "3", "5"),
        new Step("build up", "2", "4"),
        new Step("handover", "0", "3"),
        new Step("loading", "0", "2"),
        new Step("departure", "0", "1")
    );
    List<Step> steps2 = Arrays.asList(
        new Step("awb_accept", "4", "5"),
        new Step("build up", "3", "4"),
        new Step("handover", "1", "3"),
        new Step("loading", "0", "2"),
        new Step("departure", "0", "1")
    );
    List<Step> steps3 = Arrays.asList(
        new Step("awb_accept", "5", "5"),
        new Step("build up", "4", "4"),
        new Step("handover", "3", "3"),
        new Step("loading", "2", "2"),
        new Step("departure", "1", "1")
    );
    List<Flight> flights = Arrays.asList(
            new Flight("FLT1", "LEG1", "10:00", 50, "10:05", steps1),
            new Flight("FLT2", "LEG2", "11:00", 75, "11:05", steps2),
            new Flight("FLT3", "LEG3", "12:00", 100, "12:05", steps3)
        );
    */
    

    @GetMapping("/")
    public ModelAndView getFlights() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        List<FinalTable> flights = finalTableRepository.findAll();
        System.out.println("Number of flights: " + flights.size());
        modelAndView.addObject("flights", flights);

        return modelAndView;
    }

}