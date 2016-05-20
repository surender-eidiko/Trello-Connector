package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetCustomBoardBackgroundsTestCase extends TrelloAbstractTestcases {

	public GetCustomBoardBackgroundsTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetCustomBoardBackgrounds(){
		String memId = getMemberIdOrName(); 
		String response = getConnector().getCustomBoardBackgrounds(memId, null);
		assertNotNull(response);
	}

}
