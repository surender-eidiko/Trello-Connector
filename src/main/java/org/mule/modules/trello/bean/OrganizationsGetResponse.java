package org.mule.modules.trello.bean;

public class OrganizationsGetResponse extends StatusResponse {
	
	private String logoHash;

    private String[] invitations;

    private String billableMemberCount;

    private String[] premiumFeatures;

    private String desc;

    private String descData;

    private String website;

    private String url;

    private String[] idBoards;

    private String id;

    private OrganizationPrefs prefs;

    private String name;

    private String[] powerUps;

    private Memberships[] memberships;

    private String displayName;

    private String[] products;

    private String invited;

    public String getLogoHash ()
    {
        return logoHash;
    }

    public void setLogoHash (String logoHash)
    {
        this.logoHash = logoHash;
    }

    public String[] getInvitations ()
    {
        return invitations;
    }

    public void setInvitations (String[] invitations)
    {
        this.invitations = invitations;
    }

    public String getBillableMemberCount ()
    {
        return billableMemberCount;
    }

    public void setBillableMemberCount (String billableMemberCount)
    {
        this.billableMemberCount = billableMemberCount;
    }

    public String[] getPremiumFeatures ()
    {
        return premiumFeatures;
    }

    public void setPremiumFeatures (String[] premiumFeatures)
    {
        this.premiumFeatures = premiumFeatures;
    }

    public String getDesc ()
    {
        return desc;
    }

    public void setDesc (String desc)
    {
        this.desc = desc;
    }

    public String getDescData ()
    {
        return descData;
    }

    public void setDescData (String descData)
    {
        this.descData = descData;
    }

    public String getWebsite ()
    {
        return website;
    }

    public void setWebsite (String website)
    {
        this.website = website;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String[] getIdBoards ()
    {
        return idBoards;
    }

    public void setIdBoards (String[] idBoards)
    {
        this.idBoards = idBoards;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public OrganizationPrefs getPrefs ()
    {
        return prefs;
    }

    public void setPrefs (OrganizationPrefs prefs)
    {
        this.prefs = prefs;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String[] getPowerUps ()
    {
        return powerUps;
    }

    public void setPowerUps (String[] powerUps)
    {
        this.powerUps = powerUps;
    }

    public Memberships[] getMemberships ()
    {
        return memberships;
    }

    public void setMemberships (Memberships[] memberships)
    {
        this.memberships = memberships;
    }

    public String getDisplayName ()
    {
        return displayName;
    }

    public void setDisplayName (String displayName)
    {
        this.displayName = displayName;
    }

    public String[] getProducts ()
    {
        return products;
    }

    public void setProducts (String[] products)
    {
        this.products = products;
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
        return "ClassPojo [logoHash = "+logoHash+", invitations = "+invitations+", billableMemberCount = "+billableMemberCount+", premiumFeatures = "+premiumFeatures+", desc = "+desc+", descData = "+descData+", website = "+website+", url = "+url+", idBoards = "+idBoards+", id = "+id+", prefs = "+prefs+", name = "+name+", powerUps = "+powerUps+", memberships = "+memberships+", displayName = "+displayName+", products = "+products+", invited = "+invited+"]";
    }

}
