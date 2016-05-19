package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetOrganizationBoardsByIdWithFilterTestCase extends
		TrelloAbstractTestcases {

	public GetOrganizationBoardsByIdWithFilterTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetOrganizationBoardsById(){
		String orgId = getOrganizationId();
		String response = getConnector().getOrganizationBoardsByIdWithFilter(orgId, null);
		assertNotNull(response);
	}
}
