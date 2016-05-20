package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.OrganizationPostRequest;

public class PostOrganizationsTestCase extends TrelloAbstractTestcases {

	public PostOrganizationsTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostOrganizations(){
		OrganizationPostRequest request = getOrganizationPostRequest();
		String response = getConnector().postOrganizations( request);
		assertNotNull(response);
	}
}
