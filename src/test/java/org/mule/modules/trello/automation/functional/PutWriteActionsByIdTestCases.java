package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.ActionsTextByIdPutRequest;

public class PutWriteActionsByIdTestCases extends TrelloAbstractTestcases{

	 
	public PutWriteActionsByIdTestCases() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPutWriteActionsById() {
		String actionId=getActionId();
		String value=getValue();
		ActionsTextByIdPutRequest actionIdPutRequest=getActionTextByIdPutRequest();
		String putWriteActionByIdResponse=getConnector().putWriteActionsById(actionId, value, actionIdPutRequest);
		assertNotNull(putWriteActionByIdResponse);
		assertEquals("200", putWriteActionByIdResponse);

	}

}
