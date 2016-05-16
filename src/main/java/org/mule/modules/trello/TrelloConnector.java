/**
 *
 */
package org.mule.modules.trello;

import java.util.Map;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.MetaDataScope;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.licensing.RequiresEnterpriseLicense;
import org.mule.api.annotations.lifecycle.Start;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.MetaDataKeyParam;
import org.mule.api.annotations.param.Optional;
import org.mule.modules.trello.bean.*;
import org.mule.modules.trello.config.ConnectorConfig;


/**
 * This is Trello Connector Class
 * 
 * @author Surender
 *
 * 
 */
@Connector(name = "trello", friendlyName = "Trello", minMuleVersion = "3.7.0")
@RequiresEnterpriseLicense
@MetaDataScope(DataSenseResolver.class)
public class TrelloConnector {

	@Config
	ConnectorConfig config;
	private TrelloClient client;

	/**
	 * DataSense processor
	 * 
	 * @param key
	 *            Key to be used to populate the entity
	 * @param entity
	 *            Map that represents the entity
	 * @return Some string
	 */
	@Start
	public void init() {
		setClient(new TrelloClient(this));
	}

	@Processor
	public String getActionsById(String actionId,@Optional Boolean display,
			@Optional Boolean entities, @Optional String fields,
			@Optional Boolean member, @Optional String member_fields,
			@Optional Boolean memberCreator,
			@Optional String memberCreator_fields) {
		return getClient().getActionsById(actionId,display, entities, fields, member,
				member_fields, memberCreator, memberCreator_fields);
	}
	
	@Processor
	public String getActionsByIdAndField(String actionId,String field){
		return getClient().getActionsByIdAndField(actionId,field);
	}
	
	@Processor
	public String getActionsByIdAndBoard(String actionId,String fields){
		return getClient().getActionsByIdAndBoard(actionId,fields);
	}
	
	@Processor
	public String getActionsByIdAndBoardWithField(String actionId,String field){
		return getClient().getActionsByIdAndBoardWithField(actionId,field);
	}
	
	@Processor
	public String getActionsByIdAndCard(String actionId,@Optional String fields){
		return getClient().getActionsByIdAndCard(actionId,fields);
	}
	@Processor
	public String getActionsByIdAndCardWithField(String actionId,String field){
		return getClient().getActionsByIdAndCardWithField(actionId,field);
	}
	
	@Processor
	public String getActionsByIdWithDispaly(String actionId){
		return getClient().getActionsByIdWithDispaly(actionId);
	}
	@Processor
	public String getActionsByIdWithEntities(String actionId){
		return getClient().getActionsByIdWithEntities(actionId);
	}
	@Processor
	public String getActionsByIdAndList(String actionId,@Optional String fields){
		return getClient().getActionsByIdAndList(actionId,fields);
	}
	@Processor
	public String getActionsByIdAndListWithField(String actionId,String field){
		return getClient().getActionsByIdAndListWithField(actionId,field);
	}
	
	@Processor
	public String getActionsByIdAndMember(String actionId,@Optional String fields){
		return getClient().getActionsByIdAndMember(actionId,fields);
	}
	@Processor
	public String getActionsByIdAndMemberWithField(String actionId,String field){
		return getClient().getActionsByIdAndMemberWithField(actionId,field);
	}
	@Processor
	public String getActionsByIdAndMemberCreater(String actionId,@Optional String fields){
		return getClient().getActionsByIdAndMemberCreater(actionId,fields);
	}
	@Processor
	public String getActionsByIdAndMemberCreaterWithField(String actionId,String field){
		return getClient().getActionsByIdAndMemberCreaterWithField(actionId,field);
	}
	@Processor
	public String getActionsByIdAndOrganization(String actionId,@Optional String fields){
		return getClient().getActionsByIdAndOrganizationWithField(actionId,fields);
	}
	
	@Processor
	  public String putReadActionsById(String actionId,ActionsByIdPutRequest actionIdPutRequest) {
	    return getClient().putReadActionsById(actionId,actionIdPutRequest);
	  }
	
	@Processor
	  public String putWriteActionsById(String actionId,String value, ActionsTextByIdPutRequest actionIdPutRequest) {
	    return getClient().putWriteActionsById(actionId,value,actionIdPutRequest);
	  }
	
