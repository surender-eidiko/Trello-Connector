package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.ChecklistsNameByIdPutRequest;

public class PutChecklistsNameByIdTestCase extends TrelloAbstractTestcases {

	public PutChecklistsNameByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPutChecklistsNameById(){
		String checklistId=getChecklistId();
		ChecklistsNameByIdPutRequest request = getChecklistsNameByIdPutRequest();
		String response = getConnector().putChecklistsNameById(checklistId,request);
		assertNotNull(response);
	}
}
