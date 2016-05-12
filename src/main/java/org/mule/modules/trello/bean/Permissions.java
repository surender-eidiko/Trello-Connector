package org.mule.modules.trello.bean;

public class Permissions {
	 private String modelType;

	    private String idModel;

	    private String write;

	    private String read;

	    public String getModelType ()
	    {
	        return modelType;
	    }

	    public void setModelType (String modelType)
	    {
	        this.modelType = modelType;
	    }

	    public String getIdModel ()
	    {
	        return idModel;
	    }

	    public void setIdModel (String idModel)
	    {
	        this.idModel = idModel;
	    }

	    public String getWrite ()
	    {
	        return write;
	    }

	    public void setWrite (String write)
	    {
	        this.write = write;
	    }

	    public String getRead ()
	    {
	        return read;
	    }

	    public void setRead (String read)
	    {
	        this.read = read;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [modelType = "+modelType+", idModel = "+idModel+", write = "+write+", read = "+read+"]";
	    }
}
