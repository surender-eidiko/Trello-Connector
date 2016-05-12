package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardMembersByBoardIdGetResponse;

public class GetBoardMembersByBoardIdTestCase extends TrelloAbstractTestcases {

	public GetBoardMembersByBoardIdTestCase() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardMembersByBoardId() {
		String boardId=getBoardId();
		BoardMembersByBoardIdGetResponse boardMembersByBoardIdGetResponse=getConnector().getBoardMembersByBoardId(boardId, null, null, null);
		assertNotNull(boardMembersByBoardIdGetResponse);
		assertEquals("200", boardMembersByBoardIdGetResponse.getStatusCode());
		
	}

}
