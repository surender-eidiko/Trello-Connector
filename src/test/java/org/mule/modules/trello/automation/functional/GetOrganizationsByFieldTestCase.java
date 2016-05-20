package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetOrganizationsByFieldTestCase extends TrelloAbstractTestcases {

	public GetOrganizationsByFieldTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetOrganizationsByField(){
		String memId = getMemberIdOrName(); 
		String field = getField();
		String response = getConnector().getOrganizationsByField(memId, field);
		assertNotNull(response);
	}
}
