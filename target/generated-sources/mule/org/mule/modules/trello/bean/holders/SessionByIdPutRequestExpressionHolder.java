
package org.mule.modules.trello.bean.holders;

import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-18T04:08:12+05:30", comments = "Build 3.7.x.2633.51164b9")
public class SessionByIdPutRequestExpressionHolder {

    protected Object status;
    protected String _statusType;
    protected Object idSession;
    protected String _idSessionType;
    protected Object idBoard;
    protected String _idBoardType;

    /**
     * Sets status
     * 
     * @param value Value to set
     */
    public void setStatus(Object value) {
        this.status = value;
    }

    /**
     * Retrieves status
     * 
     */
    public Object getStatus() {
        return this.status;
    }

    /**
     * Sets idSession
     * 
     * @param value Value to set
     */
    public void setIdSession(Object value) {
        this.idSession = value;
    }

    /**
     * Retrieves idSession
     * 
     */
    public Object getIdSession() {
        return this.idSession;
    }

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

}
