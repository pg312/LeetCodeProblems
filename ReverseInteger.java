package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ReverseInteger {
    public  Integer reverseInteger(Integer number) {
        Integer reverseNumber =0;
        while(number != 0){
            reverseNumber = reverseNumber *10+ number%10;
            number /= 10;
        }
        return reverseNumber;
    }
}