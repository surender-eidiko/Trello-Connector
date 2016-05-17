package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsMembersByMemberIdPutRequest;

public class UpdateBoardMemberByMemberIdTestCase extends
		TrelloAbstractTestcases {

	public UpdateBoardMemberByMemberIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateBoardMemberByMemberId(){
		String boardId=getBoardId();
		String idMeber =getIdMember();
		BoardsMembersByMemberIdPutRequest request = getBoardsMembersByMemberIdPutRequest();
		String response = getConnector().updateBoardMemberByMemberId(boardId,idMeber, request);
		assertNotNull(response);
	}
}
