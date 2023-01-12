import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        byte b = 127;
        int i = Integer.MAX_VALUE;
        long l = 10L;

        float f = 12.34f;
        double d = 123.45;

        char c = 'a';

        String s = "hello";


        //array
        int [] a1 = new int[3];

        a1[0] = 5;
        a1[1] = 10;
        a1[2] = 16;

        //get a random number in Java
        double d2 = Math.random();
        System.out.println("Random number:" + d2);


        //foreach loop
        for( int e : a1) {
            System.out.println(e);
        }

        //classic for loop
        for(int j = 0; j < a1.length; j++) {
            System.out.println(a1[j]);
        }

        l = 10;

        //if statement
        if(l > 20 && l <= 30) {
            System.out.println("L is greater than 20");
        }else if (l > 30) {
            System.out.println("L is greater than 30");
        }else {
            System.out.println("L is less or equal to 20");
        }

        l = 5;

        //while loop
        while (l >= 0 ) {
            System.out.println(l);
            l--;
        }

        int k;

        //ternary statement.
        k = (l > 10L) ? 100 : -100;

        System.out.println(k);

        //input use scanner
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        System.out.println("Enter a number");
        int i1 = myObj.nextInt();
        System.out.println("You entered: " + i1);  // Output user input



    }
}
