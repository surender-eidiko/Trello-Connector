package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetCardsByIdWithCheckItemStatesTestCase extends
		TrelloAbstractTestcases {

	public GetCardsByIdWithCheckItemStatesTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetCardsByIdWithCheckItemStates(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		String response = getConnector().getCardsByIdWithCheckItemStates(cardIdOrShortlink, null);
		assertNotNull(response);
	}
}
