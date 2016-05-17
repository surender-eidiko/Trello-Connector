package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsCardCoversPutRequest;

public class UpdateSelfJoinBoardsTestCase extends TrelloAbstractTestcases {

	public UpdateSelfJoinBoardsTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateSelfJoinBoards(){
		String boardId=getBoardId();
		BoardsCardCoversPutRequest request = getBoardsCardCoversPutRequest();
		String response = getConnector().updateSelfJoinBoards(boardId, request);
		assertNotNull(response);
	}
}
