package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.StatusResponse;

public class DeleteCardsIdLabelByIdTestCase extends TrelloAbstractTestcases {

	public DeleteCardsIdLabelByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteCardsIdLabelById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		String idLabel = getIdLabel();
		StatusResponse response = getConnector().deleteCardsIdLabelById(cardIdOrShortlink,idLabel);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
