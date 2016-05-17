package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsNamePutRequest;

public class UpdateBoardNameByIdTestCase extends TrelloAbstractTestcases {

	public UpdateBoardNameByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateBoardNameById(){
		String boardId=getBoardId();
		BoardsNamePutRequest request = getBoardsNamePutRequest();
		String response = getConnector().updateBoardNameById(boardId, request);
		assertNotNull(response);
	}
}
