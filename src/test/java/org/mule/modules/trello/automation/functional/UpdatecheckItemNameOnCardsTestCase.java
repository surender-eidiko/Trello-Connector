package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsCheckListNamePutRequest;

public class UpdatecheckItemNameOnCardsTestCase extends TrelloAbstractTestcases {

	public UpdatecheckItemNameOnCardsTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdatecheckItemNameOnCards(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		String idChecklist = getIdChecklist();
		String idCheckItem = getIdCheckItem();
		CardsCheckListNamePutRequest request = getCardsCheckListNamePutRequest();
		String response = getConnector().updatecheckItemNameOnCards(cardIdOrShortlink, idChecklist,idCheckItem,request);
		assertNotNull(response);
	}
}