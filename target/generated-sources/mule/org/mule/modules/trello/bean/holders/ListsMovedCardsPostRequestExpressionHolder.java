
package org.mule.modules.trello.bean.holders;

import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T12:43:23+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class ListsMovedCardsPostRequestExpressionHolder {

    protected Object idBoard;
    protected String _idBoardType;
    protected Object idList;
    protected String _idListType;

    /**
     * Sets idBoard
     * 
     * @param value Value to set
     */
    public void setIdBoard(Object value) {
        this.idBoard = value;
    }

    /**
     * Retrieves idBoard
     * 
     */
    public Object getIdBoard() {
        return this.idBoard;
    }

    /**
     * Sets idList
     * 
     * @param value Value to set
     */
    public void setIdList(Object value) {
        this.idList = value;
    }

    /**
     * Retrieves idList
     * 
     */
    public Object getIdList() {
        return this.idList;
    }

}