	@Processor
	  public StatusResponse deleteActionsById(String membershipId) {
	    return getClient().deleteActionsById(membershipId);
	  }
	//Boards GET Methods
	@Processor
	public BoardsByIdGetResponse getBoardsById(String boardId,@Optional String actions,
			@Optional Boolean actions_entities,	@Optional Boolean actions_display, @Optional String actions_format,
			@Optional String actions_since,@Optional Integer actions_limit,@Optional String action_fields,@Optional Boolean action_member,@Optional String action_member_fields,@Optional Boolean action_memberCreator,@Optional String action_memberCreator_fields,@Optional String cards,@Optional String card_fields,@Optional String card_attachments,@Optional String card_attachment_fields,@Optional String card_checklists,@Optional Boolean card_stickers,@Optional String boardStars,@Optional String labels,@Optional String label_fields,@Optional Integer labels_limit,
			@Optional String lists,@Optional String list_fields,@Optional String memberships,@Optional Boolean memberships_member,@Optional String memberships_member_fields,@Optional String members,@Optional String member_fields,@Optional String membersInvited,@Optional String membersInvited_fields,@Optional String checklists,@Optional String checklist_fields,@Optional Boolean organization,@Optional String organization_fields,@Optional String organization_memberships,@Optional Boolean myPrefs,@Optional Boolean tags ,@Optional String fields) {
		return getClient().getBoardsById(boardId,actions, actions_entities, actions_display, actions_format,actions_since, actions_limit, action_fields,
				action_member,action_member_fields,action_memberCreator,action_memberCreator_fields,cards,card_fields,card_attachments,card_attachment_fields,card_checklists,
				card_stickers,boardStars,labels,label_fields,labels_limit,lists,list_fields,memberships,memberships_member,memberships_member_fields,members,member_fields,membersInvited,membersInvited_fields,checklists,checklist_fields,organization,organization_fields,organization_memberships,myPrefs,tags,fields);
	}
	@Processor
	public String getBoardsByIdAndField(String boardId,String field){
		return getClient().getBoardsByIdAndField(boardId,field);
	}
	@Processor
	public BoardsByIdAndActionsGetResponse getBoardsByIdAndActions(String boardId,@Optional String entities,@Optional Boolean display,@Optional String filter,@Optional String fields,@Optional Integer limit,@Optional String format,@Optional String since,@Optional String before,@Optional Integer page,@Optional String idModels,
			@Optional Boolean member,@Optional String member_fields,@Optional Boolean memberCreator,@Optional String memberCreator_fields){
		
		return getClient().getBoardsByIdAndActions(boardId,entities,display,filter,fields,limit,format,since,
				before,page,idModels,member,member_fields,memberCreator,memberCreator_fields);
	}
	@Processor
	public String getBoardsByIdAndBoardStars(String boardId,@Optional String filter){
		return getClient().getBoardsByIdAndBoardStars(boardId,filter);
	}
	@Processor
	public BoardsByIdAndCardsGetResponse getBoardsByIdAndCards(String boardId,@Optional String actions,@Optional String attachments,@Optional String attachment_fields,@Optional Boolean stickers,@Optional Boolean members,@Optional String member_fields,@Optional String checklists,@Optional String since,@Optional String before,@Optional String filter,@Optional String fields){
		return getClient().getBoardsByIdAndCards(boardId,actions,attachments,attachment_fields,stickers,members,member_fields,checklists,since,before,filter,fields);
	}
	@Processor
	public String getBoardsByIdAndCardsWithFilter(String boardId,String filter){
		return getClient().getBoardsByIdAndCardsWithFilter(boardId,filter);
	}
	@Processor
	public String getBoardsByIdAndCardsWithIdCards(String boardId,String idCard,@Optional String attachments,@Optional String attachment_fields,@Optional String actions,@Optional Boolean actions_entities,@Optional Boolean actions_display,@Optional Integer actions_limit,@Optional String action_fields,@Optional String action_memberCreator_fields,@Optional Boolean members,@Optional String member_fields,@Optional Boolean checkItemStates,@Optional String checkItemState_fields,@Optional Boolean labels,@Optional String checklists,@Optional String checklist_fields,@Optional String fields){
		return getClient().getBoardsByIdAndCardsWithIdCards(boardId,idCard,attachments,attachment_fields,actions,actions_entities,actions_display,actions_limit,action_fields,action_memberCreator_fields,members,member_fields,checkItemStates,checkItemState_fields,labels,checklists,checklist_fields,fields);
	}
	@Processor
	public BoardsByIdAndCheckListsGetResponse getBoardsByIdAndCheckLists(String boardId,String cards,@Optional String card_fields,@Optional String check_Items,@Optional String checkItem_fields,@Optional String filter,@Optional String fields){
		return getClient().getBoardsByIdAndCheckLists(boardId,cards,card_fields,check_Items,checkItem_fields,filter,fields);
	}
	@Processor
	public String getBoardsByIdAndDeltas(String boardId,String tags,String ixLastUpdate){
		return getClient().getBoardsByIdAndDeltas(boardId,tags,ixLastUpdate);
	}
	@Processor
	public String getBoardsByIdAndLabels(String boardId,@Optional String fields,@Optional String limit){
		return getClient().getBoardsByIdAndLimit(boardId,fields,limit);
	}
	@Processor
	public String getBoardsByIdAndLabelsWithId(String boardId,String labelId,@Optional String fields){
		return getClient().getBoardsByIdAndLabelsWithId(boardId,labelId,fields);
	}
	@Processor
	public BoardsByIdAndListsGetResponse getBoardsByIdAndLists(String boardId,@Optional String cards,@Optional String card_fields,@Optional String filter,@Optional String fields){
		return getClient().getBoardsByIdAndLists(boardId,cards,card_fields,filter,fields);
	}
	@Processor
	public String getBoardsByIdAndListsWithFilter(String boardId,String filter){
		return getClient().getBoardsByIdAndListsWithFilter(boardId,filter);
	}
	@Processor
	public String getBoardMembersByBoardId(String boardId,@Optional String filter,@Optional String fields,@Optional Boolean activity){
		return getClient().getBoardMembersByBoardId(boardId,filter,fields,activity);
	}
	@Processor
	public String getBoardMembersByBoardIdWithFilter(String boardId,String filter){
		return getClient().getBoardMembersByBoardIdWithFilter(boardId,filter);
	}
	@Processor
	public String getBoardsByIdAndMembersByIdWithCards(String boardId,String memberId,@Optional String actions,@Optional String attachments,@Optional String attachment_fields,@Optional Boolean member,@Optional String member_fields,@Optional Boolean checkItemStates,@Optional String checkLists,@Optional Boolean boards,
			@Optional String board_fields,@Optional Boolean list,@Optional String list_fields,@Optional
			 String filter,@Optional String fields){
		return getClient().getBoardsByIdAndMembersByIdWithCards(boardId,memberId,actions, attachments, attachment_fields, member,member_fields,checkItemStates,checkLists,boards,
				 board_fields, list, list_fields, filter, fields);
	}
	@Processor
	public String getBoardMembersInvited(String boardId,@Optional String fields){
		return getClient().getBoardMembersInvited(boardId,fields);
	}
	@Processor
	public String getBoardMembersInvitedWithField(String boardId,String field){
		return getClient().getBoardMembersInvitedWithField(boardId,field);
	}
	@Processor
	public String getBoardMemberShips(String boardId,@Optional String filter,@Optional Boolean member,@Optional String member_fields){
		return getClient().getBoardMemberShips(boardId,filter,member,member_fields);
	}
	@Processor
	public String getBoardMemberShipsById(String boardId,String membershipId,
			@Optional Boolean member,@Optional String member_fields){
		return getClient().getBoardMemberShipsById(boardId,membershipId,member,member_fields);
	}
	@Processor
	public String getBoardsWithMyPref(String boardId){
		return getClient().getBoardsWithMyPref(boardId);
	}
	@Processor
	public String getBoardsByIdAndOrganization(String boardId,@Optional String fields){
		return getClient().getBoardsByIdAndOrganization(boardId,fields);
	}
	@Processor
	public String getBoardsByIdAndOrganizationWithField(String boardId, String fields){
		return getClient().getBoardsByIdAndOrganizationWithField(boardId,fields);
	}
	// Board PUT Methods
	@Processor
	  public String putBoardsById(String boardId,BoardsByIdPutRequest boardsByIdPutReq) {
	    return getClient().putBoardsById(boardId,boardsByIdPutReq);
	  }
	@Processor
	  public String putBoardsClosedById(String boardId,BoardsClosedByIdPutRequest boardsClosedByIdPutReq) {
	    return getClient().putBoardsClosedById(boardId,boardsClosedByIdPutReq);
	  }
	@Processor
	  public String updateBoardsDescriptionById(String boardId,BoardsDescriptionByIdPutRequest boardsClosedByIdPutReq) {
	    return getClient().updateBoardsDescriptionById(boardId,boardsClosedByIdPutReq);
	  }
	@Processor
	  public String updateBoardsOrganizationById(String boardId,BoardsOrganizationByIdPutRequest boardsOrganizationByIdPutReq) {
	    return getClient().updateBoardsOrganizationById(boardId,boardsOrganizationByIdPutReq);
	  }
	@Processor
	  public String updateBoardsLabelNameByBlue(String boardId,BoardsLabelNameByColorPutRequest boardsLabelNameByColorPutReq) {
	    return getClient().updateBoardsLabelNameByBlue(boardId,boardsLabelNameByColorPutReq);
	  }
	@Processor
	  public String updateBoardsLabelNameByGreen(String boardId,BoardsLabelNameByColorPutRequest boardsLabelNameByColorPutReq) {
	    return getClient().updateBoardsLabelNameByGreen(boardId,boardsLabelNameByColorPutReq);
	  }
	@Processor
	  public String updateBoardsLabelNameByOrange(String boardId,BoardsLabelNameByColorPutRequest boardsLabelNameByColorPutReq) {
	    return getClient().updateBoardsLabelNameByOrange(boardId,boardsLabelNameByColorPutReq);
	  }
	@Processor
	  public String updateBoardsLabelNameByPurple(String boardId,BoardsLabelNameByColorPutRequest boardsLabelNameByColorPutReq) {
	    return getClient().updateBoardsLabelNameByPurple(boardId,boardsLabelNameByColorPutReq);
	  }
	@Processor
	  public String updateBoardsLabelNameByRed(String boardId,BoardsLabelNameByColorPutRequest boardsLabelNameByColorPutReq) {
	    return getClient().updateBoardsLabelNameByRed(boardId,boardsLabelNameByColorPutReq);
	  }
	@Processor
	  public String updateBoardsLabelNameByYellow(String boardId,BoardsLabelNameByColorPutRequest boardsLabelNameByColorPutReq) {
	    return getClient().updateBoardsLabelNameByYellow(boardId,boardsLabelNameByColorPutReq);
	  }
	@Processor
	  public String updateBoardMembersById(String boardId,BoardsMembersPutRequest boardMembersPutReq) {
	    return getClient().updateBoardMembersById(boardId,boardMembersPutReq);
	  }
	@Processor
	  public String updateBoardMemberByMemberId(String boardId,String idMember,BoardsMembersByMemberIdPutRequest boardMembersByMemberIdPutReq) {
	    return getClient().updateBoardMemberByMemberId(boardId,idMember,boardMembersByMemberIdPutReq);
	  }
	@Processor
	  public String updateBoardsMembershipByMembershipId(String boardId,String idMembership,BoardsMembershipsPutRequest boardMembershipsPutReq) {
	    return getClient().updateBoardsMembershipByMembershipId(boardId,idMembership,boardMembershipsPutReq);
	  }
	@Processor
	  public String updateBoardsEmailPosPref(String boardId,BoardsEmailPosPrefPutRequest boardEmailPosPrefPutReq) {
	    return getClient().updateBoardsEmailPosPref(boardId,boardEmailPosPrefPutReq);
	  }
	@Processor
	  public String updateBoardsEmailListIdPref(String boardId,BoardsEmailListPrefPutRequest boardEmailListIdPrefPutReq) {
	    return getClient().updateBoardsEmailListIdPref(boardId,boardEmailListIdPrefPutReq);
	  }	
	@Processor
	  public String showBoardsListGuide(String boardId,BoardsListGuidePutRequest boardsListGuidePrefPutReq) {
	    return getClient().showBoardsListGuide(boardId,boardsListGuidePrefPutReq);
	  }	
	@Processor
	  public String showBoardsSidebar(String boardId,BoardsListGuidePutRequest boardsListGuidePrefPutReq) {
	    return getClient().showBoardsSidebar(boardId,boardsListGuidePrefPutReq);
	  }	
	@Processor
	  public String showBoardsSidebarActivity(String boardId,BoardsListGuidePutRequest boardsListGuidePrefPutReq) {
	    return getClient().showBoardsSidebarActivity(boardId,boardsListGuidePrefPutReq);
	  }	
	@Processor
	  public String showBoardsSidebarBoardActivity(String boardId,BoardsListGuidePutRequest boardsListGuidePrefPutReq) {
	    return getClient().showBoardsListGuide(boardId,boardsListGuidePrefPutReq);
	  }	
	@Processor
	  public String showBoardsSidebarMembers(String boardId,BoardsListGuidePutRequest boardsListGuidePrefPutReq) {
	    return getClient().showBoardsSidebarMembers(boardId,boardsListGuidePrefPutReq);
	  }	
	@Processor
	  public String updateBoardNameById(String boardId,BoardsNamePutRequest boardsNamePutReq) {
	    return getClient().updateBoardNameById(boardId,boardsNamePutReq);
	  }	
	@Processor
	  public String updateBoardsBackgroundById(String boardId,BoardsBackgroundPrefPutRequest boardsBackgroundPrefPutReq) {
	    return getClient().updateBoardsBackgroundById(boardId,boardsBackgroundPrefPutReq);
	  }	
	@Processor
	  public String boardsCalenderFeedEnabled(String boardId,BoardsCalenderFeedEnabledPutRequest boardsCalenderFeedsEnabledPutReq) {
	    return getClient().boardsCalenderFeedEnabled(boardId,boardsCalenderFeedsEnabledPutReq);
	  }	
	@Processor
	  public String updateBoardsCardAging(String boardId,BoardsCardsPutRequest boardsCardsPutReq) {
	    return getClient().updateBoardsCardAging(boardId,boardsCardsPutReq);
	  }	
	@Processor
	  public String updateBoardsCardCovers(String boardId,BoardsCardCoversPutRequest boardsCardCoversPutReq) {
	    return getClient().updateBoardsCardCover(boardId,boardsCardCoversPutReq);
	  }	
	@Processor
	  public String updateBoardsComments(String boardId,BoardsCommentsPutRequest boardsCommentsPutReq) {
	    return getClient().updateBoardsComments(boardId,boardsCommentsPutReq);
	  }	
	@Processor
	  public String updateBoardsInvitations(String boardId,BoardsInvitationPutRequest boardsInvitationsPutReq) {
	    return getClient().updateBoardsInvitations(boardId,boardsInvitationsPutReq);
	  }	
	@Processor
	  public String updateBoardsPermissionLevel(String boardId,BoardsPermissionLevelPutRequest boardsInvitationsPutReq) {
	    return getClient().updateBoardsPermissionLevel(boardId,boardsInvitationsPutReq);
	  }	
	@Processor
	  public String updateSelfJoinBoards(String boardId,BoardsCardCoversPutRequest boardsSelfJoinPutReq) {
	    return getClient().updateSelfJoinBoards(boardId,boardsSelfJoinPutReq);
	  }	
	@Processor
	  public String boardsVoting(String boardId,BoardsVotingPutRequest boardsVotingPutReq) {
	    return getClient().boardsVoting(boardId,boardsVotingPutReq);
	  }	
	@Processor
	  public String updateSubscribedBoardsById(String boardId,BoardsSubscriberPutRequest boardsSubscriberPutReq) {
	    return getClient().updateSubscribedBoardsById(boardId,boardsSubscriberPutReq);
	  }	
//Boards POST Methods
	@Processor
	  public BoardsPostResponse postBoards(BoardsPostRequest boardssPostRequest) {
		
	    return getClient().postBoards(boardssPostRequest);
	  }
	@Processor
	  public String postBoardsCalenderkeyGenerate(String boardId,BoardsCalendekeyGeneratePostRequest boardsCalenderkeyGenPostRequest) {
	    return getClient().postBoardsCalenderkeyGenerate(boardId,boardsCalenderkeyGenPostRequest);
	  }
	@Processor
	  public String postBoardsChecklists(String boardId,BoardsChecklistPostRequest boardsChecklistPostRequest) {
	    return getClient().postBoardsChecklists(boardId,boardsChecklistPostRequest);
	  }
	@Processor
	  public String postBoardsEmailkeyGeneration(String boardId,BoardsCalendekeyGeneratePostRequest boardsEmailkeyGenPostRequest) {
	    return getClient().postBoardsEmailkeyGeneration(boardId,boardsEmailkeyGenPostRequest);
	  }
	@Processor
	  public String postBoardsByIdAndLabel(String boardId,BoardsByIdLabelPostRequest boardsIdLabelPostRequest) {
	    return getClient().postBoardsByIdAndLabel(boardId,boardsIdLabelPostRequest);
	  }
	@Processor
	  public String postBoardsByAndList(String boardId,BoardsByIdListPostRequest boardsIdListPostRequest) {
	    return getClient().postBoardsByAndList(boardId,boardsIdListPostRequest);
	  }
	@Processor
	  public String postBoardsMarkAsViewd(String boardId,BoardsCalendekeyGeneratePostRequest boardsMarkAsVieedPostReq ) {
	    return getClient().postBoardsMarkAsViewd(boardId,boardsMarkAsVieedPostReq);
	  }
	@Processor
	  public String postBoardsPowerUps(String boardId,String value,BoardsPoweUpsPostRequest boardsByIdAndPoerUps) {
	    return getClient().postBoardsPowerUps(boardId,value,boardsByIdAndPoerUps);
	  }
	@Processor
	  public String deleteMemberUnderBoardById(String boardId,String memberId) {
	    return getClient().deleteMemberUnderBoardById(boardId,memberId);
	  }
	@Processor
	  public StatusResponse deletePowerUpsUnderBoardById(String boardId,String powerUp) {
	    return getClient().deletePowerUpsUnderBoardById(boardId,powerUp);
	  }
	//Cards GET Methods
	@Processor
	public CardsByIdGetResponse getCardsById(String cardIdOrShortlink,@Optional String actions,@Optional Boolean actions_entities,@Optional Boolean actions_display,@Optional Integer actions_limit,@Optional String action_fields,@Optional String action_memberCreator_fields,@Optional String attachments,@Optional String attachment_fields,@Optional Boolean members,@Optional String member_fields,@Optional Boolean membersVoted,@Optional String memberVoted_fields,
			@Optional Boolean checkItemStates,@Optional String checkItemState_fields,@Optional String checklists,@Optional String checklist_fields,@Optional Boolean board,@Optional String board_fields,@Optional Boolean list,@Optional String list_fields,@Optional Boolean stickers,@Optional String sticker_fields,@Optional String fields){
		return getClient().getCardsById(cardIdOrShortlink,actions,  actions_entities,  actions_display,actions_limit,action_fields,action_memberCreator_fields,attachments,attachment_fields,  members,member_fields,  membersVoted,memberVoted_fields,
				  checkItemStates,checkItemState_fields,checklists,checklist_fields,  board,board_fields,  list,list_fields,  stickers,sticker_fields,fields);
	}
	@Processor
	public String getCardsByIdWithField(String cardIdOrShortlink,String field){
		return getClient().getCardsByIdWithField(cardIdOrShortlink,field);
	}
	@Processor
	public String getCardActionsById(String cardIdOrShortlink,@Optional Boolean entities,@Optional Boolean display,@Optional String filter,@Optional String fields,
			@Optional Integer limit,@Optional String format,@Optional String since,@Optional String before,@Optional String idModels,@Optional Boolean member,@Optional String member_fields,@Optional Boolean memberCreator,@Optional String memberCreator_fields){
		return getClient().getCardActionsById(cardIdOrShortlink, entities, display, filter,fields,limit,format,since,before,idModels,member,member_fields,memberCreator,memberCreator_fields);
	}
	@Processor
	public String getCardsAttachments(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsAttachments(cardIdOrShortlink,fields);
	}
	@Processor
	public String getCardsAttachmentsById(String cardIdOrShortlink,String idAttachment,@Optional String fields){
		return getClient().getCardsAttachmentsById(cardIdOrShortlink,idAttachment,fields);
	}
	@Processor
	public String getBoardsUnderCarsById(String cardIdOrShortlink,@Optional String fields){
		return getClient().getBoardsUnderCarsById(cardIdOrShortlink,fields);
	}
	@Processor
	public String getBoardsUnderCarsByIdWithField(String cardIdOrShortlink,String fields){
		return getClient().getBoardsUnderCarsByIdWithField(cardIdOrShortlink,fields);
	}
	@Processor
	public String getCardsByIdWithCheckItemStates(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsByIdWithCheckItemStates(cardIdOrShortlink,fields);
	}
	@Processor
	public String getCardsByIdWithCheckLists(String cardIdOrShortlink,@Optional String cards,@Optional String card_fields,@Optional String checkItems,@Optional String checkItem_fields,@Optional String filter,@Optional String fields){
		return getClient().getCardsByIdWithCheckLists(cardIdOrShortlink,cards,card_fields,checkItems,checkItem_fields,filter,fields);
	}
	@Processor
	public String getCardsByIdWithList(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsByIdWithList(cardIdOrShortlink,fields);
	}
	@Processor
	public String getCardsByIdWithListField(String cardIdOrShortlink,@Optional String field){
		return getClient().getCardsByIdWithListField(cardIdOrShortlink,field);
	}
	@Processor
	public String getCardsMembersById(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsMembersById(cardIdOrShortlink,fields);
	}
	@Processor
	public String getCardsMembersVotedById(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsMembersVotedById(cardIdOrShortlink,fields);
	}
	@Processor
	public String getCardsStickers(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsStickers(cardIdOrShortlink,fields);
	}
	@Processor
	public String getCardsStickersById(String cardIdOrShortlink,String idSticker,@Optional String fields){
		return getClient().getCardsStickersById(cardIdOrShortlink,idSticker,fields);
	}
	//PUT Methots for Cards
	@Processor
	  public String putCardsById(String cardIdOrShortlink,CardsByIdPutRequest membershipsIdPutRequest) {
	    return getClient().putCardsById(cardIdOrShortlink,membershipsIdPutRequest);
	  }
	@Processor
	  public String putCommentsOnActionsById(String cardIdOrShortlink,String idAction,CardsCommentsByIdPutRequest membershipsIdPutRequest) {
	    return getClient().putCommentsOnActionsById(cardIdOrShortlink,idAction,membershipsIdPutRequest);
	  }
	@Processor
	  public String updatecheckItemNameOnCards(String cardIdOrShortlink,String idChecklist,String  idCheckItem, CardsCheckListNamePutRequest udatecheckItemNamePostRequest) {
	    return getClient().updatecheckItemNameOnCards(cardIdOrShortlink,idChecklist,idCheckItem,udatecheckItemNamePostRequest);
	  }
	@Processor
	  public String updatecheckItePositionOnCards(String cardIdOrShortlink,String idChecklist,String  idCheckItem, CardsCheckListPositionPutRequest udatecheckItemPosPostRequest) {
	    return getClient().updatecheckItePositionOnCards(cardIdOrShortlink,idChecklist,idCheckItem,udatecheckItemPosPostRequest);
	  }
	@Processor
	  public String updatecheckIteStateOnCards(String cardIdOrShortlink,String idChecklist,String  idCheckItem, CardsCheckListStatePutRequest udatecheckItemPosPostRequest) {
	    return getClient().updatecheckIteStateOnCards(cardIdOrShortlink,idChecklist,idCheckItem,udatecheckItemPosPostRequest);
	  }
	@Processor
	  public String updateCurrentcheckListOnCards(String cardIdOrShortlink,String idChecklistCurrent ,String  idCheckItem, CardsCurrentCheckListPutRequest updateCurrentcheckListyIdPosPostRequest) {
	    return getClient().updateCurrentcheckListOnCards(cardIdOrShortlink,idChecklistCurrent,idCheckItem,updateCurrentcheckListyIdPosPostRequest);
	  }
	@Processor
	  public String updateClosedCardsById(String cardIdOrShortlink,CardsClosedPutRequest updateClosedCardsById) {
	    return getClient().updateClosedCardsById(cardIdOrShortlink,updateClosedCardsById);
	  }
	@Processor
	  public String updateCardsDescById(String cardIdOrShortlink,CardsDescriptionPutRequest updateCardsDescById) {
	    return getClient().updateCardsDescById(cardIdOrShortlink,updateCardsDescById);
	  }
	@Processor
	  public String updateCardsDueById(String cardIdOrShortlink,CardsDuePutRequest updateCardsDueById) {
	    return getClient().updateCardsDueById(cardIdOrShortlink,updateCardsDueById);
	  }
	@Processor
	  public String updateCardsIdAttachmentById(String cardIdOrShortlink,CardsCardsIdAttachmentPutRequest updateCardsidAttachmentById) {
	    return getClient().updateCardsIdAttachmentById(cardIdOrShortlink,updateCardsidAttachmentById);
	  }
	@Processor
	  public String updateCardsBoardIdById(String cardIdOrShortlink,CardsCardsBoardIdPutRequest updateCardsBoardIdPutReq) {
	    return getClient().updateCardsBoardIdById(cardIdOrShortlink,updateCardsBoardIdPutReq);
	  }
	@Processor
	  public String updateCardsListIdById(String cardIdOrShortlink,CardsCardsListPutRequest updateCardsListIdPutReq) {
	    return getClient().updateCardsListIdById(cardIdOrShortlink,updateCardsListIdPutReq);
	  }
	@Processor
	  public String updateCardMemberById(String cardIdOrShortlink,CardsMemberPutRequest updateCardMemberPutReq) {
	    return getClient().updateCardMemberById(cardIdOrShortlink,updateCardMemberPutReq);
	  }
	@Processor
	  public String updateCardNameById(String cardIdOrShortlink,CardsNamePutRequest updateCardsNamePutReq) {
	    return getClient().updateCardNameById(cardIdOrShortlink,updateCardsNamePutReq);
	  }
	@Processor
	  public String updateCardPosById(String cardIdOrShortlink,CardsNamePosRequest updateCardsNamePutReq) {
	    return getClient().updateCardPosById(cardIdOrShortlink,updateCardsNamePutReq);
	  }
	@Processor
	  public String updateCardStickersById(String cardIdOrShortlink,String idSticker,CardsStickerPutRequest updateCardsStickerPutReq) {
	    return getClient().updateCardStickersById(cardIdOrShortlink,idSticker,updateCardsStickerPutReq);
	  }
	@Processor
	  public String readSubsribedCards(String cardIdOrShortlink,CardsSubscribedPutRequest readSubscribedCarsdsPutReq) {
	    return getClient().readSubsribedCards(cardIdOrShortlink,readSubscribedCarsdsPutReq);
	  }
	@Processor
	  public String postCards(CardsPostRequest cardsPosrReq) {
	    return getClient().postCards(cardsPosrReq);
	  }
	@Processor
	  public String postCardsAcionComments(String cardIdOrShortlink,CardsAcionCommentsByIdPostRequest cardsActionCommentsPostReq) {
	    return getClient().postCardsAcionComments(cardIdOrShortlink,cardsActionCommentsPostReq);
	  }
	@Processor
	  public String postCardsAttachmentsById(String cardIdOrShortlink,CardsAttachmentsByIdPostRequest postCardsAttachmentsById) {
	    return getClient().postCardsAttachmentsById(cardIdOrShortlink,postCardsAttachmentsById);
	  }
	@Processor
	  public String postCardsCheckListsById(String cardIdOrShortlink,String idCheckList,CardsCheckListsByIdPostRequest postCardChecklistsByIdPostReq) {
	    return getClient().postCardsCheckListsById(cardIdOrShortlink,idCheckList,postCardChecklistsByIdPostReq);
	  }
	@Processor
	  public String convertChecklistToCardsById(String cardIdOrShortlink,String idChecklist,String idCheckItem ,CheckListsToCardByIdPostRequest postCardChecklistsToCardByIdPostReq) {
	    return getClient().convertChecklistToCardsById(cardIdOrShortlink,idChecklist,idCheckItem,postCardChecklistsToCardByIdPostReq);
	  }
	@Processor
	  public String postCardsChecklistById(String cardIdOrShortlink,CheckListsUpdatePostRequest checkListUpdatePostReq) {
	    return getClient().postCardsChecklistById(cardIdOrShortlink,checkListUpdatePostReq);
	  }
	@Processor
	  public String postCardsIdLabelById(String cardIdOrShortlink,CardsIdLabelByIdPostRequest postCardsIdListPostReq) {
	    return getClient().postCardsIdLabelById(cardIdOrShortlink,postCardsIdListPostReq);
	  }
	@Processor
	  public String postCardsIdMembersById(String cardIdOrShortlink,CardsIdMembersPostRequest postCardsIdMemberPostReq) {
	    return getClient().postCardsIdMembersById(cardIdOrShortlink,postCardsIdMemberPostReq);
	  }
	@Processor
	  public String postCardsLabelsById(String cardIdOrShortlink,CardsLabelsPostRequest postCardsIdMemberPostReq) {
	    return getClient().postCardsLabelsById(cardIdOrShortlink,postCardsIdMemberPostReq);
	  }
	@Processor
	  public String postCardsMembersVotedById(String cardIdOrShortlink,CardsMembersVotedPostRequest postCardsMembedrsVotedPostReq) {
	    return getClient().postCardsMembersVotedById(cardIdOrShortlink,postCardsMembedrsVotedPostReq);
	  }
	@Processor
	  public String postCardStickersById(String cardIdOrShortlink,CardsStickersPostRequest postCardsStickersPostReq) {
	    return getClient().postCardStickersById(cardIdOrShortlink,postCardsStickersPostReq);
	  }
	@Processor
	  public String postMarkAssociatedNotificationId(String cardIdOrShortlink) {
	    return getClient().getMarkAssociatedNotificationId(cardIdOrShortlink);
	  }
	
	
	//Cards DELETE methods
	
