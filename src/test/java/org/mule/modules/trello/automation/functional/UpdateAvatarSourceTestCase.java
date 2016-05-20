package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.UpdateAvatarSourcePutRequest;

public class UpdateAvatarSourceTestCase extends TrelloAbstractTestcases {

	public UpdateAvatarSourceTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateMember(){
		String memId = getMemberIdOrName(); 
		UpdateAvatarSourcePutRequest request =getUpdateAvatarSourcePutRequest();
		String response = getConnector().updateAvatarSource(memId,request);
		assertNotNull(response);
	}
}
