package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.StatusResponse;

public class DeleteChecklistsCheckItemsByIdTestCase extends
		TrelloAbstractTestcases {

	public DeleteChecklistsCheckItemsByIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteChecklistsCheckItemsById(){
		String idChecklist = getIdChecklist();
		String idCheckItem = getIdCheckItem();
		StatusResponse response = getConnector().deleteChecklistsCheckItemsById(idChecklist,idCheckItem);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}

}
