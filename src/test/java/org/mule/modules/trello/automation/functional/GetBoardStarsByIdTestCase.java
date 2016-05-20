package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetBoardStarsByIdTestCase extends TrelloAbstractTestcases {

	public GetBoardStarsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardStarsById(){
		String memId = getMemberIdOrName(); 
		String boardStarsId = getBoardStarId();
		String response = getConnector().getBoardStarsById(memId,boardStarsId);
		assertNotNull(response);
	}
}
