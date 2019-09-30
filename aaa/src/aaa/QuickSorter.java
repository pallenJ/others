package aaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSorter {
    public static void quickSort(List<Integer> list) {
        sort(list, 0, list.size() - 1);
        System.out.println(list);
    }

    private static void sort(List<Integer> list, int low, int high) {
        if (low >= high) return;

        int mid = partition(list, low, high);
        sort(list, low, mid - 1);
        sort(list, mid, high);
    }

    private static int partition(List<Integer> list, int low, int high) {
        int pivot = list.get((low + high) / 2);
        
        while (low <= high) {
            while (list.get(low) < pivot) low++;
            while (list.get(high) > pivot) high--;
            if (low <= high) {
               Collections.swap(list, low, high);
                low++;high--;
            }
        }
        return low;
    }
    public static void main(String[] args) {
				quickSort(
				new ArrayList<Integer>(Arrays.asList(132,211,31,914,53452,23,111,231,98,17,891)));
	}
}

