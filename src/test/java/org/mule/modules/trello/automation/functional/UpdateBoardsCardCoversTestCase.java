package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsCardCoversPutRequest;

public class UpdateBoardsCardCoversTestCase extends TrelloAbstractTestcases {

	public UpdateBoardsCardCoversTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateBoardsCardCovers(){
		String boardId=getBoardId();
		BoardsCardCoversPutRequest request = getBoardsCardCoversPutRequest();
		String response = getConnector().updateBoardsCardCovers(boardId, request);
		assertNotNull(response);
	}
}