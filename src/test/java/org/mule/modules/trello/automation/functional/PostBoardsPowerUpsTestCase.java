package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsPoweUpsPostRequest;

public class PostBoardsPowerUpsTestCase extends TrelloAbstractTestcases {

	public PostBoardsPowerUpsTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostBoardsChecklists(){
		String boardId=getBoardId();
		String value = getValue();
		BoardsPoweUpsPostRequest request = getBoardsPoweUpsPostRequest();
		String response = getConnector().postBoardsPowerUps(boardId,value, request);
		assertNotNull(response);
	}
}
