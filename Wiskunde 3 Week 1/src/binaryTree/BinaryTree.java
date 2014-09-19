package binaryTree;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class BinaryTree<E> {
	private BinaryNode<E> root;

	public BinaryTree(BinaryNode<E> root) {
		this.root = root;
	}

	public BinaryNode<E> getRoot() {
		return root;
	}

	public void setRoot(BinaryNode<E> root) {
		this.root = root;
	}

	// recursieve implementatie
	public void printPreorder(){
		printPreorder(root);
		System.out.println();
	}

	private void printPreorder(BinaryNode<E> node){
		if (node == null) return;
		System.out.print(node.toString() + " ");	
		printPreorder(node.getLeft());	
		printPreorder(node.getRight());
	}

	// iteratieve implementatie
	public void printPreorder2(){
		Stack<BinaryNode<E>> stack = new Stack<BinaryNode<E>>();
		BinaryNode<E> node = root;
		while (!stack.isEmpty() || node != null){
			if(node != null){
				System.out.print(node.toString() + " ");			
				stack.push(node.getRight());
				node = node.getLeft();
			} else {
				node = stack.pop();
			}
		}
		System.out.println();
	}

	public void printInorder() {
		printInorder(root);
		System.out.println();
	}

	private void printInorder(BinaryNode<E> node) {
		if (node == null) return;
		printInorder(node.getLeft());	
		System.out.print(node.toString() + " ");	
		printInorder(node.getRight());
	}

	public void printInorder2() {
		Stack<BinaryNode<E>> stack = new Stack<BinaryNode<E>>();
		BinaryNode<E> node = root;
		while (!stack.isEmpty() || node != null){
			if(node != null){
				stack.push(node);
				node = node.getLeft();
			} else {
				node = stack.pop();
				System.out.print(node.toString() + " ");
				node = node.getRight();
			}
		}
		System.out.println();
	}	

	public void printPostorder() {
		printPostorder(root);
		System.out.println();
	}

	private void printPostorder(BinaryNode<E> node) {
		if (node == null) return;
		printPostorder(node.getLeft());	
		printPostorder(node.getRight());
		System.out.print(node.toString() + " ");	
	}

	public void printLevelorder() {
		Queue<BinaryNode<E>> queue = new LinkedBlockingQueue<BinaryNode<E>>();
		BinaryNode<E> node = root;
		queue.offer(node);
		while(! queue.isEmpty()) {
			node = queue.poll();
			if(node.getLeft() != null)
				queue.offer(node.getLeft());
			if (node.getRight() != null)
				queue.offer(node.getRight());
			System.out.print(node.toString() + " ");
		}
	}

	public void getMaxDepth() {
		System.out.println(getMaxDepth(root));
	}
	
	private int getMaxDepth(BinaryNode<E> node) {
		int left = 0, right = 0;
		if (node.getLeft() != null)
			left = getMaxDepth(node.getLeft());
		if (node.getRight() != null)
			right = getMaxDepth(node.getRight());
		return 1 + Math.max(left, right);
	}
	
	public void getMaxDepth2() {
		Queue<BinaryNode<E>> queue = new LinkedBlockingQueue<BinaryNode<E>>();
		BinaryNode<E> node = root;
		int depth = 0;
		queue.offer(node);
		while(! queue.isEmpty()) {
			Queue<BinaryNode<E>> queue2 = new LinkedBlockingQueue<BinaryNode<E>>();
			while(! queue.isEmpty()) {
				node = queue.poll();
				if(node.getLeft() != null)
					queue2.offer(node.getLeft());
				if (node.getRight() != null)
					queue2.offer(node.getRight());			
			}
			queue = queue2;
			depth += 1;
		}
		System.out.println(depth);
	}
}
