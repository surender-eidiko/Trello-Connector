package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.StatusResponse;

public class DeleteWebhookByIdTestCase extends TrelloAbstractTestcases {

	public DeleteWebhookByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteWebhookById(){
		String idWebhook = getWebhookId();
		StatusResponse response = getConnector().deleteWebhookById(idWebhook);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
