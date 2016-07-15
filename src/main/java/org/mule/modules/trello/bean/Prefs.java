/**
 *
 */
package org.mule.modules.trello.bean;

import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The Class Prefs.
 */
public class Prefs {
	 
	/** The invitations. */
	private String invitations;

    /** The card aging. */
    private String cardAging;

    /** The background color. */
    private String backgroundColor;

    /** The can invite. */
    private Boolean canInvite;

    /** The calendar feed enabled. */
    private Boolean calendarFeedEnabled;

    /** The background image. */
    private String backgroundImage;

    /** The card covers. */
    private Boolean cardCovers;

    /** The can be public. */
    private Boolean canBePublic;

    /** The can be org. */
    private Boolean canBeOrg;

    /** The permission level. */
    private String permissionLevel;

    /** The self join. */
    private Boolean selfJoin;

    /** The background brightness. */
    private String backgroundBrightness;

    /** The background. */
    private String background;

    /** The background image scaled. */
    private List<BackgroundImageScaled> backgroundImageScaled;

    /** The voting. */
    private String voting;

    /** The can be private. */
    private Boolean canBePrivate;

    /** The comments. */
    private String comments;

    /** The background tile. */
    private Boolean backgroundTile;

	    /**
    	 * Gets the card aging.
    	 *
    	 * @return the card aging
    	 */
    	public String getCardAging() {
			return cardAging;
		}

		/**
		 * Sets the card aging.
		 *
		 * @param cardAging the new card aging
		 */
		public void setCardAging(String cardAging) {
			this.cardAging = cardAging;
		}

		/**
    	 * Gets the invitations.
    	 *
    	 * @return the invitations
    	 */
    	public String getInvitations ()
	    {
	        return invitations;
	    }

	    /**
    	 * Sets the invitations.
    	 *
    	 * @param invitations the new invitations
    	 */
    	public void setInvitations (String invitations)
	    {
	        this.invitations = invitations;
	    }

	    /**
    	 * Gets the background color.
    	 *
    	 * @return the background color
    	 */
    	public String getBackgroundColor ()
	    {
	        return backgroundColor;
	    }

	    /**
    	 * Sets the background color.
    	 *
    	 * @param backgroundColor the new background color
    	 */
    	public void setBackgroundColor (String backgroundColor)
	    {
	        this.backgroundColor = backgroundColor;
	    }

	    /**
    	 * Gets the can invite.
    	 *
    	 * @return the can invite
    	 */
    	public Boolean getCanInvite ()
	    {
	        return canInvite;
	    }

	    /**
    	 * Sets the can invite.
    	 *
    	 * @param canInvite the new can invite
    	 */
    	public void setCanInvite (Boolean canInvite)
	    {
	        this.canInvite = canInvite;
	    }

	    /**
    	 * Gets the calendar feed enabled.
    	 *
    	 * @return the calendar feed enabled
    	 */
    	public Boolean getCalendarFeedEnabled ()
	    {
	        return calendarFeedEnabled;
	    }

	    /**
    	 * Sets the calendar feed enabled.
    	 *
    	 * @param calendarFeedEnabled the new calendar feed enabled
    	 */
    	public void setCalendarFeedEnabled (Boolean calendarFeedEnabled)
	    {
	        this.calendarFeedEnabled = calendarFeedEnabled;
	    }

	    /**
    	 * Gets the background image.
    	 *
    	 * @return the background image
    	 */
    	public String getBackgroundImage ()
	    {
	        return backgroundImage;
	    }

	    /**
    	 * Sets the background image.
    	 *
    	 * @param backgroundImage the new background image
    	 */
    	public void setBackgroundImage (String backgroundImage)
	    {
	        this.backgroundImage = backgroundImage;
	    }

	    /**
    	 * Gets the card covers.
    	 *
    	 * @return the card covers
    	 */
    	public Boolean getCardCovers ()
	    {
	        return cardCovers;
	    }

	    /**
    	 * Sets the card covers.
    	 *
    	 * @param cardCovers the new card covers
    	 */
    	public void setCardCovers (Boolean cardCovers)
	    {
	        this.cardCovers = cardCovers;
	    }

	    /**
    	 * Gets the can be public.
    	 *
    	 * @return the can be public
    	 */
    	public Boolean getCanBePublic ()
	    {
	        return canBePublic;
	    }

	    /**
    	 * Sets the can be public.
    	 *
    	 * @param canBePublic the new can be public
    	 */
    	public void setCanBePublic (Boolean canBePublic)
	    {
	        this.canBePublic = canBePublic;
	    }

	    /**
    	 * Gets the can be org.
    	 *
    	 * @return the can be org
    	 */
    	public Boolean getCanBeOrg ()
	    {
	        return canBeOrg;
	    }

