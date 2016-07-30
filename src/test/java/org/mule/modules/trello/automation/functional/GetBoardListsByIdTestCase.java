/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.ListsUnderBoardsGetResponse;

public class GetBoardListsByIdTestCase extends TrelloAbstractTestcases {

	public GetBoardListsByIdTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndLists() {
	
		String boardId=getBoardId();
		List<ListsUnderBoardsGetResponse> boardsByIdAndListsGetResponse= getConnector().getAllListsUnderBoard(boardId,null);
		assertNotNull(boardsByIdAndListsGetResponse);
		//assertEquals("200", boardsByIdAndListsGetResponse.getStatusCode());
	}

}
