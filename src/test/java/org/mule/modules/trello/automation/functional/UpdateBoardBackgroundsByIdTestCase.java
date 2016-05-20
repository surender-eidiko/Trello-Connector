package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.UpdateBoardBackgroundByIdPutRequest;

public class UpdateBoardBackgroundsByIdTestCase extends TrelloAbstractTestcases {

	public UpdateBoardBackgroundsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateBoardBackgroundsById(){
		String memId = getMemberIdOrName(); 
		String backgroundId =getBardBackgroundId();
		UpdateBoardBackgroundByIdPutRequest request =getUpdateBoardBackgroundByIdPutRequest();
		String response = getConnector().updateBoardBackgroundsById(memId,backgroundId,request);
		assertNotNull(response);
	}
}
