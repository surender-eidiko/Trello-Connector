
package org.mule.modules.trello.bean.holders;

import java.io.File;
import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T12:43:23+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class CardsAttachmentsByIdPostRequestExpressionHolder {

    protected Object file;
    protected File _fileType;
    protected Object url;
    protected String _urlType;
    protected Object mimeType;
    protected String _mimeTypeType;
    protected Object name;
    protected String _nameType;

    /**
     * Sets file
     * 
     * @param value Value to set
     */
    public void setFile(Object value) {
        this.file = value;
    }

    /**
     * Retrieves file
     * 
     */
    public Object getFile() {
        return this.file;
    }

    /**
     * Sets url
     * 
     * @param value Value to set
     */
    public void setUrl(Object value) {
        this.url = value;
    }

    /**
     * Retrieves url
     * 
     */
    public Object getUrl() {
        return this.url;
    }

    /**
     * Sets mimeType
     * 
     * @param value Value to set
     */
    public void setMimeType(Object value) {
        this.mimeType = value;
    }

    /**
     * Retrieves mimeType
     * 
     */
    public Object getMimeType() {
        return this.mimeType;
    }

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

}
