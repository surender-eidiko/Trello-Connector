package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsEmailListPrefPutRequest;

public class UpdateBoardsEmailListIdPrefTestCase extends
		TrelloAbstractTestcases {

	public UpdateBoardsEmailListIdPrefTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateBoardsEmailListIdPref(){
		String boardId=getBoardId();
		BoardsEmailListPrefPutRequest request = getBoardsEmailListPrefPutRequest();
		String response = getConnector().updateBoardsEmailListIdPref(boardId,request);
		assertNotNull(response);
	}

}
