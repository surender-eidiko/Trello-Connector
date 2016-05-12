package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsByIdAndCardsGetResponse;

public class GetBoardsByIdAndCardsTestCase extends TrelloAbstractTestcases {

	public GetBoardsByIdAndCardsTestCase() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndCards() {
		String boardId=getBoardId();
		BoardsByIdAndCardsGetResponse boardsByIdAndCardsGetResponse=getConnector().getBoardsByIdAndCards(boardId, null, null, null, null, null, null, null, null, null, null, null);
		assertNotNull(boardsByIdAndCardsGetResponse);
		assertEquals("200", boardsByIdAndCardsGetResponse.getStatusCode());

	}

}
