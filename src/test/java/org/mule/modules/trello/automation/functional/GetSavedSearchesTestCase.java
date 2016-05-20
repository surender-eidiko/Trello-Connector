package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetSavedSearchesTestCase extends TrelloAbstractTestcases {

	public GetSavedSearchesTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetSavedSearches(){
		String memId = getMemberIdOrName(); 
		String response = getConnector().getSavedSearches(memId);
		assertNotNull(response);
	}
}
