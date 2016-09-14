/**
 *
 */
package org.mule.modules.trello.automation.functional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.ListsByIdGetResponse;
import org.mule.modules.trello.bean.StatusResponse;


public class ListsByIdTestCase extends TrelloAbstractTestcases {

	public ListsByIdTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testListsById(){
		String listId=getListId();
		ListsByIdGetResponse response = getConnector().getListById(listId,null, null);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
