package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        int sum = 0;
        int a = 0;


        for (int i = 0; i < lengthOfLastNumber; i++) {

            a = 9 + 10 * a;

            sum += a;
        }

        System.out.println(sum);


    }
}
