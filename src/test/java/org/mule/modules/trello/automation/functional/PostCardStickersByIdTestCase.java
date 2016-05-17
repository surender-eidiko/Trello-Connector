package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsStickersPostRequest;

public class PostCardStickersByIdTestCase extends TrelloAbstractTestcases {

	public PostCardStickersByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostCardStickersById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CardsStickersPostRequest request = getCardsStickersPostRequest();
		String response = getConnector().postCardStickersById(cardIdOrShortlink,request);
		assertNotNull(response);
	}
}
