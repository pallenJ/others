package aaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEx {

	public static void main(String[] args) {
		//System.out.println(selectSort(Arrays.asList(new Integer[] { 4, 1, 5, 23, 12 })));
		/*
		 * int [] asas = { 91,231,442,4, 1, 5, 23, 12 }; List<Integer> aaa = new
		 * ArrayList<Integer>(); for (int val : asas) { aaa.add(val); }
		 * System.out.println(insertSort(aaa));
		 */
		System.out.println(insertSort( new ArrayList<Integer>(Arrays.asList(52,71,454,243,512))));
	}

    public static List<Integer> quickSort(List<Integer> list) {
        if (list.size() <= 1) return list;
        int pivot = list.get(list.size() / 2);

        List<Integer> lesserArr = new LinkedList<>();
        List<Integer> equalArr = new LinkedList<>();
        List<Integer> greaterArr = new LinkedList<>();

        for (int num : list) {
            if (num < pivot) lesserArr.add(num);
            else if (num > pivot) greaterArr.add(num);
            else equalArr.add(num);
        }

        return Stream.of(quickSort(lesserArr), equalArr, quickSort(greaterArr))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
	
	public static List<Integer> insertSort(List<Integer> list){
		List<Integer> rs = new ArrayList<Integer>();
		while(list.size()>0) {
			int idx = 0,val = list.get(0);
			for (Integer integer : rs) {
				if(integer>val) break;
				idx ++;
			}
			rs.add(idx,val);list.remove(0);
		}
		
		return rs;
	}
	
	public static List<Integer> selectSort(List<Integer> list) {
		List<Integer> sorted = new ArrayList<Integer>();
		int minIdx = 0;
		while (list.size() > 0) {

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) < list.get(minIdx))
					minIdx = i;
			}
			sorted.add(list.get(minIdx));
			list.remove(minIdx);
			minIdx = 0;
		}

		return sorted;
	}

	public static List<Integer> bubbleSort(List<Integer> list) {
		int size = list.size();
		for (int i = 0; i < size - 1; i++) {
			for (int j = size - 1; j > i; j--) {
				if (list.get(j - 1) > list.get(j)) {
					Collections.swap(list, j - 1, j);
				}
			}
		}
		return list;
	}

}
