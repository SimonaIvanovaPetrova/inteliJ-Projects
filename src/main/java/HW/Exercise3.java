package HW;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

        int temp =firstNumber;
        firstNumber=secondNumber;
        secondNumber=thirdNumber;
        thirdNumber=temp;
        System.out.println("First number is:"+firstNumber);
        System.out.println("Second number is:"+secondNumber);
        System.out.println("Third number is:"+thirdNumber);
        System.out.println((firstNumber+secondNumber)-thirdNumber);
        sc.close();
    }


}
