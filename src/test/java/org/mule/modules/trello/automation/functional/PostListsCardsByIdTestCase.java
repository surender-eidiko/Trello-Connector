package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.ListsCardsPostRequest;

public class PostListsCardsByIdTestCase extends TrelloAbstractTestcases {

	public PostListsCardsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostLists(){
		String idList = getListId();
		ListsCardsPostRequest request = getListsCardsPostRequest();
		String response = getConnector().postListsCardsById(idList,request);
		assertNotNull(response);
	}
}
