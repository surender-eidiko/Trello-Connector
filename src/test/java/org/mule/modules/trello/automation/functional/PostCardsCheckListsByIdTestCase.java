package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsCheckListsByIdPostRequest;

public class PostCardsCheckListsByIdTestCase extends TrelloAbstractTestcases {

	public PostCardsCheckListsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostCardsCheckListsById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		String idCheckList = getIdChecklist();
		CardsCheckListsByIdPostRequest request = getCardsCheckListsByIdPostRequest();
		String response = getConnector().postCardsCheckListsById(cardIdOrShortlink,idCheckList,request);
		assertNotNull(response);
	}
}
