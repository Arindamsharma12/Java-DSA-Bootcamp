package com.arindam;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Conditionals {
    public static void main(String[] args) {
        /*
            syntax of if statements:
            if(boolean expression T or F){
                // body
            } else{
                // do this
            }

        */
        int salary = 25400;
//        if(salary > 10000){
//            salary = salary + 2000;
//        } else{
//            salary = salary + 1000;
//        }

        // Multiple if else
        if(salary > 20000){
            salary += 3000;
        } else if(salary > 10000){
            salary += 2000;
        } else{
            salary += 1000;
        }

        System.out.println(salary);
    }
}