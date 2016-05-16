/**
 *
 */
package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class OrganizationGetResponse.
 */
public class OrganizationGetResponse extends StatusResponse {

    /** The id. */
    private String id;

    /** The desc. */
    private String desc;

    /** The name. */
    private String name;

    /** The members. */
    private Members[] members;

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
     * Gets the members.
     *
     * @return the members
     */
    public Members[] getMembers ()
    {
        return members;
    }

    /**
     * Sets the members.
     *
     * @param members the new members
     */
    public void setMembers (Members[] members)
    {
        this.members = members;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", desc = "+desc+", name = "+name+", members = "+members+"]";
    }
}
