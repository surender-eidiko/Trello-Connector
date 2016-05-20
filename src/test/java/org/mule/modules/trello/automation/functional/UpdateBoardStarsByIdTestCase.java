package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.UpdateBoardStarsByIdPutRequest;

public class UpdateBoardStarsByIdTestCase extends TrelloAbstractTestcases {

	public UpdateBoardStarsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateBoardStarsById(){
		String memId = getMemberIdOrName(); 
		String idBoardStars = getBoardStarId();
		UpdateBoardStarsByIdPutRequest request =getUpdateBoardStarsByIdPutRequest();
		String response = getConnector().updateBoardStarsById(memId,idBoardStars,request);
		assertNotNull(response);
	}
}
