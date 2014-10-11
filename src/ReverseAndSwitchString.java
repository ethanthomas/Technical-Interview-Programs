import java.util.Scanner;

/**
 * Created by user on 10/6/14.
 */
public class ReverseAndSwitchString {


    public static void main(String[] args){



        String original, reverse = "";
        String wbw = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your string:");

//------------- reversed --------------
        original = scanner.nextLine();

        for (int i = original.length() - 1; i >= 0; i--){

           reverse = reverse + original.charAt(i);

        }

        System.out.println("Your reversed string is: " + reverse);

// ------------ word by word -----------------
        String[] a;

        a = original.split(" ");


        for (int i = 0; i <= a.length - 1; i++){

            wbw =  a[i] + " " + wbw ;

        }

        System.out.println("\nYour reversed string word by word is: " + wbw);


    }

}