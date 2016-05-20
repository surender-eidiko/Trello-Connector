package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetOrganizationMembersInvitedByIdWithFieldTestCase extends
		TrelloAbstractTestcases {

	public GetOrganizationMembersInvitedByIdWithFieldTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetOrganizationMembersByIdWithFilter(){
		String orgId = getOrganizationId();
		String field = getField();
		String response = getConnector().getOrganizationMembersInvitedByIdWithField(orgId, field);
		assertNotNull(response);
	}
}
