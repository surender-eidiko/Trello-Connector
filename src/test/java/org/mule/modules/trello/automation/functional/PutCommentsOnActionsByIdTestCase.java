package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsCommentsByIdPutRequest;

public class PutCommentsOnActionsByIdTestCase extends TrelloAbstractTestcases {

	public PutCommentsOnActionsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPutCommentsOnActionsById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		String idAction =getIdAction();
		CardsCommentsByIdPutRequest request = getCardsCommentsByIdPutRequest();
		String response = getConnector().putCommentsOnActionsById(cardIdOrShortlink,idAction, request);
		assertNotNull(response);
	}
}