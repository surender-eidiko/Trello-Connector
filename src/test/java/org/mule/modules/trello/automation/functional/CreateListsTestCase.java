/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.ListPostResponse;
import org.mule.modules.trello.bean.ListsPostRequest;

public class CreateListsTestCase extends TrelloAbstractTestcases {

	public CreateListsTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testCreatingList(){
		ListsPostRequest req = getListsPostRequest();
		ListPostResponse response = getConnector().createList(req,null);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}

}
