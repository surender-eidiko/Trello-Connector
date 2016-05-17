package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsCheckListStatePutRequest;

public class UpdatecheckIteStateOnCardsTestCase extends TrelloAbstractTestcases {

	public UpdatecheckIteStateOnCardsTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdatecheckIteStateOnCards(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		String idChecklist = getIdChecklist();
		String idCheckItem = getIdCheckItem();
		CardsCheckListStatePutRequest request = getCardsCheckListStatePutRequest();
		String response = getConnector().updatecheckIteStateOnCards(cardIdOrShortlink, idChecklist,idCheckItem,request);
		assertNotNull(response);
	}
}
