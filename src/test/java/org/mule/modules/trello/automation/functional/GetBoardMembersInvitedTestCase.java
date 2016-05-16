/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetBoardMembersInvitedTestCase extends TrelloAbstractTestcases{

	public GetBoardMembersInvitedTestCase() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardMembersInvited() {
		String boardId=getBoardId();
		
		String boardMembersInvitedGetResponse=getConnector().getBoardMembersInvited(boardId, null);
		assertNotNull(boardMembersInvitedGetResponse);
	}

}
