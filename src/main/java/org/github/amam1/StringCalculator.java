package org.github.amam1;


import java.util.ArrayList;

public class StringCalculator {

    public int add(String number) {

        if(number.equals("")){
            return 0;
        }

        if(number.split(" ").length > 0){
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            String[] parts = number.split(" ");
            for(String num: parts){
                numbers.add(Integer.parseInt(num));
            }
            Integer sum = 0;
            for (Integer n: numbers){
                sum+=n;
            }
            return sum;
        }

        return Integer.parseInt(number);

    }


}
