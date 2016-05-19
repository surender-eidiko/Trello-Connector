package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetNotificationsListFieldByIdTestCase extends
		TrelloAbstractTestcases {

	public GetNotificationsListFieldByIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetNotificationsListFieldById(){
		String notificationId = getNotificationId();
		String field = getField();
		String response = getConnector().getNotificationsListFieldById(notificationId, field);
		assertNotNull(response);
	}
}
