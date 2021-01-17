package idpcduonnodes;

public class Node {
	public int nameNode;
//	public String domain;
	public Node(int nameNode) {
		this.nameNode = nameNode;
//		this.domain = domain;
	}
	public void isTheSourceNode(Node node) {
		this.nameNode = node.nameNode;
	}
	public void isTheTerminalNode(Node node) {
		this.nameNode = node.nameNode;
	}
	
	public int distanceTo(Node node, int distance) {
		return distance;
	}
	
}
