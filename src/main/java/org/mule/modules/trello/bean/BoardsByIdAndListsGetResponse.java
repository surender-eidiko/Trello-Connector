/**
 *
 */
package org.mule.modules.trello.bean;


// TODO: Auto-generated Javadoc
/**
 * The Class BoardsByIdAndListsGetResponse.
 */
public class BoardsByIdAndListsGetResponse extends StatusResponse {
	 
 	/** The id. */
 	private String id;

	    /** The name. */
    	private String name;

	    /** The cards. */
    	private Cards[] cards;

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
    	 * Gets the cards.
    	 *
    	 * @return the cards
    	 */
    	public Cards[] getCards ()
	    {
	        return cards;
	    }

	    /**
    	 * Sets the cards.
    	 *
    	 * @param cards the new cards
    	 */
    	public void setCards (Cards[] cards)
	    {
	        this.cards = cards;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [id = "+id+", name = "+name+", cards = "+cards+"]";
	    }
}
