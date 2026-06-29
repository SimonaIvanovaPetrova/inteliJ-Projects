package HW;

public class Exercise5 {
    public static void main(String[] args) {
        //Да се състави масив със следните стойности {10 12 1 8 4}.
        // След създаването на масива да се копират стойностите в нов масив
        int []numbers = {10,12,1,8,4};
        int [] cloningArray = new int [numbers.length];
        for (int i = 0; i < numbers.length ; i++) {
            cloningArray[i]= numbers[i];
        }
    }
}
