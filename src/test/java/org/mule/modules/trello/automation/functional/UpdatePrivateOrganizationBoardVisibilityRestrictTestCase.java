package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.OrganizationBoardVisibilityRestrictPutRequest;

public class UpdatePrivateOrganizationBoardVisibilityRestrictTestCase extends
		TrelloAbstractTestcases {

	public UpdatePrivateOrganizationBoardVisibilityRestrictTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdatePrivateOrganizationBoardVisibilityRestrict(){
		String orgId = getOrganizationId();
		OrganizationBoardVisibilityRestrictPutRequest idMembership = getOrganizationBoardVisibilityRestrictPutRequest();
		String response = getConnector().updatePrivateOrganizationBoardVisibilityRestrict(orgId, idMembership);
		assertNotNull(response);
	}
}
