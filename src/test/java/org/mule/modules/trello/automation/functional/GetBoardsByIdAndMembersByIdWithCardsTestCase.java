package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetBoardsByIdAndMembersByIdWithCardsTestCase extends TrelloAbstractTestcases{

	public GetBoardsByIdAndMembersByIdWithCardsTestCase() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndMembersByIdWithCards() {
		String boardId=getBoardId();
		String memberId=getMembershipId();
		String boardsByIdAndMembersByIdCardsGetResponse=getConnector().getBoardsByIdAndMembersByIdWithCards(boardId, memberId, null, null, null, null, null, null, null, null, null, null, null, null, null);
		assertNotNull(boardsByIdAndMembersByIdCardsGetResponse);
	}
}
