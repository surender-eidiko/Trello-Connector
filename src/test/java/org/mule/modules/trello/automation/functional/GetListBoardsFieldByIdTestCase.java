package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetListBoardsFieldByIdTestCase extends TrelloAbstractTestcases {

	public GetListBoardsFieldByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetListBoardsFieldById(){
		String listId = getListId();
		String field = getField();
		String response = getConnector().getListBoardsFieldById(listId,field);
		assertNotNull(response);
	}
}
