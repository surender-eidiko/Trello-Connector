package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class MemberIdGetResponse.
 */
public class MemberIdGetResponse extends StatusResponse {
	
	/** The id. */
	private String id;

    /** The username. */
    private String username;

    /** The organizations. */
    private String[] organizations;

    /** The full name. */
    private String fullName;

    /** The url. */
    private String url;

    /** The boards. */
    private Boards[] boards;

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
     * Gets the organizations.
     *
     * @return the organizations
     */
    public String[] getOrganizations ()
    {
        return organizations;
    }

    /**
     * Sets the organizations.
     *
     * @param organizations the new organizations
     */
    public void setOrganizations (String[] organizations)
    {
        this.organizations = organizations;
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

    /**
     * Gets the boards.
     *
     * @return the boards
     */
    public Boards[] getBoards ()
    {
        return boards;
    }

    /**
     * Sets the boards.
     *
     * @param boards the new boards
     */
    public void setBoards (Boards[] boards)
    {
        this.boards = boards;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", username = "+username+", organizations = "+organizations+", fullName = "+fullName+", url = "+url+", boards = "+boards+"]";
    }

}
