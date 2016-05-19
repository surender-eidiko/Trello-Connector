package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetTokensWebhooksTestCase extends TrelloAbstractTestcases {

	public GetTokensWebhooksTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetTokensWebhooks(){
		String token =getToken();
		String response = getConnector().getTokensWebhooks(token);
		assertNotNull(response);
	}

}
