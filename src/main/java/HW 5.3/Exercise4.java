package HW;

public class Exercise4 {
    //Задача 4
    //Напишете програма, която създава масив с 10 елемента от тип int
    // обходете масива:
    //с помоща на for loop
    //с помоща на while loop
    //Да се изведат елементите на екрана.
   public static void main(String[] args) {
       int []numbers = {2,3,4,7,8,9,10,6,3,23};
       int i=0;
       while (numbers.length>i){

           System.out.println(numbers[i]);
           i++;
       }


       /*;
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);
        }*/

    }
}
