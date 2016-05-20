package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.OrganizationExternalMembersDisabledPutRequest;

public class UpdateOrgExternalMembersDisabledTestCase extends
		TrelloAbstractTestcases {

	public UpdateOrgExternalMembersDisabledTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateOrgExternalMembersDisabled(){
		String orgId = getOrganizationId();
		OrganizationExternalMembersDisabledPutRequest idMembership = getOrganizationExternalMembersDisabledPutRequest();
		String response = getConnector().updateOrgExternalMembersDisabled(orgId, idMembership);
		assertNotNull(response);
	}
}
