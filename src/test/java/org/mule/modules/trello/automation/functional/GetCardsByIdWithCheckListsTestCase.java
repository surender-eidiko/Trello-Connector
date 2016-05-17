package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetCardsByIdWithCheckListsTestCase extends TrelloAbstractTestcases {

	public GetCardsByIdWithCheckListsTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetCardsByIdWithCheckLists(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		String response = getConnector().getCardsByIdWithCheckLists(cardIdOrShortlink, null, null, null, null, null, null);
		assertNotNull(response);
	}
}
