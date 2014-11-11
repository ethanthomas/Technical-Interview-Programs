
public class RandomBetweenTwoNumbers {

    public static void main(String[] args) {

        System.out.println(generate(0,10));

    }

    public static int generate(int min,int max) {

        return min + (int) (Math.random() * ((max - min) + 1));
    }


}