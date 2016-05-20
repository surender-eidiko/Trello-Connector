package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.OrganizationBoardVisibilityRestrictPutRequest;

public class UpdatePublicOrganizationBoardVisibilityRestrictTestCase extends
		TrelloAbstractTestcases {

	public UpdatePublicOrganizationBoardVisibilityRestrictTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdatePublicOrganizationBoardVisibilityRestrict(){
		String orgId = getOrganizationId();
		OrganizationBoardVisibilityRestrictPutRequest idMembership = getOrganizationBoardVisibilityRestrictPutRequest();
		String response = getConnector().updatePublicOrganizationBoardVisibilityRestrict(orgId, idMembership);
		assertNotNull(response);
	}
}
