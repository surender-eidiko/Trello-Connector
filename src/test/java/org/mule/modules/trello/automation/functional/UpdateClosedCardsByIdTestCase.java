package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsClosedPutRequest;

public class UpdateClosedCardsByIdTestCase extends TrelloAbstractTestcases {

	public UpdateClosedCardsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateClosedCardsById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CardsClosedPutRequest request = getCardsClosedPutRequest();
		String response = getConnector().updateClosedCardsById(cardIdOrShortlink,request);
		assertNotNull(response);
	}
}
