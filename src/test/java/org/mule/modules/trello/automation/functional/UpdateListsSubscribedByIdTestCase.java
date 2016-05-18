package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsSubscribedPutRequest;

public class UpdateListsSubscribedByIdTestCase extends TrelloAbstractTestcases {

	public UpdateListsSubscribedByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateListsSubscribedById(){
		String listId = getListId();
		CardsSubscribedPutRequest request = getCardsSubscribedPutRequest();
		String response = getConnector().updateListsSubscribedById(listId,request);
		assertNotNull(response);
	}
}
