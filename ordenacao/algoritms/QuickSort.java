package ordenacao.algoritms;

import ordenacao.Sorter;

public class QuickSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int[] sorted = elements.clone();
        quickSort(sorted, 0, sorted.length - 1);
        return sorted;
    }

    private void quickSort(int[] elements, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(elements, left, right);
            quickSort(elements, left, pivotIndex - 1);
            quickSort(elements, pivotIndex + 1, right);
        }
    }

    private int partition(int[] elements, int left, int right) {
        int pivotIndex = choosePivot(left, right);
        int pivotValue = elements[pivotIndex];

        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (elements[i] < pivotValue) {
                int temp = elements[i];
                elements[i] = elements[storeIndex];
                elements[storeIndex] = temp;
                storeIndex++;
            }
        }
        elements[right] = elements[storeIndex];
        elements[storeIndex] = pivotValue;

        return storeIndex;
    }

    private int choosePivot(int left, int right) {
        return (left + right) / 2;
    }

    @Override
    public String getName() {
        return "QuickSort";
    }

}
