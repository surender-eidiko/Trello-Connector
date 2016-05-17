package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsChecklistPostRequest;

public class PostBoardsChecklistsTestCase extends TrelloAbstractTestcases {

	public PostBoardsChecklistsTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostBoardsChecklists(){
		String boardId=getBoardId();
		BoardsChecklistPostRequest request = getBoardsChecklistPostRequest();
		String response = getConnector().postBoardsChecklists(boardId, request);
		assertNotNull(response);
	}
}
