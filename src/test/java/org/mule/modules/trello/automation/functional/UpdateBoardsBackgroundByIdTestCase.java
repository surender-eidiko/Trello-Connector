package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsBackgroundPrefPutRequest;

public class UpdateBoardsBackgroundByIdTestCase extends TrelloAbstractTestcases {

	public UpdateBoardsBackgroundByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateBoardNameById(){
		String boardId=getBoardId();
		BoardsBackgroundPrefPutRequest request = getBoardsBackgroundPrefPutRequest();
		String response = getConnector().updateBoardsBackgroundById(boardId, request);
		assertNotNull(response);
	}
}
