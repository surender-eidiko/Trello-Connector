package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsLabelsPostRequest;

public class PostCardsLabelsByIdTestCase extends TrelloAbstractTestcases {

	public PostCardsLabelsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostCardsLabelsById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CardsLabelsPostRequest request = getCardsLabelsPostRequest();
		String response = getConnector().postCardsLabelsById(cardIdOrShortlink,request);
		assertNotNull(response);
	}
}
