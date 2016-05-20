package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class DeleteOrganizationsAssociatedDomainByIdOrNameTestCase extends
		TrelloAbstractTestcases {

	public DeleteOrganizationsAssociatedDomainByIdOrNameTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteOrganizationsAssociatedDomainByIdOrName(){
		String orgId = getOrganizationId();
		org.mule.modules.trello.bean.StatusResponse response = getConnector().deleteOrganizationsAssociatedDomainByIdOrName(orgId);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
