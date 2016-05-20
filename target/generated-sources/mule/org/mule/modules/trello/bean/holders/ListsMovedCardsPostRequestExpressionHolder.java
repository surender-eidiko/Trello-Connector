
package org.mule.modules.trello.bean.holders;

import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-20T07:24:31+05:30", comments = "Build 3.7.x.2633.51164b9")
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
