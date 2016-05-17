package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsCalendekeyGeneratePostRequest;

public class PostBoardsMarkAsViewdTestCase extends TrelloAbstractTestcases {

	public PostBoardsMarkAsViewdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostBoardsMarkAsViewd(){
		String boardId=getBoardId();
		BoardsCalendekeyGeneratePostRequest request = getBoardsCalendekeyGeneratePostRequest();
		String response = getConnector().postBoardsMarkAsViewd(boardId, request);
		assertNotNull(response);
	}
}
