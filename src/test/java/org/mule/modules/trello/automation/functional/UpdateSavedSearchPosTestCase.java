package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.UpdateSavedSearchPosPutRequest;

public class UpdateSavedSearchPosTestCase extends TrelloAbstractTestcases {

	public UpdateSavedSearchPosTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateSavedSearchPos(){
		String memId = getMemberIdOrName(); 
		String idSavedSearch = getSavedSearchId();
		UpdateSavedSearchPosPutRequest request = getUpdateSavedSearchPosPutRequest();
		String response = getConnector().updateSavedSearchPos(memId,idSavedSearch,request);
		assertNotNull(response);
	}
}
