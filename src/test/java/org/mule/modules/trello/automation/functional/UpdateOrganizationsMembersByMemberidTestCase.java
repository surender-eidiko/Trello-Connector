package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.OrganizationMemberIdPutRequest;

public class UpdateOrganizationsMembersByMemberidTestCase extends
		TrelloAbstractTestcases {

	public UpdateOrganizationsMembersByMemberidTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateOrganizationsDescByIdOrName(){
		String orgId = getOrganizationId();
		String idMember = getMemberId();
		OrganizationMemberIdPutRequest idMembership = getOrganizationMemberIdPutRequest();
		String response = getConnector().updateOrganizationsMembersByMemberid(orgId, idMember,idMembership);
		assertNotNull(response);
	}
}
