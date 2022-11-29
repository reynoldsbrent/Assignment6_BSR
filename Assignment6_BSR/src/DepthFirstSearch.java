
/**
 * This class contains the method that traverses the tree by depth first search
 * It also contains the method that returns the number of nodes traversed
 * @author brentreynolds
 * @version Fall 2022, 11/29/2022
 */
public class DepthFirstSearch {
Node root;
private int numberOfNodesTraversed;

public DepthFirstSearch() {
	System.out.println("Call DFS with root node to do a Depth First Search.");
}

/**
 * This method traverses the tree by depth first search 
 * @param node is the node of the tree that is being traversed from
 */
public void DFS(Node node) {
	numberOfNodesTraversed++;
	System.out.println("\nNode data: " + node.getData());
	//Add code to traverse the tree here
	//This is approximately three lines of code
	//Including an if statement to see if the node is a leaf
	//And two recursive calls to the children
	//Modify other code as necessary
	
	if(node.getlChild() == null && node.getrChild() == null) {
		System.out.print("Node is a leaf\n");
	}
	else {
		DFS(node.getlChild());
		DFS(node.getrChild());
	}
}

/**
 * This method returns the number of nodes that have been traversed
 * @return the number of nodes traversed by depth first search
 */
public int getNumberOfNodesTraversed() {
	return numberOfNodesTraversed;
}
}
