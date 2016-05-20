package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.UpdateSavedSearchNamePutRequest;

public class UpdateSavedSearchNameTestCase extends TrelloAbstractTestcases {

	public UpdateSavedSearchNameTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateSavedSearchName(){
		String memId = getMemberIdOrName(); 
		String idSavedSearch = getSavedSearchId();
		UpdateSavedSearchNamePutRequest request = getUpdateSavedSearchNamePutRequest();
		String response = getConnector().updateSavedSearchName(memId,idSavedSearch,request);
		assertNotNull(response);
	}
}
