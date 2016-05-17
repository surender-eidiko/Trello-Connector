package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsEmailPosPrefPutRequest;

public class UpdateBoardsEmailPosPrefTestCase extends TrelloAbstractTestcases {

	public UpdateBoardsEmailPosPrefTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateBoardsEmailPosPref(){
		String boardId=getBoardId();
		BoardsEmailPosPrefPutRequest request = getBoardsEmailPosPrefPutRequest();
		String response = getConnector().updateBoardsEmailPosPref(boardId, request);
		assertNotNull(response);
	}
}
