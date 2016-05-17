package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CheckItems;

public class GetCheckItemsByIdTestCase extends TrelloAbstractTestcases {

	public GetCheckItemsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetCheckItemsById(){
		String checklistId=getChecklistId();
		CheckItems response = getConnector().getCheckItemsById(checklistId,null,null);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
