package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetNotificationsBoardsByIdTestCase extends TrelloAbstractTestcases {

	public GetNotificationsBoardsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetNotificationsBoardsById(){
		String notificationId = getNotificationId();
		String response = getConnector().getNotificationsBoardsById(notificationId, null);
		assertNotNull(response);
	}
}
