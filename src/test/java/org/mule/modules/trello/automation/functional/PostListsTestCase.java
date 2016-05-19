package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.ListsPostRequest;

public class PostListsTestCase extends TrelloAbstractTestcases {

	public PostListsTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostLists(){
		ListsPostRequest request = getListsPostRequest();
		String response = getConnector().postLists(request);
		assertNotNull(response);
	}
}
