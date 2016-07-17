package org.github.amam1;


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String number) throws Exception {

        if (number.equals("")) {
            return 0;
        }

        System.out.println();

        Pattern pattern = Pattern.compile("(.*)-\\d(.*)");
        Matcher matcher = pattern.matcher(number);
        if(matcher.find()){
            throw new Exception("negative nor allowed");
        }

        Integer sum = 0;
        for (Integer n : convertStringToArrayOfIntegers(number)) {
            sum += n;
        }
        return sum;

    }


    private ArrayList<Integer> convertStringToArrayOfIntegers(String text) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        text = unifyNumberSeparators(text);

        String[] parts = text.split(" ");

        for (String num : parts) {
            numbers.add(Integer.parseInt(num));
        }

        return numbers;
    }

    private String unifyNumberSeparators(String text) {
        String cleanText = text
                //all no digits with -
                .replaceAll("[^\\d]", " ")
                .replaceAll(" +", " ")
                .trim();

        System.out.println(cleanText);
        return cleanText;
    }

}
