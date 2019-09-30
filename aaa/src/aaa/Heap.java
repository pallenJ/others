package aaa;

import java.util.Arrays;

public class Heap {
    int size;
    int heaps[];
 
    public Heap() {
        size = 0;
        heaps = new int[50];
    }
    
    public Heap(int heapSize) {
    	size = 0;
    	heaps = new int[heapSize];
    }
 
    public Heap(Integer [] arr) {
    	size = 0;
    	heaps = new int[50];

    	for (int i : arr) {
			this.insertHeap(i);
		}
    	
    }
    public Heap(int heapSize, Integer [] arr) {
    	size = 0;
    	heaps = new int[heapSize];
    	for (int i : arr) {
			this.insertHeap(i);
		}
    }
    
    public void insertHeap(int item) {
        int i = ++size;
 
        while ((i != 1) && (item > heaps[i / 2])) {
            heaps[i] = heaps[i / 2];
            i /= 2;
        }
        heaps[i] = item;
    }
 
    
    public int deleteHeap() {
        int parent, child;
        int item, tmp;
        item = heaps[1];
        tmp = heaps[size--];
        parent = 1;
        child = 2;
 
        while (child <= size) {
            if ((child < size) && (heaps[child] < heaps[child + 1]))
                child++;
 
            if (tmp >= heaps[child])
                break;
 
            heaps[parent] = heaps[child];
            parent = child;
            child *= 2;
        }
 
        heaps[parent] = tmp;
        return item;
    }
    
	
	  public static Integer[] heapSort(Integer[] arr) {
		  Heap heap = new Heap(arr);
	       for (int i = arr.length - 1; i >= 0; --i) {
	            arr[i] = heap.deleteHeap();
	        }
	       return arr;
	  }
	 
    
    public static void main(String[] args) {
    	
		System.out.println(
				Arrays.asList(//결과값을 보기위해 asList사용
						heapSort(new Integer [] {32,44,11,43,10,72,65})));
    	
	}
    
}

