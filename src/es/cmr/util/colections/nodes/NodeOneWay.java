/**
 * 
 */
package es.cmr.util.colections.nodes;


/**
 * <p>Concrete subclass of Node&lt;T&gt; that implements references to next node (onwards One Way node).
 * <p>Reference to previous node is not supported.
 * 
 * @author Carlos Moralejo Romo 
 *
 * @see es.cmr.util.colections.nodes.Node
 * 
 * @param <T> the type of object that may be stored       
 */
public class NodeOneWay<T> extends Node<T>  {
	/**
	 * References to the next node (or null if doesn't exist)
	 */
	protected Node<T> next;

	/**
	 * Constructs a one way node and stores the object passed as parameter. 
	 * 
	 * @param data any object that matches type T 
	 */
	NodeOneWay(T data) {
		super.data = data;
		this.next = null;
	}

	/**
	 * Returns the reference to the next node. 
	 *  
	 * @return the next node or null if doesn't exist 
	 */
	@Override
	final protected Node<T> getNext() {
		return next;
	}

	/**
	 * Replaces the reference to the next node.
	 * 
	 * @param next any object that matches type Node&lt;T&gt;
	 */
	@Override	
	final protected void setNext(Node<T> next) {
		this.next = next;
	}

	/**
	 * Returns the reference to the previous node.It's not supported.
	 * 
	 * @return the previous node or null if doesn't exist
	 * 
	 * @throws UnsupportedOperationException It's not supported.
	 */
	@Override
	protected Node<T> getPrevious() {
		throw new UnsupportedOperationException("getPrevious not supported for NodeListOneWay<>");
	}

	/**
	 * Replaces the reference to the previous node.It's not supported.
	 * 
	 * @param previous any object that matches type Node&lt;T&gt;
	 * 
	 * @throws UnsupportedOperationException It's not supported.
	 */
	@Override	
	protected void setPrevious(Node<T> previous) {
		throw new UnsupportedOperationException("setPrevious not supported for NodeListOneWay<>");
	}

	/** 
	 * Creates a String representation of the node.
	 * The string returned is of the form "Node value: v , next: n" where v output the string representation of object stored and n output the string representation of the reference of the next node   
	 */
	@Override
	public String toString() {
		return (super.toString()+" , next: "+ getNext());
	}
}

