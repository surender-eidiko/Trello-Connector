package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Data.
 */
public class Data {
	
	/** The old. */
	private Old old;

    /** The list. */
    private Lists list;

    /** The board. */
    private Board board;

    /**
     * Gets the old.
     *
     * @return the old
     */
    public Old getOld ()
    {
        return old;
    }

    /**
     * Sets the old.
     *
     * @param old the new old
     */
    public void setOld (Old old)
    {
        this.old = old;
    }

    /**
     * Gets the list.
     *
     * @return the list
     */
    public Lists getList ()
    {
        return list;
    }

    /**
     * Sets the list.
     *
     * @param list the new list
     */
    public void setList (Lists list)
    {
        this.list = list;
    }

    /**
     * Gets the board.
     *
     * @return the board
     */
    public Board getBoard ()
    {
        return board;
    }

    /**
     * Sets the board.
     *
     * @param board the new board
     */
    public void setBoard (Board board)
    {
        this.board = board;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [old = "+old+", list = "+list+", board = "+board+"]";
    }

}
