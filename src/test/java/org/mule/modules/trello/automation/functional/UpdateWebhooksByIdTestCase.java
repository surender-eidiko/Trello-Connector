/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.WebhooksByIdPutRequest;
import org.mule.modules.trello.bean.WebhooksPostResponse;

public class UpdateWebhooksByIdTestCase extends TrelloAbstractTestcases {

	public UpdateWebhooksByIdTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateWebhoojkById(){
		String id = getWebhookId();
		WebhooksByIdPutRequest req = getWebhookByIdPutRequest();
		WebhooksPostResponse response = getConnector().updateWebhookById(id,req,null);
		assertNotNull(response);
	}
}
