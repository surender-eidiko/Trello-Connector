package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetActionsByIdAndMemberCreaterWithFieldTestCases extends TrelloAbstractTestcases {

	public GetActionsByIdAndMemberCreaterWithFieldTestCases() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetActionsByIdAndMemberCreaterWithField() {
		String field=getField();
		String actionId=getActionId();
		String actionsByIdAndMemberCreatorWithFielddResponse=getConnector().getActionsByIdAndMemberCreaterWithField(actionId, field);
		assertNull(actionsByIdAndMemberCreatorWithFielddResponse);
		assertEquals("200", actionsByIdAndMemberCreatorWithFielddResponse);
	}

}
