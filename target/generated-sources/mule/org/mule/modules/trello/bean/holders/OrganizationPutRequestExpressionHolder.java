
package org.mule.modules.trello.bean.holders;

import javax.annotation.Generated;
import org.mule.modules.trello.bean.OrganizationPref;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-18T04:08:12+05:30", comments = "Build 3.7.x.2633.51164b9")
public class OrganizationPutRequestExpressionHolder {

    protected Object name;
    protected String _nameType;
    protected Object displayName;
    protected String _displayNameType;
    protected Object desc;
    protected String _descType;
    protected Object website;
    protected String _websiteType;
    protected Object pref;
    protected OrganizationPref _prefType;

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
     * Sets displayName
     * 
     * @param value Value to set
     */
    public void setDisplayName(Object value) {
        this.displayName = value;
    }

    /**
     * Retrieves displayName
     * 
     */
    public Object getDisplayName() {
        return this.displayName;
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
     * Sets website
     * 
     * @param value Value to set
     */
    public void setWebsite(Object value) {
        this.website = value;
    }

    /**
     * Retrieves website
     * 
     */
    public Object getWebsite() {
        return this.website;
    }

    /**
     * Sets pref
     * 
     * @param value Value to set
     */
    public void setPref(Object value) {
        this.pref = value;
    }

    /**
     * Retrieves pref
     * 
     */
    public Object getPref() {
        return this.pref;
    }

}
