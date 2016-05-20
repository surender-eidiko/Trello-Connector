package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.StatusResponse;

public class DeleteMembersSavedSearchesByIdTestCase extends
		TrelloAbstractTestcases {

	public DeleteMembersSavedSearchesByIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteMembersSavedSearchesById(){
		String memId = getMemberIdOrName(); 
		String idSavedSearch = getSavedSearchId();
		StatusResponse response = getConnector().deleteMembersSavedSearchesById(memId,idSavedSearch);
		assertNotNull(response);
	}
}
