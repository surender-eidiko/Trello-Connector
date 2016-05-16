/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetBoardMembersByBoardIdTestCase extends TrelloAbstractTestcases {

	public GetBoardMembersByBoardIdTestCase() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardMembersByBoardId() {
		String boardId=getBoardId();
		String boardMembersByBoardIdGetResponse=getConnector().getBoardMembersByBoardId(boardId, null, null, null);
		assertNotNull(boardMembersByBoardIdGetResponse);
		
	}

}
