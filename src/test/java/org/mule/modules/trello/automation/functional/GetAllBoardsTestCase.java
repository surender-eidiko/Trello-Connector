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
import org.mule.modules.trello.bean.MembersBoardsGetResponse;

public class GetAllBoardsTestCase extends TrelloAbstractTestcases {

	public GetAllBoardsTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetAllBoards() {
		List<MembersBoardsGetResponse> response =  getConnector().getAllBoards(null);
		System.out.println("Response :"+response.toString());
		assertNotNull(response);
	}
}
