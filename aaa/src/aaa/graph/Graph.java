package aaa.graph;

import java.util.*;

public class Graph<T> {

	int nodeCnt;
	private Map<Integer, Node<T>> nodelist;// 숫자가 아닌 다른 객체 정보가 필요시.
	boolean vector = false; // 방향성 유무. 딱히 없으면
	private List<Integer>[] adj;

	public Graph(int nodeCnt) {
		this.nodeCnt = nodeCnt;
		this.clearAll();
	}

	public Graph(int nodeCnt, boolean vector) {
		this.nodeCnt = nodeCnt;
		this.vector = vector;
		this.clearAll();
	}

	public void addEdge(int n1, int n2) {
		addEdgeCheck(n1, n2, this.vector);
	}

	private void addEdgeCheck(int n1, int n2, boolean vc) {// 방향성 유무에 따라 분기
		adj[n1].add(n2);
		if (!vc)
			adj[n2].add(n1);// 방향성이 없을경우 양방향 취급
	}

	@SuppressWarnings("unchecked")
	public void clearAll() {// 첫 생성시
		nodelist = new HashMap<>();
		adj = new LinkedList[this.nodeCnt];
		for (int i = 0; i < this.nodeCnt; i++) {
			nodelist.put(i, new Node<T>(i));
			adj[i] = new LinkedList<>();
		}
	}

	public void clearEdge() {// node 생성후 edge 초기화
		if (nodelist == null || nodelist.size() != this.nodeCnt)
			return;
		for (Integer nodeNum : nodelist.keySet()) {
			adj[nodeNum] = new LinkedList<>();
		}
	}

	private void DFSUtil(int no, boolean visited[],List<Integer> rs) {
		visited[no] = true;
		//System.out.print(no + " ");
		rs.add(no);
		for (Iterator<Integer> itr = adj[no].iterator(); itr.hasNext();) {
			int tmp = itr.next();
			if (!visited[tmp])
				DFSUtil(tmp, visited,rs);
		}

	}

	public List<Integer> DFS(int no) {// 연결형
		List<Integer> rs = new ArrayList<>();//결과값 리턴을 위한 ArrayList
		boolean visited[] = new boolean[this.nodeCnt];
		if(no<0) {
			for (int i = 0; i < this.nodeCnt; i++) {
				if (visited[i] == false)
					DFSUtil(i, visited,rs);//연결이 안된건 따로 처리
			}
		}else {
			DFSUtil(no, visited,rs);
		}
		return rs;
	}

	public List<Integer> DFS() {// 비연결형
		return DFS(-1);
	}
	public static void main(String args[]) {
	    Graph<Object> g = new Graph<>(5,true);//노드는 5개, 엣지에 방향성 부여

	    g.addEdge(0, 1);g.addEdge(0, 2);
	    g.addEdge(1, 3);g.addEdge(1, 4);
	    g.addEdge(2, 3);g.addEdge(2, 1);
	    g.addEdge(3, 0);g.addEdge(3, 1);g.addEdge(3, 2);
	    g.addEdge(4, 1);
	    
	    System.out.println(g.DFS(2));
	    System.out.println(g.DFS());
	}
}
