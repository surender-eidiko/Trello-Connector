package org.mule.modules.trello.bean;

public class Member {
    private String id;

    private String avatarHash;

    private String username;

    private String initials;

    private String fullName;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getAvatarHash ()
    {
        return avatarHash;
    }

    public void setAvatarHash (String avatarHash)
    {
        this.avatarHash = avatarHash;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getInitials ()
    {
        return initials;
    }

    public void setInitials (String initials)
    {
        this.initials = initials;
    }

    public String getFullName ()
    {
        return fullName;
    }

    public void setFullName (String fullName)
    {
        this.fullName = fullName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", avatarHash = "+avatarHash+", username = "+username+", initials = "+initials+", fullName = "+fullName+"]";
    }
}
