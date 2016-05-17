package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsListGuidePutRequest;

public class ShowBoardsSidebarActivityTestCase extends TrelloAbstractTestcases {

	public ShowBoardsSidebarActivityTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testShowBoardsSidebarActivity(){
		String boardId=getBoardId();
		BoardsListGuidePutRequest request = getBoardsListGuidePutRequest();
		String response = getConnector().showBoardsSidebar(boardId, request);
		assertNotNull(response);
	}
}