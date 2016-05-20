package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.OrganizationAssociatedDomainPutRequest;

public class UpdateOrganizationAssociatedDomainTestCase extends
		TrelloAbstractTestcases {

	public UpdateOrganizationAssociatedDomainTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateOrganizationsNameByIdOrName(){
		String orgId = getOrganizationId();
		OrganizationAssociatedDomainPutRequest idMembership = getOrganizationAssociatedDomainPutRequest();
		String response = getConnector().updateOrganizationAssociatedDomain(orgId, idMembership);
		assertNotNull(response);
	}
}
