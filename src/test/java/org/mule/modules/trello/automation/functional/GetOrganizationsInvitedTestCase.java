package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetOrganizationsInvitedTestCase extends TrelloAbstractTestcases {

	public GetOrganizationsInvitedTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetOrganizationsInvited(){
		String memId = getMemberIdOrName(); 
		String response = getConnector().getOrganizationsInvited(memId, null);
		assertNotNull(response);
	}
}
