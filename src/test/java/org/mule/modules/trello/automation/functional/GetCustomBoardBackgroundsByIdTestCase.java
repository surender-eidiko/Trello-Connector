package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetCustomBoardBackgroundsByIdTestCase extends
		TrelloAbstractTestcases {

	public GetCustomBoardBackgroundsByIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetCustomBoardBackgroundsById(){
		String memId = getMemberIdOrName(); 
		String field =getBardBackgroundId();
		String response = getConnector().getCustomBoardBackgroundsById(memId, field, null);
		assertNotNull(response);
	}

}
