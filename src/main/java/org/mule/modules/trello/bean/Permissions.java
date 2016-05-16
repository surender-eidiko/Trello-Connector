
package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Permissions.
 */
public class Permissions {
	 
 	/** The model type. */
 	private String modelType;

	    /** The id model. */
    	private String idModel;

	    /** The write. */
    	private String write;

	    /** The read. */
    	private String read;

	    /**
    	 * Gets the model type.
    	 *
    	 * @return the model type
    	 */
    	public String getModelType ()
	    {
	        return modelType;
	    }

	    /**
    	 * Sets the model type.
    	 *
    	 * @param modelType the new model type
    	 */
    	public void setModelType (String modelType)
	    {
	        this.modelType = modelType;
	    }

	    /**
    	 * Gets the id model.
    	 *
    	 * @return the id model
    	 */
    	public String getIdModel ()
	    {
	        return idModel;
	    }

	    /**
    	 * Sets the id model.
    	 *
    	 * @param idModel the new id model
    	 */
    	public void setIdModel (String idModel)
	    {
	        this.idModel = idModel;
	    }

	    /**
    	 * Gets the write.
    	 *
    	 * @return the write
    	 */
    	public String getWrite ()
	    {
	        return write;
	    }

	    /**
    	 * Sets the write.
    	 *
    	 * @param write the new write
    	 */
    	public void setWrite (String write)
	    {
	        this.write = write;
	    }

	    /**
    	 * Gets the read.
    	 *
    	 * @return the read
    	 */
    	public String getRead ()
	    {
	        return read;
	    }

	    /**
    	 * Sets the read.
    	 *
    	 * @param read the new read
    	 */
    	public void setRead (String read)
	    {
	        this.read = read;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [modelType = "+modelType+", idModel = "+idModel+", write = "+write+", read = "+read+"]";
	    }
}
