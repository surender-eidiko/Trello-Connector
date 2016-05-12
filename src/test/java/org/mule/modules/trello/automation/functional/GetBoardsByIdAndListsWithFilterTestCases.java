package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.bean.BoardsByIdAndListsGetResponse;

public class GetBoardsByIdAndListsWithFilterTestCases extends TrelloAbstractTestcases {

	public GetBoardsByIdAndListsWithFilterTestCases() {
		super(TrelloConnector.class);		
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndListsWithFilter() {
		String boardId=getBoardId();
		String filter=getFilter();
		BoardsByIdAndListsGetResponse boardsByIdAndListsGetResponse=getConnector().getBoardsByIdAndListsWithFilter(boardId, filter);
		assertNotNull(boardsByIdAndListsGetResponse);
		assertEquals("200", boardsByIdAndListsGetResponse.getStatusCode());
	}

}
