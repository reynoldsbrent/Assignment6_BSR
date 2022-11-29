
/**
 * @author Nathan Johnson, Bellarmine University
 *
 */

/** 
 * This class creates a new tree and calls the depth first search method 
 * on the root of that tree
 * @author brentreynolds
 * @version Fall 2022, 11/29/22
 *
 */
public class Application {
	
	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Creating a tree of height "+ args[0]+".");
				Tree aTree=new Tree();//Creates a tree with root
				Node root=aTree.generatePracticeTree(5);
				DepthFirstSearch aSearch=new DepthFirstSearch();
				
				System.out.println("***Depth First Search Will Be Used To Traverse The Tree***");
				aSearch.DFS(root);
				
				System.out.println("Number of Nodes Traversed: " + aSearch.getNumberOfNodesTraversed());
				System.out.println("Height of the tree: " + aTree.getTreeHeight());
	}

}
