package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.StatusResponse;

public class DeleteCardsCheckListsByIdTestCase extends TrelloAbstractTestcases {

	public DeleteCardsCheckListsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteCardsCheckListsById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		String idChecklist = getIdChecklist();
		StatusResponse response = getConnector().deleteCardsCheckListsById(cardIdOrShortlink,idChecklist);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}