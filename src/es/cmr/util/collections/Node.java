package es.cmr.util.collections;

/**
 * <p>This class provides a container (onwards Node) that stores an object (any extends object's class) and references others previous or next nodes
 * <p>It&apos;s abstract to define but not implement references to other previous or next node
 * 
 * @author Carlos Moralejo Romo
 *  
 * @param <T> the type of object that may be stored      
 */
public abstract class Node<T> {
	/**
	 * The object that stores.   
	 */
	protected T data;
	
	/**
	 * Returns the object stored in the node
	 * 
	 * @return the object stored in the node 
	 */
	protected T getData() {
		return data;
	}

	/**
	 * Returns the reference to the next node 
	 * 
	 * @return the next node or null if does not exist 
	 */
	abstract protected Node<T> getNext();

	/**
	 * Replaces the reference to the next node
	 * 
	 * @param next any object that matches type Node&lt;T&gt;
	 */
	abstract protected void setNext(Node<T> next);

	/**
	 * Returns the reference to the previous node 
	 * 
	 * @return the previous node or null if does not exist 
	 */
	abstract protected Node<T> getPrevious();

	/**
	 * Replaces the reference to the next node
	 * 
	 * @param previous any object that matches type Node&lt;T&gt;
	 */
	abstract protected void setPrevious(Node<T> previous);
		
	/** 
	 * Creates a String representation of the node.
	 * The string returned is of the form "Node value: v" where v output the string representation of object stored  
	 */
	@Override
	public String toString() {
		return("Node value: " + data);
	}

}
