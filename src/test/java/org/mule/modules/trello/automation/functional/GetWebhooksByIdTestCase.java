package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetWebhooksByIdTestCase extends TrelloAbstractTestcases {

	public GetWebhooksByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetWebhooksById(){
		String idWebhook = getWebhookId();
		String response = getConnector().getWebhooksById(idWebhook);
		assertNotNull(response);
	}
}
