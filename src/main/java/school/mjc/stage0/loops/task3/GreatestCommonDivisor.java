package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

        int gcd = 1;

        if (first == 0 && second != 0) {
            System.out.println(second);


        } else if (first != 0 && second == 0) {
            System.out.println(first);
        } else if (first >= second) {

            for (int i = 1; i <= second; i++) {

                if (second % i == 0 && first % i == 0 && i > gcd) {
                    gcd = i;
                }

            }

        } else {

            for (int i = 1; i <= first; i++) {

                if (first % i == 0 && second % i == 0 && i > gcd) {
                    gcd = i;
                }

            }
        }

        System.out.println(gcd);


    }
}
