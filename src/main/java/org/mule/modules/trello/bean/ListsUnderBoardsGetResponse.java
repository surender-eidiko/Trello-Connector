/**
 *
 */
package org.mule.modules.trello.bean;


// TODO: Auto-generated Javadoc
/**
 * The Class BoardsByIdAndListsGetResponse.
 */
public class ListsUnderBoardsGetResponse  extends StatusResponse{
	 

    /** The id. */
    private String id;

    /** The name. */
    private String name;

    /** The closed. */
    private String closed;

    /** The subscribed. */
    private String subscribed;

    /** The pos. */
    private String pos;

    /** The id board. */
    private String idBoard;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the closed.
	 *
	 * @return the closed
	 */
	public String getClosed() {
		return closed;
	}

	/**
	 * Sets the closed.
	 *
	 * @param closed the new closed
	 */
	public void setClosed(String closed) {
		this.closed = closed;
	}

	/**
	 * Gets the subscribed.
	 *
	 * @return the subscribed
	 */
	public String getSubscribed() {
		return subscribed;
	}

	/**
	 * Sets the subscribed.
	 *
	 * @param subscribed the new subscribed
	 */
	public void setSubscribed(String subscribed) {
		this.subscribed = subscribed;
	}

	/**
	 * Gets the pos.
	 *
	 * @return the pos
	 */
	public String getPos() {
		return pos;
	}

	/**
	 * Sets the pos.
	 *
	 * @param pos the new pos
	 */
	public void setPos(String pos) {
		this.pos = pos;
	}

	/**
	 * Gets the id board.
	 *
	 * @return the id board
	 */
	public String getIdBoard() {
		return idBoard;
	}

	/**
	 * Sets the id board.
	 *
	 * @param idBoard the new id board
	 */
	public void setIdBoard(String idBoard) {
		this.idBoard = idBoard;
	}
}
