package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int[] sorted = elements.clone();
        
        for (int i = 1; i < sorted.length; i++) {
            int current = sorted[i];
            int j = i - 1;
            while (j >= 0 && sorted[j] > current) {
                sorted[j + 1] = sorted[j];
                j--;
            }
            sorted[j + 1] = current;
        }
        
        return sorted;
    }



    @Override
    public String getName() {
        return "InsertionSort";
    }

}
