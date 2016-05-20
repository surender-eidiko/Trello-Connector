package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.StatusResponse;

public class DeleteOrganizationsByIdOrNameTestCase extends
		TrelloAbstractTestcases {

	public DeleteOrganizationsByIdOrNameTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteOrganizationsByIdOrName(){
		String orgId = getOrganizationId();
		StatusResponse response = getConnector().deleteOrganizationsByIdOrName( orgId);
		assertNotNull(response);
	}
}
