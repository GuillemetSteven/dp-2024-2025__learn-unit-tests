package fr.anthonyquere.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static List<String> startFizzBuzz(int count) {

        List<String> res = new ArrayList<>();

        for (int i = 1; i <= count; i++){
            if(i % 15 == 0){
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 ==0) {
                res.add("Buzz");
            }
            else {
                res.add(Integer.toString(i));
            }
        }

        return  res;
    }
}
