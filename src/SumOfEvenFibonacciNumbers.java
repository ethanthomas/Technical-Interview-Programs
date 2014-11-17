/**
 * Created by user on 11/11/14.
 */
public class SumOfEvenFibonacciNumbers {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {

            System.out.println(i + ": " + fibonacci(i));

            if (fibonacci(i) % 2 == 0)
                sum += fibonacci(i);

        }

        System.out.println(sum);
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }




}

