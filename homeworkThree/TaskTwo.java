package Homeworks.Algorithms_Homeworks.homeworkThree;

public class TaskTwo {
    static int[][] pic = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 0, 1, 1, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 1, 0},
            {0, 1, 0, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    static void draw() {
        for (int i = 0; i < pic.length; i++) {
            String line = "";
            for (int j = 0; j < pic[i].length; j++) {
                if (pic[i][j] == 1)
                    line += "██";
                else
                    line += "  ";
            }
            System.out.println(line);
            line = "";
        }
    }

    static void fill(int i, int j) {
        // BEGIN (write your solution here)
        if (pic[i][j] == 0) {
            pic[i][j] = 1;
            fill(i - 1, j);
            fill(i, j + 1);
            fill(i + 1, j);
            fill(i, j - 1);
        }
        // END
    }

    public static void main(String[] args) {
        System.out.println("Java");
        System.out.println("before:");
        draw();
        // 3,3 - точка принадлежащая замкнутой области
        fill(3, 3);
        System.out.println("after:");
        draw();
    }

}

