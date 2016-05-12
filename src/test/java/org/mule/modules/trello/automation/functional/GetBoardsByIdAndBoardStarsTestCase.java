package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.bean.BoardsByIdAndBoardStarsGetResponse;

public class GetBoardsByIdAndBoardStarsTestCase extends TrelloAbstractTestcases{

	public GetBoardsByIdAndBoardStarsTestCase() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndBoardStars() {
		
		String boardId=getBoardId();
		BoardsByIdAndBoardStarsGetResponse boardsByIdAndBoardStarsGetResponse=getConnector().getBoardsByIdAndBoardStars(boardId, null);
		assertNotNull(boardsByIdAndBoardStarsGetResponse);
		assertEquals("200", boardsByIdAndBoardStarsGetResponse.getStatusCode());

	}

}
