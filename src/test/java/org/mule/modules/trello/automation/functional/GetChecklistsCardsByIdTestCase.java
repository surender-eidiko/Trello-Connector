package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetChecklistsCardsByIdTestCase extends TrelloAbstractTestcases {

	public GetChecklistsCardsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetChecklistsCardsById(){
		String checklistId=getChecklistId();
		String response = getConnector().getChecklistsCardsById(checklistId, null, null, null, null, null, null, null, null, null, null, null, null,null);
		assertNotNull(response);
	}
}
