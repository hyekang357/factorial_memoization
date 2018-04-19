
public class Main {

    public static void main(String[] args) {

        long recursive_answer = 0;
        long start_time = System.nanoTime();


        recursive_answer = Recursive.factorial(20);

//        for (int i = 0; i <= 20; i+=5) {
//            // largest factorial that can be performed is n = 20
//            recursive_answer = Recursive.factorial(i);
//        }
        long finish_time = System.nanoTime();

        System.out.println(recursive_answer);
        System.out.println("Recursive: " + (finish_time - start_time));

        long memo_answer = 0;
        long start_time1 = System.nanoTime();
        Memoized m = new Memoized();
//        for (int i = 0; i <= 20; i+=5) {
//            // largest factorial that can be performed is n = 20
//            memo_answer = m.factorial(i);
//        }

        memo_answer = m.factorial(20);

        long finish_time1 = System.nanoTime();

        System.out.println(memo_answer);
        System.out.println("Memoization: " + (finish_time1 - start_time1));


        ////////////////////////////////

        start_time = System.nanoTime();
        recursive_answer = Recursive.factorial(15);

//        for (int i = 0; i <= 20; i+=5) {
//            // largest factorial that can be performed is n = 20
//            recursive_answer = Recursive.factorial(i);
//        }
        finish_time = System.nanoTime();

        System.out.println(recursive_answer);
        System.out.println("Recursive: " + (finish_time - start_time));

        memo_answer = 0;
        start_time1 = System.nanoTime();
//        for (int i = 0; i <= 20; i+=5) {
//            // largest factorial that can be performed is n = 20
//            memo_answer = m.factorial(i);
//        }
        memo_answer = m.factorial(15);

        finish_time1 = System.nanoTime();

        System.out.println(memo_answer);
        System.out.println("Memoization: " + (finish_time1 - start_time1));







    }
}
