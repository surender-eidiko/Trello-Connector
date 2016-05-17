package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsBoardIdPutRequest;

public class UpdateCardsBoardIdByIdTestCase extends TrelloAbstractTestcases {

	public UpdateCardsBoardIdByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateCardsBoardIdById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CardsBoardIdPutRequest request = getCardsBoardIdPutRequest();
		String response = getConnector().updateCardsBoardIdById(cardIdOrShortlink,request);
		assertNotNull(response);
	}
}