	@Processor
	  public StatusResponse deleteCardsById(String cardIdOrShortLink) {
	    return getClient().deleteCardsById(cardIdOrShortLink);
	  }
	@Processor
	  public StatusResponse deleteCardsActionCommentsById(String cardIdOrShortLink,String idAction) {
	    return getClient().deleteCardsActionCommentsById(cardIdOrShortLink,idAction);
	  }
	@Processor
	  public StatusResponse deleteCardsIdAttachmentById(String cardIdOrShortLink,String idAttachment) {
	    return getClient().deleteCardsIdAttachmentById(cardIdOrShortLink,idAttachment);
	  }
	@Processor
	  public StatusResponse deleteCardsCheckItemsById(String cardIdOrShortLink,String idChecklist,String idCheckItem) {
	    return getClient().deleteCardsCheckItemsById(cardIdOrShortLink,idChecklist,idCheckItem);
	  }
	@Processor
	  public StatusResponse deleteCardsCheckListsById(String cardIdOrShortLink,String idChecklist) {
	    return getClient().deleteCardsChecklistsById(cardIdOrShortLink,idChecklist);
	  }
	@Processor
	  public StatusResponse deleteCardsIdLabelById(String cardIdOrShortLink,String idLabel) {
	    return getClient().deleteCardsIdLabelById(cardIdOrShortLink,idLabel);
	  }
	@Processor
	  public StatusResponse deleteCardsByIdMember(String cardIdOrShortLink,String idMember) {
	    return getClient().deleteCardsByIdMember(cardIdOrShortLink,idMember);
	  }
	@Processor
	  public StatusResponse deleteCardsByIdMembersVoted(String cardIdOrShortLink,String idMember) {
	    return getClient().deleteCardsByIdMembersVoted(cardIdOrShortLink,idMember);
	  }
	@Processor
	  public StatusResponse deleteCardsStickersById(String cardIdOrShortLink,String idMember) {
	    return getClient().deleteCardsByIdMembersVoted(cardIdOrShortLink,idMember);
	  }
	//Checklist Get methods
	@Processor
	  public CheckListsGetResponse getChecklistsById(String checklistId,@Optional String cards,@Optional String card_fields, @Optional String checkItems,@Optional String checkItem_fields,@Optional String fields) {
	    return getClient().getChecklistsById(checklistId,cards,card_fields,checkItems,checkItem_fields,fields);
	  }
	@Processor
	  public String getChecklistsFieldById(String checklistId,String field) {
	    return getClient().getChecklistsFieldById(checklistId,field);
	  }
	@Processor
	  public String getChecklistsBoardsById(String checklistId,@Optional String fields) {
	    return getClient().getChecklistsBoardsById(checklistId,fields);
	  }
	@Processor
	  public String getChecklistsBoardFieldById(String checklistId,String field) {
	    return getClient().getChecklistsBoardFieldById(checklistId,field);
	  }
	@Processor
	  public String getChecklistsCardsById(String checklistId,@Optional String actions,@Optional String attachments,@Optional String attachment_fields,@Optional Boolean stickers,@Optional Boolean members,@Optional String member_fields,@Optional Boolean checkItemStates,@Optional String checklists,@Optional Integer limit,@Optional String since,@Optional String before,@Optional String filter,@Optional  String fields) {
	    return getClient().getChecklistsCardsById(checklistId,actions,attachments,attachment_fields,stickers,members,member_fields,checkItemStates,checklists,limit,since,before,filter,fields);
	  }
	@Processor
	  public String getChecklistsCardsFieldById(String checklistId,String filter) {
	    return getClient().getChecklistsCardsFieldById(checklistId,filter);
	  }
	@Processor
	  public CheckItems getCheckItemsById(String checklistId,@Optional String filter,@Optional String fields) {
	    return getClient().getCheckItemsById(checklistId,filter,fields);
	  }
	@Processor
	  public CheckItems getCheckItemsByCheckedIdById(String checklistId,String idCheckItems,@Optional String fields) {
	    return getClient().getCheckItemsByCheckedIdById(checklistId,idCheckItems,fields);
	  }
	@Processor
	  public CheckItems getChecklistsByCheckedIdById(String checklistId,String idCheckItems,@Optional String fields) {
	    return getClient().getCheckItemsByCheckedIdById(checklistId,idCheckItems,fields);
	  }
	//checklists PUT methods
	@Processor
	  public String putChecklistsById(String idChecklist,ChecklistsByIdPutRequest checklistsPutReq) {
	    return getClient().putChecklistsById(idChecklist,checklistsPutReq);
	  }
	@Processor
	  public String putChecklistsNameById(String idChecklist,ChecklistsNameByIdPutRequest checklistsNamePutReq) {
	    return getClient().putChecklistsNameById(idChecklist,checklistsNamePutReq);
	  }
	@Processor
	  public String putChecklistsPosById(String idChecklist,ChecklistsPosByIdPutRequest checklistsPosPutReq) {
	    return getClient().putChecklistsPosById(idChecklist,checklistsPosPutReq);
	  }
	//Post checklists methods
	@Processor
	  public String postChecklists(ChecklistsPostRequest checklistsPostReq) {
	    return getClient().postChecklistsById(checklistsPostReq);
	  }
	@Processor
	  public String postCheckItemsById(String idChecklist,CheckItemsPostRequest checkItemsPostReq) {
	    return getClient().postCheckItemsById(idChecklist,checkItemsPostReq);
	  }
	//DELETE checklist methods
	@Processor
	  public StatusResponse deleteChecklistsById(String idChecklist) {
	    return getClient().deleteChecklistsById(idChecklist);
	  }
	@Processor
	  public StatusResponse deleteChecklistsCheckItemsById(String idChecklist,String idCheckItem) {
	    return getClient().deleteChecklistsCheckItemsById(idChecklist,idCheckItem);
	  }
	//GET Methods for label
	@Processor
	  public String getLabelsById(String idLabel,@Optional String fields) {
	    return getClient().getLabelsById(idLabel,fields);
	  }
	@Processor
	  public String getLabelsBoardsById(String idLabel,@Optional String fields) {
	    return getClient().getLabelsBoardsById(idLabel,fields);
	  }
	@Processor
	  public String getLabelsBoardsFieldById(String idLabel,@Optional String field) {
	    return getClient().getLabelsBoardsFieldById(idLabel,field);
	  }
	//label PUT methods
	@Processor
	  public String updateLabelById(String idLabel,LabelByIdPutRequest labelByIdPutReq) {
	    return getClient().updateLabelById(idLabel,labelByIdPutReq);
	  }
	@Processor
	  public String updateLabelColorById(String idLabel,LabelColorByIdPutRequest labelcolorByIdPutReq) {
	    return getClient().updateLabelColorById(idLabel,labelcolorByIdPutReq);
	  }
	@Processor
	  public String updateLabelNameById(String idLabel,LabelNameByIdPutRequest labelNameByIdPutReq) {
	    return getClient().updateLabelNameById(idLabel,labelNameByIdPutReq);
	  }
	//POST methods for labels
	@Processor
	  public String postLabels(LabelsPostRequest labelsPostReq) {
	    return getClient().postLabels(labelsPostReq);
	  }
	//DELETE Label Methods
	
