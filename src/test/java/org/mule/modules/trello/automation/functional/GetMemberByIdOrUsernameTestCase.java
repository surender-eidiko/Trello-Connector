package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.MemberByIdGetresponse;

public class GetMemberByIdOrUsernameTestCase extends TrelloAbstractTestcases {

	public GetMemberByIdOrUsernameTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetMemberByIdOrUsername(){
		String memId = getMemberIdOrName(); 
		MemberByIdGetresponse response = getConnector().getMemberByIdOrUsername(memId, null, null,null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
