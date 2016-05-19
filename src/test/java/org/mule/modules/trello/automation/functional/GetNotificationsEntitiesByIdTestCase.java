package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetNotificationsEntitiesByIdTestCase extends
		TrelloAbstractTestcases {

	public GetNotificationsEntitiesByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetNotificationsEntitiesById(){
		String notificationId = getNotificationId();
		String response = getConnector().getNotificationsEntitiesById(notificationId);
		assertNotNull(response);
	}

}
