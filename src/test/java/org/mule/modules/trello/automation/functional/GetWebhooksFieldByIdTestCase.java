package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetWebhooksFieldByIdTestCase extends TrelloAbstractTestcases {

	public GetWebhooksFieldByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetWebhooksFieldById(){
		String token = getWebhookId();
		String field = getField();
		String response = getConnector().getWebhooksFieldById(token,field);
		assertNotNull(response);
	}
}
