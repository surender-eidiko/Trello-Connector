
package org.mule.modules.trello.bean.holders;

import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-20T07:24:31+05:30", comments = "Build 3.7.x.2633.51164b9")
public class CheckListsToCardByIdPostRequestExpressionHolder {

    protected Object idChecklist;
    protected String _idChecklistType;
    protected Object idCheckItem;
    protected String _idCheckItemType;

    /**
     * Sets idChecklist
     * 
     * @param value Value to set
     */
    public void setIdChecklist(Object value) {
        this.idChecklist = value;
    }

    /**
     * Retrieves idChecklist
     * 
     */
    public Object getIdChecklist() {
        return this.idChecklist;
    }

    /**
     * Sets idCheckItem
     * 
     * @param value Value to set
     */
    public void setIdCheckItem(Object value) {
        this.idCheckItem = value;
    }

    /**
     * Retrieves idCheckItem
     * 
     */
    public Object getIdCheckItem() {
        return this.idCheckItem;
    }

}
