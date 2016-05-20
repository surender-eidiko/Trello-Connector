package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetCustomStickersTestCase extends TrelloAbstractTestcases {

	public GetCustomStickersTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetCustomStickers(){
		String memId = getMemberIdOrName(); 
		String response = getConnector().getCustomStickers(memId,null);
		assertNotNull(response);
	}
}
