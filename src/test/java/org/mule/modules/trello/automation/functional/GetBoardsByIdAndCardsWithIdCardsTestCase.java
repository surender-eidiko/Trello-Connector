/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetBoardsByIdAndCardsWithIdCardsTestCase extends TrelloAbstractTestcases{

	public GetBoardsByIdAndCardsWithIdCardsTestCase() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndCardsWithIdCards() {
		String boardId=getBoardId();
		String idCard=getIdCard();
		String boardsByIdAndActionsGetResponse=getConnector().getBoardsByIdAndCardsWithIdCards(boardId, idCard, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		assertNotNull(boardsByIdAndActionsGetResponse);
	}

}
