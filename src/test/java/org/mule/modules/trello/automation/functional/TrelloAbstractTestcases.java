/**
 *
 */
package org.mule.modules.trello.automation.functional;

import org.junit.Before;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.bean.*;
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
	public Boolean getVal(){
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
	public String getNotificationId(){
		return null;
	}
	public String getQuery(){
		return null;
	}
	public String getSessionId(){
		return null;
	}
	public String getToken(){
		return null;
	}
	public String getWebhookId(){
		return null;
	}
	public String getTypeId(){
		return null;
	}
	public String getOrganizationId(){
		return null;
	}
	public String getMemberIdOrName(){
		return null;
	}
	public String getBardBackgroundId(){
		return null;
	}
	String getBoardStarId(){
		return null;
	}
	String getCustomEmojiId(){
		return null;
	}
	String getidCustomSticker(){
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
		BoardsPostRequest req = new BoardsPostRequest();
		req.setName("my first Name");
		return req;
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
	public ListsPostRequest getListsPostRequest(){
		return null;
	}
	public  ListsCardsPostRequest getListsCardsPostRequest(){
		return null;
	}
	public ListsMovedCardsPostRequest getListsMovedCardsPostRequest(){
		return null;
	}
	public NotificationsByIdPutRequest getNotificationsByIdPutRequest(){
		return null;
	}
	public NotificationsUnreadByIdPutRequest getNotificationsUnreadByIdPutRequest(){
		return null;
	}
	public NotificationsPostRequest getNotificationsPostRequest(){
		return null;
	}
	public SessionByIdPutRequest getSessionByIdPutRequest(){
		return null;
	}
	public SessionStatusByIdPutRequest getSessionStatusByIdPutRequest(){
		return null;
	}
	public SessionsPostRequest getSessionsPostRequest(){
		return null;
	}
	public TokensPutRequest getTokensPutRequest(){
		return null;
	}
	public WebhooksByIdPutRequest getWebhooksByIdPutRequest(){
		return null;
	}
	public WebhooksPutRequest getWebhooksPutRequest(){
		return null;

	}
	public WebhooksActivePutRequest getWebhooksActivePutRequest(){
		return null;
	}
	public WebhooksCallBackURLPutRequest getWebhooksCallBackURLPutRequest(){
		return null;
	}
	public WebhooksDescPutRequest getWebhooksDescPutRequest(){
		return null;
	}
	public OrganizationPutRequest getOrganizationPutRequest(){
		return null;
	}
	public OrganizationDescPutRequest getOrganizationDescPutRequest(){
		return null;
	}
	public OrganizationDisplayNamePutRequest getOrganizationDisplayNamePutRequest(){
		return null;
	}
	public  OrganizationMembersPutRequest getOrganizationMembersPutRequest(){
		return null;
	}
	public OrganizationMemberIdPutRequest getOrganizationMemberIdPutRequest(){
		return null;
	}
	public OrganizationMemberDeactivatedPutRequest getOrganizationMemberDeactivatedPutRequest(){
		return null;
	}
	public OrganizationMembershipPutRequest getOrganizationMembershipPutRequest(){
		return null;
	}
	public OrganizationAssociatedDomainPutRequest getOrganizationAssociatedDomainPutRequest(){
		return null;
	}
	public OrganizationBoardVisibilityRestrictPutRequest getOrganizationBoardVisibilityRestrictPutRequest(){
		return null;
	}
	public OrganizationExternalMembersDisabledPutRequest getOrganizationExternalMembersDisabledPutRequest(){
		return null;
	}
	public OrganizationGoogleAppVersionPutRequest getOrganizationGoogleAppVersionPutRequest(){
		return null;
	}
	public OrganizationInviteRestrictPutRequest getOrganizationInviteRestrictPutRequest(){
		return null;
	}
	public OrganizationPermissionLevelPutRequest getOrganizationPermissionLevelPutRequest(){
		return null;
	}
	public OrganizationPostRequest getOrganizationPostRequest(){
		return null;
	}
	public OrganizationLogoPostRequest getOrganizationLogoPostRequest(){
		return null;
	}
	public UpdateMemberPutRequest getUpdateMemberPutRequest(){
		return null;
	}
	public UpdateAvatarSourcePutRequest getUpdateAvatarSourcePutRequest(){
		return null;
	}
	public UpdateBoardBackgroundByIdPutRequest getUpdateBoardBackgroundByIdPutRequest(){
		return null;
	}
	public UpdateBoardStarsByIdPutRequest getUpdateBoardStarsByIdPutRequest(){
		return null;
	}
	public UpdateBoardStarByBoardIdPutRequest getUpdateBoardStarByBoardIdPutRequest(){
		return null;
	}
	public UpdateBoardStarByBoardPosPutRequest getUpdateBoardStarByBoardPosPutRequest(){
		return null;
	}
	public UpdateCustomBoardBackgroundById getUpdateCustomBoardBackgroundById(){
		return null;
	}
	public UpdateMemberSavedSearchesByIdPutRequest getUpdateMemberSavedSearchesByIdPutRequest(){
		return null;
	}
	public UpdateSavedSearchNamePutRequest getUpdateSavedSearchNamePutRequest(){
		return null;
	}
	public UpdateSavedSearchPosPutRequest getUpdateSavedSearchPosPutRequest(){
		return null;
	}
	public UpdateSavedSearchQueryPutRequest getUpdateSavedSearchQueryPutRequest(){
		return null;
	}
	public CreateMemberAvatarPostRequest getCreateMemberAvatarPostRequest(){
		return null;
	}
	public CreateMemberBoardBackgroundsPostRequest getCreateMemberBoardBackgroundsPostRequest(){
		return null;
	}
	public CreateMemberBoardStarsPostRequest getCreateMemberBoardStarsPostRequest(){
		return null;
	}
	public CreateCustomBoardBackgroundsPostRequest getCreateCustomBoardBackgroundsPostRequest(){
		return null;
	}
	public CreateCustomEmojiPostRequest getCreateCustomEmojiPostRequest(){
		return null;
	}
	public CreateCustomStickerPostRequest getCreateCustomStickerPostRequest(){
		return null;
	}
	public CreateOneTimeMessagesDismissedPostRequest getCreateOneTimeMessagesDismissedPostRequest(){
		return null;
	}
	public CreateSavedSearchesPostRequest getCreateSavedSearchesPostRequest(){
		return null;
	}
}
