import java.util.*;

public class BFS {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); // Creates an Scanner object
		BFS bfs = new BFS(); // Creates an BFS object
		
		// Creates each node on the graph and gives them their corresponding name
		Node a = new Node();
		a.name = "a";
		
		Node b = new Node();
		b.name = "b";
		
		Node c = new Node();
		c.name = "c";
		
		Node d = new Node();
		d.name = "d";

		Node e = new Node();
		e.name = "e";

		Node f = new Node();
		f.name = "f";

		Node g = new Node();
		g.name = "g";

		Node h = new Node();
		h.name = "h";

		
		// Creates the adjacency list for Node a
		ArrayList<Node> a_Adjacent = new ArrayList<Node>();
		a_Adjacent.add(c);
		a_Adjacent.add(d);
		a.setAdjacent(a_Adjacent);

		// Creates the adjacency list for Node b
		ArrayList<Node> b_Adjacent = new ArrayList<Node>();
		b_Adjacent.add(c);
		b_Adjacent.add(e);
		b.setAdjacent(b_Adjacent);
		
		// Creates the adjacency list for Node c
		ArrayList<Node> c_Adjacent = new ArrayList<Node>();
		c_Adjacent.add(a);
		c_Adjacent.add(b);
		c_Adjacent.add(d);
		c.setAdjacent(c_Adjacent);
		
		// Creates the adjacency list for Node d		
		ArrayList<Node> d_Adjacent = new ArrayList<Node>();
		d_Adjacent.add(a);
		d_Adjacent.add(c);
		d_Adjacent.add(e);
		d_Adjacent.add(f);
		d.setAdjacent(d_Adjacent);
		
		// Creates the adjacency list for Node e
		ArrayList<Node> e_Adjacent = new ArrayList<Node>();
		e_Adjacent.add(b);
		e_Adjacent.add(d);
		e_Adjacent.add(f);
		e.setAdjacent(e_Adjacent);
		
		// Creates the adjacency list for Node f
		ArrayList<Node> f_Adjacent = new ArrayList<Node>();
		f_Adjacent.add(d);
		f_Adjacent.add(e);
		f_Adjacent.add(h);
		f.setAdjacent(f_Adjacent);
		
		// Creates the adjacency list for Node g
		ArrayList<Node> g_Adjacent = new ArrayList<Node>();
		g.setAdjacent(g_Adjacent);
		
		// Creates the adjacency list for Node h
		ArrayList<Node> h_Adjacent = new ArrayList<Node>();
		h_Adjacent.add(f);
		h.setAdjacent(h_Adjacent);
		
		System.out.println("PART A: " + "\n");
		
		System.out.println("Determine the starting vertex for the graph: "); // Requests the user to determine the starting vertex
		
		// Prints out the graph with the list of vertices and edges
		System.out.println("G = { {a,c}, {a, d}, {b,c}, {b,e}, {c,a}, {c, b}, {c,d},"
				+ " {d,a}, {d,c}, {d,e}, {d, f}, {e,b}, {e,d}, {e,f}, {f,d}, {f,e}, {f,h}, {g} } ");
		
		// Gets the input of the user
		String node = scnr.nextLine();
		
		// Finds the node that matches the users input, then passes in the correct node
		if (node.equals(a.name)) {
			bfs.BFS(a);
			
		} else if (node.equals(b.name)) {
			bfs.BFS(b);
			
		} else if (node.equals(c.name)) {
			bfs.BFS(c);
			
		} else if (node.equals(d.name)) {
			bfs.BFS(d);
			
		} else if (node.equals(e.name)) {
			bfs.BFS(e);
			
		} else if (node.equals(f.name)) {
			bfs.BFS(f);
			
		} else if (node.equals(g.name)) {
			bfs.BFS(g);
			
		} else if (node.equals(h.name)) {
			bfs.BFS(h);
		}

