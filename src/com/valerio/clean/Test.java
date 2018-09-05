package com.valerio.clean;

import com.valerio.clean.States.*;

public class Test {
    public static void main(String args[]){
        Phone phone = new Phone(new Ringing());

        phone.alarm();

        phone.setCurrentState(new Silent());

        phone.alarm();

        phone.setCurrentState(new Vibration());

        phone.alarm();
    }
}
