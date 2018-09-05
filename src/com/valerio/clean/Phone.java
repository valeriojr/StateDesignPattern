package com.valerio.clean;

public class Phone {
    private State currentState;

    public Phone(State state){
        currentState = state;
    }

    public void alarm(){
        currentState.alarm();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
