package org.mule.modules.trello.bean;

public class MembersBoardsGetResponse extends StatusResponse {
	
	private String dateLastActivity;

    private String[] invitations;

    private String desc;

    private String shortLink;

    private String descData;

    private String dateLastView;

    private String subscribed;

    private String url;

    private String id;

    private LabelNames labelNames;

    private Prefs prefs;

    private String idOrganization;

    private String starred;

    private String pinned;

    private String[] powerUps;

    private String name;

    private Memberships[] memberships;

    private String shortUrl;

    private String closed;

    private String invited;

    public String getDateLastActivity ()
    {
        return dateLastActivity;
    }

    public void setDateLastActivity (String dateLastActivity)
    {
        this.dateLastActivity = dateLastActivity;
    }

    public String[] getInvitations ()
    {
        return invitations;
    }

    public void setInvitations (String[] invitations)
    {
        this.invitations = invitations;
    }

    public String getDesc ()
    {
        return desc;
    }

    public void setDesc (String desc)
    {
        this.desc = desc;
    }

    public String getShortLink ()
    {
        return shortLink;
    }

    public void setShortLink (String shortLink)
    {
        this.shortLink = shortLink;
    }

    public String getDescData ()
    {
        return descData;
    }

    public void setDescData (String descData)
    {
        this.descData = descData;
    }

    public String getDateLastView ()
    {
        return dateLastView;
    }

    public void setDateLastView (String dateLastView)
    {
        this.dateLastView = dateLastView;
    }

    public String getSubscribed ()
    {
        return subscribed;
    }

    public void setSubscribed (String subscribed)
    {
        this.subscribed = subscribed;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public LabelNames getLabelNames ()
    {
        return labelNames;
    }

    public void setLabelNames (LabelNames labelNames)
    {
        this.labelNames = labelNames;
    }

    public Prefs getPrefs ()
    {
        return prefs;
    }

    public void setPrefs (Prefs prefs)
    {
        this.prefs = prefs;
    }

    public String getIdOrganization ()
    {
        return idOrganization;
    }

    public void setIdOrganization (String idOrganization)
    {
        this.idOrganization = idOrganization;
    }

    public String getStarred ()
    {
        return starred;
    }

    public void setStarred (String starred)
    {
        this.starred = starred;
    }

    public String getPinned ()
    {
        return pinned;
    }

    public void setPinned (String pinned)
    {
        this.pinned = pinned;
    }

    public String[] getPowerUps ()
    {
        return powerUps;
    }

    public void setPowerUps (String[] powerUps)
    {
        this.powerUps = powerUps;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public Memberships[] getMemberships ()
    {
        return memberships;
    }

    public void setMemberships (Memberships[] memberships)
    {
        this.memberships = memberships;
    }

    public String getShortUrl ()
    {
        return shortUrl;
    }

    public void setShortUrl (String shortUrl)
    {
        this.shortUrl = shortUrl;
    }

    public String getClosed ()
    {
        return closed;
    }

    public void setClosed (String closed)
    {
        this.closed = closed;
    }

    public String getInvited ()
    {
        return invited;
    }

    public void setInvited (String invited)
    {
        this.invited = invited;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [dateLastActivity = "+dateLastActivity+", invitations = "+invitations+", desc = "+desc+", shortLink = "+shortLink+", descData = "+descData+", dateLastView = "+dateLastView+", subscribed = "+subscribed+", url = "+url+", id = "+id+", labelNames = "+labelNames+", prefs = "+prefs+", idOrganization = "+idOrganization+", starred = "+starred+", pinned = "+pinned+", powerUps = "+powerUps+", name = "+name+", memberships = "+memberships+", shortUrl = "+shortUrl+", closed = "+closed+", invited = "+invited+"]";
    }

}
