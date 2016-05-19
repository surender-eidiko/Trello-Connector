package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetTokensWebhooksByWebhookIdTestCase extends TrelloAbstractTestcases {

	public GetTokensWebhooksByWebhookIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetTokensWebhooksByWebhookId(){
		String token =getToken();
		String webhookId = getWebhookId();
		String response = getConnector().getTokensWebhooksByWebhookId(token,webhookId);
		assertNotNull(response);
	}
}
