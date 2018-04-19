package algo;

import java.util.*;

public class Main {


    public static void main(String[] args) {


        class Memoized {
            private Long[] memo;

            Memoized() {
                memo = new Long[21];
                memo[0] = 1L;
                memo[1] = 1L;
            }

            public long factorial(int n) {
                long result;
                if (this.memo[n] != null) return this.memo[n];
                else {
                    result = factorial( n-1 ) * n;
                    this.memo[n] = result;
                    return result;
                }
            }
        }

        // Warm up
        long recursive_answer = 0;
        recursive_answer = factorial(0);
        Memoized m = new Memoized();
        long memo_answer = m.factorial(0);

        long start_time, finish_time, start_time1, finish_time1;


        // Running the first time
        start_time = System.nanoTime();
        recursive_answer = factorial(20);
        finish_time = System.nanoTime();
        System.out.println("Recursive: " + (finish_time - start_time));

        start_time1 = System.nanoTime();
        memo_answer = m.factorial(20);
        finish_time1 = System.nanoTime();
        System.out.println("Memoization: " + (finish_time1 - start_time1));

        if (recursive_answer != memo_answer) {
            System.out.println("ERROR");
        }

        // Running the second time
        start_time = System.nanoTime();
        recursive_answer = factorial(19);
        finish_time = System.nanoTime();
        System.out.println("Recursive: " + (finish_time - start_time));

        start_time1 = System.nanoTime();
        memo_answer = m.factorial(19);
        finish_time1 = System.nanoTime();
        System.out.println("Memoization: " + (finish_time1 - start_time1));

        if (recursive_answer != memo_answer) {
            System.out.println("ERROR");
        }
    }

    static long factorial(int n) {
        long result;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            result = factorial( n-1 ) * n;
            return result;
        }
    }

}
