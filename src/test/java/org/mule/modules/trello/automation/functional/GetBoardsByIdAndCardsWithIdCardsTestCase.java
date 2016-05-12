package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsByIdAndActionsGetResponse;

public class GetBoardsByIdAndCardsWithIdCardsTestCase extends TrelloAbstractTestcases{

	public GetBoardsByIdAndCardsWithIdCardsTestCase() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndCardsWithIdCards() {
		String boardId=getBoardId();
		String idCard=getIdCard();
		BoardsByIdAndActionsGetResponse boardsByIdAndActionsGetResponse=getConnector().getBoardsByIdAndCardsWithIdCards(boardId, idCard, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		assertNotNull(boardsByIdAndActionsGetResponse);
		assertEquals("200", boardsByIdAndActionsGetResponse.getStatusCode());
	}

}
