package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.ListsMovedCardsPostRequest;

public class PostListsMovedCardsByIdTestCase extends TrelloAbstractTestcases {

	public PostListsMovedCardsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostListsMovedCardsById(){
		String idList = getListId();
		ListsMovedCardsPostRequest request = getListsMovedCardsPostRequest();
		String response = getConnector().postListsMovedCardsById(idList,request);
		assertNotNull(response);
	}
}
