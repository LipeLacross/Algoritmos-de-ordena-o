package ordenacao.algoritms;

import ordenacao.Sorter;

public class SelectionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        for (int i = 0; i < sorted.length; i++) {
            int min = i;
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[j] < sorted[min]) {
                    min = j;
                }
            }
            int temp = sorted[i];
            sorted[i] = sorted[min];
            sorted[min] = temp;
        }
        return sorted;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }
    /* 
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = selectionSort.sort(array);
        for (int i : array2) {
            System.out.println(i);
        }
    }*/
}