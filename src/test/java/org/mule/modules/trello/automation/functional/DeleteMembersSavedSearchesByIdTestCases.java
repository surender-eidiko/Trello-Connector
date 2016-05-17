/**
 * 
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.StatusResponse;


public class DeleteMembersSavedSearchesByIdTestCases extends TrelloAbstractTestcases{

	public DeleteMembersSavedSearchesByIdTestCases() {
		super(TrelloConnector.class);
	}

	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteMembersSavedSearchesById() {
		String membershipId = getMembershipId();
		String savedSearchId = getSavedSearchId();
		StatusResponse statusResponse=getConnector().deleteMembersSavedSearchesById(membershipId, savedSearchId);
		assertNotNull(statusResponse);
		assertEquals("200", statusResponse.getStatusCode());

	}

	
}
