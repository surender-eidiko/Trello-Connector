package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetSavedSearchesBySavedSearchIdTestCase extends
		TrelloAbstractTestcases {

	public GetSavedSearchesBySavedSearchIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetSavedSearchesBySavedSearchId(){
		String memId = getMemberIdOrName(); 
		String savedSearchId = getSavedSearchId();
		String value = getValue();
		String response = getConnector().getSavedSearchesBySavedSearchId(memId,savedSearchId, value);
		assertNotNull(response);
	}
}