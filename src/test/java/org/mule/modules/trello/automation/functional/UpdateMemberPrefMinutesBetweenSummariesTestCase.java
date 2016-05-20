package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class UpdateMemberPrefMinutesBetweenSummariesTestCase extends
		TrelloAbstractTestcases {

	public UpdateMemberPrefMinutesBetweenSummariesTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateMemberPrefMinutesBetweenSummaries(){
		String memId = getMemberIdOrName(); 
		String value = getValue();
		String response = getConnector().updateMemberPrefMinutesBetweenSummaries(memId,value);
		assertNotNull(response);
	}
}
