package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetBoardsByFilterTestCase extends TrelloAbstractTestcases {

	public GetBoardsByFilterTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByFilter(){
		String memId = getMemberIdOrName(); 
		String filter = getFilter();
		String response = getConnector().getBoardsByFilter(memId, filter);
		assertNotNull(response);
	}
}
