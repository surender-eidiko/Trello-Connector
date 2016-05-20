package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetOrganizationMembershipsByMembershipIdTestCase extends
		TrelloAbstractTestcases {

	public GetOrganizationMembershipsByMembershipIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetOrganizationMembershipsByMembershipId(){
		String orgId = getOrganizationId();
		String idMembership = getMembershipId();
		String response = getConnector().getOrganizationMembershipsByMembershipId(orgId, idMembership, null, null);
		assertNotNull(response);
	}
}
