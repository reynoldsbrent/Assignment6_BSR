/**
 * 
 */

/**
 * @author Nathan Johnson, Bellarmine University
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
				aSearch.DFS(root);

	}

}
