package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {

        String s = "";
        s = s + t;

        int sum = 0;

        int n = s.length();
        int divider = 1;

        for (int i = 1; i < n; i++) {
            divider = divider * 10;

        }

        for (int i = 0; i < n; i++) {
            sum = sum + t / divider;

            t = t % divider;

            divider = divider / 10;

        }

        System.out.println(sum);


    }
}
