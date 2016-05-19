package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.TokensGetResponse;

public class GetTokensByTokenTestcase extends TrelloAbstractTestcases {

	public GetTokensByTokenTestcase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetTokensByToken(){
		String token =getToken();
		TokensGetResponse response = getConnector().getTokensByToken(token, null, null);
		assertNotNull(response);
	}
}

