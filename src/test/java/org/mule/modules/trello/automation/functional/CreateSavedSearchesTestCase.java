package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CreateSavedSearchesPostRequest;

public class CreateSavedSearchesTestCase extends TrelloAbstractTestcases {

	public CreateSavedSearchesTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testCreateSavedSearches(){
		String memId = getMemberIdOrName(); 
		CreateSavedSearchesPostRequest request = getCreateSavedSearchesPostRequest();
		String response = getConnector().createSavedSearches(memId,request);
		assertNotNull(response);
	}
}
