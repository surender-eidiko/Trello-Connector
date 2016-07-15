package org.mule.modules.trello.bean;

public class CheckItems {
	 private String id;

	    private String nameData;

	    private String name;

	    private String state;

	    private String idChecklist;

	    private String pos;

	    public String getId ()
	    {
	        return id;
	    }

	    public void setId (String id)
	    {
	        this.id = id;
	    }

	    public String getNameData ()
	    {
	        return nameData;
	    }

	    public void setNameData (String nameData)
	    {
	        this.nameData = nameData;
	    }

	    public String getName ()
	    {
	        return name;
	    }

	    public void setName (String name)
	    {
	        this.name = name;
	    }

	    public String getState ()
	    {
	        return state;
	    }

	    public void setState (String state)
	    {
	        this.state = state;
	    }

	    public String getIdChecklist ()
	    {
	        return idChecklist;
	    }

	    public void setIdChecklist (String idChecklist)
	    {
	        this.idChecklist = idChecklist;
	    }

	    public String getPos ()
	    {
	        return pos;
	    }

	    public void setPos (String pos)
	    {
	        this.pos = pos;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [id = "+id+", nameData = "+nameData+", name = "+name+", state = "+state+", idChecklist = "+idChecklist+", pos = "+pos+"]";
	    }
}
