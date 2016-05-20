package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.OrganizationPutRequest;

public class UpdateOrganizationsByIdOrNameTestCase extends
		TrelloAbstractTestcases {

	public UpdateOrganizationsByIdOrNameTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateOrganizationsByIdOrName(){
		String orgId = getOrganizationId();
		OrganizationPutRequest idMembership = getOrganizationPutRequest();
		String response = getConnector().updateOrganizationsByIdOrName(orgId, idMembership);
		assertNotNull(response);
	}
}
