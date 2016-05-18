package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetListCardsFilterByIdTestCase extends TrelloAbstractTestcases {

	public GetListCardsFilterByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetListCardsFilterById(){
		String listId = getListId();
		String filter= getFilter();
		String response = getConnector().getListCardsFilterById(listId,filter);
		assertNotNull(response);
	}
}
