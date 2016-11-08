package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardListGetResponse;

public class GetCardListTestCase extends TrelloAbstractTestcases {

	public GetCardListTestCase() {
		super(TrelloConnector.class);
	}
	
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetCardListByCardId() {
		String cardId = "Qf6XDoUf";
		CardListGetResponse response =  getConnector().getCardListByCardId(cardId, null, null);
		assertNotNull(response);
		assertEquals("200", response.getStatusCode());
	}

}
