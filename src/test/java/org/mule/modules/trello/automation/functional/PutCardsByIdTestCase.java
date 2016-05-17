package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsByIdPutRequest;

public class PutCardsByIdTestCase extends TrelloAbstractTestcases {

	public PutCardsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPutCardsByIdTestCase(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CardsByIdPutRequest request = getCardsByIdPutRequest();
		String response = getConnector().putCardsById(cardIdOrShortlink, request);
		assertNotNull(response);
	}
}
