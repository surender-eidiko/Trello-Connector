/**
 *
 */
package org.mule.modules.trello.bean;

public class MemberPrefs {
	 private String colorBlind;

	    private String locale;

	    private String minutesBeforeDeadlineToNotify;

	    private String minutesBetweenSummaries;

	    private String sendSummaries;

	    public String getColorBlind ()
	    {
	        return colorBlind;
	    }

	    public void setColorBlind (String colorBlind)
	    {
	        this.colorBlind = colorBlind;
	    }

	    public String getLocale ()
	    {
	        return locale;
	    }

	    public void setLocale (String locale)
	    {
	        this.locale = locale;
	    }

	    public String getMinutesBeforeDeadlineToNotify ()
	    {
	        return minutesBeforeDeadlineToNotify;
	    }

	    public void setMinutesBeforeDeadlineToNotify (String minutesBeforeDeadlineToNotify)
	    {
	        this.minutesBeforeDeadlineToNotify = minutesBeforeDeadlineToNotify;
	    }

	    public String getMinutesBetweenSummaries ()
	    {
	        return minutesBetweenSummaries;
	    }

	    public void setMinutesBetweenSummaries (String minutesBetweenSummaries)
	    {
	        this.minutesBetweenSummaries = minutesBetweenSummaries;
	    }

	    public String getSendSummaries ()
	    {
	        return sendSummaries;
	    }

	    public void setSendSummaries (String sendSummaries)
	    {
	        this.sendSummaries = sendSummaries;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [colorBlind = "+colorBlind+", locale = "+locale+", minutesBeforeDeadlineToNotify = "+minutesBeforeDeadlineToNotify+", minutesBetweenSummaries = "+minutesBetweenSummaries+", sendSummaries = "+sendSummaries+"]";
	    }
}
