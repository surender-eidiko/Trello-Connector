package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CreateMemberAvatarPostRequest;

public class CreateMemberAvatarTestCase extends TrelloAbstractTestcases {

	public CreateMemberAvatarTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateMemberUsername(){
		String memId = getMemberIdOrName(); 
		CreateMemberAvatarPostRequest request = getCreateMemberAvatarPostRequest();
		String response = getConnector().createMemberAvatar(memId,request);
		assertNotNull(response);
	}
}
