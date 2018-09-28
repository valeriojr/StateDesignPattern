package com.valerio.smell;

/**
 * Created by alunoic on 05/09/18.
 */
public class Test {
    public static void main(String args[]){
        Phone phone = new Phone();

        phone.state = 1;

        phone.alarm();

        phone.alarm();

        phone.state = 3;

        phone.alarm();

        phone.state = 2;

        phone.alarm();
    }
}

//Output
PI... PI... PI...
... ... ...
BRUMMM... BRUMMM... BRUMMM...
