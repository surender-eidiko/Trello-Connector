package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.UpdateMemberSavedSearchesByIdPutRequest;

public class UpdateMemberSavedSearchesByIdTestCase extends
		TrelloAbstractTestcases {

	public UpdateMemberSavedSearchesByIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateMemberSavedSearchesById(){
		String memId = getMemberIdOrName(); 
		String idSavedSearch = getSavedSearchId();
		UpdateMemberSavedSearchesByIdPutRequest request = getUpdateMemberSavedSearchesByIdPutRequest();
		String response = getConnector().updateMemberSavedSearchesById(memId,idSavedSearch,request);
		assertNotNull(response);
	}
}
