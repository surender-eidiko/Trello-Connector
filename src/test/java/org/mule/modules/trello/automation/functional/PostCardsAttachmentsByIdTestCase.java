package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsAcionCommentsByIdPostRequest;
import org.mule.modules.trello.bean.CardsAttachmentsByIdPostRequest;

public class PostCardsAttachmentsByIdTestCase extends TrelloAbstractTestcases{

	public PostCardsAttachmentsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostCardsAttachmentsById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CardsAttachmentsByIdPostRequest request = getCardsAttachmentsByIdPostRequest();
		String response = getConnector().postCardsAttachmentsById(cardIdOrShortlink,request);
		assertNotNull(response);
	}
}
