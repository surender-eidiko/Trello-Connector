package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.OrganizationLogoPostRequest;

public class PostOrganizationsLogoByIdOrNameTestCase extends
		TrelloAbstractTestcases {

	public PostOrganizationsLogoByIdOrNameTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostOrganizationsLogoByIdOrName(){
		String orgId = getOrganizationId();
		OrganizationLogoPostRequest request = getOrganizationLogoPostRequest();
		String response = getConnector().postOrganizationsLogoByIdOrName( orgId,request);
		assertNotNull(response);
	}
}
