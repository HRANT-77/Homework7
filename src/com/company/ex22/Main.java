package com.company.ex22;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            DistanceConverter distanceConverter = new DistanceConverter();

            do {
                System.out.println("Input distance ");
                double k=scanner.nextDouble();
                distanceConverter.setDist(k) ;
                System.out.println("———————- MENU —————-\n" +
                        "For converting miles to meter      input 1\n" +
                        "For converting meter to miles      input 2\n" +
                        "For converting inch to centimeter  input 3\n" +
                        "For converting centimeter to inch  input 4\n" +
                        "For Exit                           input 5\n" +
                        "————————————————");
                int num = scanner.nextInt();
                if (num == 1) {
                    System.out.println(k +" mile = "+distanceConverter.convertMilesToMeters()+" meter");
                }
                if (num == 2) {
                    System.out.println(k+" meter = "+distanceConverter.convertMetersToMiles()+" miles");
                }
                if (num == 3) {
                    System.out.println(k+" inch = "+distanceConverter.convertInchToCentimeter()+" centimeter");
                }
                if (num == 4) {
                    System.out.println(k+" centimeter = "+distanceConverter.convertCentimeterToInch()+" inch");
                }
                if (num == 5) {
                    break;
                }
            } while (true);
        }
    }

