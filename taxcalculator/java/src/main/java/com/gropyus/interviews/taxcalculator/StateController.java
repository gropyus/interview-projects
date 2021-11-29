package com.gropyus.interviews.taxcalculator;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController()
@RequestMapping("/states")
public class StateController {

    private final List<String> states = List.of("UT", "NV", "TX", "AL");
    private final Map<String, Double> taxRates = new HashMap<>();

    @GetMapping()
    public StatesResponse listStates() {
        return new StatesResponse(states);
    }

    @PostMapping(path = "/{state}/tax", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateTax(@RequestBody  Double taxValue, @PathVariable String state) {
        taxRates.put(state, taxValue);
        return ResponseEntity.of(Optional.of("Success"));
    }
}
