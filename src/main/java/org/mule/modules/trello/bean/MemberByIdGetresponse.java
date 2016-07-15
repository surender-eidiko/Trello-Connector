package org.mule.modules.trello.bean;

public class MemberByIdGetresponse extends StatusResponse {
	
	private String[] idPremOrgsAdmin;

    private String avatarHash;

    private String memberType;

    private String avatarSource;

    private String[] oneTimeMessagesDismissed;

    private String id;

    private String username;

    private String confirmed;

    private MemberPrefs prefs;

    private String initials;

    private String[] idOrganizations;

    private String[] products;

    private String uploadedAvatarHash;

    private String[] premiumFeatures;

    private BioData bioData;

    private String status;

    private String url;

    private String[] idBoards;

    private String idBoardsPinned;

    private String bio;

    private String email;

    private String[] loginTypes;

    private String fullName;

    private String gravatarHash;

    private String[] trophies;

    public String[] getIdPremOrgsAdmin ()
    {
        return idPremOrgsAdmin;
    }

    public void setIdPremOrgsAdmin (String[] idPremOrgsAdmin)
    {
        this.idPremOrgsAdmin = idPremOrgsAdmin;
    }

    public String getAvatarHash ()
    {
        return avatarHash;
    }

    public void setAvatarHash (String avatarHash)
    {
        this.avatarHash = avatarHash;
    }

    public String getMemberType ()
    {
        return memberType;
    }

    public void setMemberType (String memberType)
    {
        this.memberType = memberType;
    }

    public String getAvatarSource ()
    {
        return avatarSource;
    }

    public void setAvatarSource (String avatarSource)
    {
        this.avatarSource = avatarSource;
    }

    public String[] getOneTimeMessagesDismissed ()
    {
        return oneTimeMessagesDismissed;
    }

    public void setOneTimeMessagesDismissed (String[] oneTimeMessagesDismissed)
    {
        this.oneTimeMessagesDismissed = oneTimeMessagesDismissed;
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

    public String getConfirmed ()
    {
        return confirmed;
    }

    public void setConfirmed (String confirmed)
    {
        this.confirmed = confirmed;
    }

    public MemberPrefs getPrefs ()
    {
        return prefs;
    }

    public void setPrefs (MemberPrefs prefs)
    {
        this.prefs = prefs;
    }

    public String getInitials ()
    {
        return initials;
    }

    public void setInitials (String initials)
    {
        this.initials = initials;
    }

    public String[] getIdOrganizations ()
    {
        return idOrganizations;
    }

    public void setIdOrganizations (String[] idOrganizations)
    {
        this.idOrganizations = idOrganizations;
    }

    public String[] getProducts ()
    {
        return products;
    }

    public void setProducts (String[] products)
    {
        this.products = products;
    }

    public String getUploadedAvatarHash ()
    {
        return uploadedAvatarHash;
    }

    public void setUploadedAvatarHash (String uploadedAvatarHash)
    {
        this.uploadedAvatarHash = uploadedAvatarHash;
    }

    public String[] getPremiumFeatures ()
    {
        return premiumFeatures;
    }

    public void setPremiumFeatures (String[] premiumFeatures)
    {
        this.premiumFeatures = premiumFeatures;
    }

    public BioData getBioData ()
    {
        return bioData;
    }

    public void setBioData (BioData bioData)
    {
        this.bioData = bioData;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
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

    public String getIdBoardsPinned ()
    {
        return idBoardsPinned;
    }

    public void setIdBoardsPinned (String idBoardsPinned)
    {
        this.idBoardsPinned = idBoardsPinned;
    }

    public String getBio ()
    {
        return bio;
    }

    public void setBio (String bio)
    {
        this.bio = bio;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String[] getLoginTypes ()
    {
        return loginTypes;
    }

    public void setLoginTypes (String[] loginTypes)
    {
        this.loginTypes = loginTypes;
    }

    public String getFullName ()
    {
        return fullName;
    }

    public void setFullName (String fullName)
    {
        this.fullName = fullName;
    }

    public String getGravatarHash ()
    {
        return gravatarHash;
    }

    public void setGravatarHash (String gravatarHash)
    {
        this.gravatarHash = gravatarHash;
    }

    public String[] getTrophies ()
    {
        return trophies;
    }

    public void setTrophies (String[] trophies)
    {
        this.trophies = trophies;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [idPremOrgsAdmin = "+idPremOrgsAdmin+", avatarHash = "+avatarHash+", memberType = "+memberType+", avatarSource = "+avatarSource+", oneTimeMessagesDismissed = "+oneTimeMessagesDismissed+", id = "+id+", username = "+username+", confirmed = "+confirmed+", prefs = "+prefs+", initials = "+initials+", idOrganizations = "+idOrganizations+", products = "+products+", uploadedAvatarHash = "+uploadedAvatarHash+", premiumFeatures = "+premiumFeatures+", bioData = "+bioData+", status = "+status+", url = "+url+", idBoards = "+idBoards+", idBoardsPinned = "+idBoardsPinned+", bio = "+bio+", email = "+email+", loginTypes = "+loginTypes+", fullName = "+fullName+", gravatarHash = "+gravatarHash+", trophies = "+trophies+"]";
    }
}
