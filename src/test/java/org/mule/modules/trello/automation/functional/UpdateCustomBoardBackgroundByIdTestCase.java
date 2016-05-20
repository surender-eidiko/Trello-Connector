package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.UpdateCustomBoardBackgroundById;

public class UpdateCustomBoardBackgroundByIdTestCase extends
		TrelloAbstractTestcases {

	public UpdateCustomBoardBackgroundByIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateCustomBoardBackgroundById(){
		String memId = getMemberIdOrName(); 
		String idBoardStars = getBoardStarId();
		UpdateCustomBoardBackgroundById request =getUpdateCustomBoardBackgroundById();
		String response = getConnector().updateCustomBoardBackgroundById(memId,idBoardStars,request);
		assertNotNull(response);
	}
}
