package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsByIdPutRequest;

public class PutBoardsByIdTestCase extends TrelloAbstractTestcases {

	public PutBoardsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPutBoardsById(){
		String boardId=getBoardId();
		BoardsByIdPutRequest request = getBoardsByIdPutRequest();
		String response = getConnector().putBoardsById(boardId, request);
		assertNotNull(response);
	}
}
