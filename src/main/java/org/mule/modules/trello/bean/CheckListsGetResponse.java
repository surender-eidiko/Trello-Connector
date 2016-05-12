package org.mule.modules.trello.bean;

public class CheckListsGetResponse extends StatusResponse {
	private String id;

    private CheckItems[] checkItems;

    private String name;

    private Cards[] cards;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
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

    public Cards[] getCards ()
    {
        return cards;
    }

    public void setCards (Cards[] cards)
    {
        this.cards = cards;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", checkItems = "+checkItems+", name = "+name+", cards = "+cards+"]";
    }
}
