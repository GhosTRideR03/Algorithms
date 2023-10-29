package Homeworks.Algorithms_Homeworks.homeworkTwo;

public class HomeworkTwo {
   /* task #1
    START
    READ number n O(1)
    IF n == 1 THEN return  O(1)
    FOR i = 1, i <= n, i + 1 O(n)
       FOR j = 1; j <= n, j + 1 O(1)
          print "*" O(1)
            BREAK O(1)
                          O(f(n)) = O(n)
     END

     */



    /*
    task #2
    START
    READ number n
    numbers i = 0, j = 0, a = 0
    FOR i = n/2, i <= n; i + 1  O(n/2)
       FOR j = 2, j <= n, j * 2 O(log n)
    a = a + n / 2
    END
    (log n) * (n/2) = O(log n * n)


    task #3
    START
    READ number n
    number a = 0
    FOR i = 0, i < n, i + 1 0(n)
      FOR j = n, j > i, j - 1 0(n-1) O ((n+1) * n) /2)
    a = a + i + j
            END
           O(n^2)

    task #4
    START
    READ number n
    numbers a = 0, i = n
    WHILE i > 0
    a = a + i
            i = i / 2
            O(log_2)n)
    END */

    public static void main(String[] args) {
        int n = 10;
        int a = 0, i = n;
        while (i>0) {
            a += i;
            i = i/2;
        }
    }

}