// PART B GRAPH
		
		System.out.println("\n" + "PART B: " + "\n");
		
		// Prints out the graph with the list of vertices and edges
		System.out.println("G = { {a,d}, {c,d}, {c,e}, {b,d}, {b,f}, "
								+ "{d,a}, {d,c}, {d,b}, {e,c}, {f,b}, "
								+ "{g,h}, {g,i}, {h,g}, {h,i}, {i,g}, {i,h}" + "\n");
		
		// Creates node i from the graph on Part B
		Node i = new Node();
		i.name = "i";
		
		// Creates the adjacency list for Node a
		ArrayList<Node> a_AdjacentB = new ArrayList<Node>();
		a_AdjacentB.add(d);
		a.setAdjacent(a_AdjacentB);

		// Creates the adjacency list for Node b
		ArrayList<Node> b_AdjacentB = new ArrayList<Node>();
		b_AdjacentB.add(d);
		b_AdjacentB.add(f);
		b.setAdjacent(b_AdjacentB);
		
		// Creates the adjacency list for Node c
		ArrayList<Node> c_AdjacentB = new ArrayList<Node>();
		c_AdjacentB.add(d);
		c_AdjacentB.add(e);
		c.setAdjacent(c_AdjacentB);
		
		// Creates the adjacency list for Node d		
		ArrayList<Node> d_AdjacentB = new ArrayList<Node>();
		d_AdjacentB.add(a);
		d_AdjacentB.add(b);
		d_AdjacentB.add(c);
		d.setAdjacent(d_AdjacentB);
		
		// Creates the adjacency list for Node e
		ArrayList<Node> e_AdjacentB = new ArrayList<Node>();
		e_AdjacentB.add(c);
		e.setAdjacent(e_AdjacentB);
		
		// Creates the adjacency list for Node f
		ArrayList<Node> f_AdjacentB = new ArrayList<Node>();
		f_AdjacentB.add(b);
		f.setAdjacent(f_AdjacentB);
		
		// Creates the adjacency list for Node g
		ArrayList<Node> g_AdjacentB = new ArrayList<Node>();
		g_AdjacentB.add(h);
		g_AdjacentB.add(i);
		g.setAdjacent(g_AdjacentB);
		
		// Creates the adjacency list for Node h
		ArrayList<Node> h_AdjacentB = new ArrayList<Node>();
		h_AdjacentB.add(g);
		h_AdjacentB.add(i);
		h.setAdjacent(h_AdjacentB);
		
		// Creates the adjacency list for Node i
		ArrayList<Node> i_AdjacentB = new ArrayList<Node>();
		i_AdjacentB.add(g);
		i_AdjacentB.add(h);
		i.setAdjacent(i_AdjacentB);
		
		// Instantiates the list of nodes for the 1st graph
		ArrayList<Node> nodeList1 = new ArrayList<Node>();
		nodeList1.add(a);
		nodeList1.add(b);
		nodeList1.add(c);
		nodeList1.add(d);
		nodeList1.add(e);
		nodeList1.add(f);
		
		// Call Explore() For the first graph
		bfs.Explore(nodeList1);
		
		// Instantiates the list of nodes for the 2nd graph
		ArrayList<Node> nodeList2 = new ArrayList<Node>();
		
		// NOT BIPARTITE CASE
		nodeList2.add(g);
		nodeList2.add(h);
		nodeList2.add(i);
		
		// Call Explore() for the 2nd graph (That is not bipartite)
		bfs.Explore(nodeList2);
		
	}
	
