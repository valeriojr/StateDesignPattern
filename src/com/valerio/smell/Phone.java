package com.valerio.smell;

/**
 * Created by alunoic on 05/09/18.
 */
public class Phone {
    public int state;

    public void alarm(){
        if(state == 1){
            System.out.println("PI... PI... PI...");
        }else if(state == 2){
            System.out.println("BRUMMM... BRUMM... BRUMMM...");
        }else if(state == 3){
            System.out.println("... ... ...");
        }
    }

}
