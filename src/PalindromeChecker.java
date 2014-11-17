import java.util.Scanner;

/**
 * Created by user on 11/10/14.
 */

public class PalindromeChecker {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        if (scanner.nextInt() == 0){

            System.out.println("Enter a number between 10 and 999,999");
            palindrome(scanner.nextInt());

        } else if(scanner.nextInt() == 1) {

            System.out.println("Enter a string with a length between 2 and 6");
            palindrome(scanner.next());


        }
    }

    public static void palindrome(int a){

        int b, c, d, e, f, g;

        if (digitCheck(a) == 2) {

            b = (a % 10);

            c = ((a - (a % 10)) / 10) % 10;

//            System.out.println(b + " " + c + " " + d + " " + e + " " + f);

            if (b == c) {

                System.out.println(a + " is a palindrome");
                return;

            } else {

                System.out.println(a + " is not a palindrome");
                return;
            }

        } else if (digitCheck(a) == 3) {

            b = (a % 10);

            c = ((a - (a % 10)) / 10) % 10;

            d = ((a - (a % 100)) / 100) % 10;

//            System.out.println(b + " " + c + " " + d + " " + e + " " + f);

            if (b == d) {

                System.out.println(a + " is a palindrome");
                return;

            } else {

                System.out.println(a + " is not a palindrome");
                return;
            }

        } else if (digitCheck(a) == 4) {


            b = (a % 10);

            c = ((a - (a % 10)) / 10) % 10;

            d = ((a - (a % 100)) / 100) % 10;

            e = ((a - (a % 1000)) / 1000) % 10;

//            System.out.println(b + " " + c + " " + d + " " + e + " " + f);

            if (b == e && c == d) {

                System.out.println(a + " is a palindrome");
                return;

            } else {

                System.out.println(a + " is not a palindrome");
                return;
            }

        } else if (digitCheck(a) == 5) {

            b = (a %10);

            c = ((a - (a % 10)) / 10) % 10;

            d = ((a - (a % 100)) / 100) % 10;

            e = ((a - (a % 1000)) / 1000) % 10;

            f = ((a - (a % 10000)) / 10000) % 10;

//            System.out.println(b + " " + c + " " + d + " " + e + " " + f);

            if (b == f && c == e) {

                System.out.println(a + " is a palindrome");
                return;

            } else {

                System.out.println(a + " is not a palindrome");
                return;
            }

        } else if (digitCheck(a) == 6) {

            b = (a %10);

            c = ((a - (a % 10)) / 10) % 10;

            d = ((a - (a % 100)) / 100) % 10;

            e = ((a - (a % 1000)) / 1000) % 10;

            f = ((a - (a % 10000)) / 10000) % 10;

            g = ((a - (a % 100000)) / 100000) % 10;

//            System.out.println(b + " " + c + " " + d + " " + e + " " + f);

            if (b == g && c == f && d == e) {

                System.out.println(a + " is a palindrome");
                return;

            } else {

                System.out.println(a + " is not a palindrome");
                return;
            }

        } else if (a > 999999){

            System.out.println("Number is too large. Please enter a number between 10 and 999,999" );
            palindrome(scanner.nextInt());
        }


        return;

    }


    public static void palindrome(String s) {

       char[] a = s.toCharArray();

        if(s.length() == 2) {

            if (a[0] == a[1]){
                System.out.println(s + " is a palindrome");
                return;
            } else {
                System.out.println(s + " is not a palindrome");
            }

        } else if (s.length() == 3) {

            if (a[0] == a[2]){
                System.out.println(s + " is a palindrome");
                return;
            } else {
                System.out.println(s + " is not a palindrome");
            }

        } else if (s.length() == 4) {

            if (a[0] == a[3] && a[1] == a[2]){
                System.out.println(s + " is a palindrome");
                return;
            } else {
                System.out.println(s + " is not a palindrome");
            }

        } else if (s.length() == 5) {

            if (a[0] == a[4] && a[1] == a[3]){
                System.out.println(s + " is a palindrome");
                return;
            } else {
                System.out.println(s + " is not a palindrome");
            }

        } else if (s.length() == 6) {

            if (a[0] == a[5] && a[1] == a[4] && a[2] == a[3]){
                System.out.println(s + " is a palindrome");
                return;
            } else {
                System.out.println(s + " is not a palindrome");
            }

        } else {
            System.out.println("Please enter a string between 2 and 6 letters");
        }

    }

    public static int digitCheck(int a) {
        a = String.valueOf(a).length();
        return a;
    }

}