// PART A
	
	// Breadth First Search Method
	public void BFS (Node vertex) {
		// Creates the queue that will contain the nodes on the graph
		Queue<Node> queue = new LinkedList<Node>();
		
		// Sets the distance of the starting vertex as 0
		vertex.distance = 0; 

		// Sets the parent of the starting vertex to itself
		vertex.parent = vertex;
		
		// Adds the vertex into the queue
		queue.add(vertex);
		
		// Keep looping until all vertices in the graph have been explored
		while (!queue.isEmpty()) {
			
			// Pops the node that has been accessed
			Node temp = queue.remove();
			
			// For each neighbor, check the vertices that are adjacent to it 
			for (Node neighbors : temp.adjacent) {
				
				// if the vertex does not have a parent
				if (!neighbors.hasParent()) {
					
					// Sets the parent of the adjacent vertex to the vertex that was popped
					neighbors.parent = temp; 
															
					// Increments the distance
					neighbors.distance = temp.distance + 1; 

					// Adds the vertex into the queue
					queue.add(neighbors);
					
					// Saves the traversed path
					neighbors.path = neighbors.parent.path + " -> " + neighbors.name;
					
					// Prints the distance from the starting vertex to all vertices that are reachable
					System.out.println("The shortest path from " + vertex.name + " to " + neighbors.name + " is " + vertex.name + neighbors.path 
							+ " and the shortest distance is: " + neighbors.distance);
				}				
			}
			
			// Checks if the node is not reachable and prints that it cannot be reached by other vertices
			if (temp.adjacent.isEmpty()) {
				System.out.println("The vertex " + temp.name + " is not reachable by other vertices ");
			}
			
		}
	}
	
// PART B
	
	// Explore Graph Methohod
	public void Explore(ArrayList<Node> nodeList) {
		
		// For each vertex, initialize color to "gray"
		for (Node vertex : nodeList) {
			vertex.color = "gray";
		}	
			
		// From the 1st vertex, color it "blue" and call Is_Bipartite
		nodeList.get(0).color = "blue";
		Is_Bipartite(nodeList.get(0), nodeList);
			
		// Counter to check if the vertex is the 2nd vertex
		int counter = 1;	

		// Repeat step c.
		while (true) {

			// Go to next unexplored vertex (having "gray" color), color it "blue" and call Is_Bipartite
			if (counter != 0 && nodeList.get(counter).color.equals("gray")) {
				nodeList.get(counter).color = "blue";
				Is_Bipartite(nodeList.get(counter), nodeList);
				counter++;
				
			// Increment counter to go to the next unexplored vertex
			} else {
				counter++;
			}
				
			// If all the vertices have been explored then print that the graph is Bipartite
			if (counter == nodeList.size()) {
				System.out.println("The graph is bipartite ");
				break;
			}
				
		}
		
		// Prints the color of all the nodes
		for (int i = 0; i < nodeList.size(); i++) {
			System.out.println("The color of node " + nodeList.get(i).name + " is " + nodeList.get(i).color);
		}
		
	}
	
	// Is_Bipartite Method
	public void Is_Bipartite(Node vertex, ArrayList<Node> nodeList) {
		// Instantiates the queue
		Queue<Node> queue = new LinkedList<Node>();

		// Adds the vertex that was passed in into the queue
		queue.add(vertex);

		// Keep iterating until all nodes have been popped from the queue
		while (queue.size() != 0) {
			
			// Keep popping each vertex from queue
			Node u = queue.remove();

			// Go to the adjacency list of u, for each neighbor
			for (Node v : u.adjacent) {
				
				// Assign an opposite color to v and push it into the queue
				if (v.color.equals("gray")) {
					
					// Checks if neighbors color is blue then sets its own color to red
					if (u.color.equals("blue")) {
						v.color = "red";
						
					// Checks if neighbors color is red then sets its own color to blue
					} else if (u.color.equals("red")) {
						v.color = "blue";
					}
					
					// Add the node into the queue
					queue.add(v);
					
				// Checks if its color is the same as its neighbors color	
				} else if (v.color.equals(u.color)) {
					
					// Stop the entire program and print "NOT Bipartite"
					System.out.println("\nThis graph is NOT Bipartite. ");
					
					// Print the color of all the nodes
					for (int i = 0; i < nodeList.size(); i++) {
						System.out.println("The color of node " + nodeList.get(i).name + " is " + nodeList.get(i).color);
					}
					
					// Exits the program after finding that the graph is not Bipartite
					System.exit(0);
				}
			}
		}
	}
}

// JUSTIN CALMA CECS 328 - 14 F 8AM - 12:45PM
