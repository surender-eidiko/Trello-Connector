package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.WebhooksPutRequest;

public class UpdateWebhookTestCase extends TrelloAbstractTestcases {

	public UpdateWebhookTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateWebhook(){
		WebhooksPutRequest req = getWebhooksPutRequest();
		String response = getConnector().updateWebhook(req);
		assertNotNull(response);
	}
}
