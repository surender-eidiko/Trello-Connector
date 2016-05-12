package org.mule.modules.trello.bean;

public class Data {
	private Old old;

    private Lists list;

    private Board board;

    public Old getOld ()
    {
        return old;
    }

    public void setOld (Old old)
    {
        this.old = old;
    }

    public Lists getList ()
    {
        return list;
    }

    public void setList (Lists list)
    {
        this.list = list;
    }

    public Board getBoard ()
    {
        return board;
    }

    public void setBoard (Board board)
    {
        this.board = board;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [old = "+old+", list = "+list+", board = "+board+"]";
    }

}
