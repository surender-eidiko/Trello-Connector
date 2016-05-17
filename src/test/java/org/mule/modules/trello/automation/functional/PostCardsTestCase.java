package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsPostRequest;

public class PostCardsTestCase extends TrelloAbstractTestcases {

	public PostCardsTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostCards(){
		CardsPostRequest request = getCardsPostRequest();
		String response = getConnector().postCards(request);
		assertNotNull(response);
	}
}
