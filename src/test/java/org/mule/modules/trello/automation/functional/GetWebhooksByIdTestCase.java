/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.WebhooksPostResponse;

public class GetWebhooksByIdTestCase extends TrelloAbstractTestcases {

	public GetWebhooksByIdTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetWebhooksById(){
		String idWebhook = getWebhookId();
		WebhooksPostResponse response = getConnector().getWebhooksById(idWebhook,null);
		assertNotNull(response);
		//assertEquals("200",response.getStatusCode());
	}
}
