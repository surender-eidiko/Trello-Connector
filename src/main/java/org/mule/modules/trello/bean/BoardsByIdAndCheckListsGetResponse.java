
package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class BoardsByIdAndCheckListsGetResponse.
 */
public class BoardsByIdAndCheckListsGetResponse extends StatusResponse {
	 
 	/** The id. */
 	private String id;

	    /** The id card. */
    	private String idCard;

	    /** The check items. */
    	private CheckItems[] checkItems;

	    /** The name. */
    	private String name;

	    /** The pos. */
    	private String pos;

	    /** The id board. */
    	private String idBoard;

	    /**
    	 * Gets the id.
    	 *
    	 * @return the id
    	 */
    	public String getId ()
	    {
	        return id;
	    }

	    /**
    	 * Sets the id.
    	 *
    	 * @param id the new id
    	 */
    	public void setId (String id)
	    {
	        this.id = id;
	    }

	    /**
    	 * Gets the id card.
    	 *
    	 * @return the id card
    	 */
    	public String getIdCard ()
	    {
	        return idCard;
	    }

	    /**
    	 * Sets the id card.
    	 *
    	 * @param idCard the new id card
    	 */
    	public void setIdCard (String idCard)
	    {
	        this.idCard = idCard;
	    }

	    /**
    	 * Gets the check items.
    	 *
    	 * @return the check items
    	 */
    	public CheckItems[] getCheckItems ()
	    {
	        return checkItems;
	    }

	    /**
    	 * Sets the check items.
    	 *
    	 * @param checkItems the new check items
    	 */
    	public void setCheckItems (CheckItems[] checkItems)
	    {
	        this.checkItems = checkItems;
	    }

	    /**
    	 * Gets the name.
    	 *
    	 * @return the name
    	 */
    	public String getName ()
	    {
	        return name;
	    }

	    /**
    	 * Sets the name.
    	 *
    	 * @param name the new name
    	 */
    	public void setName (String name)
	    {
	        this.name = name;
	    }

	    /**
    	 * Gets the pos.
    	 *
    	 * @return the pos
    	 */
    	public String getPos ()
	    {
	        return pos;
	    }

	    /**
    	 * Sets the pos.
    	 *
    	 * @param pos the new pos
    	 */
    	public void setPos (String pos)
	    {
	        this.pos = pos;
	    }

	    /**
    	 * Gets the id board.
    	 *
    	 * @return the id board
    	 */
    	public String getIdBoard ()
	    {
	        return idBoard;
	    }

	    /**
    	 * Sets the id board.
    	 *
    	 * @param idBoard the new id board
    	 */
    	public void setIdBoard (String idBoard)
	    {
	        this.idBoard = idBoard;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [id = "+id+", idCard = "+idCard+", checkItems = "+checkItems+", name = "+name+", pos = "+pos+", idBoard = "+idBoard+"]";
	    }
}
