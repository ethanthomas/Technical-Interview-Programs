/**
 * Created by user on 10/11/14.
 */
public class OnetoOneHundred {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 100) {

            if (i % 3 == 0)
            System.out.println("Crackle");
            if (i % 5 == 0)
                System.out.println("Pop");
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("CracklePop");
            else
                System.out.println(i);

            i++;
        }
    }
}
