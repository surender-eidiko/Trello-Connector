/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetActionsByIdAndListWithFieldTestCases extends TrelloAbstractTestcases {

	public GetActionsByIdAndListWithFieldTestCases() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetActionsByIdAndListWithField() {
		String field=getField();
		String actionId=getActionId();
		String actionsByIdAndListWithFieldResponse=getConnector().getActionsByIdAndListWithField(actionId, field);
		assertNull(actionsByIdAndListWithFieldResponse);
		assertEquals("200", actionsByIdAndListWithFieldResponse);
	}

}