	@Processor
	  public StatusResponse deleteLabelById(String labelId) {
	    return getClient().deleteLabelById(labelId);
	  }
	//List GET Method Requests
	
	@Processor
	public ListsByIdGetResponse getListById(String listId,@Optional String cards,@Optional String card_fields,@Optional String board ,@Optional String board_fields,@Optional String fields){
		return getClient().getListById(listId,cards,card_fields,board,board_fields,fields);
	}
	@Processor
	public ListsFieldByIdGetResponse getListFieldById(String listId,String field){
		return getClient().getListFieldById(listId,field);
	}
	@Processor
	public ListsActionsByIdGetResponse getListActionById(String listId,@Optional Boolean entities,@Optional Boolean display,@Optional String filter,@Optional String fields,@Optional Integer limit,@Optional String format,@Optional String since,@Optional String before,@Optional Integer page,@Optional String idModels,@Optional Boolean member,@Optional String member_fields,@Optional Boolean memberCreator,@Optional String memberCreator_fields){
		return getClient().getListActionById(listId,entities,display,filter,fields,limit,format,since,before,page,idModels,member,member_fields,memberCreator,memberCreator_fields);
	}
	@Processor
	public String getListBoardsById(String listId,@Optional String fields){
		return getClient().getListBoardsById(listId,fields);
	}
	@Processor
	public String getListBoardsFieldById(String listId, String field){
		return getClient().getListBoardsFieldById(listId,field);
	}
	@Processor
	  public ListCardsGetResponse  getListsCardsById(String listId,@Optional String actions,@Optional String attachments,@Optional String attachment_fields,@Optional Boolean stickers,@Optional Boolean members,@Optional String member_fields,@Optional Boolean checkItemStates,@Optional String checklists,@Optional Integer limit,@Optional String since,@Optional String before,@Optional String filter,@Optional  String fields) {
	    return getClient().getListsCardsById(listId,actions,attachments,attachment_fields,stickers,members,member_fields,checkItemStates,checklists,limit,since,before,filter,fields);
	  }
	@Processor
	public String getListCardsFilterById(String listId, String filter){
		return getClient().getListCardsFilterById(listId,filter);
	}
	//PUT methods for Lists
	@Processor
	  public String updateListsById(String listId,ListsByIdPutRequest listsPutReq) {
	    return getClient().updateListsById(listId,listsPutReq);
	  }
	@Processor
	  public String updateListsCloseddById(String listId,ListsClosedByIdPutRequest listsClosedPutReq) {
	    return getClient().updateListsCloseddById(listId,listsClosedPutReq);
	  }
	@Processor
	  public String updateListsBoardsById(String listId,ListsBoardsByIdPutRequest listsBoardsPutReq) {
	    return getClient().updateListsBoardsById(listId,listsBoardsPutReq);
	  }
	@Processor
	  public String updateListsNameById(String listId,ChecklistsNameByIdPutRequest listNamesPutReq) {
	    return getClient().updateListsNameById(listId,listNamesPutReq);
	  }
	@Processor
	  public String updateListsPositionById(String listId,ChecklistsPosByIdPutRequest listPosPutReq) {
	    return getClient().updateListsPositionById(listId,listPosPutReq);
	  }
	@Processor
	  public String updateListsSubscribedById(String listId,CardsSubscribedPutRequest listSubscribedPutReq) {
	    return getClient().updateListsSubscribedById(listId,listSubscribedPutReq);
	  }
	//POST lists methods
	@Processor
	  public String postLists(ListsPostRequest listssPostReq) {
	    return getClient().postLists(listssPostReq);
	  }
	@Processor
	  public String postListsCardsById(String idList,ListsCardsPostRequest listsCardsPostReq) {
	    return getClient().postListsCardsById(idList,listsCardsPostReq);
	  }
	@Processor
	  public String postListsMovedCardsById(String idList,ListsMovedCardsPostRequest listsMovedCardsPostReq) {
	    return getClient().postListsMovedCardsById(idList,listsMovedCardsPostReq);
	  }
	//notifications GET methods
	@Processor
	  public String getNotificationsById(String notificationId,@Optional Boolean display,@Optional Boolean entities,@Optional String fields,@Optional String memberCreator,@Optional String memberCreator_fields,@Optional Boolean board,@Optional String board_fields,@Optional Boolean list,@Optional Boolean card,@Optional String card_fields,@Optional Boolean organization,@Optional String  organization_fields,@Optional Boolean member,@Optional String member_fields) {
	    return getClient().getNotificationsById( notificationId,  display,  entities,  fields,  memberCreator,  memberCreator_fields,  board,  board_fields,  list,  card,  card_fields,  organization,   organization_fields,  member,  member_fields);
	  }
	@Processor
	  public String getNotificationsWithFieldById(String notificationId,String field) {
	    return getClient().getNotificationsWithById( notificationId,field);
	  }
	@Processor
	  public String getNotificationsBoardsById(String notificationId,@Optional String fields) {
	    return getClient().getNotificationsBoardsById( notificationId,fields);
	  }@Processor
	  public String getNotificationsBoardsFieldById(String notificationId,String field) {
		    return getClient().getNotificationsBoardsFieldById( notificationId,field);
		  }
	  @Processor
	  public String getNotificationsCardsById(String notificationId,@Optional String fields) {
	    return getClient().getNotificationsCardsById( notificationId,fields);
	  }
	  @Processor
	  public String getNotificationsCardsFieldById(String notificationId,String field) {
		    return getClient().getNotificationsCardsFieldById( notificationId,field);
		  }
	  @Processor
	  public String getNotificationsDisplayById(String notificationId) {
		    return getClient().getNotificationsDisplayById( notificationId);
		  }
	  @Processor
	  public String getNotificationsEntitiesById(String notificationId) {
		    return getClient().getNotificationsEntitiesById( notificationId);
		  }
	  @Processor
	  public String getNotificationsListById(String notificationId,@Optional String fields) {
		    return getClient().getNotificationsListById(notificationId,fields);
		  }
	  @Processor
	  public String getNotificationsListFieldById(String notificationId,String field) {
		    return getClient().getNotificationsListFieldById(notificationId,field);
		  }
	  @Processor
	  public String getMemberNotificationsById(String notificationId,@Default("all") @Optional String fields) {
		    return getClient().getMemberNotificationsById(notificationId,fields);
		  }
	  @Processor
	  public String getMemberNotificationsFieldById(String notificationId,String field) {
		    return getClient().getMemberNotificationsFieldById(notificationId,field);
		  }
	  @Processor
	  public String getMemberCreatorNotificationsById(String notificationId,@Default("all") @Optional String fields) {
		    return getClient().getMemberCreatorNotificationsById(notificationId,fields);
		  }
	  @Processor
	  public String getMemberCreaterNotificationsFieldById(String notificationId,String field) {
		    return getClient().getMemberCreaterNotificationsFieldById(notificationId,field);
		  }
	  @Processor
	  public String getOrganizationsNotificationsById(String notificationId,@Default("all") @Optional String fields) {
		    return getClient().getOrganizationsNotificationsById(notificationId,fields);
		  }
	  @Processor
	  public String getOrganizationsFieldNotificationsById(String notificationId,String field) {
		    return getClient().getOrganizationsFieldNotificationsById(notificationId,field);
		  }
	  //PUT Notifications methods
	  @Processor
	  public String updateNotificationsById(String notificationId,NotificationsByIdPutRequest notificationsPutReq) {
	    return getClient().updateNotificationsById(notificationId,notificationsPutReq);
	  }
	  @Processor
	  public String updateUnreadNotificationsById(String notificationId,NotificationsUnreadByIdPutRequest notificationsUnreadPutReq) {
	    return getClient().updateUnreadNotificationsById(notificationId,notificationsUnreadPutReq);
	  }
	  //POST notification method
	  @Processor
	  public String postAllNotifications(NotificationsPostRequest notificationsPostReq) {
	    return getClient().postAllNotifications(notificationsPostReq);
	  }
	  //Get Method requests for Search
	  @Processor
	  public String getSearchQuery(String query,@Optional String idBoards,@Optional String idOrganizations,@Optional String idCards,@Default("all") @Optional String modelTypes,@Optional String board_fields,@Optional String card_fields,@Optional Integer boards_limit,@Optional Integer cards_limit,@Optional Integer cards_page,@Default("false") @Optional Boolean card_board,@Default("false") @Optional String  card_list,@Default("false") @Optional Boolean card_members,@Default("false")@Optional Boolean card_stickers, @Default("false")@Optional String card_attachments,@Optional String organization_fields,@Default("10")@Optional Integer organizations_limit,@Optional String member_fields,@Default("10")@Optional Integer members_limit,@Default("false")@Optional Boolean partial) {
	    return getClient().getSearchQuery(query,idBoards,  idOrganizations,  idCards,  modelTypes,  board_fields,  card_fields,   boards_limit,  cards_limit,  cards_page,  card_board,   card_list,  card_members,  card_stickers,card_attachments,organization_fields,organizations_limit,member_fields,members_limit,partial);
	  }
	  @Processor
	  public String getSearchMembers(String query,@Optional String limit,@Optional String idBoard,@Optional String idOrganization,@Default("false") @Optional Boolean onlyOrgMembers) {
		    return getClient().getSearchMembers(query,limit,  idBoard,  idOrganization,  onlyOrgMembers);
	  }
	//Session Get method
	  @Processor
	  public String getSessionsSocket() {
		    return getClient().getSessionsSocket();
	  }
	  //PUT Sessions methods
	  @Processor
	  public String updateSessionById(String sessionId,SessionByIdPutRequest sessionByIdPutReq) {
	    return getClient().updateSessionById(sessionId,sessionByIdPutReq);
	  }
	  @Processor
	  public String updateSessionStatusById(String sessionId,SessionStatusByIdPutRequest sessionStatusByIdPutReq) {
	    return getClient().updateSessionStatusById(sessionId,sessionStatusByIdPutReq);
	  }
	  //post session methods
	  @Processor
	  public String postSessions(SessionsPostRequest sessionsPOstReq) {
	    return getClient().postSessions(sessionsPOstReq);
	  }
	 //Token GET methods
	  @Processor
	  public TokensGetResponse getTokensByToken(String token,@Optional String fields,@Optional Boolean webhooks) {
		    return getClient().getTokensByToken(token,fields,webhooks);
	  }
	  @Processor
	  public String getTokensFieldByToken(String token,String field) {
		    return getClient().getTokensFieldByToken(token,field);
	  }
	  @Processor
	  public String getMemberTokenByToken(String token,@Optional String fields) {
		    return getClient().getMemberTokenByToken(token,fields);
	  }
	  @Processor
	  public String getMemberFieldTokenByToken(String token,String field) {
		    return getClient().getMemberFieldTokenByToken(token,field);
	  }
	  @Processor
	  public String getTokensWebhooks(String token) {
		    return getClient().getTokensWebhooks(token);
	  }
	  @Processor
	  public String getTokensWebhooksByWebhookId(String token,String idWebhook) {
		    return getClient().getTokensWebhooksByWebhookId(token,idWebhook);
	  }
	  //PUT Token methods
	  @Processor
	  public String updateTokenWebhookByToken(String token,TokensPutRequest tokensPutReq) {
	    return getClient().updateTokenWebhookByToken(token,tokensPutReq);
	  }
	  //POST Token Method
	  @Processor
	  public String postTokenWebhookByToken(String token,TokensPutRequest tokensPutReq) {
	    return getClient().postTokenWebhookByToken(token,tokensPutReq);
	  }
	  //DELETE
	  @Processor
	  public StatusResponse deleteTokenByToken(String token) {
	    return getClient().deleteTokenByToken(token);
	  }
	  @Processor
	  public StatusResponse deleteTokenWebhookByToken(String token,String idWebhook) {
	    return getClient().deleteTokenWebhookByToken(token,idWebhook);
	  }
	  //Get Types
	  @Processor
	  public TypesGetResponse getTypeById(String typeId) {
	    return getClient().TypesGetResponse(typeId);
	  }
	  //WebHooks GET Methods
	  @Processor
	  public String getWebhooksById(String idWebhook) {
	    return getClient().getWebhooksById(idWebhook);
	  }
	  @Processor
	  public String getWebhooksFieldById(String idWebhook,String field) {
	    return getClient().getWebhooksFieldById(idWebhook,field);
	  }
	  //PUT Webhooks
	  @Processor
	  public String updateWebhookById(String idWebhook,WebhooksByIdPutRequest webhooksByIdPutReq) {
	    return getClient().updateWebhookById(idWebhook,webhooksByIdPutReq);
	  }
	  @Processor
	  public String updateWebhook(WebhooksPutRequest webhookPutReq) {
	    return getClient().updateWebhook(webhookPutReq);
	  }
	  @Processor
	  public String updateActiveWebhook(String idWebhook,WebhooksActivePutRequest webhooksActivePutReq) {
	    return getClient().updateActiveWebhook(idWebhook,webhooksActivePutReq);
	  }
	  @Processor
	  public String updateCallbackURLWebhook(String idWebhook,WebhooksCallBackURLPutRequest webhooksCallbackActivePutReq) {
	    return getClient().updateCallbackURLWebhook(idWebhook,webhooksCallbackActivePutReq);
	  }
	  @Processor
	  public String updateWebhookDescription(String idWebhook,WebhooksDescPutRequest webhooksDescPutReq) {
	    return getClient().updateWebhookDescription(idWebhook,webhooksDescPutReq);
	  }
	  @Processor
	  public String updateWebhooksIdModel(String idWebhook,WebhooksDescPutRequest webhooksDescPutReq) {
	    return getClient().updateWebhooksIdModel(idWebhook,webhooksDescPutReq);
	  }
	  //POST Webhooks
	  @Processor
	  public String postWebhook(WebhooksPutRequest webhooksPostReq) {
	    return getClient().postWebhook(webhooksPostReq);
	  }
	  //DELETE webhooks
	  @Processor
	  public StatusResponse deleteWebhookById(String idWebhook) {
	    return  getClient().deleteWebhookById(idWebhook);
	  }
	  //Organization GET Methods
	  @Processor
	  public OrganizationGetResponse getOrganizationById(String OrganizationId,@Optional String actions,@Optional Boolean actions_entities,@Optional Boolean actions_display,@Optional Integer actions_limit,@Optional String action_fields,@Optional String memberships,@Optional Boolean memberships_member,@Optional String memberships_member_fields,@Optional String members,@Optional String member_fields,@Optional Boolean  member_activity, @Optional String membersInvited,@Optional String membersInvited_fields, @Optional String boards,@Optional String board_fields,@Optional String board_actions,@Optional Boolean board_actions_entities,@Optional Boolean board_actions_display,@Optional String board_actions_format,@Optional String board_actions_since,@Optional Integer board_actions_limit,@Optional String board_action_fields,@Optional String board_lists,@Optional String paid_account,@Optional String fields) {
	    return getClient().getOrganizationById(OrganizationId,actions,  actions_entities,  actions_display,  actions_limit,action_fields,memberships,memberships_member,memberships_member_fields,members,member_fields,member_activity,membersInvited,membersInvited_fields,boards,board_fields,board_actions,board_actions_entities,board_actions_display,board_actions_format,board_actions_since,board_actions_limit,board_action_fields,board_lists,paid_account,fields);
	  }
	  @Processor
	  public String getOrganizationByIdAndField(String OrganizationId,String field) {
	    return getClient().getOrganizationByIdAndField(OrganizationId,field);
	  }
	  @Processor
	  public OrganizationActionGetResponse getOrganizationActionsById(String OrganizationId,@Optional Boolean entities,@Optional Boolean display,@Optional String filter ,@Optional String fields,@Optional Integer limit,@Optional String format,@Optional String since,@Optional String before,@Optional String page,@Optional String idModels ,@Optional Boolean member,@Optional String member_fields,@Optional Boolean memberCreator,@Optional String memberCreator_fields) {
	    return getClient().getOrganizationActionsById(OrganizationId,  entities,  display,  filter ,  fields,  limit,  format,  since,  before,  page,  idModels ,  member,  member_fields,  memberCreator,  memberCreator_fields);
	  }
	  @Processor
	  public OrganizationBoardsGetResponse getOrganizationBoardsById(String OrganizationId,@Optional String filter,@Optional String fields,@Optional String actions ,@Optional Boolean actions_entities,@Optional Integer actions_limit,@Optional String actions_format,@Optional String actions_since,@Optional String action_fields,@Optional String memberships,@Optional Boolean organization ,@Optional String organization_fields,@Optional String lists) {
	    return getClient().getOrganizationBoardsById(OrganizationId,  filter,  fields,  actions ,  actions_entities,  actions_limit,  actions_format,  actions_since,  action_fields,  memberships,  organization ,  organization_fields,  lists);
	  }
	  @Processor
	  public String getOrganizationBoardsByIdWithFilter(String OrganizationId,String filter) {
	    return getClient().getOrganizationBoardsByIdWithFilter(OrganizationId,filter);
	  }
	  @Processor
	  public String getOrganizationDeltasById(String OrganizationId,String tags,@Optional String ixLastUpdate) {
	    return getClient().getOrganizationDeltasById(OrganizationId,tags,ixLastUpdate);
	  }
	  @Processor
	  public OrganizationMemberResponse getOrganizationMembersById(String OrganizationId,@Optional String filters,@Optional String fields,@Optional Boolean activity) {
	    return getClient().getOrganizationMembersById(OrganizationId,filters,fields,activity);
	  }
	  @Processor
	  public OrganizationMemberResponse getOrganizationMembersByIdWithFilter(String OrganizationId,String filter) {
	    return getClient().getOrganizationMembersByIdWithFilter(OrganizationId,filter);
	  }
	  @Processor
	  public String getOrganizationMembersCardsById(String OrganizationId,String idMember,@Optional String actions,@Optional String attachments ,@Optional String attachment_fields,@Optional Boolean members,@Optional String member_fields,@Optional Boolean checkItemStates,@Optional String checklists,@Optional Boolean board,@Optional String board_fields ,@Optional String list,@Optional String list_fields,@Optional String filter,@Optional String fields) {
	    return getClient().getOrganizationMembersCardsById(OrganizationId,  idMember,  actions,  attachments,  attachment_fields,  members,  member_fields,  checkItemStates,  checklists,  board ,  board_fields,list,fields,filter);
	  }
	  @Processor
	  public String getOrganizationMembersInvitedById(String OrganizationId,@Optional String fields) {
	    return getClient().getOrganizationMembersInvitedById(OrganizationId,fields);
	  }
	  @Processor
	  public String getOrganizationMembersInvitedByIdWithField(String OrganizationId,String field) {
	    return getClient().getOrganizationMembersInvitedByIdWithField(OrganizationId,field);
	  }
	  @Processor
	  public String getOrganizationMembershipsById(String OrganizationId,@Optional String filter,@Optional Boolean member,@Optional String member_fields ) {
	    return getClient().getOrganizationMembershipsById(OrganizationId,filter,member,member_fields);
	  }
	  @Processor
	  public String getOrganizationMembershipsByMembershipId(String OrganizationId,String idMembership,@Optional Boolean member,@Optional String member_fields ) {
	    return getClient().getOrganizationMembershipsByMembershipId(OrganizationId,idMembership,member,member_fields);
	  }
	  //organization put methods
	  @Processor
	  public String updateOrganizationsByIdOrName(String OrganizationId,OrganizationPutRequest organizationPutReq) {
	    return getClient().updateOrganizationsById(OrganizationId,organizationPutReq);
	  }
	  @Processor
	  public String updateOrganizationsDescByIdOrName(String OrganizationIdOrName,OrganizationDescPutRequest updateOrgDecPutReq) {
	    return getClient().updateOrganizationsDescByIdOrName(OrganizationIdOrName,updateOrgDecPutReq);
	  }
	  @Processor
	  public String updateOrganizationsDisplayNameIdOrName(String OrganizationIdOrName,OrganizationDisplayNamePutRequest updateOrgDisplayName) {
	    return getClient().updateOrganizationsDisplayNameIdOrName(OrganizationIdOrName,updateOrgDisplayName);
	  }
	  @Processor
	  public String updateOrganizationsMembersByIdOrName(String OrganizationIdOrName,OrganizationMembersPutRequest updateOrgMembersPutReq) {
	    return getClient().updateOrganizationsMembersByIdOrName(OrganizationIdOrName,updateOrgMembersPutReq);
	  }
	  @Processor
	  public String updateOrganizationsMembersByMemberid(String OrganizationIdOrName,String idMember,OrganizationMemberIdPutRequest updateOrgMembersByIdPutReq) {
	    return getClient().updateOrganizationsMembersByMemberid(OrganizationIdOrName,idMember,updateOrgMembersByIdPutReq);
	  }
	  @Processor
	  public String deactivateOrganizationMemberById(String OrganizationIdOrName,String idMember,OrganizationMemberDeactivatedPutRequest deactivatedOrgMembersByIdPutReq) {
	    return getClient().deactivateOrganizationMemberById(OrganizationIdOrName,idMember,deactivatedOrgMembersByIdPutReq);
	  }
	  @Processor
	  public String putOrganizationMembershipById(String OrganizationIdOrName,String idMember,OrganizationMembershipPutRequest memberShipsputReq) {
	    return getClient().putOrganizationMembershipById(OrganizationIdOrName,idMember,memberShipsputReq);
	  }
	  @Processor
	  public String updateOrganizationsNameByIdOrName(String OrganizationIdOrName,OrganizationDisplayNamePutRequest updateOrgNamePutReq) {
	    return getClient().updateOrganizationsNameByIdOrName(OrganizationIdOrName,updateOrgNamePutReq);
	  }
	  @Processor
	  public String updateOrganizationAssociatedDomain(String OrganizationIdOrName,OrganizationAssociatedDomainPutRequest orgAssociatedDomainPutReq) {
	    return getClient().updateOrganizationAssociatedDomain(OrganizationIdOrName,orgAssociatedDomainPutReq);
	  }
	  @Processor
	  public String updateOrgOrganizationBoardVisibilityRestrict(String OrganizationIdOrName,OrganizationBoardVisibilityRestrictPutRequest orgVisibilityRestrictPutReq) {
	    return getClient().updateOrgOrganizationBoardVisibilityRestrict(OrganizationIdOrName,orgVisibilityRestrictPutReq);
	  }
	  @Processor
	  public String updatePrivateOrganizationBoardVisibilityRestrict(String OrganizationIdOrName,OrganizationBoardVisibilityRestrictPutRequest orgVisibilityRestrictPutReq) {
	    return getClient().updatePrivateOrganizationBoardVisibilityRestrict(OrganizationIdOrName,orgVisibilityRestrictPutReq);
	  }
	  @Processor
	  public String updatePublicOrganizationBoardVisibilityRestrict(String OrganizationIdOrName,OrganizationBoardVisibilityRestrictPutRequest orgVisibilityRestrictPutReq) {
	    return getClient().updatePublicOrganizationBoardVisibilityRestrict(OrganizationIdOrName,orgVisibilityRestrictPutReq);
	  }
	  @Processor
	  public String updateOrgExternalMembersDisabled(String OrganizationIdOrName,OrganizationExternalMembersDisabledPutRequest orgExternalMemDisabledPutReq) {
	    return getClient().updateOrgExternalMembersDisabled(OrganizationIdOrName,orgExternalMemDisabledPutReq);
	  }
	  @Processor
	  public String updateOrgGoogleAppVersion(String OrganizationIdOrName,OrganizationGoogleAppVersionPutRequest orgExternalMemDisabledPutReq) {
	    return getClient().updateOrgGoogleAppVersion(OrganizationIdOrName,orgExternalMemDisabledPutReq);
	  }
	  @Processor
	  public String updateOrgInviteRestrict(String OrganizationIdOrName,OrganizationInviteRestrictPutRequest orgInviteRestrictPutReq) {
	    return getClient().updateOrgInviteRestrict(OrganizationIdOrName,orgInviteRestrictPutReq);
	  }
	  @Processor
	  public String updateOrgPermissionLevel(String OrganizationIdOrName,OrganizationPermissionLevelPutRequest orgPermissionLevelRestrictPutReq) {
	    return getClient().updateOrgPermissionLevel(OrganizationIdOrName,orgPermissionLevelRestrictPutReq);
	  }
	  @Processor
	  public String updateOrgWebsite(String OrganizationIdOrName,OrganizationPermissionLevelPutRequest orgPermissionLevelRestrictPutReq) {
	    return getClient().updateOrgWebsite(OrganizationIdOrName,orgPermissionLevelRestrictPutReq);
	  }
	  
