package aaa;

import java.util.Arrays;

import aaa.search.Example;

public class ArraySearch {

	public static void main(String[] args) {
		ArraySearch arraySearch = new ArraySearch();
		
		int[] arr = {1,5,2,3,4};
		Object [] arr2 = {1,"2",null,false,2L,arr};
		/*
		 * System.out.println(arraySearch.linearSearchInteger(4, arr));
		 * System.out.println(arraySearch.linearSearchInteger(14, arr));
		 * 
		 * System.out.println(arraySearch.linearSearchObject(arr, arr2));
		 * System.out.println(arraySearch.linearSearchObject(1, arr2));
		 * System.out.println(arraySearch.linearSearchObject(null, arr2));
		 */

	}
	
	public int binarySearch(Example ex,Example []arr) {
		int first = 0, last = arr.length - 1, middle;
	    Arrays.sort(arr);//정렬된 상태에서만 사용 가능 하므로
	    while(first <= last){
	        if	   (arr[middle = (first + last) / 2].compareTo(ex)==0)return middle;
	        else if(arr[middle].compareTo(ex)>0)last = middle-1;
	        else 				first = middle + 1;
	    }	    
		return -1;
	}
	
	public int binarySearch(int num,int arr[]){
		
	    int first = 0, last = arr.length - 1, middle;
	    Arrays.sort(arr);//정렬된 상태에서만 사용 가능 하므로
	    
	    while(first <= last){
	        if	   (num == arr[middle = (first + last) / 2])return middle;
	        else if(num < arr[middle])last = middle-1;
	        else 				first = middle + 1;
	    }
	    return -1;
	}


	
	public int linearSearchInteger(int num, int []arr){
		for (int i = 0; i < arr.length; i++) {
			if(num== arr[i]) return i;
		}
	    return -1;
	}
	
	public int linearSearchObject(Object obj, Object[]arr ) {
		for (int i = 0; i < arr.length; i++) { 
			try {
			if(arr[i].equals(obj)) return i;
				} catch (NullPointerException e) {
			if(obj == null) return i;		
			}
		}
		return -1;
	}

}
