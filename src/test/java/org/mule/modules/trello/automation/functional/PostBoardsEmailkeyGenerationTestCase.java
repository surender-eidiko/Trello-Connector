package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsCalendekeyGeneratePostRequest;

public class PostBoardsEmailkeyGenerationTestCase extends
		TrelloAbstractTestcases {

	public PostBoardsEmailkeyGenerationTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostBoardsChecklists(){
		String boardId=getBoardId();
		BoardsCalendekeyGeneratePostRequest request = getBoardsCalendekeyGeneratePostRequest();
		String response = getConnector().postBoardsEmailkeyGeneration(boardId, request);
		assertNotNull(response);
	}
}
