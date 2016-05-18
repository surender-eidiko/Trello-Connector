package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.ListsFieldByIdGetResponse;

public class GetListFieldByIdTestCase extends TrelloAbstractTestcases {

	public GetListFieldByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetListFieldById(){
		String listId = getListId();
		String field = getField();
		ListsFieldByIdGetResponse response = getConnector().getListFieldById(listId,field);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
