/**
 *
 */
package org.mule.modules.trello.automation.functional;

import org.junit.Before;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.bean.ActionsByIdPutRequest;
import org.mule.modules.trello.bean.ActionsTextByIdPutRequest;
import org.mule.modules.trello.bean.BoardsBackgroundPrefPutRequest;
import org.mule.modules.trello.bean.BoardsByIdLabelPostRequest;
import org.mule.modules.trello.bean.BoardsByIdListPostRequest;
import org.mule.modules.trello.bean.BoardsByIdPutRequest;
import org.mule.modules.trello.bean.BoardsCalendekeyGeneratePostRequest;
import org.mule.modules.trello.bean.BoardsCalenderFeedEnabledPutRequest;
import org.mule.modules.trello.bean.BoardsCardCoversPutRequest;
import org.mule.modules.trello.bean.BoardsCardsPutRequest;
import org.mule.modules.trello.bean.BoardsChecklistPostRequest;
import org.mule.modules.trello.bean.BoardsClosedByIdPutRequest;
import org.mule.modules.trello.bean.BoardsCommentsPutRequest;
import org.mule.modules.trello.bean.BoardsDescriptionByIdPutRequest;
import org.mule.modules.trello.bean.BoardsEmailListPrefPutRequest;
import org.mule.modules.trello.bean.BoardsEmailPosPrefPutRequest;
import org.mule.modules.trello.bean.BoardsInvitationPutRequest;
import org.mule.modules.trello.bean.BoardsLabelNameByColorPutRequest;
import org.mule.modules.trello.bean.BoardsListGuidePutRequest;
import org.mule.modules.trello.bean.BoardsMembersByMemberIdPutRequest;
import org.mule.modules.trello.bean.BoardsMembersPutRequest;
import org.mule.modules.trello.bean.BoardsMembershipsPutRequest;
import org.mule.modules.trello.bean.BoardsNamePutRequest;
import org.mule.modules.trello.bean.BoardsOrganizationByIdPutRequest;
import org.mule.modules.trello.bean.BoardsPermissionLevelPutRequest;
import org.mule.modules.trello.bean.BoardsPostRequest;
import org.mule.modules.trello.bean.BoardsPoweUpsPostRequest;
import org.mule.modules.trello.bean.BoardsSubscriberPutRequest;
import org.mule.modules.trello.bean.BoardsVotingPutRequest;
import org.mule.modules.trello.bean.CardsAcionCommentsByIdPostRequest;
import org.mule.modules.trello.bean.CardsAttachmentsByIdPostRequest;
import org.mule.modules.trello.bean.CardsBoardIdPutRequest;
import org.mule.modules.trello.bean.CardsByIdPutRequest;
import org.mule.modules.trello.bean.CardsCheckListNamePutRequest;
import org.mule.modules.trello.bean.CardsCheckListPositionPutRequest;
import org.mule.modules.trello.bean.CardsCheckListStatePutRequest;
import org.mule.modules.trello.bean.CardsCheckListsByIdPostRequest;
import org.mule.modules.trello.bean.CardsClosedPutRequest;
import org.mule.modules.trello.bean.CardsCommentsByIdPutRequest;
import org.mule.modules.trello.bean.CardsCurrentCheckListPutRequest;
import org.mule.modules.trello.bean.CardsDescriptionPutRequest;
import org.mule.modules.trello.bean.CardsDuePutRequest;
import org.mule.modules.trello.bean.CardsIdAttachmentPutRequest;
import org.mule.modules.trello.bean.CardsIdLabelByIdPostRequest;
import org.mule.modules.trello.bean.CardsIdMembersPostRequest;
import org.mule.modules.trello.bean.CardsLabelsPostRequest;
import org.mule.modules.trello.bean.CardsListPutRequest;
import org.mule.modules.trello.bean.CardsMemberPutRequest;
import org.mule.modules.trello.bean.CardsMembersVotedPostRequest;
import org.mule.modules.trello.bean.CardsNamePostRequest;
import org.mule.modules.trello.bean.CardsNamePutRequest;
import org.mule.modules.trello.bean.CardsPostRequest;
import org.mule.modules.trello.bean.CardsStickerPutRequest;
import org.mule.modules.trello.bean.CardsStickersPostRequest;
import org.mule.modules.trello.bean.CardsSubscribedPutRequest;
import org.mule.modules.trello.bean.CheckItemsPostRequest;
import org.mule.modules.trello.bean.CheckListsToCardByIdPostRequest;
import org.mule.modules.trello.bean.CheckListsUpdatePostRequest;
import org.mule.modules.trello.bean.ChecklistsByIdPutRequest;
import org.mule.modules.trello.bean.ChecklistsNameByIdPutRequest;
import org.mule.modules.trello.bean.ChecklistsPosByIdPutRequest;
import org.mule.modules.trello.bean.ChecklistsPostRequest;
import org.mule.modules.trello.bean.LabelByIdPutRequest;
import org.mule.modules.trello.bean.LabelColorByIdPutRequest;
import org.mule.modules.trello.bean.LabelNameByIdPutRequest;
import org.mule.modules.trello.bean.LabelsPostRequest;
import org.mule.modules.trello.bean.ListsBoardsByIdPutRequest;
import org.mule.modules.trello.bean.ListsByIdGetResponse;
import org.mule.modules.trello.bean.ListsByIdPutRequest;
import org.mule.modules.trello.bean.ListsClosedByIdPutRequest;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;
import org.mule.tools.devkit.ctf.mockup.ConnectorDispatcher;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

