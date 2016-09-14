/**
 *
 */
package org.mule.modules.trello.bean;

public class BioData {
	private Emoji emoji;

    public Emoji getEmoji ()
    {
        return emoji;
    }

    public void setEmoji (Emoji emoji)
    {
        this.emoji = emoji;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [emoji = "+emoji+"]";
    }
}
