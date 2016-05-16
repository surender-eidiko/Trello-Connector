/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.modules.trello.TrelloConnector;

public class GetActionByIdTestCases extends TrelloAbstractTestcases{

	public GetActionByIdTestCases() {
		super(TrelloConnector.class);
		
	}
	@Test
	public void testGetActionById() {
		String actionId=getActionId();
		String actionResponse=getConnector().getActionsById(actionId, null, null, null, null, null, null, null);
		 assertNotNull(actionResponse);
		 assertEquals("200", actionResponse );
		
	}

}
