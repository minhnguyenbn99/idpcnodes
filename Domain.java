package idpcduonnodes;

import java.util.ArrayList;

public class Domain{
	public static ArrayList<Node> domainNodes;
	public int nameDomain;
	
	public Domain(int nameDomain) {
		this.nameDomain = nameDomain;
//		this.nodes = new ArrayList<Node>();
//		this.nodes = nodes;
	}
	public void constainNode(Domain domain, Node node) {
		this.nameDomain = domain.nameDomain;
		this.domainNodes = new ArrayList<Node>();
		domainNodes.add(node);	
		
	}	
//	public ArrayList<Node> getDomain(){
//		return this.nodes;
//	}
}
