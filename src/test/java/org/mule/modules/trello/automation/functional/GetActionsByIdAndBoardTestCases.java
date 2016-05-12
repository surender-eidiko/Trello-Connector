package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.modules.trello.TrelloConnector;

public class GetActionsByIdAndBoardTestCases extends TrelloAbstractTestcases {

	public GetActionsByIdAndBoardTestCases() {
		super(TrelloConnector.class);
	// TODO Auto-generated constructor stub
}
	@Test
	public void testGetActionsByIdAndBoard() {
		
		String field=getField();
		String actionId=getActionId();
		String getActionsByIdAndBoardResponse=getConnector().getActionsByIdAndBoard(actionId, field);
		assertNull(getActionsByIdAndBoardResponse);
		assertEquals("200", getActionsByIdAndBoardResponse);
		
	}

}
