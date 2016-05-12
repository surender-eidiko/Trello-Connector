package org.mule.modules.trello.bean;

public class Badges {
	 private String checkItems;

	    private String description;

	    private String checkItemsChecked;

	    private String votes;

	    private String due;

	    private String attachments;

	    private String fogbugz;

	    private String viewingMemberVoted;

	    private String subscribed;

	    private String comments;

	    public String getCheckItems ()
	    {
	        return checkItems;
	    }

	    public void setCheckItems (String checkItems)
	    {
	        this.checkItems = checkItems;
	    }

	    public String getDescription ()
	    {
	        return description;
	    }

	    public void setDescription (String description)
	    {
	        this.description = description;
	    }

	    public String getCheckItemsChecked ()
	    {
	        return checkItemsChecked;
	    }

	    public void setCheckItemsChecked (String checkItemsChecked)
	    {
	        this.checkItemsChecked = checkItemsChecked;
	    }

	    public String getVotes ()
	    {
	        return votes;
	    }

	    public void setVotes (String votes)
	    {
	        this.votes = votes;
	    }

	    public String getDue ()
	    {
	        return due;
	    }

	    public void setDue (String due)
	    {
	        this.due = due;
	    }

	    public String getAttachments ()
	    {
	        return attachments;
	    }

	    public void setAttachments (String attachments)
	    {
	        this.attachments = attachments;
	    }

	    public String getFogbugz ()
	    {
	        return fogbugz;
	    }

	    public void setFogbugz (String fogbugz)
	    {
	        this.fogbugz = fogbugz;
	    }

	    public String getViewingMemberVoted ()
	    {
	        return viewingMemberVoted;
	    }

	    public void setViewingMemberVoted (String viewingMemberVoted)
	    {
	        this.viewingMemberVoted = viewingMemberVoted;
	    }

	    public String getSubscribed ()
	    {
	        return subscribed;
	    }

	    public void setSubscribed (String subscribed)
	    {
	        this.subscribed = subscribed;
	    }

	    public String getComments ()
	    {
	        return comments;
	    }

	    public void setComments (String comments)
	    {
	        this.comments = comments;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [checkItems = "+checkItems+", description = "+description+", checkItemsChecked = "+checkItemsChecked+", votes = "+votes+", due = "+due+", attachments = "+attachments+", fogbugz = "+fogbugz+", viewingMemberVoted = "+viewingMemberVoted+", subscribed = "+subscribed+", comments = "+comments+"]";
	    }
}
