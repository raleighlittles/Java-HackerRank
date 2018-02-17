class SumInLeavesVisitor extends TreeVis {
    private int result = 0;
    public int getResult() {
      	//implement this
        return result;
    }

    public void visitNode(TreeNode node) {
        
      	//implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this
        result += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private long result = 1;
    private final int M = 1000000000 + 7;
    public int getResult() {
      	//implement this
        return (int) result;
    }

    public void visitNode(TreeNode node) {
      	//implement this
        if (node.getColor().equals(Color.RED))
        {
            result = (result * node.getValue()) % M;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this
        if (leaf.getColor().equals(Color.RED))
        {
            result = (result * leaf.getValue()) % M;
        }
    }
}

class FancyVisitor extends TreeVis {
    private int even_depth_nonleaves_sum = 0;
    private int grn_leaves_sum = 0;
    public int getResult() {
      	//implement this
        return Math.abs(even_depth_nonleaves_sum - grn_leaves_sum);
    }

    public void visitNode(TreeNode node) {
    	//implement this
        if (node.getDepth() % 2 == 0)
        {
            even_depth_nonleaves_sum += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
    	//implement this
        if (leaf.getColor().equals(Color.GREEN))
        {
            grn_leaves_sum += leaf.getValue();
        }
    }
}

public class Solution {
    private static int nodeValues[];
private static Color nodeColors[];
private static Map<Integer, Set<Integer>> nodesMap = new HashMap<>();
  
    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        
         Scanner in = new Scanner(System.in);

    int numberOfNodes = in.nextInt();

    nodeValues = new int[numberOfNodes];
    for(int index = 0; index < numberOfNodes; index++) {
        nodeValues[index] = in.nextInt();
    }

    nodeColors = new Color[numberOfNodes];
    for(int index = 0; index < numberOfNodes; index++) {
        nodeColors[index] = (in.nextInt() == 0) ? Color.RED : Color.GREEN;
    }

    Tree rootNode;
    if(numberOfNodes == 1) {
        rootNode = new TreeLeaf(nodeValues[0], nodeColors[0], 0);
    }
    else {
        for(int index = 0; index < (numberOfNodes - 1); index++) {
            int u = in.nextInt();
            int v = in.nextInt();
            Set<Integer> uEdges = nodesMap.get(u);
            if(uEdges == null) {
                uEdges = new HashSet<>();
            }
            uEdges.add(v);
            nodesMap.put(u, uEdges);
            Set<Integer> vEdges = nodesMap.get(v);
            if(vEdges == null) {
                vEdges = new HashSet<>();
            }
            vEdges.add(u);
            nodesMap.put(v, vEdges);
        }

        rootNode = new TreeNode(nodeValues[0], nodeColors[0], 0);
        Set<Integer> rootEdges = nodesMap.get(1);
        Iterator<Integer> rootIterator = rootEdges.iterator();
        while(rootIterator.hasNext()) {
            Integer nodeIdentifier = rootIterator.next();
            nodesMap.get(nodeIdentifier).remove(1);
            createEdge(rootNode, nodeIdentifier);
        }
    }

    return rootNode;
}

private static void createEdge(Tree parentNode, Integer nodeIdentifier) {

    Set<Integer> nodeEdges = nodesMap.get(nodeIdentifier);
    boolean hasChild = false;
    if(nodeEdges != null && !nodeEdges.isEmpty())
        hasChild = true;

    if(hasChild) {
        TreeNode node = new TreeNode(nodeValues[nodeIdentifier - 1], nodeColors[nodeIdentifier - 1], parentNode.getDepth() + 1);
        ((TreeNode) parentNode).addChild(node);
        Iterator<Integer> nodeIterator = nodeEdges.iterator();
        while(nodeIterator.hasNext()) {
            Integer neighborNodeIdentifier = nodeIterator.next();
            nodesMap.get(neighborNodeIdentifier).remove(nodeIdentifier);
            createEdge(node, neighborNodeIdentifier);
        }
    }
    else {
        TreeLeaf leaf = new TreeLeaf(nodeValues[nodeIdentifier - 1], nodeColors[nodeIdentifier - 1], parentNode.getDepth() + 1);
        ((TreeNode) parentNode).addChild(leaf);
    }
}
        
       