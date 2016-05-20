package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.UpdateBoardStarByBoardIdPutRequest;

public class UpdateBoardStarByBoardIdTestCase extends TrelloAbstractTestcases {

	public UpdateBoardStarByBoardIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateBoardStarByBoardId(){
		String memId = getMemberIdOrName(); 
		String idBoardStars = getBoardStarId();
		UpdateBoardStarByBoardIdPutRequest request =getUpdateBoardStarByBoardIdPutRequest();
		String response = getConnector().updateBoardStarByBoardId(memId,idBoardStars,request);
		assertNotNull(response);
	}
}
