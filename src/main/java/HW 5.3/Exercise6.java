package HW;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {


        //Задача 6
        //Дадени са два масива със стойности {1, 2, 3} и  {1, 2, 3}
        // да се състави програма, която проверява дали масивите са еднакви
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 2, 3};
        if(Arrays.equals(firstArray,secondArray)){
            System.out.println("Equals");
        }else{
            System.out.println("Not equal.");
        }
    }
}
