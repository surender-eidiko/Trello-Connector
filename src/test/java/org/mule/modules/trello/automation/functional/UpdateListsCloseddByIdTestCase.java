package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.ListsClosedByIdPutRequest;

public class UpdateListsCloseddByIdTestCase extends TrelloAbstractTestcases {

	public UpdateListsCloseddByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateListsCloseddById(){
		String listId = getListId();
		ListsClosedByIdPutRequest request = getListsClosedByIdPutRequest();
		String response = getConnector().updateListsCloseddById(listId,request);
		assertNotNull(response);
	}
}
