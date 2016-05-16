/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetActionsByIdAndMemberCreaterTestcases extends TrelloAbstractTestcases {

	public GetActionsByIdAndMemberCreaterTestcases() {
		super(TrelloConnector.class);
		
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetActionsByIdAndMemberCreater() {
		
		String actionId=getActionId();
		String actionsByIdAndMemberCreator=getConnector().getActionsByIdAndMemberCreater(actionId, null);
		assertNull(actionsByIdAndMemberCreator);
		assertEquals("200", actionsByIdAndMemberCreator);
	}

}