	  //Orgabnization POST methods
	  @Processor
	  public String postOrganizations(OrganizationPostRequest organizationPostReq) {
	    return getClient().postOrganizations(organizationPostReq);
	  }
	  @Processor
	  public String postOrganizationsLogoByIdOrName(String orgIdOrName,OrganizationLogoPostRequest organizationLogoPostReq) {
	    return getClient().postOrganizationsLogoByIdOrName(orgIdOrName,organizationLogoPostReq);
	  }
	  
	  //Organization DELETE methods
	  
	  @Processor
	  public StatusResponse deleteOrganizationsByIdOrName(String orgIdOrName) {
	    return getClient().deleteOrganizationsByIdOrName(orgIdOrName);
	  }
	  @Processor
	  public StatusResponse deleteOrganizationsLogoByIdOrName(String orgIdOrName) {
	    return getClient().deleteOrganizationsLogoByIdOrName(orgIdOrName);
	  }
	  @Processor
	  public StatusResponse deleteMemberFromOrganizationByIdOrName(String orgIdOrName,String idMember) {
	    return getClient().deleteMemberFromOrganizationByIdOrName(orgIdOrName,idMember);
	  }
	  @Processor
	  public StatusResponse deleteMemberFromAllOrganizationsByIdOrName(String orgIdOrName,String idMember) {
	    return getClient().deleteMemberFromAllOrganizationsByIdOrName(orgIdOrName,idMember);
	  }
	  @Processor
	  public StatusResponse deleteOrganizationsAssociatedDomainByIdOrName(String orgIdOrName) {
	    return getClient().deleteOrganizationsAssociatedDomainByIdOrName(orgIdOrName);
	  }
	  @Processor
	  public StatusResponse deleteOrganizationsOrgInviteReqByIdOrName(String orgIdOrName) {
	    return getClient().deleteOrganizationsOrgInviteReqByIdOrName(orgIdOrName);
	  }
	  //Members API 
	  @Processor
		public MemberIdGetResponse getMemberByIdOrUsername(String id, @Optional String actions, @Optional @Default("false") Boolean actions_entities,
				@Optional @Default("false") Boolean actions_display, @Optional @Default("50") String actions_limit, @Optional @Default("all") String action_fields, @Optional String action_since, @Optional String action_before, @Optional @Default("none") String cards, @Optional @Default("all") String card_fields, @Optional @Default("false") Boolean card_members, @Optional String card_member_fields, @Optional @Default("false") String card_attachments, @Optional String card_attachment_fields, @Optional @Default("false") Boolean card_stickers, @Optional String boards, @Optional String board_fields, @Optional String board_actions, @Optional @Default("false") Boolean board_actions_entities, @Default("false") Boolean board_actions_display, @Default("list") String board_actions_format, @Optional String board_actions_since, @Default("50") String board_actions_limit, @Default("all") String board_action_fields, @Default("none") String  board_lists, @Default("none") String board_memberships, @Default("false") Boolean board_organization, @Optional String board_organization_fields, @Optional String boardsInvited, @Optional String boardsInvited_fields, @Default("false") Boolean boardStars, @Default("false") Boolean savedSearches, @Default("none") String organizations, @Default("all") String organization_fields, @Default("false") Boolean organization_paid_account, @Default("none") String organizationsInvited, @Default("all") String organizationsInvited_fields, @Optional String notifications, @Default("false") Boolean notifications_entities, @Default("false") Boolean notifications_display, @Default("50") String notifications_limit, @Default("all") String notification_fields, @Default("true") Boolean notification_memberCreator, @Optional String notification_memberCreator_fields, @Optional String notification_before, @Optional String notification_since, @Default("none") String tokens, @Default("false") Boolean paid_account, @Default("none") String boardBackgrounds, @Default("none") String customBoardBackgrounds, @Default("none") String customStickers, @Default("none") String customEmoji, @Default("all") String fields){
			return getClient().getMemberByIdOrUsername(id,actions,    actions_entities,
					   actions_display,    actions_limit,    action_fields,   action_since,
					   action_before,    cards,    card_fields,    card_members,   card_member_fields,
					   card_attachments,   card_attachment_fields,    card_stickers,   boards,   
					   board_fields,   board_actions,    board_actions_entities,   board_actions_display,   
					   board_actions_format,   board_actions_since,   board_actions_limit,   board_action_fields,    
					   board_lists,   board_memberships,   board_organization,   board_organization_fields,   boardsInvited,   
					   boardsInvited_fields,   boardStars,   savedSearches,   organizations,   organization_fields,   
					   organization_paid_account,   organizationsInvited,   organizationsInvited_fields,   notifications,   
					   notifications_entities,   notifications_display,  notifications_limit,   notification_fields,   
					   notification_memberCreator,   notification_memberCreator_fields,   notification_before,   
					   notification_since,   tokens,   paid_account,   boardBackgrounds,   
					   customBoardBackgrounds,   customStickers,   customEmoji,  fields);
		}
		@Processor
		public String getMembersByIdOrUsernameAndField(String id, String field){
			return getClient().getMembersByIdOrUsernameAndField(id, field);
		}
		
