package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.UpdateMemberPutRequest;

public class UpdateMemberTestCase extends TrelloAbstractTestcases {

	public UpdateMemberTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateMember(){
		String memId = getMemberIdOrName(); 
		UpdateMemberPutRequest request =getUpdateMemberPutRequest();
		String response = getConnector().updateMember(memId,request);
		assertNotNull(response);
	}
}
