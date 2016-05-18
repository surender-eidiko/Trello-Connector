package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CheckItems;

public class GetChecklistsByCheckedIdByIdTestCase extends
		TrelloAbstractTestcases {

	public GetChecklistsByCheckedIdByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetChecklistsByCheckedIdById(){
		String checklistId=getChecklistId();
		String idCheckItems = getIdCheckItems();
		CheckItems response = getConnector().getChecklistsByCheckedIdById(checklistId,idCheckItems,null);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
