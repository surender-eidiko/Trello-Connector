package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsDuePutRequest;

public class UpdateCardsDueByIdTestCase extends TrelloAbstractTestcases {

	public UpdateCardsDueByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdatecheckItePositionOnCards(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CardsDuePutRequest request = getCardsDuePutRequest();
		String response = getConnector().updateCardsDueById(cardIdOrShortlink,request);
		assertNotNull(response);
	}
}
