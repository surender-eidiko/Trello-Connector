package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.OrganizationPermissionLevelPutRequest;

public class UpdateOrgPermissionLevelTestCase extends TrelloAbstractTestcases {

	public UpdateOrgPermissionLevelTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateOrgPermissionLevel(){
		String orgId = getOrganizationId();
		OrganizationPermissionLevelPutRequest idMembership = getOrganizationPermissionLevelPutRequest();
		String response = getConnector().updateOrgPermissionLevel(orgId, idMembership);
		assertNotNull(response);
	}
}
