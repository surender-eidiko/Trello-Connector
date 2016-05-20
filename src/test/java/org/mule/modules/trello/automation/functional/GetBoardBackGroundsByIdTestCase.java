package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetBoardBackGroundsByIdTestCase extends TrelloAbstractTestcases {

	public GetBoardBackGroundsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardBackGroundsById(){
		String memId = getMemberIdOrName(); 
		String backgroundId = getBardBackgroundId();
		String response = getConnector().getBoardBackGroundsById(memId, backgroundId, null);
		assertNotNull(response);
	}
}
