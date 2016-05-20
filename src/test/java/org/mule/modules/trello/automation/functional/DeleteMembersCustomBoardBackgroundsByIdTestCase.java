package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.StatusResponse;

public class DeleteMembersCustomBoardBackgroundsByIdTestCase extends
		TrelloAbstractTestcases {

	public DeleteMembersCustomBoardBackgroundsByIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteMembersCustomBoardBackgroundsById(){
		String memId = getMemberIdOrName(); 
		String BackgroundId = getBardBackgroundId();
		StatusResponse response = getConnector().deleteMembersCustomBoardBackgroundsById(memId,BackgroundId);
		assertNotNull(response);
	}

}
