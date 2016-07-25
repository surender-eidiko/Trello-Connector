/**
 *
 */
package org.mule.modules.trello.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.functional.*;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

@RunWith(Suite.class)
@SuiteClasses({
	CreateListsTestCase.class,
	DeleteCardsByIdTestCase.class,
	DeleteMemberUnderBoardByIdTestCase.class,
	DeleteWebhookByIdTestCase.class,
	GetAllBoardsTestCase.class,
	GetBoardListsByIdTestCase.class,
	GetBoardsByChecklistIdTestCase.class,
	GetBoardsByIdTestCase.class,
	GetCardsByIdTestCase.class,
	GetChecklistsByIdTestCase.class,
	GetMemberBoardsByMemnerIdTestCase.class,
	GetMemberByIdOrUsernameTestCase.class,
	GetWebhooksByIdTestCase.class,
	ListsByIdTestCase.class,
	PostBoardsTestCase.class,
	PostCardsTestCase.class,
	PostWebhookTestCase.class,
	PutBoardsByIdTestCase.class,
	PutCardsByIdTestCase.class,
	TrelloAbstractTestcases.class,
	UpdateListsByIdTestCase.class,
	UpdateWebhooksByIdTestCase.class,
	UpdateWebhookTestCase.class })
public class FunctionalTestSuite {
	@BeforeClass
	public static void initialiseSuite() {
		ConnectorTestContext.initialize(TrelloConnector.class);
	}

	@AfterClass
	public static void shutdownSuite() {

		ConnectorTestContext.shutDown();

	}
}
