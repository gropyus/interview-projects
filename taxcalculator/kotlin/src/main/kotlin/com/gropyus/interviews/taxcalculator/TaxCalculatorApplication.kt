package com.gropyus.interviews.taxcalculator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaxCalculatorApplication

fun main(args: Array<String>) {
    runApplication<TaxCalculatorApplication>(*args)
}
