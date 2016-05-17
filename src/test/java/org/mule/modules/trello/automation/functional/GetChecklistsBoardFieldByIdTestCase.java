package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetChecklistsBoardFieldByIdTestCase extends
		TrelloAbstractTestcases {

	public GetChecklistsBoardFieldByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetChecklistsBoardFieldById(){
		String checklistId=getChecklistId();
		String field = getField();
		String response = getConnector().getChecklistsBoardFieldById(checklistId,field);
		assertNotNull(response);
	}
}
