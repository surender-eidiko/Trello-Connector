package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetCardsMembersByIdTestCase extends TrelloAbstractTestcases {

	public GetCardsMembersByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetCardsMembersById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		String response = getConnector().getCardsMembersById(cardIdOrShortlink, null);
		assertNotNull(response);
	}
}
