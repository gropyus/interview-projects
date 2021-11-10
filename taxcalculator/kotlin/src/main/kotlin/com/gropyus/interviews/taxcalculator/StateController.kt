package com.gropyus.interviews.taxcalculator

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/states")
class StateController {
    @GetMapping
    fun listStates(): List<String> {
        return listOf("UT", "NV", "TX", "AL")
    }
}
