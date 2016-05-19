package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetOrganizationsFieldNotificationsByIdTestCase extends
		TrelloAbstractTestcases {

	public GetOrganizationsFieldNotificationsByIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetOrganizationsFieldNotificationsById(){
		String notificationId = getNotificationId();
		String field = getField();
		String response = getConnector().getOrganizationsFieldNotificationsById(notificationId, field);
		assertNotNull(response);
	}
}
