package org.mule.modules.trello.automation.functional;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsIdAttachmentPutRequest;

public class UpdateCardsIdAttachmentByIdTestCase extends TrelloAbstractTestcases{

	public UpdateCardsIdAttachmentByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateCardsIdAttachmentById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CardsIdAttachmentPutRequest request = getCardsCardsIdAttachmentPutRequest();
		String response = getConnector().updateCardsIdAttachmentById(cardIdOrShortlink,request);
		assertNotNull(response);
	}
}