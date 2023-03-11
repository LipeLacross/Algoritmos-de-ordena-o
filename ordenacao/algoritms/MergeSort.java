package ordenacao.algoritms;

import ordenacao.Sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int[] sorted = elements.clone();
        mergeSort(sorted, 0, sorted.length - 1);
        return sorted;
    }

    private void mergeSort(int[] elements, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(elements, start, middle);
            mergeSort(elements, middle + 1, end);
            merge(elements, start, middle, end);
        }
    }

    private void merge(int[] elements, int start, int middle, int end) {
        int[] leftArray = new int[middle - start + 1];
        int[] rightArray = new int[end - middle];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = elements[start + i];
        }
        for (int j = 0; j < rightArray.length; j++) {
            rightArray[j] = elements[middle + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                elements[k] = leftArray[i];
                i++;
            } else {
                elements[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArray.length) {
            elements[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArray.length) {
            elements[k] = rightArray[j];
            j++;
            k++;
        }
    }

    @Override
    public String getName() {
        return "MergeSort";
    }

}
