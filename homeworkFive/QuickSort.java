package Homeworks.Algorithms_Homeworks.homeworkFive;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {1, 5, 4, 0, 10, 22, -4, -5, 25, 30, 44, 55, 43};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = array[left + (right - left) / 2];

        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }

        quickSort(array, left, j);
        quickSort(array, i, right);
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

