package org.mule.modules.trello.bean;

public class OrganizationGetResponse extends StatusResponse {

    private String id;

    private String desc;

    private String name;

    private Members[] members;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getDesc ()
    {
        return desc;
    }

    public void setDesc (String desc)
    {
        this.desc = desc;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public Members[] getMembers ()
    {
        return members;
    }

    public void setMembers (Members[] members)
    {
        this.members = members;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", desc = "+desc+", name = "+name+", members = "+members+"]";
    }
}
