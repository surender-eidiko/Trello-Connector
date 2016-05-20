package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetDeltasTestCase extends TrelloAbstractTestcases {

	public GetDeltasTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetDeltas(){
		String memId = getMemberIdOrName(); 
		String tags = getTags();
		String ixLastUpdate = getIxLastUpdate();
		String response = getConnector().getDeltas(memId, tags,ixLastUpdate);
		assertNotNull(response);
	}
}
