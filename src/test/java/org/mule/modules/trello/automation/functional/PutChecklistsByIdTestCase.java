package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.ChecklistsByIdPutRequest;

public class PutChecklistsByIdTestCase extends TrelloAbstractTestcases {

	public PutChecklistsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPutChecklistsById(){
		String checklistId=getChecklistId();
		ChecklistsByIdPutRequest request = getChecklistsByIdPutRequest();
		String response = getConnector().putChecklistsById(checklistId,request);
		assertNotNull(response);
	}
}
