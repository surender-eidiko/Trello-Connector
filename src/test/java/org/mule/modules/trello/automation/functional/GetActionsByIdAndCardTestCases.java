/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.modules.trello.TrelloConnector;

public class GetActionsByIdAndCardTestCases extends TrelloAbstractTestcases {

	public GetActionsByIdAndCardTestCases() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	public void testGetActionsByIdAndCard() {
		String actionId=getActionId();
		String actionsByIdAndBoarCardResponse=getConnector().getActionsByIdAndCard(actionId, null);
		assertNull(actionsByIdAndBoarCardResponse);
		assertEquals("200", actionsByIdAndBoarCardResponse);
	}

}
