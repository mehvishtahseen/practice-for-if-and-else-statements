package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature;
        System.out.print("what is the temperature out today: ");
        temperature = scanner.nextInt();
        if (temperature > 65){
            System.out.println("it's hot outside");
        }else if (temperature >= 40 && temperature <= 65){
            System.out.println("beautiful day. Go out and have fun!");
        } else {
            System.out.println("it's cold today. Cover yourself properly before going out");
        }
            }
}
