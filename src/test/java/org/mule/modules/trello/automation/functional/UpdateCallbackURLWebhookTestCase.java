package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.WebhooksCallBackURLPutRequest;

public class UpdateCallbackURLWebhookTestCase extends TrelloAbstractTestcases {

	public UpdateCallbackURLWebhookTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateCallbackURLWebhook(){
		String idWebhook = getWebhookId();
		WebhooksCallBackURLPutRequest req = getWebhooksCallBackURLPutRequest();
		String response = getConnector().updateCallbackURLWebhook(idWebhook,req);
		assertNotNull(response);
	}
}
