package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.ChecklistsPosByIdPutRequest;

public class UpdateListsPositionByIdTestCase extends TrelloAbstractTestcases {

	public UpdateListsPositionByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateListsPositionById(){
		String listId = getListId();
		ChecklistsPosByIdPutRequest request = getChecklistsPosByIdPutRequest();
		String response = getConnector().updateListsPositionById(listId,request);
		assertNotNull(response);
	}
}
