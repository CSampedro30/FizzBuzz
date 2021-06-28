import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {

        Scanner scn = new Scanner (System.in);

        System.out.println("Input the length.");
        int length = scn.nextInt();
        System.out.println("Input the first number.");
        int flagOne = scn.nextInt();
        System.out.println("Input the second number.");
        int flagTwo = scn.nextInt();

        String out = "";

        for(int i = 1; i <= length; i++) {
            
            if (i % (flagOne * flagTwo) == 0) {
                out += "FizzBuzz ";
            } else if (i % flagOne == 0) {
                out += "Fizz ";
            } else if (i % flagTwo == 0) {
                out += "Buzz ";
            } else {
                out += i + " ";
            }
        }
        System.out.println(out.trim());
        scn.close();
    }
}