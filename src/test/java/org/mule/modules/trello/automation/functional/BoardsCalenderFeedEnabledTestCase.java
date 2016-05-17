package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsCalenderFeedEnabledPutRequest;

public class BoardsCalenderFeedEnabledTestCase extends TrelloAbstractTestcases {

	public BoardsCalenderFeedEnabledTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testBoardsCalenderFeedEnabled(){
		String boardId=getBoardId();
		BoardsCalenderFeedEnabledPutRequest request = getBoardsCalenderFeedEnabledPutRequest();
		String response = getConnector().boardsCalenderFeedEnabled(boardId, request);
		assertNotNull(response);
	}
}
