package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsCheckListPositionPutRequest;

public class UpdatecheckItePositionOnCardsTestCase extends
		TrelloAbstractTestcases {

	public UpdatecheckItePositionOnCardsTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdatecheckItePositionOnCards(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		String idChecklist = getIdChecklist();
		String idCheckItem = getIdCheckItem();
		CardsCheckListPositionPutRequest request = getCardsCheckListPositionPutRequest();
		String response = getConnector().updatecheckItePositionOnCards(cardIdOrShortlink, idChecklist,idCheckItem,request);
		assertNotNull(response);
	}
}
