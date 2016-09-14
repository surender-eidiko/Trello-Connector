/**
 *
 */
package org.mule.modules.trello.bean;

import org.codehaus.jackson.annotate.JsonProperty;

public class BoardsByIdPutResponse extends StatusResponse {
	@JsonProperty("labelNames")
	private LabelNames labelNames;
	@JsonProperty("id")
    private String id;
	@JsonProperty("prefs")
    private Prefs prefs;
	@JsonProperty("idOrganization")
    private String idOrganization;
	@JsonProperty("desc")
    private String desc;
	@JsonProperty("descData")
    private DescData descData;
	@JsonProperty("pinned")
    private Boolean pinned;
	@JsonProperty("name")
    private String name;
	@JsonProperty("shortUrl")
    private String shortUrl;
	@JsonProperty("closed")
    private Boolean closed;
	@JsonProperty("url")
    private String url;

    public LabelNames getLabelNames ()
    {
        return labelNames;
    }
    
    public void setLabelNames (LabelNames labelNames)
    {
        this.labelNames = labelNames;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
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

    public String getDesc ()
    {
        return desc;
    }

    public void setDesc (String desc)
    {
        this.desc = desc;
    }

    public DescData getDescData ()
    {
        return descData;
    }
    public void setDescData (DescData descData)
    {
        this.descData = descData;
    }

    public Boolean getPinned ()
    {
        return pinned;
    }

    public void setPinned (Boolean pinned)
    {
        this.pinned = pinned;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getShortUrl ()
    {
        return shortUrl;
    }

    public void setShortUrl (String shortUrl)
    {
        this.shortUrl = shortUrl;
    }

    public Boolean getClosed ()
    {
        return closed;
    }

    public void setClosed (Boolean closed)
    {
        this.closed = closed;
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
        return "ClassPojo [labelNames = "+labelNames+", id = "+id+", prefs = "+prefs+", idOrganization = "+idOrganization+", desc = "+desc+", descData = "+descData+", pinned = "+pinned+", name = "+name+", shortUrl = "+shortUrl+", closed = "+closed+", url = "+url+"]";
    }
}
