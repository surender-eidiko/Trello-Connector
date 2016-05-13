package org.mule.modules.trello.bean;

public class MemberIdGetResponse extends StatusResponse {
	
	private String id;

    private String username;

    private String[] organizations;

    private String fullName;

    private String url;

    private Boards[] boards;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String[] getOrganizations ()
    {
        return organizations;
    }

    public void setOrganizations (String[] organizations)
    {
        this.organizations = organizations;
    }

    public String getFullName ()
    {
        return fullName;
    }

    public void setFullName (String fullName)
    {
        this.fullName = fullName;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public Boards[] getBoards ()
    {
        return boards;
    }

    public void setBoards (Boards[] boards)
    {
        this.boards = boards;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", username = "+username+", organizations = "+organizations+", fullName = "+fullName+", url = "+url+", boards = "+boards+"]";
    }

}
