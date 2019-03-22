package algo.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;

public class GraphSearch {
	public Node rootNode;
	public ArrayList nodes = new ArrayList();
	public Map<Node, List<Node>> adjMap = new HashMap();

	public void setRootNode(Node n) {
		this.rootNode = n;
	}

	public Node getRootNode() {
		return this.rootNode;
	}

	public void addNode(Node n) {
		nodes.add(n);
	}

	public void connectNode(Node start, Node end) {
		List<Node> nodeList = adjMap.get(start);
		if (nodeList == null) {
			nodeList = new ArrayList<Node>();
			adjMap.put(start, nodeList);
		}
		nodeList.add(end);
	}

	private Node getUnvisitedChildNode(Node n) {
		List<Node> nodeList = adjMap.get(n);
		for (int i = 0; ((nodeList != null) && (i < nodeList.size())); i++)
			if (nodeList.get(i).visited == false)
				return nodeList.get(i);

		return null;
	}

	public void bfs() {

		// BFS uses Queue data structure
		Queue q = new LinkedList();
		q.add(this.rootNode);
		printNode(this.rootNode);
		rootNode.visited = true;
		while (!q.isEmpty()) {
			Node n = (Node) q.remove();
			Node child = null;
			while ((child = getUnvisitedChildNode(n)) != null) {
				child.visited = true;
				printNode(child);
				q.add(child);
			}
		}
		// Clear visited property of nodes
		clearNodes();
	}

	// DFS traversal of a tree is performed by the dfs() function
	public void dfs() {
		// DFS uses Stack data structure
		Stack s = new Stack();
		s.push(this.rootNode);
		rootNode.visited = true;
		printNode(rootNode);
		while (!s.isEmpty()) {
			Node n = (Node) s.peek();
			Node child = getUnvisitedChildNode(n);
			if (child != null) {
				child.visited = true;
				printNode(child);
				s.push(child);
			} else {
				s.pop();
			}
		}
		// Clear visited property of nodes
		clearNodes();
	}

	private void clearNodes() {
		for (Entry<Node, List<Node>> eMap : adjMap.entrySet()) {
			List<Node> list = eMap.getValue();
			for (int i = 0; i < list.size(); i++)
				list.get(i).visited = false;
		}
	}

	// Utility methods for printing the node's label
	private void printNode(Node n) {
		System.out.print(n.data + " ");
	}

}

class Node {
	char data;
	boolean visited;

	public Node(char c) {
		this.data = c;
	}
}