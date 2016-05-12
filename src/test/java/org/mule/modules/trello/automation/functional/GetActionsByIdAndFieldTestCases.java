package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.modules.trello.TrelloConnector;

public class GetActionsByIdAndFieldTestCases extends TrelloAbstractTestcases{
	public GetActionsByIdAndFieldTestCases() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testGetActionsByIdAndField() {
		String actionId=getActionId();
		String field=getField();
		String actionByIdAndFieldResponse=getConnector().getActionsByIdAndField(actionId, field);
		 assertNotNull(actionByIdAndFieldResponse);
		 assertEquals("200", actionByIdAndFieldResponse);
	}

}
