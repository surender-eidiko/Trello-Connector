/**
 *
 */
package org.mule.modules.trello.bean;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class MembersBoardsGetResponse.
 */
public class MembersBoardsGetResponse extends StatusResponse {
	
	/** The invitations. */
	private String invitations;
	
	
    /**
     * Gets the invitations.
     *
     * @return the invitations
     */
    public String getInvitations() {
		return invitations;
	}

	/**
	 * Sets the invitations.
	 *
	 * @param invitations the new invitations
	 */
	public void setInvitations(String invitations) {
		this.invitations = invitations;
	}

	/** The date last activity. */
    private String dateLastActivity;

    /** The id tags. */
    private String[] idTags;

    /** The desc. */
    private String desc;
    
    /** The desc data. */
    private DescData descData;

    /** The short link. */
    private String shortLink;

    /** The date last view. */
    private String dateLastView;

    /** The subscribed. */
    private Boolean subscribed;

    /** The url. */
    private String url;
    
    /** The label names. */
    private LabelNames labelNames;

    /** The id. */
    private String id;

    /** The prefs. */
    private Prefs prefs;

    /** The id organization. */
    private String idOrganization;

    /** The starred. */
    private String starred;

    /** The pinned. */
    private String pinned;

    /** The name. */
    private String name;
    
    /** The power ups. */
    private String[] powerUps;
    
    /** The memberships. */
    private List<Memberships> memberships;

    /** The short url. */
    private String shortUrl;

    /** The closed. */
    private String closed;

    /** The invited. */
    private String invited;
    /**
     * Gets the date last activity.
     *
     * @return the date last activity
     */
    public String getDateLastActivity ()
    {
        return dateLastActivity;
    }

    /**
     * Sets the date last activity.
     *
     * @param dateLastActivity the new date last activity
     */
    public void setDateLastActivity (String dateLastActivity)
    {
        this.dateLastActivity = dateLastActivity;
    }

    /**
     * Gets the id tags.
     *
     * @return the id tags
     */
    public String[] getIdTags ()
    {
        return idTags;
    }

    /**
     * Sets the id tags.
     *
     * @param idTags the new id tags
     */
    public void setIdTags (String[] idTags)
    {
        this.idTags = idTags;
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
     * Gets the desc data.
     *
     * @return the desc data
     */
    public DescData getDescData ()
    {
        return descData;
    }

    /**
     * Sets the desc data.
     *
     * @param descData the new desc data
     */
    public void setDescData (DescData descData)
    {
        this.descData = descData;
    }

    /**
     * Gets the short link.
     *
     * @return the short link
     */
    public String getShortLink ()
    {
        return shortLink;
    }

    /**
     * Sets the short link.
     *
     * @param shortLink the new short link
     */
    public void setShortLink (String shortLink)
    {
        this.shortLink = shortLink;
    }

    /**
     * Gets the date last view.
     *
     * @return the date last view
     */
    public String getDateLastView ()
    {
        return dateLastView;
    }

    /**
     * Sets the date last view.
     *
     * @param dateLastView the new date last view
     */
    public void setDateLastView (String dateLastView)
    {
        this.dateLastView = dateLastView;
    }

    /**
     * Gets the subscribed.
     *
     * @return the subscribed
     */
    public Boolean getSubscribed ()
    {
        return subscribed;
    }

    /**
     * Sets the subscribed.
     *
     * @param subscribed the new subscribed
     */
    public void setSubscribed (Boolean subscribed)
    {
        this.subscribed = subscribed;
    }

    /**
     * Gets the url.
     *
     * @return the url
     */
    public String getUrl ()
    {
        return url;
    }

    /**
     * Sets the url.
     *
     * @param url the new url
     */
    public void setUrl (String url)
    {
        this.url = url;
    }
   
    /**
     * Gets the label names.
     *
     * @return the label names
     */
    public LabelNames getLabelNames ()
    {
        return labelNames;
    }

    /**
     * Sets the label names.
     *
     * @param labelNames the new label names
     */
    public void setLabelNames (LabelNames labelNames)
    {
        this.labelNames = labelNames;
    }

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
     * Gets the prefs.
     *
     * @return the prefs
     */
    public Prefs getPrefs ()
    {
        return prefs;
    }

    /**
     * Sets the prefs.
     *
     * @param prefs the new prefs
     */
    public void setPrefs (Prefs prefs)
    {
        this.prefs = prefs;
    }

    /**
     * Gets the id organization.
     *
     * @return the id organization
     */
    public String getIdOrganization ()
    {
        return idOrganization;
    }

    /**
     * Sets the id organization.
     *
     * @param idOrganization the new id organization
     */
    public void setIdOrganization (String idOrganization)
    {
        this.idOrganization = idOrganization;
    }

    /**
     * Gets the starred.
     *
     * @return the starred
     */
    public String getStarred ()
    {
        return starred;
    }

    /**
     * Sets the starred.
     *
     * @param starred the new starred
     */
    public void setStarred (String starred)
    {
        this.starred = starred;
    }

    /**
     * Gets the pinned.
     *
     * @return the pinned
     */
    public String getPinned ()
    {
        return pinned;
    }

    /**
     * Sets the pinned.
     *
     * @param pinned the new pinned
     */
    public void setPinned (String pinned)
    {
        this.pinned = pinned;
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
     * Gets the power ups.
     *
     * @return the power ups
     */
    public String[] getPowerUps ()
    {
        return powerUps;
    }

    /**
     * Sets the power ups.
     *
     * @param powerUps the new power ups
     */
    public void setPowerUps (String[] powerUps)
    {
        this.powerUps = powerUps;
    }

    /**
     * Gets the memberships.
     *
     * @return the memberships
     */
    public List<Memberships> getMemberships ()
    {
        return memberships;
    }

    /**
     * Sets the memberships.
     *
     * @param memberships the new memberships
     */
    public void setMemberships (List<Memberships> memberships)
    {
        this.memberships = memberships;
    }

    /**
     * Gets the short url.
     *
     * @return the short url
     */
    public String getShortUrl ()
    {
        return shortUrl;
    }

    /**
     * Sets the short url.
     *
     * @param shortUrl the new short url
     */
    public void setShortUrl (String shortUrl)
    {
        this.shortUrl = shortUrl;
    }

    /**
     * Gets the closed.
     *
     * @return the closed
     */
    public String getClosed ()
    {
        return closed;
    }

    /**
     * Sets the closed.
     *
     * @param closed the new closed
     */
    public void setClosed (String closed)
    {
        this.closed = closed;
    }

    /**
     * Gets the invited.
     *
     * @return the invited
     */
    public String getInvited ()
    {
        return invited;
    }

    /**
     * Sets the invited.
     *
     * @param invited the new invited
     */
    public void setInvited (String invited)
    {
        this.invited = invited;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [ dateLastActivity = "+dateLastActivity+", idTags = "+idTags+", desc = "+desc+", descData = "+descData+", shortLink = "+shortLink+", dateLastView = "+dateLastView+", subscribed = "+subscribed+", url = "+url+", labelNames = "+labelNames+", id = "+id+", prefs = "+prefs+", idOrganization = "+idOrganization+", starred = "+starred+", pinned = "+pinned+", name = "+name+", powerUps = "+powerUps+", memberships = "+memberships+", shortUrl = "+shortUrl+", closed = "+closed+", invited = "+invited+"]";
    }
		

}
