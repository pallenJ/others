package aaa;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	
	static void abc(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		/*
		 * List<Test> s = new ArrayList<>();
		 * 
		 * s.add(new Test("a", "a", "a")); s.add(new Test("b", "b", "b")); s.add(new
		 * Test("c", "c", "c"));
		 * 
		 * Map<String, Test> map = s.stream().collect(Collectors.toMap(Test::getAaa,
		 * Test::getTest )); Stream<Test> str = s.stream();
		 * System.out.println(str.collect(Collectors.toSet()));
		 */
		
		/*
		 * int num =1, max=342; String temp ; while(true) {
		 * 
		 * temp = String.format("%0"+(max+"").length()+"d", num);
		 * System.out.print("('title"+temp+"','user_"+temp+"','content"+temp+"')");
		 * if(++num>=max)break; System.out.print(", ");
		 * if(num%3==0)System.out.println(); }
		 */
		
		/*
		 * Object aaa = new String(); System.out.println(aaa instanceof Test);
		 */
		System.out.println("https://avsdfsf".replaceAll("^https?://", ""));

	}
	
	private String aaa;
	private String bbb;
	private String ccc;
	public String getAaa() {
		return aaa;
	}
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}
	public String getBbb() {
		return bbb;
	}
	public void setBbb(String bbb) {
		this.bbb = bbb;
	}
	public String getCcc() {
		return ccc;
	}
	public void setCcc(String ccc) {
		this.ccc = ccc;
	}
	public Test() {}
	public Test(String aaa, String bbb, String ccc) {
		super();
		this.aaa = aaa;
		this.bbb = bbb;
		this.ccc = ccc;
	}
	public Test getTest() {
		return this;
	}
	@Override
	public String toString() {
		return "Test [aaa=" + aaa + ", bbb=" + bbb + ", ccc=" + ccc + "]";
	}
	
}
