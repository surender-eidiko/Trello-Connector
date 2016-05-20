package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class UpdateMemberUsernameTestCase extends TrelloAbstractTestcases {

	public UpdateMemberUsernameTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateMemberUsername(){
		String memId = getMemberIdOrName(); 
		String idSavedSearch = getSavedSearchId();
		String response = getConnector().updateMemberUsername(memId,idSavedSearch);
		assertNotNull(response);
	}
}
