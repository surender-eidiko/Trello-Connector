package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.WebhooksDescPutRequest;

public class UpdateWebhookDescriptionTestCase extends TrelloAbstractTestcases {

	public UpdateWebhookDescriptionTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateWebhookDescription(){
		String idWebhook = getWebhookId();
		WebhooksDescPutRequest req = getWebhooksDescPutRequest();
		String response = getConnector().updateWebhookDescription(idWebhook,req);
		assertNotNull(response);
	}
}
