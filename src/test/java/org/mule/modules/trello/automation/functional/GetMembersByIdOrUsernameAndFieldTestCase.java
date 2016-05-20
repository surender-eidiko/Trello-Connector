package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetMembersByIdOrUsernameAndFieldTestCase extends
		TrelloAbstractTestcases {

	public GetMembersByIdOrUsernameAndFieldTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetMemberByIdOrUsername(){
		String memId = getMemberIdOrName(); 
		String field = getField();
		String response = getConnector().getMembersByIdOrUsernameAndField(memId, field);
		assertNotNull(response);
	}
}
