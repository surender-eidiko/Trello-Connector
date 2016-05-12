package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;

public class GetActionsByIdAndListTestCases extends TrelloAbstractTestcases {

	public GetActionsByIdAndListTestCases() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetActionsByIdAndList() {
		
		String actionId=getActionId();
		String actionByIdAndList=getConnector().getActionsByIdAndList(actionId, null);
		assertNull(actionByIdAndList);
		assertEquals("200", actionByIdAndList);
	}

}
