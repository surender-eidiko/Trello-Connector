package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class DeleteMemberFromAllOrganizationsByIdOrNameTestCase extends
		TrelloAbstractTestcases {

	public DeleteMemberFromAllOrganizationsByIdOrNameTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteMemberFromAllOrganizationsByIdOrName(){
		String orgId = getOrganizationId();
		String idMember = getMemberId();
		org.mule.modules.trello.bean.StatusResponse response = getConnector().deleteMemberFromAllOrganizationsByIdOrName(orgId,idMember);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
