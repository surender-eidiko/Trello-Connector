package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetLabelsBoardsFieldByIdTestCase extends TrelloAbstractTestcases {

	public GetLabelsBoardsFieldByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetLabelsBoardsFieldById(){
		String idLabel = getIdLabel();
		String field = getField();
		String response = getConnector().getLabelsBoardsFieldById(idLabel,field);
		assertNotNull(response);
	}
}
