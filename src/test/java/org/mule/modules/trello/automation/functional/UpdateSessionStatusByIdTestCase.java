package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.SessionStatusByIdPutRequest;

public class UpdateSessionStatusByIdTestCase extends TrelloAbstractTestcases {

	public UpdateSessionStatusByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateSessionById(){
		String sessionId = getSessionId();
		SessionStatusByIdPutRequest request = getSessionStatusByIdPutRequest();
		String response = getConnector().updateSessionStatusById(sessionId, request);
		assertNotNull(response);
	}
}
