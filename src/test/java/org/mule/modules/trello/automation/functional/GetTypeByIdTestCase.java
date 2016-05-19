package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.TypesGetResponse;

public class GetTypeByIdTestCase extends TrelloAbstractTestcases {

	public GetTypeByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetTypeById(){
		String token = getTypeId();
		TypesGetResponse response = getConnector().getTypeById(token);
		assertNotNull(response);
	}
}
