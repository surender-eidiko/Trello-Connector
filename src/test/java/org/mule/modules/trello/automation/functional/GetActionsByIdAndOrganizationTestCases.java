/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetActionsByIdAndOrganizationTestCases extends TrelloAbstractTestcases{

	public GetActionsByIdAndOrganizationTestCases() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetActionsByIdAndOrganization() {
		
		String actionId=getActionId();
		String actionsByIdAndOrganizationResponse=getConnector().getActionsByIdAndOrganization(actionId, null);
		assertNotNull(actionsByIdAndOrganizationResponse);
		assertEquals("200", actionsByIdAndOrganizationResponse);
	}

}
