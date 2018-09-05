package com.valerio.clean.States;

import com.valerio.clean.State;

/**
 * Created by alunoic on 05/09/18.
 */
public class Ringing implements State {
    @Override
    public void alarm() {
        System.out.println("PI... PI... PI...");
    }
}
