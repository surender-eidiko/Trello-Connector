/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsByIdAndListsGetResponse;

public class GetBoardsByIdAndListsTestCase extends TrelloAbstractTestcases {

	public GetBoardsByIdAndListsTestCase() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndLists() {
	
		String boardId=getBoardId();
		BoardsByIdAndListsGetResponse boardsByIdAndListsGetResponse=getConnector().getBoardsByIdAndLists(boardId, null, null, null, null);
		assertNotNull(boardsByIdAndListsGetResponse);
		assertEquals("200", boardsByIdAndListsGetResponse.getStatusCode());
	}

}
