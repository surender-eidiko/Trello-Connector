package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.MembersBoardsGetResponse;

public class GetBoardsTestCase extends TrelloAbstractTestcases {

	public GetBoardsTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardStars(){
		String memId = getMemberIdOrName(); 
		MembersBoardsGetResponse response = getConnector().getBoards(memId, null, null, null, null, null, null, null, null, null, null, null, null);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
