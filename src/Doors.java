/**
 * Created by user on 10/7/14.
 */
public class Doors {

    public static void main(String[] args) {


        int total = 100;
        boolean[] doors = new boolean[total];

        int a = 1;
        while (a <= 100) {

            for (int i = a - 1; i < doors.length; i +=a) {


                doors[i] = !doors[i];

                System.out.println(doors[i]);

            }
            a++;



        }



    }
}
