package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.StatusResponse;

public class DeleteLabelByIdTestCase extends TrelloAbstractTestcases {

	public DeleteLabelByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteLabelById(){
		String idLabel = getIdLabel();
		StatusResponse response = getConnector().deleteLabelById(idLabel);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
