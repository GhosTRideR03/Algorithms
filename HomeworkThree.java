package Homeworks.Algorithms_Homeworks.homeworkThree;

public class HomeworkThree {
    private static int counterIteration = 0;
//    private static int counterRecursion = 0;

    public static void main(String[] args) {
        System.out.println(fibonacciRecursion(10));
        System.out.println("for fibonacci recursion " + counterIteration + " times");
        System.out.println(fibonacciRecursion(20));
        System.out.println("for fibonacci recursion " + counterIteration + " times");
        counterIteration =0;
        System.out.println(fibonacciRecursion(30));
        System.out.println("for fibonacci recursion " + counterIteration + " times");
        counterIteration =0;
        System.out.println(fibonacciIteration(10));
        System.out.println("for fibonacci iteration  " + counterIteration + " times");
        counterIteration =0;
        System.out.println(fibonacciIteration(20));
        System.out.println("for fibonacci iteration  " + counterIteration + " times");
        counterIteration =0;
        System.out.println(fibonacciIteration(30));
        System.out.println("for fibonacci iteration  " + counterIteration + " times");
        counterIteration =0;


    }

    static double fibonacciRecursion(int n) {
        counterIteration++;
        if (n <= 1) {
            return (n -1) * -1;
        } else {
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }

    }

    static double fibonacciIteration(int n) {
        int[] fibonacciNumbers = new int[n];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers    [i - 2];
            counterIteration++;
        }
        return fibonacciNumbers[n - 1];
    }

}

