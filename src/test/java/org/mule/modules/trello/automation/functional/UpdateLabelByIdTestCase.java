package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.LabelByIdPutRequest;

public class UpdateLabelByIdTestCase extends TrelloAbstractTestcases {

	public UpdateLabelByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateLabelById(){
		String idLabel = getIdLabel();
		LabelByIdPutRequest request = getLabelByIdPutRequest();
		String response = getConnector().updateLabelById(idLabel,request);
		assertNotNull(response);
	}
}
