/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetActionsByIdWithEntitiesTestCases extends TrelloAbstractTestcases{

	public GetActionsByIdWithEntitiesTestCases() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetActionsByIdWithEntities() {
		String actionId=getActionId();
		String actionsByIdWithEntities=getConnector().getActionsByIdWithEntities(actionId);
		assertNull(actionsByIdWithEntities);
		assertEquals("200", actionsByIdWithEntities);
		
	}

}
