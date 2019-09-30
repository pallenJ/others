package aaa.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class GraphEX {
	
	private int nodeCnt; // 노드의 개수
	private List<Integer>[] adj; // 인접 리스트. LinkedList의 배열들.

	
	GraphEX(int cnt) {
		this.nodeCnt = cnt;
		this.clear();
	}

	@SuppressWarnings("unchecked")
	private void clear() {
		adj = new LinkedList[this.nodeCnt];
		for (int i = 0; i < this.nodeCnt; i++) // 인접 리스트 초기화
			adj[i] = new LinkedList<>();
	}

	public static void main(String args[]) {
		GraphEX g = new GraphEX(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		System.out.println(g.BFS(2));
		//해당 노드를 시작으로 탐색
	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
	}

	public List<Integer> BFS(int startNode) {
		// 노드의 방문 여부 판단 (초깃값: false)
		boolean visited[] = new boolean[nodeCnt];
		LinkedList<Integer> queue = new LinkedList<>();
		List<Integer> rs = new LinkedList<>();;
		// 현재 노드를 방문한 것으로 표시하고 큐에 삽입(enqueue)
		visited[startNode] = true;
		queue.add(startNode);

		
		while (queue.size() != 0) {// 큐(Queue)의 사이즈가 0이 될때까지
			startNode = queue.poll();
			rs.add(startNode);// 방문한 노드와 인접한 모든 노드를 가져온다.
			
			for (Iterator<Integer> itr = adj[startNode].listIterator(); itr.hasNext();) {
				Integer n = itr.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}

		}
		return rs;
	}
	
	public int getNodeCnt() {
		return nodeCnt;
	}

	public void setNodeCnt(int nodeCnt) {
		this.nodeCnt = nodeCnt;
	}

	public List<Integer>[] getAdj() {
		return adj;
	}

	public void setAdj(LinkedList<Integer>[] adj) {
		this.adj = adj;
	}
	
}
