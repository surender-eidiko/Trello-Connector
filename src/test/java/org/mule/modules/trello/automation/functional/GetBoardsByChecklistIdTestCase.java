package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsByChecklistsIdGetResponse;

public class GetBoardsByChecklistIdTestCase extends TrelloAbstractTestcases {

	public GetBoardsByChecklistIdTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardByChecklistId(){
		String checklistId=getChecklistId();
		BoardsByChecklistsIdGetResponse  response = getConnector().getBoardWithChecklistId(checklistId, null,null);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
