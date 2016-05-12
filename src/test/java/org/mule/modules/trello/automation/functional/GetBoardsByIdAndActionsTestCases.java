package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.bean.BoardsByIdAndActionsGetResponse;

public class GetBoardsByIdAndActionsTestCases extends TrelloAbstractTestcases{

	public GetBoardsByIdAndActionsTestCases() {
		super(TrelloConnector.class);
		
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndActions() {
		String boardId=getBoardId();
		BoardsByIdAndActionsGetResponse boardsByIdAndActionGetResponse=getConnector().getBoardsByIdAndActions(boardId, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		assertNotNull(boardsByIdAndActionGetResponse);
		assertEquals("200", boardsByIdAndActionGetResponse.getStatusCode());

	}

}
