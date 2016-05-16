/**
 *
 */
package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Member.
 */
public class Member {
    
    /** The id. */
    private String id;

    /** The avatar hash. */
    private String avatarHash;

    /** The username. */
    private String username;

    /** The initials. */
    private String initials;

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
     * Gets the avatar hash.
     *
     * @return the avatar hash
     */
    public String getAvatarHash ()
    {
        return avatarHash;
    }

    /**
     * Sets the avatar hash.
     *
     * @param avatarHash the new avatar hash
     */
    public void setAvatarHash (String avatarHash)
    {
        this.avatarHash = avatarHash;
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
     * Gets the initials.
     *
     * @return the initials
     */
    public String getInitials ()
    {
        return initials;
    }

    /**
     * Sets the initials.
     *
     * @param initials the new initials
     */
    public void setInitials (String initials)
    {
        this.initials = initials;
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
        return "ClassPojo [id = "+id+", avatarHash = "+avatarHash+", username = "+username+", initials = "+initials+", fullName = "+fullName+"]";
    }
}
