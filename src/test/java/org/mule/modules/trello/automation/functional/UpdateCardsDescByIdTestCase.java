package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsDescriptionPutRequest;

public class UpdateCardsDescByIdTestCase extends TrelloAbstractTestcases {

	public UpdateCardsDescByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateCardsDescById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CardsDescriptionPutRequest request = getCardsDescriptionPutRequest();
		String response = getConnector().updateCardsDescById(cardIdOrShortlink,request);
		assertNotNull(response);
	}
}
