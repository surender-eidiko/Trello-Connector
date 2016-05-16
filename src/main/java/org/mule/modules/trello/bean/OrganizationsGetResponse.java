
package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class OrganizationsGetResponse.
 */
public class OrganizationsGetResponse extends StatusResponse {
	
	/** The logo hash. */
	private String logoHash;

    /** The invitations. */
    private String[] invitations;

    /** The billable member count. */
    private String billableMemberCount;

    /** The premium features. */
    private String[] premiumFeatures;

    /** The desc. */
    private String desc;

    /** The desc data. */
    private String descData;

    /** The website. */
    private String website;

    /** The url. */
    private String url;

    /** The id boards. */
    private String[] idBoards;

    /** The id. */
    private String id;

    /** The prefs. */
    private OrganizationPref prefs;

    /** The name. */
    private String name;

    /** The power ups. */
    private String[] powerUps;

    /** The memberships. */
    private Memberships[] memberships;

    /** The display name. */
    private String displayName;

    /** The products. */
    private String[] products;

    /** The invited. */
    private String invited;

    /**
     * Gets the logo hash.
     *
     * @return the logo hash
     */
    public String getLogoHash ()
    {
        return logoHash;
    }

    /**
     * Sets the logo hash.
     *
     * @param logoHash the new logo hash
     */
    public void setLogoHash (String logoHash)
    {
        this.logoHash = logoHash;
    }

    /**
     * Gets the invitations.
     *
     * @return the invitations
     */
    public String[] getInvitations ()
    {
        return invitations;
    }

    /**
     * Sets the invitations.
     *
     * @param invitations the new invitations
     */
    public void setInvitations (String[] invitations)
    {
        this.invitations = invitations;
    }

    /**
     * Gets the billable member count.
     *
     * @return the billable member count
     */
    public String getBillableMemberCount ()
    {
        return billableMemberCount;
    }

    /**
     * Sets the billable member count.
     *
     * @param billableMemberCount the new billable member count
     */
    public void setBillableMemberCount (String billableMemberCount)
    {
        this.billableMemberCount = billableMemberCount;
    }

    /**
     * Gets the premium features.
     *
     * @return the premium features
     */
    public String[] getPremiumFeatures ()
    {
        return premiumFeatures;
    }

    /**
     * Sets the premium features.
     *
     * @param premiumFeatures the new premium features
     */
    public void setPremiumFeatures (String[] premiumFeatures)
    {
        this.premiumFeatures = premiumFeatures;
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
    public String getDescData ()
    {
        return descData;
    }

    /**
     * Sets the desc data.
     *
     * @param descData the new desc data
     */
    public void setDescData (String descData)
    {
        this.descData = descData;
    }

    /**
     * Gets the website.
     *
     * @return the website
     */
    public String getWebsite ()
    {
        return website;
    }

    /**
     * Sets the website.
     *
     * @param website the new website
     */
    public void setWebsite (String website)
    {
        this.website = website;
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
     * Gets the id boards.
     *
     * @return the id boards
     */
    public String[] getIdBoards ()
    {
        return idBoards;
    }

    /**
     * Sets the id boards.
     *
     * @param idBoards the new id boards
     */
    public void setIdBoards (String[] idBoards)
    {
        this.idBoards = idBoards;
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
    public OrganizationPref getPrefs ()
    {
        return prefs;
    }

    /**
     * Sets the prefs.
     *
     * @param prefs the new prefs
     */
    public void setPrefs (OrganizationPref prefs)
    {
        this.prefs = prefs;
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
    public Memberships[] getMemberships ()
    {
        return memberships;
    }

    /**
     * Sets the memberships.
     *
     * @param memberships the new memberships
     */
    public void setMemberships (Memberships[] memberships)
    {
        this.memberships = memberships;
    }

    /**
     * Gets the display name.
     *
     * @return the display name
     */
    public String getDisplayName ()
    {
        return displayName;
    }

    /**
     * Sets the display name.
     *
     * @param displayName the new display name
     */
    public void setDisplayName (String displayName)
    {
        this.displayName = displayName;
    }

    /**
     * Gets the products.
     *
     * @return the products
     */
    public String[] getProducts ()
    {
        return products;
    }

    /**
     * Sets the products.
     *
     * @param products the new products
     */
    public void setProducts (String[] products)
    {
        this.products = products;
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
        return "ClassPojo [logoHash = "+logoHash+", invitations = "+invitations+", billableMemberCount = "+billableMemberCount+", premiumFeatures = "+premiumFeatures+", desc = "+desc+", descData = "+descData+", website = "+website+", url = "+url+", idBoards = "+idBoards+", id = "+id+", prefs = "+prefs+", name = "+name+", powerUps = "+powerUps+", memberships = "+memberships+", displayName = "+displayName+", products = "+products+", invited = "+invited+"]";
    }

}
