package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.UpdateBoardStarByBoardPosPutRequest;

public class UpdateBoardStarByBoardPosTestCase extends TrelloAbstractTestcases {

	public UpdateBoardStarByBoardPosTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateBoardStarByBoardPos(){
		String memId = getMemberIdOrName(); 
		String idBoardStars = getBoardStarId();
		UpdateBoardStarByBoardPosPutRequest request =getUpdateBoardStarByBoardPosPutRequest();
		String response = getConnector().updateBoardStarByBoardPos(memId,idBoardStars,request);
		assertNotNull(response);
	}
}
