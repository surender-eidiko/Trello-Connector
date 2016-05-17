package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsSubscribedPutRequest;

public class ReadSubsribedCardsTestCase extends TrelloAbstractTestcases {

	public ReadSubsribedCardsTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testReadSubsribedCards(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CardsSubscribedPutRequest request = getCardsSubscribedPutRequest();
		String response = getConnector().readSubsribedCards(cardIdOrShortlink,request);
		assertNotNull(response);
	}
}
