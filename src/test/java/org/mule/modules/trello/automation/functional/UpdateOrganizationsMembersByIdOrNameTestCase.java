package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.OrganizationMembersPutRequest;

public class UpdateOrganizationsMembersByIdOrNameTestCase extends
		TrelloAbstractTestcases {

	public UpdateOrganizationsMembersByIdOrNameTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateOrganizationsDescByIdOrName(){
		String orgId = getOrganizationId();
		OrganizationMembersPutRequest idMembership = getOrganizationMembersPutRequest();
		String response = getConnector().updateOrganizationsMembersByIdOrName(orgId, idMembership);
		assertNotNull(response);
	}
}
