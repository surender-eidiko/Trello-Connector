package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetTokensFieldByTokenTestCase extends TrelloAbstractTestcases {

	public GetTokensFieldByTokenTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetTokensFieldByToken(){
		String token =getToken();
		String field = getField();
		String response = getConnector().getTokensFieldByToken(token, field);
		assertNotNull(response);
	}
}
