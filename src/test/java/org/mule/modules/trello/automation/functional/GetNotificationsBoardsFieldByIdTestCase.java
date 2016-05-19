package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetNotificationsBoardsFieldByIdTestCase extends
		TrelloAbstractTestcases {

	public GetNotificationsBoardsFieldByIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetNotificationsBoardsFieldById(){
		String notificationId = getNotificationId();
		String field = getField();
		String response = getConnector().getNotificationsBoardsFieldById(notificationId, field);
		assertNotNull(response);
	}
}
