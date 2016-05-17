package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsPostRequest;
import org.mule.modules.trello.bean.BoardsPostResponse;

public class PostBoardsTestCase extends TrelloAbstractTestcases {

	public PostBoardsTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testBoardsCalenderFeedEnabled(){
		BoardsPostRequest request = getBoardsPostRequest();
		BoardsPostResponse response = getConnector().postBoards(request);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
