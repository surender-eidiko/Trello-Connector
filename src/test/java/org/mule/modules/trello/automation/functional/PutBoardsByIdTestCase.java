package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsByIdPutRequest;
import org.mule.modules.trello.bean.BoardsByIdPutResponse;

public class PutBoardsByIdTestCase extends TrelloAbstractTestcases {

	public PutBoardsByIdTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPutBoardsById(){
		String boardId=getBoardId();
		BoardsByIdPutRequest request = getBoardsByIdPutRequest();
		BoardsByIdPutResponse response = getConnector().putBoardById(boardId, request,null);
		assertNotNull(response);
	}
}
