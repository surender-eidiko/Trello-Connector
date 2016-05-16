/**
 *
 */
package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class CheckListsGetResponse.
 */
public class CheckListsGetResponse extends StatusResponse {
	
	/** The id. */
	private String id;

    /** The check items. */
    private CheckItems[] checkItems;

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
        return "ClassPojo [id = "+id+", checkItems = "+checkItems+", name = "+name+", cards = "+cards+"]";
    }
}
