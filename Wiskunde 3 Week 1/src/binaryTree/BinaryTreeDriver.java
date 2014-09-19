package binaryTree;

public class BinaryTreeDriver {
	
	public static void main(String[] args){
		
		
		
		BinaryTree<Character> tree1 = createTree1();
		
		System.out.println("tree1 in-order: ");
		System.out.println("recursively:");
		tree1.printLevelorder(); 
//		System.out.println("iteratively:");
//		tree1.printInorder2();
		System.out.println("\n");
		
		BinaryTree<Character> tree2 = createTree2();
		System.out.println("tree2 in-order: ");
		System.out.println("recursively:");
		tree2.printLevelorder(); 
//		System.out.println("iteratively:");
//		tree2.printInorder2();
		System.out.println("\n");
		
		
		
		
	}
	
	private static BinaryTree<Character> createTree1() {
		BinaryNode<Character> nodeA = new BinaryNode<Character>('A');
		BinaryNode<Character> nodeB = new BinaryNode<Character>('B');
		BinaryNode<Character> nodeC = new BinaryNode<Character>('C');
		BinaryNode<Character> nodeD = new BinaryNode<Character>('D');
		BinaryNode<Character> nodeE = new BinaryNode<Character>('E');
		BinaryNode<Character> nodeF = new BinaryNode<Character>('F');
		BinaryNode<Character> nodeG = new BinaryNode<Character>('G');
	
		nodeC.setLeft(nodeA);
		nodeC.setRight(nodeG);
		
		nodeA.setLeft(nodeD);
		nodeA.setRight(nodeF);
		
		nodeG.setLeft(nodeE);
		nodeG.setRight(nodeB);
		
		return new BinaryTree<Character>(nodeC);
	}
	
	private static BinaryTree<Character> createTree2() {
		BinaryNode<Character> nodeA = new BinaryNode<Character>('A');
		BinaryNode<Character> nodeB = new BinaryNode<Character>('B');
		BinaryNode<Character> nodeC = new BinaryNode<Character>('C');
		BinaryNode<Character> nodeD = new BinaryNode<Character>('D');
		BinaryNode<Character> nodeE = new BinaryNode<Character>('E');
		BinaryNode<Character> nodeF = new BinaryNode<Character>('F');
		BinaryNode<Character> nodeG = new BinaryNode<Character>('G');
		BinaryNode<Character> nodeH = new BinaryNode<Character>('H');
		BinaryNode<Character> nodeI = new BinaryNode<Character>('I');
		
		nodeD.setLeft(nodeC);
		nodeD.setRight(nodeE);
		
		nodeB.setLeft(nodeA);
		nodeB.setRight(nodeD);
		
		nodeI.setLeft(nodeH);
		
		nodeG.setRight(nodeI);
		
		nodeF.setLeft(nodeB);
		nodeF.setRight(nodeG);
		
		return new BinaryTree<Character>(nodeF);
	}
}
