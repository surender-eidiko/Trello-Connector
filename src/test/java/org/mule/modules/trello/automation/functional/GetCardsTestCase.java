package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetCardsTestCase extends TrelloAbstractTestcases {

	public GetCardsTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetCards(){
		String memId = getMemberIdOrName(); 
		String response = getConnector().getCards(memId, null, null, null, null, null, null, null, null, null, null, null, null, null);
		assertNotNull(response);
	}
}
