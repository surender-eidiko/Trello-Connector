
package org.mule.modules.trello.bean.holders;

import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T12:43:23+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class BoardsPoweUpsPostRequestExpressionHolder {

    protected Object boardId;
    protected String _boardIdType;
    protected Object value;
    protected String _valueType;

    /**
     * Sets boardId
     * 
     * @param value Value to set
     */
    public void setBoardId(Object value) {
        this.boardId = value;
    }

    /**
     * Retrieves boardId
     * 
     */
    public Object getBoardId() {
        return this.boardId;
    }

    /**
     * Sets value
     * 
     * @param value Value to set
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * Retrieves value
     * 
     */
    public Object getValue() {
        return this.value;
    }

}
