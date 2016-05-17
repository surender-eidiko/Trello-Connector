package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsNamePostRequest;

public class UpdateCardPosByIdTestCase extends TrelloAbstractTestcases {

	public UpdateCardPosByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateCardPosById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CardsNamePostRequest request = getCardsNamePostRequest();
		String response = getConnector().updateCardPosById(cardIdOrShortlink,request);
		assertNotNull(response);
	}
}
