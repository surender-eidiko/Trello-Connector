package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.bean.ActionsByIdPutRequest;

public class PutReadActionsByIdTestCases extends TrelloAbstractTestcases {

	public PutReadActionsByIdTestCases() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPutReadActionsById() {
		String actionId=getActionId();
		ActionsByIdPutRequest actionByIdPutRequest=getActionByIdPutRequest();
		String putReadActionByIdResponse=getConnector().putReadActionsById(actionId, null, actionByIdPutRequest);
		assertNotNull(putReadActionByIdResponse);
		assertEquals("200", putReadActionByIdResponse);
	}

}
