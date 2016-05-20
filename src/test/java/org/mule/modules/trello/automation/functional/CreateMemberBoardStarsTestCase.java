package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CreateMemberBoardStarsPostRequest;

public class CreateMemberBoardStarsTestCase extends TrelloAbstractTestcases {

	public CreateMemberBoardStarsTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testCreateMemberBoardStars(){
		String memId = getMemberIdOrName(); 
		CreateMemberBoardStarsPostRequest request = getCreateMemberBoardStarsPostRequest();
		String response = getConnector().createMemberBoardStars(memId,request);
		assertNotNull(response);
	}
}
