package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.ChecklistsPosByIdPutRequest;

public class PutChecklistsPosByIdTestCase extends TrelloAbstractTestcases {

	public PutChecklistsPosByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPutChecklistsPosById(){
		String checklistId=getChecklistId();
		ChecklistsPosByIdPutRequest request = getChecklistsPosByIdPutRequest();
		String response = getConnector().putChecklistsPosById(checklistId,request);
		assertNotNull(response);
	}
}
