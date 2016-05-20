package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.StatusResponse;

public class DeleteMembersBoardStarsByIdTestCase extends
		TrelloAbstractTestcases {

	public DeleteMembersBoardStarsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteMembersBoardStarsById(){
		String memId = getMemberIdOrName(); 
		String boardStars = getBoardStarId();
		StatusResponse response = getConnector().deleteMembersBoardStarsById(memId,boardStars);
		assertNotNull(response);
	}
}
