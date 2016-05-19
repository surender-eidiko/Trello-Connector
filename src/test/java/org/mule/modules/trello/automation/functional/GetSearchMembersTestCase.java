package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetSearchMembersTestCase extends TrelloAbstractTestcases {

	public GetSearchMembersTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetSearchMembers(){
		String query = getQuery();
		String response = getConnector().getSearchMembers(query, null, null, null, null);
		assertNotNull(response);
	}
}
