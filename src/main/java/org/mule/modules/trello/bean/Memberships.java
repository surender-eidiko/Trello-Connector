package org.mule.modules.trello.bean;

public class Memberships {
	
	private String id;

    private String idMember;

    private String memberType;

    private String unconfirmed;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getIdMember ()
    {
        return idMember;
    }

    public void setIdMember (String idMember)
    {
        this.idMember = idMember;
    }

    public String getMemberType ()
    {
        return memberType;
    }

    public void setMemberType (String memberType)
    {
        this.memberType = memberType;
    }

    public String getUnconfirmed ()
    {
        return unconfirmed;
    }

    public void setUnconfirmed (String unconfirmed)
    {
        this.unconfirmed = unconfirmed;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", idMember = "+idMember+", memberType = "+memberType+", unconfirmed = "+unconfirmed+"]";
    }

}
