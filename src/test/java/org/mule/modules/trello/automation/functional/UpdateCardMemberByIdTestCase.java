package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsMemberPutRequest;

public class UpdateCardMemberByIdTestCase extends TrelloAbstractTestcases {

	public UpdateCardMemberByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateCardMemberById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CardsMemberPutRequest request = getCardsMemberPutRequest();
		String response = getConnector().updateCardMemberById(cardIdOrShortlink,request);
		assertNotNull(response);
	}
}
