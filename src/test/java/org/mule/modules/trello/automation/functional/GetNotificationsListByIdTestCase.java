package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetNotificationsListByIdTestCase extends TrelloAbstractTestcases {

	public GetNotificationsListByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetNotificationsListById(){
		String notificationId = getNotificationId();
		String response = getConnector().getNotificationsListById(notificationId, null);
		assertNotNull(response);
	}
}
