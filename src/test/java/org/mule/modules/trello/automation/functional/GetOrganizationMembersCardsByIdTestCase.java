package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetOrganizationMembersCardsByIdTestCase extends
		TrelloAbstractTestcases {

	public GetOrganizationMembersCardsByIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetOrganizationMembersCardsById(){
		String orgId = getOrganizationId();
		String idMember = getMemberId();
		String response = getConnector().getOrganizationMembersCardsById(orgId, idMember, null, null, null, null, null, null, null, null, null, null, null, null, null);
		assertNotNull(response);
	}
}
