package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.NotificationsByIdPutRequest;

public class UpdateNotificationsByIdTestCase extends TrelloAbstractTestcases {

	public UpdateNotificationsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetNotificationsCardsFieldById(){
		String notificationId = getNotificationId();
		NotificationsByIdPutRequest request = getNotificationsByIdPutRequest();
		String response = getConnector().updateNotificationsById(notificationId, request);
		assertNotNull(response);
	}
}