package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.ChecklistsNameByIdPutRequest;

public class UpdateListsNameByIdTestCase extends TrelloAbstractTestcases {

	public UpdateListsNameByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateListsNameById(){
		String listId = getListId();
		ChecklistsNameByIdPutRequest request = getChecklistsNameByIdPutRequest();
		String response = getConnector().updateListsNameById(listId,request);
		assertNotNull(response);
	}
}
