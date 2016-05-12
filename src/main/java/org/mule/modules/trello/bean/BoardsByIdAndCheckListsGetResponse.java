package org.mule.modules.trello.bean;

public class BoardsByIdAndCheckListsGetResponse extends StatusResponse {
	 private String id;

	    private String idCard;

	    private CheckItems[] checkItems;

	    private String name;

	    private String pos;

	    private String idBoard;

	    public String getId ()
	    {
	        return id;
	    }

	    public void setId (String id)
	    {
	        this.id = id;
	    }

	    public String getIdCard ()
	    {
	        return idCard;
	    }

	    public void setIdCard (String idCard)
	    {
	        this.idCard = idCard;
	    }

	    public CheckItems[] getCheckItems ()
	    {
	        return checkItems;
	    }

	    public void setCheckItems (CheckItems[] checkItems)
	    {
	        this.checkItems = checkItems;
	    }

	    public String getName ()
	    {
	        return name;
	    }

	    public void setName (String name)
	    {
	        this.name = name;
	    }

	    public String getPos ()
	    {
	        return pos;
	    }

	    public void setPos (String pos)
	    {
	        this.pos = pos;
	    }

	    public String getIdBoard ()
	    {
	        return idBoard;
	    }

	    public void setIdBoard (String idBoard)
	    {
	        this.idBoard = idBoard;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [id = "+id+", idCard = "+idCard+", checkItems = "+checkItems+", name = "+name+", pos = "+pos+", idBoard = "+idBoard+"]";
	    }
}
