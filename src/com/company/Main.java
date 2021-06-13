package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Take input from user for amount they need, interest on it and the time period they are borrowing in years
        System.out.print("Principal: ");
        int principal = input.nextInt();

        System.out.print("Annual Interest Rate: ");
        float interest = input.nextFloat();

        System.out.print("Period: ");
        byte period = input.nextByte();

        final byte percent = 100;
        final byte months_per_year = 12;
        // r is interest per month
        double r = (interest / percent) /months_per_year;
        // n = numbers of months the lender will be paying the loan
        int n = period * months_per_year;
        // calculate the mortgage per month
        double mortgage = principal * ((r * Math.pow(1 + r, n))/ (Math.pow(1+r,n)-1));
        // convert the mortgage calculated to currency value

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgage);
        System.out.println("Mortgage: " + result);

        
            }
}
