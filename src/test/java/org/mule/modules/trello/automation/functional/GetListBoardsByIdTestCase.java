package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetListBoardsByIdTestCase extends TrelloAbstractTestcases {

	public GetListBoardsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetListBoardsById(){
		String listId = getListId();
		String response = getConnector().getListBoardsById(listId,null);
		assertNotNull(response);
	}
}
