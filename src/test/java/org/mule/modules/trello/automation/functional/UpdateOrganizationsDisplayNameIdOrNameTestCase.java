package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.OrganizationDisplayNamePutRequest;

public class UpdateOrganizationsDisplayNameIdOrNameTestCase extends
		TrelloAbstractTestcases {

	public UpdateOrganizationsDisplayNameIdOrNameTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateOrganizationsDisplayNameIdOrName(){
		String orgId = getOrganizationId();
		OrganizationDisplayNamePutRequest idMembership = getOrganizationDisplayNamePutRequest();
		String response = getConnector().updateOrganizationsDisplayNameIdOrName(orgId, idMembership);
		assertNotNull(response);
	}
}
