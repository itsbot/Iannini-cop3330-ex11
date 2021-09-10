/*
 *  UCF COP3330 Fall 2021 Exercise 11 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise11;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many euros are you exchanging?");
        int euros = sc.nextInt();

        System.out.println("What is the exchange rate?");
        double eRate = sc.nextDouble();

        DecimalFormat df = new DecimalFormat("#.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        double dollars = (euros * eRate);

        System.out.println(euros+" euros at an exchange rate of "+eRate+" is "+df.format(dollars)+" U.S. dollars.");
    }
}
