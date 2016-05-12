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
import org.mule.modules.trello.bean.ActionsByIdPutRequest;
import org.mule.modules.trello.bean.ActionsTextByIdPutRequest;
import org.mule.modules.trello.bean.BoardsByIdAndActionsGetResponse;
import org.mule.modules.trello.bean.BoardsByIdAndCardsGetResponse;
import org.mule.modules.trello.bean.BoardsByIdAndCheckListsGetResponse;
import org.mule.modules.trello.bean.BoardsByIdAndListsGetResponse;
import org.mule.modules.trello.bean.BoardsByIdGetResponse;
import org.mule.modules.trello.bean.BoardsByIdLabelPostRequest;
import org.mule.modules.trello.bean.BoardsByIdListPostRequest;
import org.mule.modules.trello.bean.BoardsByIdPutRequest;
import org.mule.modules.trello.bean.BoardsCalendekeyGeneratePostRequest;
import org.mule.modules.trello.bean.BoardsChecklistPostRequest;
import org.mule.modules.trello.bean.BoardsClosedByIdPutRequest;
import org.mule.modules.trello.bean.BoardsDescriptionByIdPutRequest;
import org.mule.modules.trello.bean.BoardsOrganizationByIdPutRequest;
import org.mule.modules.trello.bean.BoardsPostRequest;
import org.mule.modules.trello.bean.BoardsPostResponse;
import org.mule.modules.trello.bean.BoardsPoweUpsPostRequest;
import org.mule.modules.trello.bean.CardsAcionCommentsByIdPostRequest;
import org.mule.modules.trello.bean.CardsAttachmentsByIdPostRequest;
import org.mule.modules.trello.bean.CardsByIdGetResponse;
import org.mule.modules.trello.bean.CardsByIdPutRequest;
import org.mule.modules.trello.bean.CardsCardsBoardIdPutRequest;
import org.mule.modules.trello.bean.CardsCardsIdAttachmentPutRequest;
import org.mule.modules.trello.bean.CardsCardsListPutRequest;
import org.mule.modules.trello.bean.CardsCheckListNamePutRequest;
import org.mule.modules.trello.bean.CardsCheckListPositionPutRequest;
import org.mule.modules.trello.bean.CardsCheckListStatePutRequest;
import org.mule.modules.trello.bean.CardsCheckListsByIdPostRequest;
import org.mule.modules.trello.bean.CardsClosedPutRequest;
import org.mule.modules.trello.bean.CardsCommentsByIdPutRequest;
import org.mule.modules.trello.bean.CardsCurrentCheckListPutRequest;
import org.mule.modules.trello.bean.CardsDescriptionPutRequest;
import org.mule.modules.trello.bean.CardsDuePutRequest;
import org.mule.modules.trello.bean.CardsIdLabelByIdPostRequest;
import org.mule.modules.trello.bean.CardsIdMembersPostRequest;
import org.mule.modules.trello.bean.CardsLabelsPostRequest;
import org.mule.modules.trello.bean.CardsMemberPutRequest;
import org.mule.modules.trello.bean.CardsMembersVotedPostRequest;
import org.mule.modules.trello.bean.CardsNamePosRequest;
import org.mule.modules.trello.bean.CardsNamePutRequest;
import org.mule.modules.trello.bean.CardsPostRequest;
import org.mule.modules.trello.bean.CardsStickerPutRequest;
import org.mule.modules.trello.bean.CardsStickersPostRequest;
import org.mule.modules.trello.bean.CardsSubscribedPutRequest;
import org.mule.modules.trello.bean.CheckItems;
import org.mule.modules.trello.bean.CheckItemsPostRequest;
import org.mule.modules.trello.bean.CheckListsGetResponse;
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
import org.mule.modules.trello.bean.ListCardsGetResponse;
import org.mule.modules.trello.bean.ListsActionsByIdGetResponse;
import org.mule.modules.trello.bean.ListsBoardsByIdPutRequest;
import org.mule.modules.trello.bean.ListsByIdGetResponse;
import org.mule.modules.trello.bean.ListsByIdPutRequest;
import org.mule.modules.trello.bean.ListsCardsPostRequest;
import org.mule.modules.trello.bean.ListsClosedByIdPutRequest;
import org.mule.modules.trello.bean.ListsFieldByIdGetResponse;
import org.mule.modules.trello.bean.ListsMovedCardsPostRequest;
import org.mule.modules.trello.bean.ListsPostRequest;
import org.mule.modules.trello.bean.NotificationsByIdPutRequest;
import org.mule.modules.trello.bean.NotificationsPostRequest;
import org.mule.modules.trello.bean.NotificationsUnreadByIdPutRequest;
import org.mule.modules.trello.bean.OrganizationGetResponse;
import org.mule.modules.trello.bean.SessionByIdPutRequest;
import org.mule.modules.trello.bean.SessionStatusByIdPutRequest;
import org.mule.modules.trello.bean.SessionsPostRequest;
import org.mule.modules.trello.bean.StatusResponse;
import org.mule.modules.trello.bean.TokensGetResponse;
import org.mule.modules.trello.bean.TokensPutRequest;
import org.mule.modules.trello.bean.TypesGetResponse;
import org.mule.modules.trello.bean.WebhooksActivePutRequest;
import org.mule.modules.trello.bean.WebhooksByIdPutRequest;
import org.mule.modules.trello.bean.WebhooksCallBackURLPutRequest;
import org.mule.modules.trello.bean.WebhooksDescPutRequest;
import org.mule.modules.trello.bean.WebhooksPutRequest;
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
	  public String putReadActionsById(String actionId,@Optional String text,ActionsByIdPutRequest actionIdPutRequest) {
	    return getClient().putReadActionsById(actionId,text,actionIdPutRequest);
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