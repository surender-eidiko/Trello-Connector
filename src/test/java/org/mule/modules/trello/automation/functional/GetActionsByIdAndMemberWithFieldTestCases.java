package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetActionsByIdAndMemberWithFieldTestCases extends TrelloAbstractTestcases {

	public GetActionsByIdAndMemberWithFieldTestCases() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetActionsByIdAndMemberWithField() {
		String field=getField();
		String actionId=getActionId();
		String actionsByIdAndMemberWithFielddResponse=getConnector().getActionsByIdAndMemberWithField(actionId, field);
		assertNull(actionsByIdAndMemberWithFielddResponse);
		assertEquals("200", actionsByIdAndMemberWithFielddResponse);
	}

}
