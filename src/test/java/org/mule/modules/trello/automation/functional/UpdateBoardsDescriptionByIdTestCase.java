package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsDescriptionByIdPutRequest;

public class UpdateBoardsDescriptionByIdTestCase extends
		TrelloAbstractTestcases {

	public UpdateBoardsDescriptionByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndOrganizationWithFiels(){
		String boardId=getBoardId();
		BoardsDescriptionByIdPutRequest field = getBoardsDescriptionByIdPutRequest();
		String response = getConnector().updateBoardsDescriptionById(boardId, field);
		assertNotNull(response);
	}

}
