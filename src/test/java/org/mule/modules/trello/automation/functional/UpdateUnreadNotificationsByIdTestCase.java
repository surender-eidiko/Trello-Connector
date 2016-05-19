package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.NotificationsUnreadByIdPutRequest;

public class UpdateUnreadNotificationsByIdTestCase extends
		TrelloAbstractTestcases {

	public UpdateUnreadNotificationsByIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateUnreadNotificationsById(){
		String notificationId = getNotificationId();
		NotificationsUnreadByIdPutRequest request = getNotificationsUnreadByIdPutRequest();
		String response = getConnector().updateUnreadNotificationsById(notificationId, request);
		assertNotNull(response);
	}
}
