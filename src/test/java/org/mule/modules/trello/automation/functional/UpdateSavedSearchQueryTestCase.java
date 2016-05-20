package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.UpdateSavedSearchQueryPutRequest;

public class UpdateSavedSearchQueryTestCase extends TrelloAbstractTestcases {

	public UpdateSavedSearchQueryTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateSavedSearchQuery(){
		String memId = getMemberIdOrName(); 
		String idSavedSearch = getSavedSearchId();
		UpdateSavedSearchQueryPutRequest request = getUpdateSavedSearchQueryPutRequest();
		String response = getConnector().updateSavedSearchQuery(memId,idSavedSearch,request);
		assertNotNull(response);
	}
}
