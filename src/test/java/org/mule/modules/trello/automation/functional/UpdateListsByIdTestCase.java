package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.ListsByIdGetResponse;
import org.mule.modules.trello.bean.ListsByIdPutRequest;

public class UpdateListsByIdTestCase extends TrelloAbstractTestcases {

	public UpdateListsByIdTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateListsById(){
		String listId = getListId();
		ListsByIdPutRequest request = getListsByIdPutRequest();
		ListsByIdGetResponse response = getConnector().updateListById(listId,request,null);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
