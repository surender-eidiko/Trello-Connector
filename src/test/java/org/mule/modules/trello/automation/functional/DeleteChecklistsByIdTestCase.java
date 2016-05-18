package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.StatusResponse;

public class DeleteChecklistsByIdTestCase extends TrelloAbstractTestcases {

	public DeleteChecklistsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteChecklistsById(){
		String idChecklist = getIdChecklist();
		StatusResponse response = getConnector().deleteChecklistsById(idChecklist);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
