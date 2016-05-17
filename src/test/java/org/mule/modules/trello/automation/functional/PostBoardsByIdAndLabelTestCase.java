package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsByIdLabelPostRequest;

public class PostBoardsByIdAndLabelTestCase extends TrelloAbstractTestcases{

	public PostBoardsByIdAndLabelTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostBoardsByIdAndLabel(){
		String boardId=getBoardId();
		BoardsByIdLabelPostRequest request = getBoardsByIdLabelPostRequest();
		String response = getConnector().postBoardsByIdAndLabel(boardId, request);
		assertNotNull(response);
	}
}
