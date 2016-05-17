package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsIdMembersPostRequest;

public class PostCardsIdMembersByIdTestCase extends TrelloAbstractTestcases {

	public PostCardsIdMembersByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostCardsIdMembersById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CardsIdMembersPostRequest request = getCardsIdMembersPostRequest();
		String response = getConnector().postCardsIdMembersById(cardIdOrShortlink,request);
		assertNotNull(response);
	}
}
