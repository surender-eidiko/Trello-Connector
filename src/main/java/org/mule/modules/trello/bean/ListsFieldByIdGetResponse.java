package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class ListsFieldByIdGetResponse.
 */
public class ListsFieldByIdGetResponse extends StatusResponse {
    
    /** The _value. */
    private String _value;

    /**
     * Gets the _value.
     *
     * @return the _value
     */
    public String get_value ()
    {
        return _value;
    }

    /**
     * Sets the _value.
     *
     * @param _value the new _value
     */
    public void set_value (String _value)
    {
        this._value = _value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [_value = "+_value+"]";
    }
}
