/**
 *
 */
package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class TokensGetResponse.
 */
public class TokensGetResponse extends StatusResponse {
	
	/** The id. */
	private String id;

    /** The id member. */
    private String idMember;

    /** The permissions. */
    private Permissions[] permissions;

    /** The date created. */
    private String dateCreated;

    /** The identifier. */
    private String identifier;

    /** The date expires. */
    private String dateExpires;

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
     * Gets the id member.
     *
     * @return the id member
     */
    public String getIdMember ()
    {
        return idMember;
    }

    /**
     * Sets the id member.
     *
     * @param idMember the new id member
     */
    public void setIdMember (String idMember)
    {
        this.idMember = idMember;
    }

    /**
     * Gets the permissions.
     *
     * @return the permissions
     */
    public Permissions[] getPermissions ()
    {
        return permissions;
    }

    /**
     * Sets the permissions.
     *
     * @param permissions the new permissions
     */
    public void setPermissions (Permissions[] permissions)
    {
        this.permissions = permissions;
    }

    /**
     * Gets the date created.
     *
     * @return the date created
     */
    public String getDateCreated ()
    {
        return dateCreated;
    }

    /**
     * Sets the date created.
     *
     * @param dateCreated the new date created
     */
    public void setDateCreated (String dateCreated)
    {
        this.dateCreated = dateCreated;
    }

    /**
     * Gets the identifier.
     *
     * @return the identifier
     */
    public String getIdentifier ()
    {
        return identifier;
    }

    /**
     * Sets the identifier.
     *
     * @param identifier the new identifier
     */
    public void setIdentifier (String identifier)
    {
        this.identifier = identifier;
    }

    /**
     * Gets the date expires.
     *
     * @return the date expires
     */
    public String getDateExpires ()
    {
        return dateExpires;
    }

    /**
     * Sets the date expires.
     *
     * @param dateExpires the new date expires
     */
    public void setDateExpires (String dateExpires)
    {
        this.dateExpires = dateExpires;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", idMember = "+idMember+", permissions = "+permissions+", dateCreated = "+dateCreated+", identifier = "+identifier+", dateExpires = "+dateExpires+"]";
    }
}