		@Processor
		public MemberActionsByIdOrUsernameGetResponse getMemberActionsByIdOrUsername(String id, @Default("false") Boolean entities,  @Default("false") Boolean display, @Default("all") String filter, @Default("all") String fields, @Default("50") String limit, @Default("list") String format, @Optional String since, @Optional String before, @Default("0") String page, @Optional String idModels, @Default("true") Boolean member, @Optional String member_fields, @Default("true") Boolean memberCreator, @Optional String memberCreator_fields){
			
			return getClient().getMemberActionsByIdOrUsername(id, entities,  display, filter, fields, limit, format, since, before, page, idModels, member, member_fields, memberCreator, memberCreator_fields);
		}
		
		@Processor
		public String getBoardBackGrounds(String id, @Default("all") String filter){
			return getClient().getBoardBackGrounds(id, filter);
		}
		
		@Processor
		public String getBoardBackGroundsById(String id, String idBoardBackground, @Default("all") String filter){
			return getClient().getBoardBackGroundsById(id, idBoardBackground, filter);
		}	
		
		@Processor
		public String getBoardStars(String id){
			return getClient().getBoardStars(id);
		}
		
		@Processor
		public String getBoardStarsById(String id, String idBoardStar){
			return getClient().getBoardStarsById(id, idBoardStar);
		}
		
