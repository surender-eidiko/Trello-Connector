package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.OrganizationMembershipPutRequest;

public class PutOrganizationMembershipByIdTestCase extends
		TrelloAbstractTestcases {

	public PutOrganizationMembershipByIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateOrganizationsDescByIdOrName(){
		String orgId = getOrganizationId();
		String idMember = getMemberId();
		OrganizationMembershipPutRequest idMembership = getOrganizationMembershipPutRequest();
		String response = getConnector().putOrganizationMembershipById(orgId,idMember, idMembership);
		assertNotNull(response);
	}
}
