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
import org.mule.modules.trello.bean.CardsByIdGetResponse;

public class GetCardsByIdTestCase  extends TrelloAbstractTestcases{
	
	public GetCardsByIdTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetCardsById(){
		String cardId =getCardIdOrShortlink(); 
		CardsByIdGetResponse response =getConnector().getCardById(cardId, null,null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		assertNotNull(response);
		System.out.println(response.getStatusCode());
		assertEquals("200", response.getStatusCode());
		System.out.println("responsce is :"+response);
	}
}
