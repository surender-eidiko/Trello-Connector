package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.OrganizationsGetResponse;

public class GetOrganizationsTestCase extends TrelloAbstractTestcases {

	public GetOrganizationsTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetCustomEmojiById(){
		String memId = getMemberIdOrName(); 
		OrganizationsGetResponse response = getConnector().getOrganizations(memId, null,null, null);
		assertNotNull(response);
	}
}
