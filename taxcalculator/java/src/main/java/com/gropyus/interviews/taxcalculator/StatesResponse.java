package com.gropyus.interviews.taxcalculator;

import java.util.List;

public class StatesResponse {
    private List<String> states;

    public List<String> getStates() {
        return states;
    }

    public void setStates(List<String> states) {
        this.states = states;
    }

    public StatesResponse() {
    }

    public StatesResponse(List<String> states) {
        this.states = states;
    }
}
