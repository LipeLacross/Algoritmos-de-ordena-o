package ordenacao.algoritms;

import ordenacao.Sorter;

public class SelectionSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int[] sorted = elements.clone();

        for (int i = 0; i < sorted.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[j] < sorted[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = sorted[i];
                sorted[i] = sorted[minIndex];
                sorted[minIndex] = temp;
            }
        }

        return sorted;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }
}
