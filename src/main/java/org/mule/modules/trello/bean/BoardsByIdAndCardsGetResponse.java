/**
 *
 */
package org.mule.modules.trello.bean;


// TODO: Auto-generated Javadoc
/**
 * The Class BoardsByIdAndCardsGetResponse.
 */
public class BoardsByIdAndCardsGetResponse extends StatusResponse {
	
	/** The id. */
	private String id;

    /** The name. */
    private String name;

    /** The id list. */
    private String idList;

    /** The url. */
    private String url;

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
     * Gets the id list.
     *
     * @return the id list
     */
    public String getIdList ()
    {
        return idList;
    }

    /**
     * Sets the id list.
     *
     * @param idList the new id list
     */
    public void setIdList (String idList)
    {
        this.idList = idList;
    }

    /**
     * Gets the url.
     *
     * @return the url
     */
    public String getUrl ()
    {
        return url;
    }

    /**
     * Sets the url.
     *
     * @param url the new url
     */
    public void setUrl (String url)
    {
        this.url = url;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", name = "+name+", idList = "+idList+", url = "+url+"]";
    }
}
