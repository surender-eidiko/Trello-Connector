package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsByIdGetResponse;
import org.mule.modules.trello.bean.CardsByIdPutRequest;

public class PutCardsByIdTestCase extends TrelloAbstractTestcases {

	public PutCardsByIdTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPutCardsByIdTestCase(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CardsByIdPutRequest request = getCardsByIdPutRequest();
		CardsByIdGetResponse response = getConnector().updateCardById(cardIdOrShortlink, request,null);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
