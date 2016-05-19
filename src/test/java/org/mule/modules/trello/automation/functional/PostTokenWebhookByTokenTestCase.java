package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.TokensPutRequest;

public class PostTokenWebhookByTokenTestCase extends TrelloAbstractTestcases {

	public PostTokenWebhookByTokenTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostTokenWebhookByToken(){
		String token =getToken();
		TokensPutRequest request = getTokensPutRequest();
		String response = getConnector().postTokenWebhookByToken(token,request);
		assertNotNull(response);
	}
}
