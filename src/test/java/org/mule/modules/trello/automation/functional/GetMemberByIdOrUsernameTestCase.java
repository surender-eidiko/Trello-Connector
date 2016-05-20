package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.mule.modules.trello.bean.MemberIdGetResponse;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetMemberByIdOrUsernameTestCase extends TrelloAbstractTestcases {

	public GetMemberByIdOrUsernameTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetMemberByIdOrUsername(){
		String memId = getMemberIdOrName(); 
		MemberIdGetResponse response = getConnector().getMemberByIdOrUsername(memId, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
