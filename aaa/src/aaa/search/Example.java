package aaa.search;

import java.util.Arrays;

import aaa.ArraySearch;

public class Example implements Comparable<Example>{//setter getter는 편의상 생략

	int id;
	String name;
	
	@Override
	public int compareTo(Example o) {
		// TODO Auto-generated method stub
		return new Integer(this.id).compareTo(o.id);
		//
	}
	
	public int compareToName(Example o) {
		return this.name.compareTo(o.name);
	}

	public Example(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}
	
	
	public static void main(String[] args) {
		Example [] aaa = new Example [10];
		Example ex;
		for (int i = 0; i < aaa.length; i++) {
			aaa[i] =new Example(1+(6+i)%aaa.length,"name"+i);
		}
		ex = aaa[6];
		Arrays.sort(aaa);
		System.out.println(Arrays.asList(aaa));
		System.out.println(
		new ArraySearch().binarySearch(ex, aaa)
				);
		
	}

	
	
}
