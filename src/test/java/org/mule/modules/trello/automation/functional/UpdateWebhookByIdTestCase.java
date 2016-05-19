package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.WebhooksByIdPutRequest;

public class UpdateWebhookByIdTestCase extends TrelloAbstractTestcases {

	public UpdateWebhookByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateWebhookById(){
		String token = getWebhookId();
		WebhooksByIdPutRequest req = getWebhooksByIdPutRequest();
		String response = getConnector().updateWebhookById(token,req);
		assertNotNull(response);
	}
}
