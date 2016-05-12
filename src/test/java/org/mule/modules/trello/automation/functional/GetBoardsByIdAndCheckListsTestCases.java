package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsByIdAndCheckListsGetResponse;

public class GetBoardsByIdAndCheckListsTestCases extends TrelloAbstractTestcases {

	public GetBoardsByIdAndCheckListsTestCases() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndCheckLists() {
		String boardId=getBoardId();
		
		String cards=getCards();
		
		BoardsByIdAndCheckListsGetResponse boardsByIdAndCheckListsGetResponse=getConnector().getBoardsByIdAndCheckLists(boardId, cards, null, null, null, null, null);
		assertNotNull(boardsByIdAndCheckListsGetResponse);
		assertEquals("200", boardsByIdAndCheckListsGetResponse.getStatusCode());
	}

}
