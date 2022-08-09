package com.sparta.ge;

import java.util.zip.DataFormatException;

public class App
{
    public static void main( String[] args ) {
        /*int[] numbers = {1, 2, 3, 4};
        try {
            System.out.println(numbers[10]);
        } catch (IndexOutOfBoundsException e){
            System.err.println("You messed up!");
        } catch (ArithmeticException e){
            System.out.println("Another exception");
        }*/
        try {
            printNameInList();
        } catch (YouMessedUpException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printNameInList() throws YouMessedUpException {
        String[] words = {"Manish", "David"};
        if(words.length <= 3){
            throw new YouMessedUpException("Manish");
        }
    }
}
