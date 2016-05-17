package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CheckListsUpdatePostRequest;

public class PostCardsChecklistByIdTestCase extends TrelloAbstractTestcases {

	public PostCardsChecklistByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostCardsChecklistById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CheckListsUpdatePostRequest request = getCheckListsUpdatePostRequest();
		String response = getConnector().postCardsChecklistById(cardIdOrShortlink,request);
		assertNotNull(response);
	}
}
