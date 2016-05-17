package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetCardActionsByIdTestCase extends TrelloAbstractTestcases {

	public GetCardActionsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetCardActionsById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		String response = getConnector().getCardActionsById(cardIdOrShortlink, null, null, null, null, null, null, null, null, null, null, null, null, null);
		assertNotNull(response);
	}
}
