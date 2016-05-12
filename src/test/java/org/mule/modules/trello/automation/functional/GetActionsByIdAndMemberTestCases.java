package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetActionsByIdAndMemberTestCases extends TrelloAbstractTestcases {

	public GetActionsByIdAndMemberTestCases() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetActionsByIdAndMember() {
		String actionId=getActionId();
		String actionsByIdAndMemberResponse=getConnector().getActionsByIdAndMember(actionId, null);
		assertNull(actionsByIdAndMemberResponse);
		assertEquals("200", actionsByIdAndMemberResponse);
	}

}
