package org.mule.modules.trello.bean;

public class ListCardsGetResponse extends StatusResponse{
	private String dateLastActivity;

    private String[] idChecklists;

    private String desc;

    private String shortLink;

    private String idShort;

    private String[] checkItemStates;

    private String descData;

    private String[] idMembersVoted;

    private String[] labels;

    private String subscribed;

    private String idList;

    private String url;

    private String pos;

    private String idBoard;

    private String id;

    private Badges badges;

    private String manualCoverAttachment;

    private String email;

    private String name;

    private String idAttachmentCover;

    private String due;

    private String shortUrl;

    private String[] idMembers;

    private String closed;

    private String[] idLabels;

    public String getDateLastActivity ()
    {
        return dateLastActivity;
    }

    public void setDateLastActivity (String dateLastActivity)
    {
        this.dateLastActivity = dateLastActivity;
    }

    public String[] getIdChecklists ()
    {
        return idChecklists;
    }

    public void setIdChecklists (String[] idChecklists)
    {
        this.idChecklists = idChecklists;
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

    public String getIdShort ()
    {
        return idShort;
    }

    public void setIdShort (String idShort)
    {
        this.idShort = idShort;
    }

    public String[] getCheckItemStates ()
    {
        return checkItemStates;
    }

    public void setCheckItemStates (String[] checkItemStates)
    {
        this.checkItemStates = checkItemStates;
    }

    public String getDescData ()
    {
        return descData;
    }

    public void setDescData (String descData)
    {
        this.descData = descData;
    }

    public String[] getIdMembersVoted ()
    {
        return idMembersVoted;
    }

    public void setIdMembersVoted (String[] idMembersVoted)
    {
        this.idMembersVoted = idMembersVoted;
    }

    public String[] getLabels ()
    {
        return labels;
    }

    public void setLabels (String[] labels)
    {
        this.labels = labels;
    }

    public String getSubscribed ()
    {
        return subscribed;
    }

    public void setSubscribed (String subscribed)
    {
        this.subscribed = subscribed;
    }

    public String getIdList ()
    {
        return idList;
    }

    public void setIdList (String idList)
    {
        this.idList = idList;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getPos ()
    {
        return pos;
    }

    public void setPos (String pos)
    {
        this.pos = pos;
    }

    public String getIdBoard ()
    {
        return idBoard;
    }

    public void setIdBoard (String idBoard)
    {
        this.idBoard = idBoard;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Badges getBadges ()
    {
        return badges;
    }

    public void setBadges (Badges badges)
    {
        this.badges = badges;
    }

    public String getManualCoverAttachment ()
    {
        return manualCoverAttachment;
    }

    public void setManualCoverAttachment (String manualCoverAttachment)
    {
        this.manualCoverAttachment = manualCoverAttachment;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getIdAttachmentCover ()
    {
        return idAttachmentCover;
    }

    public void setIdAttachmentCover (String idAttachmentCover)
    {
        this.idAttachmentCover = idAttachmentCover;
    }

    public String getDue ()
    {
        return due;
    }

    public void setDue (String due)
    {
        this.due = due;
    }

    public String getShortUrl ()
    {
        return shortUrl;
    }

    public void setShortUrl (String shortUrl)
    {
        this.shortUrl = shortUrl;
    }

    public String[] getIdMembers ()
    {
        return idMembers;
    }

    public void setIdMembers (String[] idMembers)
    {
        this.idMembers = idMembers;
    }

    public String getClosed ()
    {
        return closed;
    }

    public void setClosed (String closed)
    {
        this.closed = closed;
    }

    public String[] getIdLabels ()
    {
        return idLabels;
    }

    public void setIdLabels (String[] idLabels)
    {
        this.idLabels = idLabels;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [dateLastActivity = "+dateLastActivity+", idChecklists = "+idChecklists+", desc = "+desc+", shortLink = "+shortLink+", idShort = "+idShort+", checkItemStates = "+checkItemStates+", descData = "+descData+", idMembersVoted = "+idMembersVoted+", labels = "+labels+", subscribed = "+subscribed+", idList = "+idList+", url = "+url+", pos = "+pos+", idBoard = "+idBoard+", id = "+id+", badges = "+badges+", manualCoverAttachment = "+manualCoverAttachment+", email = "+email+", name = "+name+", idAttachmentCover = "+idAttachmentCover+", due = "+due+", shortUrl = "+shortUrl+", idMembers = "+idMembers+", closed = "+closed+", idLabels = "+idLabels+"]";
    }
}
