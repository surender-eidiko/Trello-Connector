package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.WebhooksActivePutRequest;

public class UpdateActiveWebhookTestCase extends TrelloAbstractTestcases {

	public UpdateActiveWebhookTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateActiveWebhook(){
		String idWebhook = getWebhookId();
		WebhooksActivePutRequest req = getWebhooksActivePutRequest();
		String response = getConnector().updateActiveWebhook(idWebhook,req);
		assertNotNull(response);
	}
}
