package main.java.sorts;

public class Sorts {
    //big 0(n^2)
    public void bubleSort(int[] mas) {
        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(mas[j] > mas[j + 1]) {
                    int buf = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = buf;
                }
            }
        }
    }


    //big 0(n^2)
    public void selectionSort(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            int min_i = i;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[min_i] > mas[j]) {
                    min_i = j;
                }
            }
            if (min_i != i) {
                int buff = mas[i];
                mas[i] = mas[min_i];
                mas[min_i] = buff;
            }
        }
    }

    //big 0(n^2)
    public void insertionSort(int[] mas) {
        for (int i = 1; i < mas.length; i++) {
            int buff = mas[i];
            for (int j = i - 1; j >= 0; j--) {
                if (buff > mas[j])
                    break;
                else {
                    mas[j + 1] = mas[j];
                    mas[j] = buff;
                }
            }
        }
    }

    //big O(n log n)
    public void quickSort(int[] mas, int first, int last) {
        int leftPosition = first;
        int rightPosition = last;
        int pivot = mas[(leftPosition + rightPosition) / 2];
        do {
            while (mas[leftPosition] < pivot) {
                leftPosition++;
            }
            while (mas[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int buff = mas[leftPosition];
                    mas[leftPosition] = mas[rightPosition];
                    mas[rightPosition] = buff;
                }
                leftPosition++;
                rightPosition--;
            }
        } while (leftPosition <= rightPosition);

        if (leftPosition < last) {
            quickSort(mas, leftPosition, last);
        }
        if (first < rightPosition) {
            quickSort(mas, first, rightPosition);
        }
    }

}
