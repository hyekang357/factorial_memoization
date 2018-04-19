import java.util.*;

public class Memoized {

    private HashMap<Integer, Long> memo;

    Memoized() {
        memo = new HashMap<>();
        this.memo.put(0, 1L);
        this.memo.put(1, 1L);
    }

    long factorial(int n) {

        long result;

        if (this.memo.get(n) != null) {
            return this.memo.get(n);
        } else {
            result = factorial( n-1 ) * n;
            this.memo.put(n, result);
            return result;
        }

    }

}
