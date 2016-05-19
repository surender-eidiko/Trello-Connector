package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetOrganizationMembersInvitedByIdTestCase extends
		TrelloAbstractTestcases {

	public GetOrganizationMembersInvitedByIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetOrganizationMembersInvitedById(){
		String orgId = getOrganizationId();
		String response = getConnector().getOrganizationMembersInvitedById(orgId, null);
		assertNotNull(response);
	}

}
