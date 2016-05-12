package org.mule.modules.trello.bean;


public class BoardsByIdAndCardsGetResponse extends StatusResponse {
	private String id;

    private String name;

    private String idList;

    private String url;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
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

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", name = "+name+", idList = "+idList+", url = "+url+"]";
    }
}
