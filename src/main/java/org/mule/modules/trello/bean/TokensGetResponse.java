package org.mule.modules.trello.bean;

public class TokensGetResponse extends StatusResponse {
	private String id;

    private String idMember;

    private Permissions[] permissions;

    private String dateCreated;

    private String identifier;

    private String dateExpires;

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

    public Permissions[] getPermissions ()
    {
        return permissions;
    }

    public void setPermissions (Permissions[] permissions)
    {
        this.permissions = permissions;
    }

    public String getDateCreated ()
    {
        return dateCreated;
    }

    public void setDateCreated (String dateCreated)
    {
        this.dateCreated = dateCreated;
    }

    public String getIdentifier ()
    {
        return identifier;
    }

    public void setIdentifier (String identifier)
    {
        this.identifier = identifier;
    }

    public String getDateExpires ()
    {
        return dateExpires;
    }

    public void setDateExpires (String dateExpires)
    {
        this.dateExpires = dateExpires;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", idMember = "+idMember+", permissions = "+permissions+", dateCreated = "+dateCreated+", identifier = "+identifier+", dateExpires = "+dateExpires+"]";
    }
}
