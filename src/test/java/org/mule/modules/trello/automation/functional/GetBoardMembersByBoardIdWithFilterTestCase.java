package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetBoardMembersByBoardIdWithFilterTestCase extends TrelloAbstractTestcases {

	public GetBoardMembersByBoardIdWithFilterTestCase() {
		// TODO Auto-generated constructor stub
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardMembersByBoardIdWithFilter() {
		String boardId=getBoardId();
		String filter=getFilter();
		String boardMembersByBoardIdGetResponse=getConnector().getBoardMembersByBoardIdWithFilter(boardId, filter);
		assertNotNull(boardMembersByBoardIdGetResponse);
	}

}
