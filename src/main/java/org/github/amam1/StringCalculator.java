package org.github.amam1;


public class StringCalculator {

    public int add(String number) {

        if(number.equals("")){
            return 0;
        }
        return Integer.parseInt(number);

    }
}
