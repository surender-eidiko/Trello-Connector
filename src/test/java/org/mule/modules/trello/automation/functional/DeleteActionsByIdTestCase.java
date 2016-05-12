package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.bean.StatusResponse;

public class DeleteActionsByIdTestCase extends TrelloAbstractTestcases {

	public DeleteActionsByIdTestCase() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteActionsById() {
		String membershipId=getMembershipId();
		StatusResponse statusResponse=getConnector().deleteActionsById(membershipId);
		assertNotNull(statusResponse);
		assertEquals("200", statusResponse.getStatusCode());

	}

}
