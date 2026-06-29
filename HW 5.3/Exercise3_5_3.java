package HW_4_8;

import java.util.Scanner;

public class Exercise3_5_3 {
    public static void main(String[] args) {
        //Да се прочете масив от екрана с 5
        //числа по избор от тип double и да се отпечатат всички резултати
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 separate numbers");
       double []numbers = new double[5];
        for (int i = 0; i <5; i++) {
            numbers[i]=sc.nextDouble();
        }
        System.out.println("Array elements are :");

        for (int i = 0; i <5; i++) {
            System.out.println(numbers[i]);
        }
    }
}