	    /**
    	 * Sets the can be org.
    	 *
    	 * @param canBeOrg the new can be org
    	 */
    	public void setCanBeOrg (Boolean canBeOrg)
	    {
	        this.canBeOrg = canBeOrg;
	    }

	    /**
    	 * Gets the permission level.
    	 *
    	 * @return the permission level
    	 */
    	public String getPermissionLevel ()
	    {
	        return permissionLevel;
	    }

	    /**
    	 * Sets the permission level.
    	 *
    	 * @param permissionLevel the new permission level
    	 */
    	public void setPermissionLevel (String permissionLevel)
	    {
	        this.permissionLevel = permissionLevel;
	    }

	    /**
    	 * Gets the self join.
    	 *
    	 * @return the self join
    	 */
    	public Boolean getSelfJoin ()
	    {
	        return selfJoin;
	    }

	    /**
    	 * Sets the self join.
    	 *
    	 * @param selfJoin the new self join
    	 */
    	public void setSelfJoin (Boolean selfJoin)
	    {
	        this.selfJoin = selfJoin;
	    }

	    /**
    	 * Gets the background brightness.
    	 *
    	 * @return the background brightness
    	 */
    	public String getBackgroundBrightness ()
	    {
	        return backgroundBrightness;
	    }

	    /**
    	 * Sets the background brightness.
    	 *
    	 * @param backgroundBrightness the new background brightness
    	 */
    	public void setBackgroundBrightness (String backgroundBrightness)
	    {
	        this.backgroundBrightness = backgroundBrightness;
	    }

	    /**
    	 * Gets the background.
    	 *
    	 * @return the background
    	 */
    	public String getBackground ()
	    {
	        return background;
	    }

	    /**
    	 * Sets the background.
    	 *
    	 * @param background the new background
    	 */
    	public void setBackground (String background)
	    {
	        this.background = background;
	    }

	    /**
    	 * Gets the background image scaled.
    	 *
    	 * @return the background image scaled
    	 */
    	public List<BackgroundImageScaled> getBackgroundImageScaled ()
	    {
	        return backgroundImageScaled;
	    }

	    /**
    	 * Sets the background image scaled.
    	 *
    	 * @param backgroundImageScaled the new background image scaled
    	 */
    	public void setBackgroundImageScaled (List<BackgroundImageScaled> backgroundImageScaled)
	    {
	        this.backgroundImageScaled = backgroundImageScaled;
	    }

	    /**
    	 * Gets the voting.
    	 *
    	 * @return the voting
    	 */
    	public String getVoting ()
	    {
	        return voting;
	    }

	    /**
    	 * Sets the voting.
    	 *
    	 * @param voting the new voting
    	 */
    	public void setVoting (String voting)
	    {
	        this.voting = voting;
	    }

	    /**
    	 * Gets the can be private.
    	 *
    	 * @return the can be private
    	 */
    	public Boolean getCanBePrivate ()
	    {
	        return canBePrivate;
	    }

	    /**
    	 * Sets the can be private.
    	 *
    	 * @param canBePrivate the new can be private
    	 */
    	public void setCanBePrivate (Boolean canBePrivate)
	    {
	        this.canBePrivate = canBePrivate;
	    }

	    /**
    	 * Gets the comments.
    	 *
    	 * @return the comments
    	 */
    	public String getComments ()
	    {
	        return comments;
	    }

	    /**
    	 * Sets the comments.
    	 *
    	 * @param comments the new comments
    	 */
    	public void setComments (String comments)
	    {
	        this.comments = comments;
	    }

	    /**
    	 * Gets the background tile.
    	 *
    	 * @return the background tile
    	 */
    	public Boolean getBackgroundTile ()
	    {
	        return backgroundTile;
	    }

	    /**
    	 * Sets the background tile.
    	 *
    	 * @param backgroundTile the new background tile
    	 */
    	public void setBackgroundTile (Boolean backgroundTile)
	    {
	        this.backgroundTile = backgroundTile;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [invitations = "+invitations+", backgroundColor = "+backgroundColor+", canInvite = "+canInvite+", calendarFeedEnabled = "+calendarFeedEnabled+", backgroundImage = "+backgroundImage+", cardCovers = "+cardCovers+", canBePublic = "+canBePublic+", canBeOrg = "+canBeOrg+", permissionLevel = "+permissionLevel+", selfJoin = "+selfJoin+", backgroundBrightness = "+backgroundBrightness+", background = "+background+", backgroundImageScaled = "+backgroundImageScaled+", voting = "+voting+", canBePrivate = "+canBePrivate+", comments = "+comments+", backgroundTile = "+backgroundTile+"]";
	    }
}
