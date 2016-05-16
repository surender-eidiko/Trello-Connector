/**
 *
 */
package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class BoardsByIdAndActionsGetResponse.
 */
public class BoardsByIdAndActionsGetResponse extends StatusResponse {
	 
 	/** The member. */
 	private Member member;

	    /** The id member creator. */
    	private String idMemberCreator;

	    /** The id. */
    	private String id;

	    /** The data. */
    	private Data data;

	    /** The type. */
    	private String type;

	    /** The date. */
    	private String date;

	    /** The member creator. */
    	private MemberCreator memberCreator;

	    /**
    	 * Gets the member.
    	 *
    	 * @return the member
    	 */
    	public Member getMember ()
	    {
	        return member;
	    }

	    /**
    	 * Sets the member.
    	 *
    	 * @param member the new member
    	 */
    	public void setMember (Member member)
	    {
	        this.member = member;
	    }

	    /**
    	 * Gets the id member creator.
    	 *
    	 * @return the id member creator
    	 */
    	public String getIdMemberCreator ()
	    {
	        return idMemberCreator;
	    }

	    /**
    	 * Sets the id member creator.
    	 *
    	 * @param idMemberCreator the new id member creator
    	 */
    	public void setIdMemberCreator (String idMemberCreator)
	    {
	        this.idMemberCreator = idMemberCreator;
	    }

	    /**
    	 * Gets the id.
    	 *
    	 * @return the id
    	 */
    	public String getId ()
	    {
	        return id;
	    }

	    /**
    	 * Sets the id.
    	 *
    	 * @param id the new id
    	 */
    	public void setId (String id)
	    {
	        this.id = id;
	    }

	    /**
    	 * Gets the data.
    	 *
    	 * @return the data
    	 */
    	public Data getData ()
	    {
	        return data;
	    }

	    /**
    	 * Sets the data.
    	 *
    	 * @param data the new data
    	 */
    	public void setData (Data data)
	    {
	        this.data = data;
	    }

	    /**
    	 * Gets the type.
    	 *
    	 * @return the type
    	 */
    	public String getType ()
	    {
	        return type;
	    }

	    /**
    	 * Sets the type.
    	 *
    	 * @param type the new type
    	 */
    	public void setType (String type)
	    {
	        this.type = type;
	    }

	    /**
    	 * Gets the date.
    	 *
    	 * @return the date
    	 */
    	public String getDate ()
	    {
	        return date;
	    }

	    /**
    	 * Sets the date.
    	 *
    	 * @param date the new date
    	 */
    	public void setDate (String date)
	    {
	        this.date = date;
	    }

	    /**
    	 * Gets the member creator.
    	 *
    	 * @return the member creator
    	 */
    	public MemberCreator getMemberCreator ()
	    {
	        return memberCreator;
	    }

	    /**
    	 * Sets the member creator.
    	 *
    	 * @param memberCreator the new member creator
    	 */
    	public void setMemberCreator (MemberCreator memberCreator)
	    {
	        this.memberCreator = memberCreator;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [member = "+member+", idMemberCreator = "+idMemberCreator+", id = "+id+", data = "+data+", type = "+type+", date = "+date+", memberCreator = "+memberCreator+"]";
	    }
}
