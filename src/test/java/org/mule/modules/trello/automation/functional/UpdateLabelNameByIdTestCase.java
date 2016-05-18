package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.LabelNameByIdPutRequest;

public class UpdateLabelNameByIdTestCase extends TrelloAbstractTestcases {

	public UpdateLabelNameByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateLabelNameById(){
		String idLabel = getIdLabel();
		LabelNameByIdPutRequest request = getLabelNameByIdPutRequest();
		String response = getConnector().updateLabelNameById(idLabel,request);
		assertNotNull(response);
	}
}
