package HW;
import java.util.Scanner;
public class Exercise4 {
    //Въведете 3 променливи от клавиатурата – брой работни часове (целочислен тип),
    // сума пари (число
    //с плаваща запетая), дали е почивен ден – булев тип.
    // Съставете програма, която взема решения на базата на тези данни по следния начин:
    //ако не е почивен ден ще работя
    //ако имам пари и е почивен ден ще отида на кино
    //ако нямам – ще стоя вкъщи и ще гледам телевизия
    //ако е почивен ден
    //ако имам по-малко от 10 лв ще отида за сладолед
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter working hours:");
        int workingHours = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the amount of money");
        double moneySum = Double.parseDouble(sc.nextLine());
        System.out.println("Enter true or false ,if it is a weekend or not ");
        boolean isItWeekend = sc.nextBoolean();

        if(isItWeekend == false){
            System.out.println("I will work");
        }else{
            if(moneySum>0){
                System.out.println("I will go to the cinema!");
            }
            else if (moneySum<10){
                    System.out.println("I will buy ice cream!");
                }
            else {
                System.out.println("I will stay at home");
            }
        }

    }
}
