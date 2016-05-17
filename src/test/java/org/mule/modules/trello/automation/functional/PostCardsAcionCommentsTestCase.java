package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsAcionCommentsByIdPostRequest;

public class PostCardsAcionCommentsTestCase extends TrelloAbstractTestcases {

	public PostCardsAcionCommentsTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostCardsAcionComments(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CardsAcionCommentsByIdPostRequest request = getCardsAcionCommentsByIdPostRequest();
		String response = getConnector().postCardsAcionComments(cardIdOrShortlink,request);
		assertNotNull(response);
	}
}
