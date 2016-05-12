
package org.mule.modules.trello.bean.holders;

import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T12:43:23+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class CardsCommentsByIdPutRequestExpressionHolder {

    protected Object idAction;
    protected String _idActionType;
    protected Object text;
    protected String _textType;

    /**
     * Sets idAction
     * 
     * @param value Value to set
     */
    public void setIdAction(Object value) {
        this.idAction = value;
    }

    /**
     * Retrieves idAction
     * 
     */
    public Object getIdAction() {
        return this.idAction;
    }

    /**
     * Sets text
     * 
     * @param value Value to set
     */
    public void setText(Object value) {
        this.text = value;
    }

    /**
     * Retrieves text
     * 
     */
    public Object getText() {
        return this.text;
    }

}
