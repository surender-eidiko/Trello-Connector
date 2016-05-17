package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsByIdListPostRequest;

public class PostBoardsByAndListTestCase extends TrelloAbstractTestcases {

	public PostBoardsByAndListTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostBoardsByAndList(){
		String boardId=getBoardId();
		BoardsByIdListPostRequest request = getBoardsByIdListPostRequest();
		String response = getConnector().postBoardsByAndList(boardId, request);
		assertNotNull(response);
	}
}
