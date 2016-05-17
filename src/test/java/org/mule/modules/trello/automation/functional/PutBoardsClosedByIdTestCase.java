package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsClosedByIdPutRequest;

public class PutBoardsClosedByIdTestCase extends TrelloAbstractTestcases {

	public PutBoardsClosedByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPutBoardsById(){
		String boardId=getBoardId();
		BoardsClosedByIdPutRequest request = getBoardsClosedByIdPutRequest();
		String response = getConnector().putBoardsClosedById(boardId, request);
		assertNotNull(response);
	}
}
