package es.cmr.util.collections;

/**
 * <p>Concrete subclass of Node&lt;T&gt; that implements references to next and previous nodes (onwards Reversible node).
 * 
 * @author Carlos Moralejo Romo 
 *
 * @see es.cmr.util.collections.Node
 * 
 * @param <T> the type of object that may be stored       
 */
final public class NodeReversible<T> extends NodeOneWay<T> {
	/**
	 * References to the previous node (or null if does not exist)
	 */
	protected Node<T> previous;

	/**
	 * Constructs a reversible node and stores the object passed as parameter. 
	 * 
	 * @param data any object that matches type T 
	 */
	protected NodeReversible(T data) {
		super(data);
		this.previous = null;
	}

	/**
	 * Returns the reference to the previous node.
	 * 
	 * @return the previous node or null if does not exist
	 */
	@Override
	final protected Node<T> getPrevious() {
		return previous;
	}

	/**
	 * Replaces the reference to the previous node.
	 * 
	 * @param previous any object that matches type Node&lt;T&gt;
	 */
	@Override	
	final protected void setPrevious(Node<T> previous) {
		this.previous = previous;
	}

	/** 
	 * Creates a String representation of the node.
	 * The string returned is of the form "Node value: v , next: n , previous: p" where v output the string representation of object stored, n output the string representation of the reference of the next node and p output the string representation of the reference of the previous node
	 */
	@Override
	public String toString() {
		return (super.toString()+" , previous: "+ getPrevious());
	}
	
	
}
