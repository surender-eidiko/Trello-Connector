package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsByIdAndCardsGetResponse;

public class GetBoardsByIdAndCardsWithFilterTestCase extends TrelloAbstractTestcases{

	public GetBoardsByIdAndCardsWithFilterTestCase() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndCardsWithFilter() {
		String boardId=getBoardId();
		String filter=getFilter();
		BoardsByIdAndCardsGetResponse boardsByIdAndCardsGetResponse=getConnector().getBoardsByIdAndCardsWithFilter(boardId, filter);
		assertNotNull(boardsByIdAndCardsGetResponse);
		assertEquals("200", boardsByIdAndCardsGetResponse.getStatusCode());
	}

}
