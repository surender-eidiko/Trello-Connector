package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetChecklistsFieldByIdTestCase extends TrelloAbstractTestcases {

	public GetChecklistsFieldByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetChecklistsFieldById(){
		String checklistId=getChecklistId();
		String field = getField();
		String response = getConnector().getChecklistsFieldById(checklistId,field);
		assertNotNull(response);
	}
}
