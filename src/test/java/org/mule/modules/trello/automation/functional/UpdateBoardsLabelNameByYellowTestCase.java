package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsLabelNameByColorPutRequest;

public class UpdateBoardsLabelNameByYellowTestCase extends TrelloAbstractTestcases{

	public UpdateBoardsLabelNameByYellowTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateBoardsLabelNameByYello(){
		String boardId=getBoardId();
		BoardsLabelNameByColorPutRequest request = getBoardsLabelNameByColorPutRequest();
		String response = getConnector().updateBoardsLabelNameByYellow(boardId, request);
		assertNotNull(response);
	}
}
