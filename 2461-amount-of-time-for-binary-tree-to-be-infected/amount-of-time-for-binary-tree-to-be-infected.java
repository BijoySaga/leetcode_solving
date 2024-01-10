import java.util.*;

class TreeNode
{
  int val;
  TreeNode left, right;
  public TreeNode ()
  {
    this.val = 0;
    this.left = null;
    this.right = null;
  }
  public TreeNode (int x)
  {
    this.val = x;
    this.left = null;
    this.right = null;
  }
  public TreeNode (int x, TreeNode left, TreeNode right)
  {
    this.val = x;
    this.left = left;
    this.right = right;
  }
}

public class Solution
{
  Map < Integer, List < Integer >> graph = new HashMap <> ();

  public int amountOfTime (TreeNode root, int start)
  {
    constructGraph (root);
    Queue < Integer > q = new LinkedList <> ();
    q.add (start);
    Set < Integer > visited = new HashSet <> ();
    int minutesPassed = -1;
    while (!q.isEmpty ())
      {
	++minutesPassed;
	int levelSize = q.size ();
	for (int i = 0; i < levelSize; ++i)
	  {
	    int currentNode = q.poll ();
	      visited.add (currentNode);
	    for (int adjacentNode:graph.
		 getOrDefault (currentNode, new ArrayList <> ()))
	      {
		if (!visited.contains (adjacentNode))
		  {
		    q.add (adjacentNode);
		  }
	      }
	  }
      }
    return minutesPassed;
  }

  private void constructGraph (TreeNode root)
  {
    if (root == null)
      return;

    if (root.left != null)
      {
	graph.computeIfAbsent (root.val,
			       k->new ArrayList <> ()).add (root.left.val);
	graph.computeIfAbsent (root.left.val,
			       k->new ArrayList <> ()).add (root.val);
      }

    if (root.right != null)
      {
	graph.computeIfAbsent (root.val,
			       k->new ArrayList <> ()).add (root.right.val);
	graph.computeIfAbsent (root.right.val,
			       k->new ArrayList <> ()).add (root.val);
      }

    constructGraph (root.left);
    constructGraph (root.right);
  }
}
