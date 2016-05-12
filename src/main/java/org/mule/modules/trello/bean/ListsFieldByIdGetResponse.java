package org.mule.modules.trello.bean;

public class ListsFieldByIdGetResponse extends StatusResponse {
    private String _value;

    public String get_value ()
    {
        return _value;
    }

    public void set_value (String _value)
    {
        this._value = _value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [_value = "+_value+"]";
    }
}
