package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.ChecklistsPostRequest;

public class PostChecklistsTestCase extends TrelloAbstractTestcases {

	public PostChecklistsTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostChecklists(){
		ChecklistsPostRequest request = getChecklistsPostRequest();
		String response = getConnector().postChecklists(request);
		assertNotNull(response);
	}
}
