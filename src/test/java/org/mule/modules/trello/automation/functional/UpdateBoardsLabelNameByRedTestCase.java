package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsLabelNameByColorPutRequest;

public class UpdateBoardsLabelNameByRedTestCase extends TrelloAbstractTestcases {

	public UpdateBoardsLabelNameByRedTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateBoardsLabelNameByRed(){
		String boardId=getBoardId();
		BoardsLabelNameByColorPutRequest request = getBoardsLabelNameByColorPutRequest();
		String response = getConnector().updateBoardsLabelNameByRed(boardId, request);
		assertNotNull(response);
	}

}
