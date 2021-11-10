package com.gropyus.interviews.taxcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/states")
public class StateController {
    @GetMapping()
    public StatesResponse listStates() {
        return new StatesResponse(List.of("UT", "NV", "TX", "AL"));
    }
}
