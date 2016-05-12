package org.mule.modules.trello.automation.functional;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.trello.TrelloConnector;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

@RunWith(Suite.class)
@SuiteClasses({ DeleteActionsByIdTestCase.class, GetActionByIdTestCases.class,
		GetActionsByIdAndBoardTestCases.class,
		GetActionsByIdAndBoardWithFieldTestCases.class,
		GetActionsByIdAndCardTestCases.class,
		GetActionsByIdAndCardWithFieldTestCases.class,
		GetActionsByIdAndFieldTestCases.class,
		GetActionsByIdAndListTestCases.class,
		GetActionsByIdAndListWithFieldTestCases.class,
		GetActionsByIdAndMemberCreaterTestcases.class,
		GetActionsByIdAndMemberCreaterWithFieldTestCases.class,
		GetActionsByIdAndMemberTestCases.class,
		GetActionsByIdAndMemberWithFieldTestCases.class,
		GetActionsByIdAndOrganizationTestCases.class,
		GetActionsByIdWithDispalyTestCase.class,
		GetActionsByIdWithEntitiesTestCases.class,
		GetBoardMembersByBoardIdTestCase.class,
		GetBoardMembersByBoardIdWithFilterTestCase.class,
		GetBoardMemberShipsByIdTestCase.class,
		GetBoardMemberShipsTestCase.class,
		GetBoardMembersInvitedTestCase.class,
		GetBoardMembersInvitedWithFieldTestCase.class,
		GetBoardsByIdAndActionsTestCases.class,
		GetBoardsByIdAndBoardStarsTestCase.class,
		GetBoardsByIdAndCardsTestCase.class,
		GetBoardsByIdAndCardsWithFilterTestCase.class,
		GetBoardsByIdAndCardsWithIdCardsTestCase.class,
		GetBoardsByIdAndCheckListsTestCases.class,
		GetBoardsByIdAndDeltasTestCase.class,
		GetBoardsByIdAndFieldTestCase.class,
		GetBoardsByIdAndLabelsTestCase.class,
		GetBoardsByIdAndLabelsWithIdTestCase.class,
		GetBoardsByIdAndListsTestCase.class,
		GetBoardsByIdAndListsWithFilterTestCases.class,
		GetBoardsByIdAndMembersByIdWithCardsTestCase.class,
		GetBoardsByIdAndOrganizationTestCase.class,
		GetBoardsByIdTestCase.class, GetBoardsWithMyPrefTestCase.class,
		PutReadActionsByIdTestCases.class, PutWriteActionsByIdTestCases.class })
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
