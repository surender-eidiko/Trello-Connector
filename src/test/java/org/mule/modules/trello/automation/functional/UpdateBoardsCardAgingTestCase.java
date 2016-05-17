package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsCardsPutRequest;

public class UpdateBoardsCardAgingTestCase extends TrelloAbstractTestcases {

	public UpdateBoardsCardAgingTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateBoardsCardAging(){
		String boardId=getBoardId();
		BoardsCardsPutRequest request = getBoardsCardsPutRequest();
		String response = getConnector().updateBoardsCardAging(boardId, request);
		assertNotNull(response);
	}
}
