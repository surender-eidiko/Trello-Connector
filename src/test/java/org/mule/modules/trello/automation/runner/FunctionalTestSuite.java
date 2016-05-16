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
import org.mule.modules.trello.automation.functional.DeleteActionsByIdTestCase;
import org.mule.modules.trello.automation.functional.GetActionByIdTestCases;
import org.mule.modules.trello.automation.functional.GetActionsByIdAndBoardTestCases;
import org.mule.modules.trello.automation.functional.GetActionsByIdAndBoardWithFieldTestCases;
import org.mule.modules.trello.automation.functional.GetActionsByIdAndCardTestCases;
import org.mule.modules.trello.automation.functional.GetActionsByIdAndCardWithFieldTestCases;
import org.mule.modules.trello.automation.functional.GetActionsByIdAndFieldTestCases;
import org.mule.modules.trello.automation.functional.GetActionsByIdAndListTestCases;
import org.mule.modules.trello.automation.functional.GetActionsByIdAndListWithFieldTestCases;
import org.mule.modules.trello.automation.functional.GetActionsByIdAndMemberCreaterTestcases;
import org.mule.modules.trello.automation.functional.GetActionsByIdAndMemberCreaterWithFieldTestCases;
import org.mule.modules.trello.automation.functional.GetActionsByIdAndMemberTestCases;
import org.mule.modules.trello.automation.functional.GetActionsByIdAndMemberWithFieldTestCases;
import org.mule.modules.trello.automation.functional.GetActionsByIdAndOrganizationTestCases;
import org.mule.modules.trello.automation.functional.GetActionsByIdWithDispalyTestCase;
import org.mule.modules.trello.automation.functional.GetActionsByIdWithEntitiesTestCases;
import org.mule.modules.trello.automation.functional.GetBoardMemberShipsByIdTestCase;
import org.mule.modules.trello.automation.functional.GetBoardMemberShipsTestCase;
import org.mule.modules.trello.automation.functional.GetBoardMembersByBoardIdTestCase;
import org.mule.modules.trello.automation.functional.GetBoardMembersByBoardIdWithFilterTestCase;
import org.mule.modules.trello.automation.functional.GetBoardMembersInvitedTestCase;
import org.mule.modules.trello.automation.functional.GetBoardMembersInvitedWithFieldTestCase;
import org.mule.modules.trello.automation.functional.GetBoardsByIdAndActionsTestCases;
import org.mule.modules.trello.automation.functional.GetBoardsByIdAndBoardStarsTestCase;
import org.mule.modules.trello.automation.functional.GetBoardsByIdAndCardsTestCase;
import org.mule.modules.trello.automation.functional.GetBoardsByIdAndCardsWithFilterTestCase;
import org.mule.modules.trello.automation.functional.GetBoardsByIdAndCardsWithIdCardsTestCase;
import org.mule.modules.trello.automation.functional.GetBoardsByIdAndCheckListsTestCases;
import org.mule.modules.trello.automation.functional.GetBoardsByIdAndDeltasTestCase;
import org.mule.modules.trello.automation.functional.GetBoardsByIdAndFieldTestCase;
import org.mule.modules.trello.automation.functional.GetBoardsByIdAndLabelsTestCase;
import org.mule.modules.trello.automation.functional.GetBoardsByIdAndLabelsWithIdTestCase;
import org.mule.modules.trello.automation.functional.GetBoardsByIdAndListsTestCase;
import org.mule.modules.trello.automation.functional.GetBoardsByIdAndListsWithFilterTestCases;
import org.mule.modules.trello.automation.functional.GetBoardsByIdAndMembersByIdWithCardsTestCase;
import org.mule.modules.trello.automation.functional.GetBoardsByIdAndOrganizationTestCase;
import org.mule.modules.trello.automation.functional.GetBoardsByIdTestCase;
import org.mule.modules.trello.automation.functional.GetBoardsWithMyPrefTestCase;
import org.mule.modules.trello.automation.functional.PutReadActionsByIdTestCases;
import org.mule.modules.trello.automation.functional.PutWriteActionsByIdTestCases;
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