		@Processor
		public MembersBoardsGetResponse getBoards(String id, @Default("all") String filter, @Default("all") String fields, @Optional String actions, @Default("false") Boolean actions_entities, @Default("50") String actions_limit, @Default("list") String actions_format, @Optional String actions_since, @Default("all") String action_fields, @Default("none") String memberships, @Default("false") Boolean organization, @Optional String organization_fields, @Default("none") String lists){
			return getClient().getBoards(id, filter, fields, actions, actions_entities, actions_limit, actions_format, actions_since, action_fields, memberships, organization, organization_fields, lists);
		}
		
		@Processor
		public String getBoardsByFilter(String id, String filter){
			return getClient().getBoardsByFilter(id, filter);
		}
		
		@Processor
		public String getBoardsInvited(String id, String fields){
			return getClient().getBoardsInvited(id, fields);
		}
		
		@Processor
		public String getBoardsInvitedByField(String id, String field){
			return getClient().getBoardsInvitedByField(id, field);
		}
		
		@Processor
		public String getCards(String id, @Optional String actions,@Default("false") Boolean attachments, @Default("all") String attachment_fields, @Default("false") Boolean stickers, @Default("false") Boolean members, @Optional String member_fields, @Default("false") Boolean checkItemStates, @Default("none") String checklists, @Optional String limit, @Optional String since, @Optional String before, @Default("visible") String filter, @Default("all") String fields){
			return getClient().getCards(id, actions, attachments, attachment_fields, stickers, members, member_fields, checkItemStates, checklists, limit, since, before, filter, fields);
		}
		
