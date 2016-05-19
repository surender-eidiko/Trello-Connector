package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetOrganizationsNotificationsByIdTestCase extends
		TrelloAbstractTestcases {

	public GetOrganizationsNotificationsByIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetOrganizationsNotificationsById(){
		String notificationId = getNotificationId();
		String response = getConnector().getOrganizationsNotificationsById(notificationId, null);
		assertNotNull(response);
	}
}
