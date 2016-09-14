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
import org.mule.modules.trello.bean.StatusResponse;

public class DeleteCardsByIdTestCase extends TrelloAbstractTestcases {

	public DeleteCardsByIdTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteCardsById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		StatusResponse response = getConnector().deleteCardById(cardIdOrShortlink,null);
		System.out.println("Code :"+response.getStatusCode()+"message :"+response.getStatusMessage());
		assertNotNull(response);
		
	}
}
