
package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class BoardsByIdGetResponse.
 */
public class BoardsByIdGetResponse extends StatusResponse {
	 
 	/** The id. */
 	private String id;

	    /** The desc. */
    	private String desc;

	    /** The name. */
    	private String name;

	    /** The lists. */
    	private Lists[] lists;

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
    	 * Gets the desc.
    	 *
    	 * @return the desc
    	 */
    	public String getDesc ()
	    {
	        return desc;
	    }

	    /**
    	 * Sets the desc.
    	 *
    	 * @param desc the new desc
    	 */
    	public void setDesc (String desc)
	    {
	        this.desc = desc;
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
    	 * Gets the lists.
    	 *
    	 * @return the lists
    	 */
    	public Lists[] getLists ()
	    {
	        return lists;
	    }

	    /**
    	 * Sets the lists.
    	 *
    	 * @param lists the new lists
    	 */
    	public void setLists (Lists[] lists)
	    {
	        this.lists = lists;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [id = "+id+", desc = "+desc+", name = "+name+", lists = "+lists+"]";
	    }
}
