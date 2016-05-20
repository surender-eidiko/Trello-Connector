package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.OrganizationGoogleAppVersionPutRequest;

public class UpdateOrgGoogleAppVersionTestCase extends TrelloAbstractTestcases {

	public UpdateOrgGoogleAppVersionTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateOrgGoogleAppVersion(){
		String orgId = getOrganizationId();
		OrganizationGoogleAppVersionPutRequest idMembership = getOrganizationGoogleAppVersionPutRequest();
		String response = getConnector().updateOrgGoogleAppVersion(orgId, idMembership);
		assertNotNull(response);
	}
}
