package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetBoardsInvitedTestCase extends TrelloAbstractTestcases {

	public GetBoardsInvitedTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsInvited(){
		String memId = getMemberIdOrName(); 
		String response = getConnector().getBoardsInvited(memId, null);
		assertNotNull(response);
	}
}
