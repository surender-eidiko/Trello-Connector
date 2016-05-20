package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.OrganizationDescPutRequest;

public class UpdateOrganizationsDescByIdOrNameTestCase extends
		TrelloAbstractTestcases {

	public UpdateOrganizationsDescByIdOrNameTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateOrganizationsDescByIdOrName(){
		String orgId = getOrganizationId();
		OrganizationDescPutRequest idMembership = getOrganizationDescPutRequest();
		String response = getConnector().updateOrganizationsDescByIdOrName(orgId, idMembership);
		assertNotNull(response);
	}
}
