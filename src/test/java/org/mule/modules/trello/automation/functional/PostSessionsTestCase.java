package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.SessionsPostRequest;

public class PostSessionsTestCase extends TrelloAbstractTestcases {

	public PostSessionsTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostSessions(){
		SessionsPostRequest request = getSessionsPostRequest();
		String response = getConnector().postSessions(request);
		assertNotNull(response);
	}
}
