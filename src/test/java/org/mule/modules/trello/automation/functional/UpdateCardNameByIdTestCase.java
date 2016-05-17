package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsNamePutRequest;

public class UpdateCardNameByIdTestCase extends TrelloAbstractTestcases {

	public UpdateCardNameByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateCardNameById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CardsNamePutRequest request = getCardsNamePutRequest();
		String response = getConnector().updateCardNameById(cardIdOrShortlink,request);
		assertNotNull(response);
	}
}
