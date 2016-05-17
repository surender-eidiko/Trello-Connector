package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsLabelNameByColorPutRequest;

public class UpdateBoardsLabelNameByPurpleTestCase extends
		TrelloAbstractTestcases {

	public UpdateBoardsLabelNameByPurpleTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateBoardsLabelNameByPurple(){
		String boardId=getBoardId();
		BoardsLabelNameByColorPutRequest request = getBoardsLabelNameByColorPutRequest();
		String response = getConnector().updateBoardsLabelNameByPurple(boardId, request);
		assertNotNull(response);
	}

}
