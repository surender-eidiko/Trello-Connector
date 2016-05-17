package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsStickerPutRequest;

public class UpdateCardStickersByIdTestCase extends TrelloAbstractTestcases {

	public UpdateCardStickersByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateCardStickersById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		String idSticker = getIdSticker();
		CardsStickerPutRequest request = getCardsStickerPutRequest();
		String response = getConnector().updateCardStickersById(cardIdOrShortlink,idSticker,request);
		assertNotNull(response);
	}
}
