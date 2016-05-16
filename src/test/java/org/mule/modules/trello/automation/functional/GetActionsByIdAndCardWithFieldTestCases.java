/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.modules.trello.TrelloConnector;

public class GetActionsByIdAndCardWithFieldTestCases extends TrelloAbstractTestcases {

	public GetActionsByIdAndCardWithFieldTestCases() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	public void testGetActionsByIdAndCardWithField() {
		String field=getField();
		String actionId=getActionId();
		String actionsByIdAndCardWithFielddResponse=getConnector().getActionsByIdAndCardWithField(actionId, field);
		assertNull(actionsByIdAndCardWithFielddResponse);
		assertEquals("200", actionsByIdAndCardWithFielddResponse);
	}

}
