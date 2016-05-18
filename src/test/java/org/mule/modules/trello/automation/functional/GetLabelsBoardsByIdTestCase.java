package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetLabelsBoardsByIdTestCase extends TrelloAbstractTestcases {

	public GetLabelsBoardsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetLabelsBoardsById(){
		String idLabel = getIdLabel();
		String response = getConnector().getLabelsBoardsById(idLabel,null);
		assertNotNull(response);
	}
}
