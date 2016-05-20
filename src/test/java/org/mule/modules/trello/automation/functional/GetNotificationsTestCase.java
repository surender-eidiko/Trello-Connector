package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetNotificationsTestCase extends TrelloAbstractTestcases {

	public GetNotificationsTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetNotifications(){
		String memId = getMemberIdOrName(); 
		String response = getConnector().getNotifications(memId, null, null, null, null, null, null, null, null, null, null, null);
		assertNotNull(response);
	}
}

