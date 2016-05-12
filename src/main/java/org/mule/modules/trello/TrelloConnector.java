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
import org.mule.modules.trello.bean.BoardMembersByBoardIdGetResponse;
import org.mule.modules.trello.bean.BoardMembersInvitedGetResponse;
import org.mule.modules.trello.bean.BoardsByIdAndActionsGetResponse;
import org.mule.modules.trello.bean.BoardsByIdAndBoardStarsGetResponse;
import org.mule.modules.trello.bean.BoardsByIdAndCardsGetResponse;
import org.mule.modules.trello.bean.BoardsByIdAndCheckListsGetResponse;
import org.mule.modules.trello.bean.BoardsByIdAndDeltasGetResponse;
import org.mule.modules.trello.bean.BoardsByIdAndFieldGetResponse;
import org.mule.modules.trello.bean.BoardsByIdAndLabelsGetResponse;
import org.mule.modules.trello.bean.BoardsByIdAndListsGetResponse;
import org.mule.modules.trello.bean.BoardsByIdAndMembersByIdCardsGetResponse;
import org.mule.modules.trello.bean.BoardsByIdGetResponse;
import org.mule.modules.trello.bean.BoardsByIdLabelPostRequest;
import org.mule.modules.trello.bean.BoardsByIdListPostRequest;
import org.mule.modules.trello.bean.BoardsByIdPutRequest;
import org.mule.modules.trello.bean.BoardsCalendekeyGeneratePostRequest;
import org.mule.modules.trello.bean.BoardsChecklistPostRequest;
import org.mule.modules.trello.bean.BoardsClosedByIdPutRequest;
import org.mule.modules.trello.bean.BoardsDescriptionByIdPutRequest;
import org.mule.modules.trello.bean.BoardsMembershipGetResponse;
import org.mule.modules.trello.bean.BoardsOrganizationByIdPutRequest;
import org.mule.modules.trello.bean.BoardsPostRequest;
import org.mule.modules.trello.bean.BoardsPostResponse;
import org.mule.modules.trello.bean.BoardsPoweUpsPostRequest;
import org.mule.modules.trello.bean.BoardssByIdAndOrganizationGetResponse;
import org.mule.modules.trello.bean.CardsAcionCommentsByIdPostRequest;
import org.mule.modules.trello.bean.CardsActionsByIdGetResponse;
import org.mule.modules.trello.bean.CardsAttachmentsByIdPostRequest;
import org.mule.modules.trello.bean.CardsByIdGetResponse;
import org.mule.modules.trello.bean.CardsByIdPutRequest;
import org.mule.modules.trello.bean.CardsByIdWithFieldGetResponse;
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
import org.mule.modules.trello.bean.StatusResponse;
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
	public String getActionsByIdWithEntities1(String actionId){
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
	public BoardsByIdAndFieldGetResponse getBoardsByIdAndField(String boardId,String field){
		return getClient().getBoardsByIdAndField(boardId,field);
	}
	@Processor
	public BoardsByIdAndActionsGetResponse getBoardsByIdAndActions(String boardId,@Optional String entities,@Optional Boolean display,@Optional String filter,@Optional String fields,@Optional Integer limit,@Optional String format,@Optional String since,@Optional String before,@Optional Integer page,@Optional String idModels,
			@Optional Boolean member,@Optional String member_fields,@Optional Boolean memberCreator,@Optional String memberCreator_fields){
		
		return getClient().getBoardsByIdAndActions(boardId,entities,display,filter,fields,limit,format,since,
				before,page,idModels,member,member_fields,memberCreator,memberCreator_fields);
	}
	@Processor
	public BoardsByIdAndBoardStarsGetResponse getBoardsByIdAndBoardStars(String boardId,@Optional String filter){
		return getClient().getBoardsByIdAndBoardStars(boardId,filter);
	}
	@Processor
	public BoardsByIdAndCardsGetResponse getBoardsByIdAndCards(String boardId,@Optional String actions,@Optional String attachments,@Optional String attachment_fields,@Optional Boolean stickers,@Optional Boolean members,@Optional String member_fields,@Optional String checklists,@Optional String since,@Optional String before,@Optional String filter,@Optional String fields){
		return getClient().getBoardsByIdAndCards(boardId,actions,attachments,attachment_fields,stickers,members,member_fields,checklists,since,before,filter,fields);
	}
	@Processor
	public BoardsByIdAndCardsGetResponse getBoardsByIdAndCardsWithFilter(String boardId,String filter){
		return getClient().getBoardsByIdAndCardsWithFilter(boardId,filter);
	}
	@Processor
	public BoardsByIdAndActionsGetResponse getBoardsByIdAndCardsWithIdCards(String boardId,String idCard,@Optional String attachments,@Optional String attachment_fields,@Optional String actions,@Optional Boolean actions_entities,@Optional Boolean actions_display,@Optional Integer actions_limit,@Optional String action_fields,@Optional String action_memberCreator_fields,@Optional Boolean members,@Optional String member_fields,@Optional Boolean checkItemStates,@Optional String checkItemState_fields,@Optional Boolean labels,@Optional String checklists,@Optional String checklist_fields,@Optional String fields){
		return getClient().getBoardsByIdAndCardsWithIdCards(boardId,idCard,attachments,attachment_fields,actions,actions_entities,actions_display,actions_limit,action_fields,action_memberCreator_fields,members,member_fields,checkItemStates,checkItemState_fields,labels,checklists,checklist_fields,fields);
	}
	@Processor
	public BoardsByIdAndCheckListsGetResponse getBoardsByIdAndCheckLists(String boardId,String cards,@Optional String card_fields,@Optional String check_Items,@Optional String checkItem_fields,@Optional String filter,@Optional String fields){
		return getClient().getBoardsByIdAndCheckLists(boardId,cards,card_fields,check_Items,checkItem_fields,filter,fields);
	}
	@Processor
	public BoardsByIdAndDeltasGetResponse getBoardsByIdAndDeltas(String boardId,String tags,String ixLastUpdate){
		return getClient().getBoardsByIdAndDeltas(boardId,tags,ixLastUpdate);
	}
	@Processor
	public BoardsByIdAndLabelsGetResponse getBoardsByIdAndLabels(String boardId,@Optional String fields,@Optional String limit){
		return getClient().getBoardsByIdAndLimit(boardId,fields,limit);
	}
	@Processor
	public BoardsByIdAndLabelsGetResponse getBoardsByIdAndLabelsWithId(String boardId,String labelId,@Optional String fields){
		return getClient().getBoardsByIdAndLabelsWithId(boardId,labelId,fields);
	}
	@Processor
	public BoardsByIdAndListsGetResponse getBoardsByIdAndLists(String boardId,@Optional String cards,@Optional String card_fields,@Optional String filter,@Optional String fields){
		return getClient().getBoardsByIdAndLists(boardId,cards,card_fields,filter,fields);
	}
	@Processor
	public BoardsByIdAndListsGetResponse getBoardsByIdAndListsWithFilter(String boardId,String filter){
		return getClient().getBoardsByIdAndListsWithFilter(boardId,filter);
	}
	@Processor
	public BoardMembersByBoardIdGetResponse getBoardMembersByBoardId(String boardId,@Optional String filter,@Optional String fields,@Optional Boolean activity){
		return getClient().getBoardMembersByBoardId(boardId,filter,fields,activity);
	}
	@Processor
	public BoardMembersByBoardIdGetResponse getBoardMembersByBoardIdWithFilter(String boardId,String filter){
		return getClient().getBoardMembersByBoardIdWithFilter(boardId,filter);
	}
	@Processor
	public BoardsByIdAndMembersByIdCardsGetResponse getBoardsByIdAndMembersByIdWithCards(String boardId,String memberId,@Optional String actions,@Optional String attachments,@Optional String attachment_fields,@Optional Boolean member,@Optional String member_fields,@Optional Boolean checkItemStates,@Optional String checkLists,@Optional Boolean boards,
			@Optional String board_fields,@Optional Boolean list,@Optional String list_fields,@Optional
			 String filter,@Optional String fields){
		return getClient().getBoardsByIdAndMembersByIdWithCards(boardId,memberId,actions, attachments, attachment_fields, member,member_fields,checkItemStates,checkLists,boards,
				 board_fields, list, list_fields, filter, fields);
	}
	@Processor
	public BoardMembersInvitedGetResponse getBoardMembersInvited(String boardId,@Optional String fields){
		return getClient().getBoardMembersInvited(boardId,fields);
	}
	@Processor
	public BoardMembersInvitedGetResponse getBoardMembersInvitedWithField(String boardId,String field){
		return getClient().getBoardMembersInvitedWithField(boardId,field);
	}
	@Processor
	public BoardsMembershipGetResponse getBoardMemberShips(String boardId,@Optional String filter,@Optional Boolean member,@Optional String member_fields){
		return getClient().getBoardMemberShips(boardId,filter,member,member_fields);
	}
	@Processor
	public BoardsMembershipGetResponse getBoardMemberShipsById(String boardId,String membershipId,
			@Optional Boolean member,@Optional String member_fields){
		return getClient().getBoardMemberShipsById(boardId,membershipId,member,member_fields);
	}
	@Processor
	public StatusResponse getBoardsWithMyPref(String boardId){
		return getClient().getBoardsWithMyPref(boardId);
	}
	@Processor
	public BoardssByIdAndOrganizationGetResponse getBoardsByIdAndOrganization(String boardId,@Optional String fields){
		return getClient().getBoardsByIdAndOrganization(boardId,fields);
	}
	@Processor
	public BoardssByIdAndOrganizationGetResponse getBoardsByIdAndOrganizationWithField(String boardId, String fields){
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
	  public StatusResponse postBoardsCalenderkeyGenerate(String boardId,BoardsCalendekeyGeneratePostRequest boardsCalenderkeyGenPostRequest) {
	    return getClient().postBoardsCalenderkeyGenerate(boardId,boardsCalenderkeyGenPostRequest);
	  }
	@Processor
	  public StatusResponse postBoardsChecklists(String boardId,BoardsChecklistPostRequest boardsChecklistPostRequest) {
	    return getClient().postBoardsChecklists(boardId,boardsChecklistPostRequest);
	  }
	@Processor
	  public StatusResponse postBoardsEmailkeyGeneration(String boardId,BoardsCalendekeyGeneratePostRequest boardsEmailkeyGenPostRequest) {
	    return getClient().postBoardsEmailkeyGeneration(boardId,boardsEmailkeyGenPostRequest);
	  }
	@Processor
	  public StatusResponse postBoardsByIdAndLabel(String boardId,BoardsByIdLabelPostRequest boardsIdLabelPostRequest) {
	    return getClient().postBoardsByIdAndLabel(boardId,boardsIdLabelPostRequest);
	  }
	@Processor
	  public StatusResponse postBoardsByAndList(String boardId,BoardsByIdListPostRequest boardsIdListPostRequest) {
	    return getClient().postBoardsByAndList(boardId,boardsIdListPostRequest);
	  }
	@Processor
	  public StatusResponse postBoardsMarkAsViewd(String boardId,BoardsCalendekeyGeneratePostRequest boardsMarkAsVieedPostReq ) {
	    return getClient().postBoardsMarkAsViewd(boardId,boardsMarkAsVieedPostReq);
	  }
	@Processor
	  public StatusResponse postBoardsPowerUps(String boardId,String value,BoardsPoweUpsPostRequest boardsByIdAndPoerUps) {
	    return getClient().postBoardsPowerUps(boardId,value,boardsByIdAndPoerUps);
	  }
	@Processor
	  public StatusResponse deleteMemberUnderBoardById(String boardId,String memberId) {
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
	public CardsByIdWithFieldGetResponse getCardsByIdWithField(String cardIdOrShortlink,String field){
		return getClient().getCardsByIdWithField(cardIdOrShortlink,field);
	}
	@Processor
	public CardsActionsByIdGetResponse getCardActionsById(String cardIdOrShortlink,@Optional Boolean entities,@Optional Boolean display,@Optional String filter,@Optional String fields,
			@Optional Integer limit,@Optional String format,@Optional String since,@Optional String before,@Optional String idModels,@Optional Boolean member,@Optional String member_fields,@Optional Boolean memberCreator,@Optional String memberCreator_fields){
		return getClient().getCardActionsById(cardIdOrShortlink, entities, display, filter,fields,limit,format,since,before,idModels,member,member_fields,memberCreator,memberCreator_fields);
	}
	@Processor
	public StatusResponse getCardsAttachments(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsAttachments(cardIdOrShortlink,fields);
	}
	@Processor
	public StatusResponse getCardsAttachmentsById(String cardIdOrShortlink,String idAttachment,@Optional String fields){
		return getClient().getCardsAttachmentsById(cardIdOrShortlink,idAttachment,fields);
	}
	@Processor
	public StatusResponse getBoardsUnderCarsById(String cardIdOrShortlink,@Optional String fields){
		return getClient().getBoardsUnderCarsById(cardIdOrShortlink,fields);
	}
	@Processor
	public StatusResponse getBoardsUnderCarsByIdWithField(String cardIdOrShortlink,String fields){
		return getClient().getBoardsUnderCarsByIdWithField(cardIdOrShortlink,fields);
	}
	@Processor
	public StatusResponse getCardsByIdWithCheckItemStates(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsByIdWithCheckItemStates(cardIdOrShortlink,fields);
	}
	@Processor
	public StatusResponse getCardsByIdWithCheckLists(String cardIdOrShortlink,@Optional String cards,@Optional String card_fields,@Optional String checkItems,@Optional String checkItem_fields,@Optional String filter,@Optional String fields){
		return getClient().getCardsByIdWithCheckLists(cardIdOrShortlink,cards,card_fields,checkItems,checkItem_fields,filter,fields);
	}
	@Processor
	public StatusResponse getCardsByIdWithList(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsByIdWithList(cardIdOrShortlink,fields);
	}
	@Processor
	public StatusResponse getCardsByIdWithListField(String cardIdOrShortlink,@Optional String field){
		return getClient().getCardsByIdWithListField(cardIdOrShortlink,field);
	}
	@Processor
	public StatusResponse getCardsMembersById(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsMembersById(cardIdOrShortlink,fields);
	}
	@Processor
	public StatusResponse getCardsMembersVotedById(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsMembersVotedById(cardIdOrShortlink,fields);
	}
	@Processor
	public StatusResponse getCardsStickers(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsStickers(cardIdOrShortlink,fields);
	}
	@Processor
	public StatusResponse getCardsStickersById(String cardIdOrShortlink,String idSticker,@Optional String fields){
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