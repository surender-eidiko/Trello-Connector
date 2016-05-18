package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.ListsBoardsByIdPutRequest;

public class UpdateListsBoardsByIdTestCase extends TrelloAbstractTestcases {

	public UpdateListsBoardsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateListsBoardsById(){
		String listId = getListId();
		ListsBoardsByIdPutRequest request = getListsBoardsByIdPutRequest();
		String response = getConnector().updateListsBoardsById(listId,request);
		assertNotNull(response);
	}
}
