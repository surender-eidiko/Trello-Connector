package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetBoardsUnderCarsByIdTestCase extends TrelloAbstractTestcases {

	public GetBoardsUnderCarsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsUnderCarsById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		String response = getConnector().getBoardsUnderCarsById(cardIdOrShortlink, null);
		assertNotNull(response);
	}
}
