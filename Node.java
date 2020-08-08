import java.util.*;

public class Node {

	// Fields for the Node class
	public int distance;
	public Node parent;
	public ArrayList<Node> adjacent; 
	public String color;
	public String name;
	public String path;
	
	// Constructor 
	public Node() {
		this.distance = 0;
		this.parent = null;
		this.adjacent = new ArrayList<Node>();
		this.color = "gray";
		this.name = "";
		this.path = "";
	}
	
	// Constructor (Not used)
	public Node(int distance, Node parent) {
		this.distance = distance;
		this.parent = parent;
		this.adjacent = new ArrayList<Node>();
		this.color = "gray";
		this.name = "";
		this.path = "";
	}
	
	// Method to check if the current vertex has a parent
	public boolean hasParent() {
		if (parent == null) {
			return false;
		} else {
			return true;
		}
	}
	
	// Sets the adjacency list for the given vertex
	public void setAdjacent(ArrayList<Node> adjacent) {
		this.adjacent = adjacent;
	}
	
}
