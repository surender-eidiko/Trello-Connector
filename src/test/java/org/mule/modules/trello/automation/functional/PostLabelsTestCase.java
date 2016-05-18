package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.LabelsPostRequest;

public class PostLabelsTestCase extends TrelloAbstractTestcases {

	public PostLabelsTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testUpdateLabelById(){
		LabelsPostRequest request = getLabelsPostRequest();
		String response = getConnector().postLabels(request);
		assertNotNull(response);
	}
}
