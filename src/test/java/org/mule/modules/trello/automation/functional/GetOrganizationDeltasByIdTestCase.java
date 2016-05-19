package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetOrganizationDeltasByIdTestCase extends TrelloAbstractTestcases {

	public GetOrganizationDeltasByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetOrganizationDeltasById(){
		String orgId = getOrganizationId();
		String tags = getTags();
		String response = getConnector().getOrganizationDeltasById(orgId,tags, null);
		assertNotNull(response);
	}
}
