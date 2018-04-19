public class Recursive {

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
