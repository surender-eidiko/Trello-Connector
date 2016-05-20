package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CreateMemberBoardBackgroundsPostRequest;

public class CreateMemberBoardBackgroundTestCase extends
		TrelloAbstractTestcases {

	public CreateMemberBoardBackgroundTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testCreateMemberBoardBackground(){
		String memId = getMemberIdOrName(); 
		CreateMemberBoardBackgroundsPostRequest request = getCreateMemberBoardBackgroundsPostRequest();
		String response = getConnector().createMemberBoardBackgrounds(memId,request);
		assertNotNull(response);
	}
}
