package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsMembershipsPutRequest;

public class UpdateBoardsMembershipByMembershipIdTestCase extends
		TrelloAbstractTestcases {

	public UpdateBoardsMembershipByMembershipIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateBoardsMembershipByMembershipId(){
		String boardId=getBoardId();
		String idMebership =getIdMembership();
		BoardsMembershipsPutRequest request = getBoardsMembershipsPutRequest();
		String response = getConnector().updateBoardsMembershipByMembershipId(boardId, idMebership, request);
		assertNotNull(response);
	}
}
