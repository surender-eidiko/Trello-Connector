package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class CheckItems.
 */
public class CheckItems extends StatusResponse {
	 
 	/** The id. */
 	private String id;

	    /** The name data. */
    	private String nameData;

	    /** The name. */
    	private String name;

	    /** The state. */
    	private String state;

	    /** The pos. */
    	private String pos;

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
    	 * Gets the name data.
    	 *
    	 * @return the name data
    	 */
    	public String getNameData ()
	    {
	        return nameData;
	    }

	    /**
    	 * Sets the name data.
    	 *
    	 * @param nameData the new name data
    	 */
    	public void setNameData (String nameData)
	    {
	        this.nameData = nameData;
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
    	 * Gets the state.
    	 *
    	 * @return the state
    	 */
    	public String getState ()
	    {
	        return state;
	    }

	    /**
    	 * Sets the state.
    	 *
    	 * @param state the new state
    	 */
    	public void setState (String state)
	    {
	        this.state = state;
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

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [id = "+id+", nameData = "+nameData+", name = "+name+", state = "+state+", pos = "+pos+"]";
	    }
}
