package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class UpdateMemberPrefColorBlindTestCase extends TrelloAbstractTestcases {

	public UpdateMemberPrefColorBlindTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateMemberPrefColorBlind(){
		String memId = getMemberIdOrName(); 
		Boolean value = getVal();
		String response = getConnector().updateMemberPrefColorBlind(memId,value);
		assertNotNull(response);
	}
}
