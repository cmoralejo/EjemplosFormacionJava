package es.cmr.util.collections;

import java.util.Iterator;

/**
 * <p>Class that implements a linked list of one way nodes
 * <p>It can be process with an iterator or loop for-each
 * <p>Also you can add node after constructor  
 * 
 * @author Carlos Moralejo Romo 
 *
 * @see es.cmr.util.collections.NodeOneWay
 * 
 * @param <T> the type of object dealt with the list       
 */
public class ListNodesOneWay<T> implements Iterable<T>{
	//References to the start node,end and current node
	protected  Node<T> startNode=null;
	protected Node<T> endNode=null;	
	protected Node<T> currentNode=null;
	
	/**
	 * Constructs a linked list of one way nodes based on the array passed as parameter. 
	 * 
	 * @param datas primitive array of objects that matches type T 
	 */
	public ListNodesOneWay(T[] datas) {
		for (int i=0; i < datas.length;i++) {
			this.addNode(datas[i]);
		}
	}

	/**
	 * Add at the end of the list a new node passed as parameter. 
	 * 
	 * @param data any object that matches type T 
	 */
	public void addNode(T data) {
		NodeOneWay<T> newNode = new NodeOneWay<>(data);
		if (endNode==null) {
			startNode=endNode=currentNode=newNode;
		}
		else {
			endNode.setNext(newNode);
			endNode=newNode;
		}
	}

	/**
	 * Returns the reference to the first node. 
	 *  
	 * @return the first node or null if does not exist 
	 */
	final protected T getFirstNode() {
		currentNode=startNode;
		return(currentNode!=null? currentNode.getData():null); 
	}

	/**
	 * Returns the reference to the next node. 
	 *  
	 * @return the next node or null if does not exist 
	 */
	final protected T getNextNode() {
		if (currentNode!=null && currentNode.getNext()!=null) {
			currentNode=currentNode.getNext();
			return(currentNode.getData());
		}
		else  {
			return(null);
		}
	}
	
	
	/**
	 * Return an Iterator over this linked list.
	 * Provide appropriate implementation for &quot;hasNext&quot; and &quot;next&quot; methods  
	 *
	 * @return an iterator
	 */	
	@Override
	public Iterator<T> iterator() {
		return new ListIterator();
	}
		/*
		 * Inner private class to implements the iterator of this linkedlist  
		 */
		private class ListIterator implements Iterator<T> {
			//Reference to next node  
			private T nextNode;

			//Set the next node as the first node
			private ListIterator() {
				nextNode = getFirstNode();
			}
	
			//Check if next node does not exists
			public boolean hasNext() {
				return(nextNode!=null);
			}
			
			/*
			 * Returns the next node (the attribute next of the actual node)
			 * If next node exists does not exists throws NoSuchElementException  
			 */
			public T next() {
				T node = nextNode;
				if (nextNode==null)
				{
					throw new java.util.NoSuchElementException();
				}
				nextNode = getNextNode();
				return(node);
			}
			
		};
	
}
