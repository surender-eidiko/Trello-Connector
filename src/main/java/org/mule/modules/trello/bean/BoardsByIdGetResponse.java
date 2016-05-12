package org.mule.modules.trello.bean;

public class BoardsByIdGetResponse extends StatusResponse {
	 private String id;

	    private String desc;

	    private String name;

	    private Lists[] lists;

	    public String getId ()
	    {
	        return id;
	    }

	    public void setId (String id)
	    {
	        this.id = id;
	    }

	    public String getDesc ()
	    {
	        return desc;
	    }

	    public void setDesc (String desc)
	    {
	        this.desc = desc;
	    }

	    public String getName ()
	    {
	        return name;
	    }

	    public void setName (String name)
	    {
	        this.name = name;
	    }

	    public Lists[] getLists ()
	    {
	        return lists;
	    }

	    public void setLists (Lists[] lists)
	    {
	        this.lists = lists;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [id = "+id+", desc = "+desc+", name = "+name+", lists = "+lists+"]";
	    }
}
