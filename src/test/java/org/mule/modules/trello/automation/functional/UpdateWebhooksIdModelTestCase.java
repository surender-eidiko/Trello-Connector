package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.WebhooksDescPutRequest;

public class UpdateWebhooksIdModelTestCase extends TrelloAbstractTestcases {

	public UpdateWebhooksIdModelTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateWebhooksIdModel(){
		String idWebhook = getWebhookId();
		WebhooksDescPutRequest req = getWebhooksDescPutRequest();
		String response = getConnector().updateWebhooksIdModel(idWebhook,req);
		assertNotNull(response);
	}
}
