package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.OrganizationPermissionLevelPutRequest;

public class UpdateOrgWebsiteTestCase extends TrelloAbstractTestcases {

	public UpdateOrgWebsiteTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateOrgWebsite(){
		String orgId = getOrganizationId();
		OrganizationPermissionLevelPutRequest idMembership = getOrganizationPermissionLevelPutRequest();
		String response = getConnector().updateOrgWebsite(orgId, idMembership);
		assertNotNull(response);
	}
}
