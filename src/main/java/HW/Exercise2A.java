package HW;

import java.util.Scanner;

public class Exercise2A {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter 4 different numbers double or int type:");
            String numberA = sc.nextLine();
            String numberB = sc.nextLine();
            String numberC = sc.nextLine();
            String numberD = sc.nextLine();

            System.out.println("Number1 is: "+ numberA);
            System.out.println("Number2 is: "+ numberB);
            System.out.println("Number3 is: "+ numberC);
            System.out.println("Number4 is: "+ numberD);
            String temp =numberA;
            numberA=numberB;
            numberB=temp;
            temp=numberC;
            numberC=numberD;
            numberD=temp;
            System.out.println("Changed Number1 is: "+ numberA);
            System.out.println("Changed Number2 is: "+ numberB);
            System.out.println("Changed Number3 is: "+ numberC);
            System.out.println("Changed Number4 is: "+ numberD);

            int sumInt = 0;
            double sumDouble = 0.0;
            if(isItInt(numberA)){//then it is int and needs to be parse to double
                int numA=Integer.parseInt(numberA);
                sumDouble +=(double)numA;

            }else if (isItDouble(numberA)){
                //then it is double and have to pars it to int
                double numA= Double.parseDouble(numberA);
                sumInt += (int) numA;
            }else{
                System.out.println("not an integer or double value");
            }
            if(isItInt(numberB)){
                int numB=Integer.parseInt(numberB);
                sumDouble += (double) numB;
            }else if (isItDouble(numberB)){
                double numB= Double.parseDouble(numberB);
                sumInt += (int)numB;
            }else{
                System.out.println("not an integer or double value");
            }
            if(isItInt(numberC)){
                int numC=Integer.parseInt(numberC);

                sumDouble += (double)numC;
            }else if (isItDouble(numberC)){
                double numC= Double.parseDouble(numberC);
                sumInt +=(int)numC;
            }else{
                System.out.println("not an integer or double value");
            }
            if(isItInt(numberD)){
                int numD = Integer.parseInt(numberD);

                sumDouble += (double)numD;
            }else if(isItDouble(numberD)){
                double numD= Double.parseDouble(numberD);
                sumInt +=(int) numD;
            }else{
                System.out.println("not an integer or double value");
            }
            System.out.println("Sum of integers "+sumInt);
            System.out.println("Sum of doubles "+sumDouble);

        }
    public static boolean isItInt(String number){
        try {Integer.parseInt(number);
            return true;

        }catch (NumberFormatException e){
            return false;

        }
    }
    public static boolean isItDouble(String number){
        try {
            Double.parseDouble(number);
            return number.contains(".");

        }catch (NumberFormatException e){
            return false;

        }
    }
    }

