package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CheckListsByIdGetResponse;

public class GetChecklistsByIdTestCase extends TrelloAbstractTestcases {

	public GetChecklistsByIdTestCase() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetChecklistsById(){
		String checklistId=getChecklistId();
		CheckListsByIdGetResponse response = getConnector().getChecklistsById(checklistId,null, null, null, null,null, null);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
