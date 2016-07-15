package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.WebhooksPostResponse;
import org.mule.modules.trello.bean.WebhooksPutRequest;

public class PostWebhookTestCase extends TrelloAbstractTestcases {

	public PostWebhookTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostWebhook(){
		WebhooksPutRequest req = getWebhooksPutRequest();
		WebhooksPostResponse response = getConnector().postWebhook(req,null);
		assertNotNull(response);
	}
}
