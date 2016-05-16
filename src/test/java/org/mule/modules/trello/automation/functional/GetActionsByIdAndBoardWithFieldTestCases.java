/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.mule.modules.trello.TrelloConnector;

public class GetActionsByIdAndBoardWithFieldTestCases extends TrelloAbstractTestcases {

	public GetActionsByIdAndBoardWithFieldTestCases() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	
	public void testGetActionsByIdAndBoardWithField() {
		String field=getField();
		String actionId=getActionId();
		String actionsByIdAndBoarWithFielddResponse=getConnector().getActionsByIdAndBoardWithField(actionId, field);
		assertNotNull(actionsByIdAndBoarWithFielddResponse);
		assertEquals("200", actionsByIdAndBoarWithFielddResponse);
	}

}
