import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner (System.in);

        int lol = scn.nextInt();        

        for(int i = 1; i <= lol; i++) {
            
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + " fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println(i +" buzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}