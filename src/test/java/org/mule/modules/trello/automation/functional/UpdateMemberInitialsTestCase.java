package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class UpdateMemberInitialsTestCase extends TrelloAbstractTestcases {

	public UpdateMemberInitialsTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateMemberInitials(){
		String memId = getMemberIdOrName(); 
		String value = getValue();
		String response = getConnector().updateMemberInitials(memId,value);
		assertNotNull(response);
	}
}
