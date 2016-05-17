package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetCardsStickersTestCase extends TrelloAbstractTestcases {

	public GetCardsStickersTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetCardsStickers(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		String response = getConnector().getCardsStickers(cardIdOrShortlink, null);
		assertNotNull(response);
	}
}
