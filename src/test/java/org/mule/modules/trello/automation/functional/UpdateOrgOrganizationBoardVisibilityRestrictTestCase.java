package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.OrganizationBoardVisibilityRestrictPutRequest;

public class UpdateOrgOrganizationBoardVisibilityRestrictTestCase extends
		TrelloAbstractTestcases {

	public UpdateOrgOrganizationBoardVisibilityRestrictTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateOrgOrganizationBoardVisibilityRestrict(){
		String orgId = getOrganizationId();
		OrganizationBoardVisibilityRestrictPutRequest idMembership = getOrganizationBoardVisibilityRestrictPutRequest();
		String response = getConnector().updateOrgOrganizationBoardVisibilityRestrict(orgId, idMembership);
		assertNotNull(response);
	}
}