public class TrelloAbstractTestcases extends AbstractTestCase<TrelloConnector>{

	private TrelloConnector connector;
	  private ConnectorDispatcher<TrelloConnector> dispatcher;
	  public TrelloAbstractTestcases(Class<TrelloConnector> connector){
		    super(connector);
		  }
	protected TrelloConnector getConnector() {
		return connector;
	}
	protected ConnectorDispatcher<TrelloConnector> getDispatcher() {
		return dispatcher;
	}
	
	@SuppressWarnings("deprecation")
	@Before
	  public void init() throws Exception {

	    // Initialization for single-test run
	    ConnectorTestContext.initialize(TrelloConnector.class, false);

	    // Context instance
		ConnectorTestContext<TrelloConnector> context = ConnectorTestContext
	      .getInstance(TrelloConnector.class);

	    // Connector dispatcher
	    dispatcher = context.getConnectorDispatcher();

	    connector = dispatcher.createMockup();

	  }	
	
	
	public String getActionId()
	{
		return null;
	}
	public String getField()
	{
		return null;
	}

	public ActionsByIdPutRequest getActionByIdPutRequest()
	{
		return  null;
	}
	public ActionsTextByIdPutRequest getActionTextByIdPutRequest()
	{
		return null;
	}
	public String getValue()
	{
		return null;
	}
	public String getMembershipId()
	{
		return null;
	}
	public String getMemberId(){
		return null;
	}
	String getIdAttachment(){
		return null;
	}
	String getIdSticker(){
		return null;
	}
	String getPowerUp(){
		return null;
	}
	String getBoardId(){
	return null;
	}
	String getIdChecklist(){
		return null;
	}
	String getIdCheckItem()
	{
		return null;
	}
	public String getFilter()
	{
		return null;
	}
	public String getIdCard()
	{
		return null;
	}
	String getIdChecklistCurrent(){
		return null;
	}
	public String getCards()
	{
		return null;
	}
	public String getTags()
	{
		return null;
	}
	public String getIxLastUpdate()
	{
		return null;
	}
	public String getLabelId()
	{
		return null;
	}
	public String getIdMember(){
		return null;
	}
	public String getIdMembership(){
		return null;
	}
	public String getIdAction(){
		return null;
	}
	public String getChecklistId(){
		return null;
	}
	public String getSavedSearchId(){
		return null;
	}
	public String getIdCheckItems(){
		return null;
	}
	public String getListId(){
		return null;
	}
	public BoardsByIdPutRequest getBoardsByIdPutRequest(){
		return null;
	}
	public BoardsClosedByIdPutRequest getBoardsClosedByIdPutRequest(){
		return null;
	}
	public BoardsDescriptionByIdPutRequest getBoardsDescriptionByIdPutRequest(){
		return null;
	}
	public BoardsOrganizationByIdPutRequest getBoardsOrganizationByIdPutRequest(){
		return  null;
	}
	public BoardsLabelNameByColorPutRequest getBoardsLabelNameByColorPutRequest(){
		return null;
	}
	public BoardsMembersPutRequest getBoardsMembersPutRequest(){
		return null;
	}
	public BoardsMembersByMemberIdPutRequest getBoardsMembersByMemberIdPutRequest(){
		return null;
	}
	public BoardsMembershipsPutRequest getBoardsMembershipsPutRequest(){
		return null;
	}
	public BoardsEmailPosPrefPutRequest getBoardsEmailPosPrefPutRequest(){
		return null;
	}
	public BoardsEmailListPrefPutRequest getBoardsEmailListPrefPutRequest(){
		return null;
	}
	public BoardsListGuidePutRequest getBoardsListGuidePutRequest(){
		return null;
	}
	public BoardsNamePutRequest getBoardsNamePutRequest(){
		return null;
	}
	public BoardsBackgroundPrefPutRequest getBoardsBackgroundPrefPutRequest(){
		return null;
	}
	public BoardsCalenderFeedEnabledPutRequest getBoardsCalenderFeedEnabledPutRequest(){
		return null;
	}
	public BoardsCardsPutRequest getBoardsCardsPutRequest(){
		return null;
	}
	public BoardsCardCoversPutRequest getBoardsCardCoversPutRequest(){
		return null;
	}
	public BoardsCommentsPutRequest getBoardsCommentsPutRequest(){
		return null;
	}
	public BoardsInvitationPutRequest getBoardsInvitationPutRequest(){
		return null;
	}
	public BoardsPermissionLevelPutRequest getBoardsPermissionLevelPutRequest(){
		return null;
	}
	public BoardsVotingPutRequest getBoardsVotingPutRequest(){
		return null;
	}
	public BoardsSubscriberPutRequest getBoardsSubscriberPutRequest(){
		return null;
	}
	public BoardsPostRequest getBoardsPostRequest(){
		return null;
	}
	public BoardsCalendekeyGeneratePostRequest getBoardsCalendekeyGeneratePostRequest(){
		return null;
	}
	public BoardsChecklistPostRequest getBoardsChecklistPostRequest(){
		return null;
	}
	public BoardsByIdLabelPostRequest getBoardsByIdLabelPostRequest(){
		return null;
	}
	public BoardsByIdListPostRequest getBoardsByIdListPostRequest(){
		return null;
	}
	public BoardsPoweUpsPostRequest getBoardsPoweUpsPostRequest(){
		return null;
	}
	public String getCardIdOrShortlink(){
		return "5739632a782c29f22a039c4f";
	}
	public CardsByIdPutRequest getCardsByIdPutRequest(){
		return null;
	}
	public CardsCommentsByIdPutRequest getCardsCommentsByIdPutRequest(){
		return null;
	}
	public CardsCheckListNamePutRequest getCardsCheckListNamePutRequest(){
		return null;
	}
	public CardsCheckListPositionPutRequest getCardsCheckListPositionPutRequest(){
		return null;
	}
	public CardsCheckListStatePutRequest getCardsCheckListStatePutRequest(){
		return null;
	}
	public CardsCurrentCheckListPutRequest getCardsCurrentCheckListPutRequest(){
		return null;
	}
	public CardsClosedPutRequest getCardsClosedPutRequest(){
		return null;
	}
	public CardsDescriptionPutRequest getCardsDescriptionPutRequest(){
		return null;
	}
	public CardsDuePutRequest getCardsDuePutRequest(){
		return null;
	}
	public CardsIdAttachmentPutRequest getCardsCardsIdAttachmentPutRequest(){
		return null;
	}
	public CardsBoardIdPutRequest getCardsBoardIdPutRequest(){
		return null;
	}
	public String getIdLabel(){
		return null;
	}
	public CardsListPutRequest getCardsListPutRequest(){
		return null;
	}
	public CardsMemberPutRequest getCardsMemberPutRequest(){
		return null;
	}
	public CardsNamePutRequest getCardsNamePutRequest(){
		return null;
	}
	public CardsNamePostRequest  getCardsNamePostRequest(){
		return null;
	}
	public CardsStickerPutRequest getCardsStickerPutRequest(){
		return null;
	}
	public CardsSubscribedPutRequest getCardsSubscribedPutRequest(){
		return null;
	}
	public CardsPostRequest getCardsPostRequest(){
		return null;
	}
	public CardsAcionCommentsByIdPostRequest getCardsAcionCommentsByIdPostRequest(){
		return null;
	}
	public CardsAttachmentsByIdPostRequest getCardsAttachmentsByIdPostRequest(){
		return null;
	}
	public CardsCheckListsByIdPostRequest getCardsCheckListsByIdPostRequest(){
		return null;
	}
	public CheckListsToCardByIdPostRequest getCheckListsToCardByIdPostRequest(){
		return null;
	}
	public CheckListsUpdatePostRequest getCheckListsUpdatePostRequest(){
		return null;
	}
	public CardsIdLabelByIdPostRequest getCardsIdLabelByIdPostRequest(){
		return null;
	}
	public CardsIdMembersPostRequest getCardsIdMembersPostRequest(){
		return null;
	}
	public CardsLabelsPostRequest getCardsLabelsPostRequest(){
		return null;
	}
	public CardsMembersVotedPostRequest getCardsMembersVotedPostRequest(){
		return null;
	}
	public CardsStickersPostRequest getCardsStickersPostRequest(){
		return null;
	}
	public ChecklistsByIdPutRequest getChecklistsByIdPutRequest(){
		return null;
	}
	public ChecklistsNameByIdPutRequest getChecklistsNameByIdPutRequest(){
		return null;
	}
	public ChecklistsPosByIdPutRequest getChecklistsPosByIdPutRequest(){
		return null;
	}
	public ChecklistsPostRequest getChecklistsPostRequest(){
		return null;
	}
	public CheckItemsPostRequest getCheckItemsPostRequest(){
		return null;
	}
	public LabelByIdPutRequest getLabelByIdPutRequest(){
		return null;
	}
	public LabelColorByIdPutRequest getLabelColorByIdPutRequest(){
		return null;
	}
	public LabelNameByIdPutRequest getLabelNameByIdPutRequest(){
		return null;
	}
	public LabelsPostRequest getLabelsPostRequest(){
		return null;
	}
	public ListsByIdPutRequest getListsByIdPutRequest(){
		return null;
	}
	public ListsClosedByIdPutRequest getListsClosedByIdPutRequest(){
		return null;
	}
	public ListsBoardsByIdPutRequest getListsBoardsByIdPutRequest(){
		return null;
	}
	
}
