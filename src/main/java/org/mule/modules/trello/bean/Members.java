package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Members.
 */
public class Members {
	 
 	/** The id. */
 	private String id;

	    /** The username. */
    	private String username;

	    /** The full name. */
    	private String fullName;

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
    	 * Gets the username.
    	 *
    	 * @return the username
    	 */
    	public String getUsername ()
	    {
	        return username;
	    }

	    /**
    	 * Sets the username.
    	 *
    	 * @param username the new username
    	 */
    	public void setUsername (String username)
	    {
	        this.username = username;
	    }

	    /**
    	 * Gets the full name.
    	 *
    	 * @return the full name
    	 */
    	public String getFullName ()
	    {
	        return fullName;
	    }

	    /**
    	 * Sets the full name.
    	 *
    	 * @param fullName the new full name
    	 */
    	public void setFullName (String fullName)
	    {
	        this.fullName = fullName;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [id = "+id+", username = "+username+", fullName = "+fullName+"]";
	    }
}
