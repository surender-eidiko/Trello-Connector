package org.mule.modules.trello.bean;

public class MemberByIdGetresponse extends StatusResponse {
	
	private String id;

    private String username;

    private String email;

    private Organizations[] organizations;

    private String fullName;

    private String url;

    private MemberBoards[] boards;

    public void setBoards(MemberBoards[] boards) {
		this.boards = boards;
	}

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

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public Organizations[] getOrganizations ()
    {
        return organizations;
    }

    public void setOrganizations (Organizations[] organizations)
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

   

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", username = "+username+", email = "+email+", organizations = "+organizations+", fullName = "+fullName+", url = "+url+", boards = "+boards+"]";
    }
}
