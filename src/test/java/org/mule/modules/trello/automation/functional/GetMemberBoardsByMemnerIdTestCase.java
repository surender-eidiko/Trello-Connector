/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.MembersBoardsGetResponse;

public class GetMemberBoardsByMemnerIdTestCase extends TrelloAbstractTestcases  {
	public GetMemberBoardsByMemnerIdTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testgetBoardMemberShipsById() {
		String memberId =getMemberId();
		List<MembersBoardsGetResponse> response =  getConnector().getBoards(memberId,null);
		System.out.println(response.toString());
		assertNotNull(response);
		//assertEquals("200",response.getStatusCode());
	}

}
