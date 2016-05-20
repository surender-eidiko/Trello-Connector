
package org.mule.modules.trello.bean.holders;

import javax.annotation.Generated;
import org.mule.modules.trello.bean.BoardsPref;
import org.mule.modules.trello.bean.LabelNames;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-20T07:24:31+05:30", comments = "Build 3.7.x.2633.51164b9")
public class BoardsByIdPutRequestExpressionHolder {

    protected Object name;
    protected String _nameType;
    protected Object desc;
    protected String _descType;
    protected Object closed;
    protected Boolean _closedType;
    protected Object subscribed;
    protected Boolean _subscribedType;
    protected Object idOrganization;
    protected String _idOrganizationType;
    protected Object prefs;
    protected BoardsPref _prefsType;
    protected Object labelNames;
    protected LabelNames _labelNamesType;

    /**
     * Sets name
     * 
     * @param value Value to set
     */
    public void setName(Object value) {
        this.name = value;
    }

    /**
     * Retrieves name
     * 
     */
    public Object getName() {
        return this.name;
    }

    /**
     * Sets desc
     * 
     * @param value Value to set
     */
    public void setDesc(Object value) {
        this.desc = value;
    }

    /**
     * Retrieves desc
     * 
     */
    public Object getDesc() {
        return this.desc;
    }

    /**
     * Sets closed
     * 
     * @param value Value to set
     */
    public void setClosed(Object value) {
        this.closed = value;
    }

    /**
     * Retrieves closed
     * 
     */
    public Object getClosed() {
        return this.closed;
    }

    /**
     * Sets subscribed
     * 
     * @param value Value to set
     */
    public void setSubscribed(Object value) {
        this.subscribed = value;
    }

    /**
     * Retrieves subscribed
     * 
     */
    public Object getSubscribed() {
        return this.subscribed;
    }

    /**
     * Sets idOrganization
     * 
     * @param value Value to set
     */
    public void setIdOrganization(Object value) {
        this.idOrganization = value;
    }

    /**
     * Retrieves idOrganization
     * 
     */
    public Object getIdOrganization() {
        return this.idOrganization;
    }

    /**
     * Sets prefs
     * 
     * @param value Value to set
     */
    public void setPrefs(Object value) {
        this.prefs = value;
    }

    /**
     * Retrieves prefs
     * 
     */
    public Object getPrefs() {
        return this.prefs;
    }

    /**
     * Sets labelNames
     * 
     * @param value Value to set
     */
    public void setLabelNames(Object value) {
        this.labelNames = value;
    }

    /**
     * Retrieves labelNames
     * 
     */
    public Object getLabelNames() {
        return this.labelNames;
    }

}