		@Processor
		public String getCardsByFilter(String id, String filter){
			return getClient().getCardsByFilter(id, filter);
		}
		
		@Processor
		public String getCustomBoardBackgrounds(String id, @Default("all") String filter){
			return getClient().getCustomBoardBackgrounds(id, filter);
		}
		@Processor
		public String getCustomBoardBackgroundsById(String memberId, String boardBackgroundId, @Default("all") String fields){
			return getClient().getCustomBoardBackgroundsById(memberId, boardBackgroundId, fields);
		}
		@Processor
		public String getCustomEmoji(String memberId, @Default("all") String filter){
			return getClient().getCustomEmoji(memberId, filter);
		}
		@Processor
		public String getCustomEmojiById(String memberId, String idCustomEmoji, @Default("all") String fields){
			return getClient().getCustomEmojiById(memberId, idCustomEmoji, fields);
		}
		@Processor
		public String getCustomStickers(String memberId, @Default("all") String filter){
			return getClient().getCustomStickers(memberId, filter);
		}
		@Processor
		public String getCustomStickersById(String memberId, String idCustomSticker, @Default("all") String fields){
			return getClient().getCustomStickersById(memberId, idCustomSticker, fields);
		}
		@Processor
		public String getDeltas(String memberId, String tags, String ixLastUpdate){
			return getClient().getDeltas(memberId, tags, ixLastUpdate);
		}
		@Processor
		public String getNotifications(String memberId, @Default("false") Boolean entities, @Default("false") Boolean display,@Default("all") String filter, @Default("all") String read_filter, @Default("all") String fields, @Default("50") String limit, @Default("0") String page, @Optional String before, @Optional String since, @Default("true") Boolean memberCreator, @Optional String memberCreator_fields){
			return getClient().getNotifications(memberId, entities, display, filter, read_filter, fields, limit, page, before, since, memberCreator, memberCreator_fields);
		}
		@Processor
		public String getNotificationsByFilter(String memberId, String filter){
			return getClient().getNotificationsByFilter(memberId, filter);
		}
		@Processor
		public OrganizationsGetResponse getOrganizations(String memberId, @Default("all") String filter, @Default("all") String fields, @Default("false") Boolean paid_account){
			return getClient().getOrganizations(memberId, filter, fields, paid_account);
		}
		@Processor
		public String getOrganizationsByFilter(String memberId, String filter){
			return getClient().getOrganizationsByFilter(memberId, filter);
		}
		
		@Processor
		public String getOrganizationsInvited(String memberId, @Default("all") String fields){
			return getClient().getOrganizationsInvited(memberId, fields);
		}
		
		@Processor
		public String getOrganizationsByField(String memberId, String field){
			return getClient().getOrganizationsByField(memberId, field);
		}
		@Processor
		public String getSavedSearches(String memberId){
			return getClient().getSavedSearches(memberId);
		}
		@Processor
		public String getSavedSearchesBySavedSearchId(String memberId, String savedSearchId){
			return getClient().getSavedSearchesBySavedSearchId(memberId, savedSearchId);
		}
		@Processor
		public String getTokens(String memberId,@Default("all") String filter, @Default("false") Boolean webhooks){
			return getClient().getTokens(memberId,filter,webhooks);
		}
		
		@Processor
		public String updateMember(String memberId, UpdateMemberPutRequest request){
			return getClient().updateMember(memberId,request);
		}
		@Processor
		public String updateAvatarSource(String memberId, UpdateAvatarSourcePutRequest request){
			return getClient().updateAvatarSource(memberId, request);
		}
		@Processor
		public String updateBio(String memberId, String value){
			return getClient().updateBio(memberId, value);
		}
		@Processor
		public String updateBoardBackgroundsById(String memberId, String idBoardBackground, UpdateBoardBackgroundByIdPutRequest request){
			return getClient().updateBoardBackgroundsById(memberId, idBoardBackground, request);
		}
		@Processor
		public String updateBoardStarsById(String memberId, String idBoardStar, UpdateBoardStarsByIdPutRequest request ){
			return getClient().updateBoardStarsById(memberId, idBoardStar, request);
		}
		@Processor
		public String updateBoardStarByBoardId(String memberId, String idBoardStar, UpdateBoardStarByBoardIdPutRequest request){
			return getClient().updateBoardStarByBoardId(memberId, idBoardStar, request);
		}
		@Processor
		public String updateBoardStarByBoardPos(String memberId, String idBoardStar, UpdateBoardStarByBoardPosPutRequest request){
			return getClient().updateBoardStarByBoardPos(memberId, idBoardStar, request);
		}
		@Processor
		public String updateCustomBoardBackgroundById(String memberId, String idBoardBackground, UpdateCustomBoardBackgroundById request){
			return getClient().updateCustomBoardBackgroundById(memberId, idBoardBackground, request);
		}
		@Processor
		public String updateMemberFullname(String memberId, String value){
			return getClient().updateMemberFullname(memberId, value);
		}
		@Processor
		public String updateMemberInitials(String memberId, String value){
			return getClient().updateMemberInitials(memberId, value);
		}
		@Processor
		public String updateMemberPrefColorBlind(String memberId, Boolean value){
			return getClient().updateMemberPrefColorBlind(memberId, value);
		}
		@Processor
		public String updateMemberPrefLocale(String memberId, String value){
			return getClient().updateMemberPrefLocale(memberId, value);
		}
		@Processor
		public String updateMemberPrefMinutesBetweenSummaries(String memberId, String value){
			return getClient().updateMemberPrefMinutesBetweenSummaries(memberId, value);
		}
		@Processor
		public String updateMemberSavedSearchesById(String memberId, String idSavedSearch, UpdateMemberSavedSearchesByIdPutRequest request){
			return getClient().updateMemberSavedSearchesById(memberId, idSavedSearch, request);
		}
		@Processor
		public String updateSavedSearchName(String memberId, String idSavedSearch, UpdateSavedSearchNamePutRequest request){
			return getClient().updateSavedSearchName(memberId, idSavedSearch, request);
		}
		@Processor
		public String updateSavedSearchPos(String memberId, String idSavedSearch, UpdateSavedSearchPosPutRequest request){
			return getClient().updateSavedSearchPos(memberId, idSavedSearch, request);
		}
		@Processor
		public String updateSavedSearchQuery(String memberId, String idSavedSearch, UpdateSavedSearchQueryPutRequest request){
			return getClient().updateSavedSearchQuery(memberId, idSavedSearch, request);
		}
		@Processor
		public String updateMemberUsername(String memberId, String value){
			return getClient().updateMemberUsername(memberId, value);
		}
		
		@Processor
		public String createMemberAvatar(String memberId, CreateMemberAvatarPostRequest request){
			return getClient().createMemberAvatar(memberId, request);
		}
		
		@Processor
		public String createMemberBoardBackgrounds(String memberId, CreateMemberBoardBackgroundsPostRequest request){
			return getClient().createMemberBoardBackgrounds(memberId, request);
		}
		
		@Processor
		public String createMemberBoardStars(String memberId, CreateMemberBoardStarsPostRequest request){
			return getClient().createMemberBoardStars(memberId, request);
		}
		
		@Processor
		public String createCustomBoardBackgrounds(String memberId, CreateCustomBoardBackgroundsPostRequest request){
			return getClient().createCustomBoardBackgrounds(memberId, request);
		}
		
		@Processor
		public String createCustomEmoji(String memberId, CreateCustomEmojiPostRequest request){
			return getClient().createCustomEmoji(memberId, request);
		}
		
		@Processor
		public String createCustomStickers(String memberId, CreateCustomStickerPostRequest request){
			return getClient().createCustomStickers(memberId, request);
		}
		
		@Processor
		public String createOneTimeMessagesDismissed(String memberId, CreateOneTimeMessagesDismissedPostRequest request){
			return getClient().createOneTimeMessagesDismissed(memberId, request);
		}
		@Processor
		public String createSavedSearches(String memberId, CreateSavedSearchesPostRequest request){
			return getClient().createSavedSearches(memberId, request);
		}
		
		@Processor
		public StatusResponse deleteMembersBoardBackgroundsById(String memberId, String idBoardBackground) {
			return getClient().deleteMembersBoardBackgroundsById(memberId, idBoardBackground);
		}
		@Processor
		public StatusResponse deleteMembersBoardStarsById(String memberId, String idBoardStar) {
			return getClient().deleteMembersBoardStarsById(memberId, idBoardStar);
		}
		@Processor
		public StatusResponse deleteMembersCustomBoardBackgroundsById(String memberId, String idBoardBackground) {
			return getClient().deleteMembersCustomBoardBackgroundsById(memberId, idBoardBackground);
		}
		@Processor
		public StatusResponse deleteMembersCustomStickersById(String memberId, String idCustomSticker) {
			return getClient().deleteMembersCustomStickersById(memberId, idCustomSticker);
		}
		@Processor
		public StatusResponse deleteMembersSavedSearchesById(String memberId, String idSavedSearch) {
			return getClient().deleteMembersSavedSearchesById(memberId, idSavedSearch);
		}
	  
	  
	  
	  
	  

	public ConnectorConfig getConfig() {
		return config;
	}

	public void setConfig(ConnectorConfig config) {
		this.config = config;
	}

	/**
	 * @param client
	 */
	public void setClient(TrelloClient client) {
		this.client = client;
	}

	/**
	 * @return TrelloClient Object
	 */
	public TrelloClient getClient() {
		return client;
	}

	
	
	@Processor
	public Map<String, Object> addEntity(@MetaDataKeyParam String key,
			@Default("#[payload]") Map<String, Object> entity) {
		/*
		 * USE THE KEY AND THE MAP TO DO SOMETHING
		 */
		return entity;
	}

}