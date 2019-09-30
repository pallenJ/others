package aaa.graph;

import java.util.Comparator;

public class Node<T> implements Comparator<Node>, Comparable<Node>{//편의를 위해 setter getter 생략

	int no;
	T node;
	@Override
	public int compare(Node o1, Node o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		
		return (new Integer(this.no)).compareTo(o.no);
	}
	public Node(int no, T node) {
		this.no = no;
		this.node = node;
	}
	public Node(int no) {
		this.no = no;
	}
	
	@Override
	public String toString() {
		return "Node [no=" + no + ", node=" + node + "]";
	}

}
