package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsByIdAndMembersByIdCardsGetResponse;

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
		BoardsByIdAndMembersByIdCardsGetResponse boardsByIdAndMembersByIdCardsGetResponse=getConnector().getBoardsByIdAndMembersByIdWithCards(boardId, memberId, null, null, null, null, null, null, null, null, null, null, null, null, null);
		assertNotNull(boardsByIdAndMembersByIdCardsGetResponse);
		assertEquals("200", boardsByIdAndMembersByIdCardsGetResponse.getStatusCode());
	}

}
