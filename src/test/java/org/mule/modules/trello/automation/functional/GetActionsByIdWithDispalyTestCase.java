package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.modules.trello.TrelloConnector;

public class GetActionsByIdWithDispalyTestCase extends TrelloAbstractTestcases {
 public GetActionsByIdWithDispalyTestCase() {
	 super(TrelloConnector.class);
	// TODO Auto-generated constructor stub
}
	@Test
	public void testGetActionsByIdWithDispaly() {
	
		String actionId=getActionId();
		String actionsByIdAndBoarWithFielddResponse=getConnector().getActionsByIdWithDispaly(actionId);
		assertNull(actionsByIdAndBoarWithFielddResponse);
		assertEquals("200", actionsByIdAndBoarWithFielddResponse);
	}

}
