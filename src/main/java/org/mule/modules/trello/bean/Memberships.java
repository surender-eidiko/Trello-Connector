/**
 *
 */
package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Memberships.
 */
public class Memberships {
	
	/** The id. */
	private String id;

    /** The id member. */
    private String idMember;

    /** The member type. */
    private String memberType;

    /** The unconfirmed. */
    private String unconfirmed;

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
     * Gets the member type.
     *
     * @return the member type
     */
    public String getMemberType ()
    {
        return memberType;
    }

    /**
     * Sets the member type.
     *
     * @param memberType the new member type
     */
    public void setMemberType (String memberType)
    {
        this.memberType = memberType;
    }

    /**
     * Gets the unconfirmed.
     *
     * @return the unconfirmed
     */
    public String getUnconfirmed ()
    {
        return unconfirmed;
    }

    /**
     * Sets the unconfirmed.
     *
     * @param unconfirmed the new unconfirmed
     */
    public void setUnconfirmed (String unconfirmed)
    {
        this.unconfirmed = unconfirmed;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", idMember = "+idMember+", memberType = "+memberType+", unconfirmed = "+unconfirmed+"]";
    }

}
