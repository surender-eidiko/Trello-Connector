package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetBoardsByIdAndOrganizationWithFieldTestCase extends TrelloAbstractTestcases {
	public GetBoardsByIdAndOrganizationWithFieldTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndOrganizationWithFiels(){
		String boardId=getBoardId();
		String field = getField();
		String response = getConnector().getBoardsByIdAndOrganizationWithField(boardId, field);
		assertNotNull(response);
	}
	
}
