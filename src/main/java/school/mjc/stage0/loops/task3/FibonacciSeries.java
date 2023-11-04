package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fib1 = 0;
        int fib2 = 1;

        System.out.println(fib1);
        System.out.println(fib2);

        for (int i = 2; i < lastFibonacci; i++) {

            int fib = fib1 + fib2;

            System.out.println(fib);

            fib1 = fib2;
            fib2 = fib;


        }


    }
}
