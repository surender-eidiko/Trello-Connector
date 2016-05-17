package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsCommentsPutRequest;

public class UpdateBoardsCommentsTestCase extends TrelloAbstractTestcases {

	public UpdateBoardsCommentsTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateBoardsComments(){
		String boardId=getBoardId();
		BoardsCommentsPutRequest request = getBoardsCommentsPutRequest();
		String response = getConnector().updateBoardsComments(boardId, request);
		assertNotNull(response);
	}
}
