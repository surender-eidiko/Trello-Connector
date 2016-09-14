/**
 *
 */
package org.mule.modules.trello.bean;

public class WebhooksPostResponse extends StatusResponse {
    private String id;

    private String idModel;

    private String description;

    private String active;

    private String callbackURL;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getIdModel ()
    {
        return idModel;
    }

    public void setIdModel (String idModel)
    {
        this.idModel = idModel;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getActive ()
    {
        return active;
    }

    public void setActive (String active)
    {
        this.active = active;
    }

    public String getCallbackURL ()
    {
        return callbackURL;
    }

    public void setCallbackURL (String callbackURL)
    {
        this.callbackURL = callbackURL;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", idModel = "+idModel+", description = "+description+", active = "+active+", callbackURL = "+callbackURL+"]";
    }
}
