package Assignment;

import java.util.Scanner;


 public class RandomNumber {

    public int num1;
    public int num2;
    public int num3;

    public RandomNumber() {
        System.out.println("Enter 3 random No as id:");
        Scanner obj = new Scanner(System.in);
        try {
            num1 = obj.nextInt();
            num2 = obj.nextInt();
            num3 = obj.nextInt();
        } catch (Exception e) {
            System.out.println("Enter correct input");
        }
        ;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }
}


