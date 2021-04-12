package components;

/**
 * @author Daniel Elmaliach
 * @ID 206068629
 * The Class Tracking.
 */
public class Tracking {
	
	/** The time. */
	private int time;
	
	/** The node. */
	private Node node;
	
	/** The status. */
	private Status status;
	
	/**
	 * Instantiates a new tracking.
	 *
	 * @param time the time
	 * @param node the node
	 * @param status the status
	 */
	public Tracking(int time,Node node,Status status) {
		this.time = time;
		this.node = node;
		this.status = status;
	}
	
	/**
	 * Sets the time.
	 *
	 * @param time the new time
	 */
	public void setTime(int time) { this.time = time; }
	
	/**
	 * Sets the node.
	 *
	 * @param node the new node
	 */
	public void setNode(Node node) { this.node = node; }
	
	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(Status status) { this.status = status; }
	
	/**
	 * Gets the time.
	 *
	 * @return the time
	 */
	public int getTime() { return time; }
	
	/**
	 * Gets the node.
	 *
	 * @return the node
	 */
	public Node getNode() { return node; }
	
	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public Status getStatus() { return status; }
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		if(node!=null)
			return  time + ": " + node + ", status=" + status ;
		return  time + ": Customer, status=" + status ;
		}
	
	/**
	 * Equals.
	 *
	 * @param object the object
	 * @return true, if successful
	 */
	public boolean equals(Object object) {
		if(object == null || getClass() != object.getClass()) 
			return false;
		Tracking other = (Tracking)object;
		return time == other.time && status == other.status && node.equals(other.node);
	}
}