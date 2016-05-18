package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetLabelsByIdTestCase extends TrelloAbstractTestcases {

	public GetLabelsByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetLabelsById(){
		String idLabel = getIdLabel();
		String response = getConnector().getLabelsById(idLabel,null);
		assertNotNull(response);
	}

}
