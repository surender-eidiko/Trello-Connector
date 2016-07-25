package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.WebhooksPostResponse;
import org.mule.modules.trello.bean.WebhooksPutRequest;

public class UpdateWebhookTestCase extends TrelloAbstractTestcases {

	public UpdateWebhookTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateWebhook(){
		WebhooksPutRequest req = getWebhooksPutRequest();
		WebhooksPostResponse response = getConnector().updateWebhook(req,null);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
