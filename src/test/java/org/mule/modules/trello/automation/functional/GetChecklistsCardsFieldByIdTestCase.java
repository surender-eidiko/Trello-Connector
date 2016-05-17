package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetChecklistsCardsFieldByIdTestCase extends
		TrelloAbstractTestcases {

	public GetChecklistsCardsFieldByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetChecklistsCardsFieldById(){
		String checklistId=getChecklistId();
		String filter = getFilter();
		String response = getConnector().getChecklistsCardsFieldById(checklistId,filter);
		assertNotNull(response);
	}
}
