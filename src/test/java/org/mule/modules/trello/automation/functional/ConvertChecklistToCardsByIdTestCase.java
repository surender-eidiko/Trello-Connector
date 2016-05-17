package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CheckListsToCardByIdPostRequest;

public class ConvertChecklistToCardsByIdTestCase extends
		TrelloAbstractTestcases {

	public ConvertChecklistToCardsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testConvertChecklistToCardsById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		String idCheckList = getIdChecklist();
		String idCheckItem = getIdCheckItem();
		CheckListsToCardByIdPostRequest request = getCheckListsToCardByIdPostRequest();
		String response = getConnector().convertChecklistToCardsById(cardIdOrShortlink,idCheckList,idCheckItem,request);
		assertNotNull(response);
	}
}
