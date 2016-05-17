package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsCurrentCheckListPutRequest;

public class UpdateCurrentcheckListOnCardsTestCase extends
		TrelloAbstractTestcases {

	public UpdateCurrentcheckListOnCardsTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateCurrentcheckListOnCards(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		String idChecklistCurrent = getIdChecklistCurrent();
		String idCheckItem = getIdCheckItem();
		CardsCurrentCheckListPutRequest request = getCardsCurrentCheckListPutRequest();
		String response = getConnector().updateCurrentcheckListOnCards(cardIdOrShortlink, idChecklistCurrent,idCheckItem,request);
		assertNotNull(response);
	}
}
