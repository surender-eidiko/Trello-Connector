package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CreateCustomBoardBackgroundsPostRequest;

public class CreateCustomBoardBackgroundsTestCase extends
		TrelloAbstractTestcases {

	public CreateCustomBoardBackgroundsTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testCreateCustomBoardBackgrounds(){
		String memId = getMemberIdOrName(); 
		CreateCustomBoardBackgroundsPostRequest request = getCreateCustomBoardBackgroundsPostRequest();
		String response = getConnector().createCustomBoardBackgrounds(memId,request);
		assertNotNull(response);
	}
}
