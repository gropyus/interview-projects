package com.gropyus.interviews.taxcalculator

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/states")
class StateController {

    private val states = listOf("UT", "NV", "TX", "AL")
    private val taxRates: MutableMap<String, Double> = mutableMapOf()

    @GetMapping
    fun listStates(): List<String> {
        return states
    }

    @PostMapping(path = ["/{state}/tax"], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun updateTax(@RequestBody taxValue: Double, @PathVariable state: String) {
        taxRates[state] = taxValue
    }
}
