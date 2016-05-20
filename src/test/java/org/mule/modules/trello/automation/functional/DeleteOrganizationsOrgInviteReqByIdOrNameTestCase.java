package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class DeleteOrganizationsOrgInviteReqByIdOrNameTestCase extends
		TrelloAbstractTestcases {

	public DeleteOrganizationsOrgInviteReqByIdOrNameTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteOrganizationsOrgInviteReqByIdOrName(){
		String orgId = getOrganizationId();
		org.mule.modules.trello.bean.StatusResponse response = getConnector().deleteOrganizationsOrgInviteReqByIdOrName(orgId);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
