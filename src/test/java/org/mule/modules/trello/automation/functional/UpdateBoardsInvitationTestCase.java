package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsInvitationPutRequest;

public class UpdateBoardsInvitationTestCase extends TrelloAbstractTestcases {

	public UpdateBoardsInvitationTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateBoardsInvitation(){
		String boardId=getBoardId();
		BoardsInvitationPutRequest request = getBoardsInvitationPutRequest();
		String response = getConnector().updateBoardsInvitations(boardId, request);
		assertNotNull(response);
	}
}
