package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetCardsByFilterTestCase extends TrelloAbstractTestcases {

	public GetCardsByFilterTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetCardsByFilter(){
		String memId = getMemberIdOrName(); 
		String filter = getFilter();
		String response = getConnector().getCardsByFilter(memId, filter);
		assertNotNull(response);
	}
}
