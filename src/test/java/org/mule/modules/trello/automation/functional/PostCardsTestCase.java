/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.Serializable;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsByIdGetResponse;
import org.mule.modules.trello.bean.CardsPostRequest;

public class PostCardsTestCase extends TrelloAbstractTestcases implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PostCardsTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostCards(){
		CardsPostRequest request = getCardsPostRequest();
		CardsByIdGetResponse response = getConnector().createCard(request,null);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
