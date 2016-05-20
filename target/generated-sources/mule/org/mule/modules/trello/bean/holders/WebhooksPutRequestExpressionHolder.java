
package org.mule.modules.trello.bean.holders;

import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-20T07:24:31+05:30", comments = "Build 3.7.x.2633.51164b9")
public class WebhooksPutRequestExpressionHolder {

    protected Object description;
    protected String _descriptionType;
    protected Object callbackURL;
    protected String _callbackURLType;
    protected Object idModel;
    protected String _idModelType;

    /**
     * Sets description
     * 
     * @param value Value to set
     */
    public void setDescription(Object value) {
        this.description = value;
    }

    /**
     * Retrieves description
     * 
     */
    public Object getDescription() {
        return this.description;
    }

    /**
     * Sets callbackURL
     * 
     * @param value Value to set
     */
    public void setCallbackURL(Object value) {
        this.callbackURL = value;
    }

    /**
     * Retrieves callbackURL
     * 
     */
    public Object getCallbackURL() {
        return this.callbackURL;
    }

    /**
     * Sets idModel
     * 
     * @param value Value to set
     */
    public void setIdModel(Object value) {
        this.idModel = value;
    }

    /**
     * Retrieves idModel
     * 
     */
    public Object getIdModel() {
        return this.idModel;
    }

}
