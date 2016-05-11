package org.mule.modules.trello;

import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jackson.map.ObjectMapper;
import org.mule.api.annotations.param.Optional;
import org.mule.modules.spark.bean.MessagesPostResponse;
import org.mule.modules.trello.bean.ActionsByIdAndListGetResponse;
import org.mule.modules.trello.bean.ActionsByIdAndMemberCreaterGetResponse;
import org.mule.modules.trello.bean.ActionsByIdAndMemberGetResponse;
import org.mule.modules.trello.bean.ActionsByIdAndOrganizationGetResponse;
import org.mule.modules.trello.bean.ActionsByIdGetResponse;
import org.mule.modules.trello.bean.ActionsByIdPutRequest;
import org.mule.modules.trello.bean.ActionsByIdPutResponse;
import org.mule.modules.trello.bean.ActionsByIdWithDisplayGetResponse;
import org.mule.modules.trello.bean.ActionsByIdWithEntitiesGetResponse;
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
import org.mule.modules.trello.bean.BoardsCalendekeyGeneratePostRequest;
import org.mule.modules.trello.bean.BoardsChecklistPostRequest;
import org.mule.modules.trello.bean.BoardsMembershipGetResponse;
import org.mule.modules.trello.bean.BoardsPostRequest;
import org.mule.modules.trello.bean.BoardsPostResponse;
import org.mule.modules.trello.bean.BoardsPoweUpsPostRequest;
import org.mule.modules.trello.bean.BoardssByIdAndOrganizationGetResponse;
import org.mule.modules.trello.bean.CardsAcionCommentsByIdPostRequest;
import org.mule.modules.trello.bean.CardsActionsByIdGetResponse;
import org.mule.modules.trello.bean.CardsByIdGetResponse;
import org.mule.modules.trello.bean.CardsByIdPutRequest;
import org.mule.modules.trello.bean.CardsByIdPutResponse;
import org.mule.modules.trello.bean.CardsByIdWithFieldGetResponse;
import org.mule.modules.trello.bean.CardsCardsBoardIdPutRequest;
import org.mule.modules.trello.bean.CardsCardsIdAttachmentPutRequest;
import org.mule.modules.trello.bean.CardsCardsListPutRequest;
import org.mule.modules.trello.bean.CardsCheckListNamePutRequest;
import org.mule.modules.trello.bean.CardsCheckListNamePutResponse;
import org.mule.modules.trello.bean.CardsCheckListPositionPutRequest;
import org.mule.modules.trello.bean.CardsCheckListPositionPutResponse;
import org.mule.modules.trello.bean.CardsCheckListStatePutRequest;
import org.mule.modules.trello.bean.CardsCheckListStatePutResponse;
import org.mule.modules.trello.bean.CardsClosedPutRequest;
import org.mule.modules.trello.bean.CardsClosedPutResponse;
import org.mule.modules.trello.bean.CardsCommentsByIdPutRequest;
import org.mule.modules.trello.bean.CardsCommentsByIdPutResponse;
import org.mule.modules.trello.bean.CardsCurrentCheckListPutRequest;
import org.mule.modules.trello.bean.CardsCurrentCheckListPutResponse;
import org.mule.modules.trello.bean.CardsDescriptionPutRequest;
import org.mule.modules.trello.bean.CardsDuePutRequest;
import org.mule.modules.trello.bean.CardsMemberPutRequest;
import org.mule.modules.trello.bean.CardsNamePosRequest;
import org.mule.modules.trello.bean.CardsNamePutRequest;
import org.mule.modules.trello.bean.CardsPostRequest;
import org.mule.modules.trello.bean.CardsStickerPutRequest;
import org.mule.modules.trello.bean.CardsSubscribedPutRequest;
import org.mule.modules.trello.bean.StatusResponse;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class TrelloClient {

	private Client client;
	private WebResource apiResource;
	private TrelloConnector trelloConnector;
	private static final Logger log = Logger.getLogger(TrelloClient.class
			.getName());

	public TrelloConnector getTrelloConnector() {
		return trelloConnector;
	}

	public void setTrelloConnector(TrelloConnector trelloConnector) {
		this.trelloConnector = trelloConnector;
	}

	public TrelloClient(TrelloConnector trelloConnector) {
		setTrelloConnector(trelloConnector);
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,
				Boolean.TRUE);
		this.client = Client.create(clientConfig);
		this.apiResource = this.client.resource(getTrelloConnector()
				.getConfig().getUrl());
	}

	public ActionsByIdGetResponse getActionsById(String actionId,
			Boolean display, Boolean entities, String fields, Boolean member,
			String member_fields, Boolean memberCreator,
			String memberCreator_fields) {
		WebResource webResource = getApiResource().path("actions").path(
				actionId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (actionId != null) {
			queryParams.add("actionId", actionId);
		}
		if (display != null) {
			queryParams.add("display", String.valueOf(display));
		}
		if (entities != null) {
			queryParams.add("entities", String.valueOf(entities));
		}

		queryParams.add("fields", fields);

		if (member != null) {
			queryParams.add("member", String.valueOf(member));
		}
		if (memberCreator != null) {
			queryParams.add("memberCreator", String.valueOf(memberCreator));
		}
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdGetResponse) getData(webResource,
				ActionsByIdGetResponse.class);
	}

	public ActionsByIdGetResponse getActionsByIdAndField(String actionId,
			String field) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path(field);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (actionId != null) {
			queryParams.add("actionId", actionId);
		}
		queryParams.add("field", field);
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdGetResponse) getData(webResource,
				ActionsByIdGetResponse.class);
	}

	public ActionsByIdGetResponse getActionsByIdAndBoard(String actionId,
			@Optional String fields) {

		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("board");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (actionId != null) {
			queryParams.add("actionId", actionId);
		}
		if (fields != null) {
			queryParams.add("fields", fields);

		}
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdGetResponse) getData(webResource,
				ActionsByIdGetResponse.class);
	}

	public ActionsByIdGetResponse getActionsByIdAndBoardWithField(
			String actionId, String field) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("board").path(field);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (actionId != null) {
			queryParams.add("actionId", actionId);
		}
		queryParams.add("field", field);
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdGetResponse) getData(webResource,
				ActionsByIdGetResponse.class);
	}

	public ActionsByIdGetResponse getActionsByIdAndCard(String actionId,
			String fields) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("board").path(fields);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		if (fields != null) {
			queryParams.add("field", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdGetResponse) getData(webResource,
				ActionsByIdGetResponse.class);
	}

	public ActionsByIdGetResponse getActionsByIdAndCardWithField(
			String actionId, String field) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("board").path(field);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (actionId != null) {
			queryParams.add("actionId", actionId);
		}
		queryParams.add("field", field);
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdGetResponse) getData(webResource,
				ActionsByIdGetResponse.class);
	}

	public ActionsByIdWithDisplayGetResponse getActionsByIdWithDispaly(
			String actionId) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("display");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdWithDisplayGetResponse) getData(webResource,
				ActionsByIdWithDisplayGetResponse.class);
	}

	public ActionsByIdWithEntitiesGetResponse getActionsByIdWithEntities(
			String actionId) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("entities");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdWithEntitiesGetResponse) getData(webResource,
				ActionsByIdWithEntitiesGetResponse.class);
	}

	public ActionsByIdAndListGetResponse getActionsByIdAndList(String actionId,
			String fields) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("list").path(fields);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		if (fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdAndListGetResponse) getData(webResource,
				ActionsByIdAndListGetResponse.class);
	}

	public ActionsByIdAndListGetResponse getActionsByIdAndListWithField(
			String actionId, String field) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("list").path(field);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		queryParams.add("field", field);
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdAndListGetResponse) getData(webResource,
				ActionsByIdAndListGetResponse.class);
	}

	public ActionsByIdAndMemberGetResponse getActionsByIdAndMember(
			String actionId, String fields) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("member").path(fields);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		if (fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdAndMemberGetResponse) getData(webResource,
				ActionsByIdAndMemberGetResponse.class);
	}

	public ActionsByIdAndMemberGetResponse getActionsByIdAndMemberWithField(
			String actionId, String field) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("member").path(field);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		queryParams.add("field", field);
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdAndMemberGetResponse) getData(webResource,
				ActionsByIdAndMemberGetResponse.class);
	}

	public ActionsByIdAndMemberCreaterGetResponse getActionsByIdAndMemberCreater(
			String actionId, String fields) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("memberCreator").path(fields);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		if (fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdAndMemberCreaterGetResponse) getData(webResource,
				ActionsByIdAndMemberCreaterGetResponse.class);
	}

	public ActionsByIdAndMemberCreaterGetResponse getActionsByIdAndMemberCreaterWithField(
			String actionId, String field) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("memberCreator").path(field);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		queryParams.add("field", field);
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdAndMemberCreaterGetResponse) getData(webResource,
				ActionsByIdAndMemberCreaterGetResponse.class);
	}

	public ActionsByIdAndOrganizationGetResponse getActionsByIdAndOrganization(
			String actionId, String fields) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("organization").path(fields);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		if (fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdAndOrganizationGetResponse) getData(webResource,
				ActionsByIdAndOrganizationGetResponse.class);
	}

	public ActionsByIdAndOrganizationGetResponse getActionsByIdAndOrganizationWithField(
			String actionId, String field) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("organization").path(field);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		queryParams.add("field", field);
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdAndOrganizationGetResponse) getData(webResource,
				ActionsByIdAndOrganizationGetResponse.class);
	}

	public ActionsByIdPutResponse putReadActionsById(String actionId,
			String text, ActionsByIdPutRequest actionIdPutRequest) {
		WebResource webResource = getApiResource().path("actions").path(
				actionId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		if (text != null) {
			queryParams.add("text", text);
		}
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdPutResponse) putData(actionIdPutRequest,
				webResource, ActionsByIdPutResponse.class);
	}

	public ActionsByIdPutResponse putWriteActionsById(String actionId,
			String value, ActionsByIdPutRequest actionIdPutRequest) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("text");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		queryParams.add("value", value);
		webResource = webResource.queryParams(queryParams);
		return (ActionsByIdPutResponse) putData(actionIdPutRequest,
				webResource, ActionsByIdPutResponse.class);
	}

	public StatusResponse deleteActionsById(String actionId) {
		WebResource webResource = getApiResource().path("actions").path(
				actionId);
		return (StatusResponse) deleteData(webResource);
	}

	public BoardsByIdGetResponse getBoardsById(String boardId, String actions,
			Boolean actions_entities, Boolean actions_display,
			String actions_format, String actions_since, Integer actions_limit,
			String action_fields, Boolean action_member,
			String action_member_fields, Boolean action_memberCreator,
			String action_memberCreator_fields, String cards,
			String card_fields, String card_attachments,
			String card_attachment_fields, String card_checklists,
			Boolean card_stickers, String boardStars, String labels,
			String label_fields, Integer labels_limit, String lists,
			String list_fields, String memberships, Boolean memberships_member,
			String memberships_member_fields, String members,
			String member_fields, String membersInvited,
			String membersInvited_fields, String checklists,
			String checklist_fields, Boolean organization,
			String organization_fields, String organization_memberships,
			Boolean myPrefs, Boolean tags, String fields) {

		WebResource webResource = getApiResource().path("boards").path(boardId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("boardId", boardId);
		if (actions != null) {
			queryParams.add("actions", actions);
		}
		if (actions_since != null) {
			queryParams.add("actions_since", actions_since);
		}
		if (actions_limit != null) {
			queryParams.add("actions_limit", String.valueOf(actions_limit));
		}
		if (action_fields != null) {
			queryParams.add("action_fields", action_fields);
		}
		if (action_member != null) {
			queryParams.add("action_member", String.valueOf(action_member));
		}
		if (action_member_fields != null) {
			queryParams.add("action_member_fields", action_member_fields);
		}
		if (action_memberCreator != null) {
			queryParams.add("action_memberCreator",
					String.valueOf(action_memberCreator));
		}
		if (action_memberCreator_fields != null) {
			queryParams.add("action_memberCreator_fields",
					action_memberCreator_fields);
		}
		if (cards != null) {
			queryParams.add("cards", cards);
		}
		if (card_fields != null) {
			queryParams.add("card_fields", card_fields);
		}
		if (card_attachments != null) {
			queryParams.add("card_attachments", card_attachments);
		}
		if (card_attachment_fields != null) {
			queryParams.add("card_attachment_fields", card_attachment_fields);
		}
		if (card_checklists != null) {
			queryParams.add("card_checklists", card_checklists);
		}
		if (card_stickers != null) {
			queryParams.add("card_stickers", String.valueOf(card_stickers));
		}
		if (boardStars != null) {
			queryParams.add("boardStars", boardStars);
		}
		if (labels != null) {
			queryParams.add("labels", labels);
		}
		if (label_fields != null) {
			queryParams.add("label_fields", label_fields);
		}
		if (labels_limit != null) {
			queryParams.add("labels_limit", String.valueOf(labels_limit));
		}
		if (lists != null) {
			queryParams.add("lists", lists);
		}
		if (list_fields != null) {
			queryParams.add("list_fields", list_fields);
		}
		if (memberships != null) {
			queryParams.add("memberships", memberships);
		}
		if (memberships_member != null) {
			queryParams.add("memberships_member",
					String.valueOf(memberships_member));
		}
		if (memberships_member_fields != null) {
			queryParams.add("memberships_member_fields",
					memberships_member_fields);
		}
		if (members != null) {
			queryParams.add("members", members);
		}
		if (member_fields != null) {
			queryParams.add("member_fields", member_fields);
		}
		if (membersInvited != null) {
			queryParams.add("membersInvited", membersInvited);
		}
		if (membersInvited_fields != null) {
			queryParams.add("membersInvited_fields", membersInvited_fields);
		}
		if (checklists != null) {
			queryParams.add("checklists", checklists);
		}
		if (checklist_fields != null) {
			queryParams.add("checklist_fields", checklist_fields);
		}
		if (organization != null) {
			queryParams.add("organization", String.valueOf(organization));
		}
		if (organization_fields != null) {
			queryParams.add("organization_fields", organization_fields);
		}
		if (organization_memberships != null) {
			queryParams.add("organization_memberships",
					organization_memberships);
		}
		if (myPrefs != null) {
			queryParams.add("myPrefs", String.valueOf(myPrefs));
		}
		if (tags != null) {
			queryParams.add("tags", String.valueOf(tags));
		}
		if (fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdGetResponse) getData(webResource,
				BoardsByIdGetResponse.class);
	}

	public BoardsByIdAndActionsGetResponse getBoardsByIdAndActions(
			String boardId, String entities, Boolean display, String filter,
			String fields, Integer limit, String format, String since,
			String before, Integer page, String idModels, Boolean member,
			String member_fields, Boolean memberCreator,
			String memberCreator_fields) {

		WebResource webResource = getApiResource().path("boards").path(boardId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("boardId", boardId);
		if (entities != null) {
			queryParams.add("entities", entities);
		}
		if (display != null) {
			queryParams.add("display", String.valueOf(display));
		}
		if (filter != null) {
			queryParams.add("filter", filter);
		}
		if (limit != null) {
			queryParams.add("limit", String.valueOf(limit));
		}
		if (format != null) {
			queryParams.add("format", format);
		}
		if (since != null) {
			queryParams.add("since", since);
		}
		if (since != null) {
			queryParams.add("since", since);
		}
		if (page != null) {
			queryParams.add("page", String.valueOf(page));
		}
		if (idModels != null) {
			queryParams.add("idModels", idModels);
		}
		if (member != null) {
			queryParams.add("member", String.valueOf(member));
		}
		if (member_fields != null) {
			queryParams.add("member_fields", member_fields);
		}
		if (memberCreator != null) {
			queryParams.add("memberCreator", String.valueOf(memberCreator));
		}
		if (memberCreator_fields != null) {
			queryParams.add("memberCreator_fields", memberCreator_fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndActionsGetResponse) getData(webResource,
				BoardsByIdAndActionsGetResponse.class);
	}

	public BoardsByIdAndBoardStarsGetResponse getBoardsByIdAndBoardStars(
			String boardId, String filters) {
		WebResource webResource = getApiResource().path("boards").path(boardId)
				.path("boardStars");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("boardId", boardId);
		if (filters != null) {
			queryParams.add("filters", filters);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndBoardStarsGetResponse) getData(webResource,
				BoardsByIdAndBoardStarsGetResponse.class);
	}

	public BoardsByIdAndCardsGetResponse getBoardsByIdAndCards(String boardId,
			String filters) {
		WebResource webResource = getApiResource().path("boards").path(boardId)
				.path("cards");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("boardId", boardId);
		if (filters != null) {
			queryParams.add("filters", filters);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndCardsGetResponse) getData(webResource,
				BoardsByIdAndCardsGetResponse.class);
	}

	public BoardsByIdAndFieldGetResponse getBoardsByIdAndField(String boardId,
			String field) {
		WebResource webResource = getApiResource().path("boards").path(boardId)
				.path(field);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("boardId", boardId);
		queryParams.add("field", field);
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndFieldGetResponse) getData(webResource,
				BoardsByIdAndFieldGetResponse.class);
	}

	public BoardsByIdAndCardsGetResponse getBoardsByIdAndCards(String boardId,
			String actions, String attachments, String attachment_fields,
			Boolean stickers, Boolean members, String member_fields,
			String checklists, String since, String before, String filter,
			String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId)
				.path(fields);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (attachments != null) {
			queryParams.add("attachments", attachments);
		}
		if (attachment_fields != null) {
			queryParams.add("attachment_fields", attachment_fields);
		}
		if (stickers != null) {
			queryParams.add("stickers", String.valueOf(stickers));
		}
		if (members != null) {
			queryParams.add("members", String.valueOf(members));
		}
		if (member_fields != null) {
			queryParams.add("member_fields", member_fields);
		}
		if (checklists != null) {
			queryParams.add("checklists", checklists);
		}
		if (since != null) {
			queryParams.add("since", since);
		}
		if (before != null) {
			queryParams.add("before", before);
		}
		if (filter != null) {
			queryParams.add("filter", filter);
		}
		if (fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndCardsGetResponse) getData(webResource,
				BoardsByIdAndCardsGetResponse.class);
	}

	public BoardsByIdAndCardsGetResponse getBoardsByIdAndCardsWithFilter(
			String boardId, String filter) {
		WebResource webResource = getApiResource().path("boards").path(boardId)
				.path(filter);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(filter!=null){
			queryParams.add("filter", filter);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndCardsGetResponse) getData(webResource,
				BoardsByIdAndCardsGetResponse.class);
	}

	public BoardsByIdAndActionsGetResponse getBoardsByIdAndCardsWithIdCards(
			String boardId, String idCard, String attachments,
			String attachment_fields, String actions, Boolean actions_entities,
			Boolean actions_display, Integer actions_limit,
			String action_fields, String action_memberCreator_fields,
			Boolean members, String member_fields, Boolean checkItemStates,
			String checkItemState_fields, Boolean labels, String checklists,
			String checklist_fields, String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId)
				.path("cards").path(idCard);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(idCard!=null){
			queryParams.add("idCard", idCard);
		}
		if (attachments != null) {
			queryParams.add("attachments", attachments);
		}
		if (actions != null) {
			queryParams.add("actions", actions);
		}
		if (actions_entities != null) {
			queryParams.add("actions_entities",
					String.valueOf(actions_entities));
		}
		if (actions_display != null) {
			queryParams.add("actions_display", String.valueOf(actions_display));
		}
		if (actions_limit != null) {
			queryParams.add("actions_limit", String.valueOf(actions_limit));
		}
		if (action_fields != null) {
			queryParams.add("action_fields", action_fields);
		}
		if (action_memberCreator_fields != null) {
			queryParams.add("action_memberCreator_fields",
					action_memberCreator_fields);
		}
		if (members != null) {
			queryParams.add("members", String.valueOf(members));
		}
		if (member_fields != null) {
			queryParams.add("member_fields", member_fields);
		}
		if (checkItemStates != null) {
			queryParams.add("checkItemStates", String.valueOf(checkItemStates));
		}
		if (checkItemState_fields != null) {
			queryParams.add("checkItemState_fields", checkItemState_fields);
		}
		if (labels != null) {
			queryParams.add("labels", String.valueOf(labels));
		}

		if (checklists != null) {
			queryParams.add("checklists", checklists);
		}
		if (checklist_fields != null) {
			queryParams.add("checklist_fields", checklist_fields);
		}
		if (attachments != null) {
			queryParams.add("attachments", attachments);
		}
		if (fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndActionsGetResponse) getData(webResource,
				BoardsByIdAndActionsGetResponse.class);
	}

	public BoardsByIdAndCheckListsGetResponse getBoardsByIdAndCheckLists(
			String boardId, String cards, String card_fields,
			String check_Items, String checkItem_fields, String filter,
			String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId)
				.path("checklists");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(cards!=null){
			queryParams.add("cards", cards);
		}
		if (card_fields != null) {
			queryParams.add("card_fields", card_fields);
		}
		if (check_Items != null) {
			queryParams.add("actions", check_Items);
		}
		if (checkItem_fields != null) {
			queryParams.add("checkItem_fields", checkItem_fields);
		}
		if (filter != null) {
			queryParams.add("filter", filter);
		}
		if (checkItem_fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndCheckListsGetResponse) getData(webResource,
				BoardsByIdAndCheckListsGetResponse.class);
	}

	public BoardsByIdAndDeltasGetResponse getBoardsByIdAndDeltas(
			String boardId, String tags, String ixLastUpdate) {

		WebResource webResource = getApiResource().path("boards").path(boardId).path("deltas");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("tags", tags);
		queryParams.add("ixLastUpdate", ixLastUpdate);
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndDeltasGetResponse) getData(webResource,
				BoardsByIdAndDeltasGetResponse.class);
	}
	
	public BoardsByIdAndLabelsGetResponse getBoardsByIdAndLimit(String boardId,
			String fields, String limit) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("labels");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		if(limit!=null){
			queryParams.add("limit", limit);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndLabelsGetResponse) getData(webResource,
				BoardsByIdAndLabelsGetResponse.class);
	}

	public BoardsByIdAndLabelsGetResponse getBoardsByIdAndLabelsWithId(
			String boardId, String labelId, String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("labels").path(labelId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndLabelsGetResponse) getData(webResource,
				BoardsByIdAndLabelsGetResponse.class);
	}
	public BoardsByIdAndListsGetResponse getBoardsByIdAndLists(String boardId,
			String cards, String card_fields, String filter, String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("lists");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(cards!=null){
			queryParams.add("cards", cards);
		}
		if(card_fields!=null){
			queryParams.add("card_fields", card_fields);
		}
		if(filter!=null){
			queryParams.add("filter", filter);
		}
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndListsGetResponse) getData(webResource,
				BoardsByIdAndListsGetResponse.class);
	}
	public BoardsByIdAndListsGetResponse getBoardsByIdAndListsWithFilter(
			String boardId, String filter) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("lists").path(filter);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndListsGetResponse) getData(webResource,
				BoardsByIdAndListsGetResponse.class);
	}
	public BoardMembersByBoardIdGetResponse getBoardMembersByBoardId(String boardId, String filter,String fields,Boolean activity) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("members");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(filter!=null){
			queryParams.add("filter", filter);
		}
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		if(activity!=null){
			queryParams.add("activity", String.valueOf(activity));
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardMembersByBoardIdGetResponse) getData(webResource,
				BoardMembersByBoardIdGetResponse.class);
	}
	public BoardMembersByBoardIdGetResponse getBoardMembersByBoardIdWithFilter(
			String boardId, String filter) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("members").path(filter);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = webResource.queryParams(queryParams);
		return (BoardMembersByBoardIdGetResponse) getData(webResource,
				BoardMembersByBoardIdGetResponse.class);
	}
	public BoardsByIdAndMembersByIdCardsGetResponse getBoardsByIdAndMembersByIdWithCards(
			String boardId, String memberId, String actions,
			String attachments, String attachment_fields, Boolean member,
			String member_fields, Boolean checkItemStates, String checkLists,
			Boolean boards, String board_fields, Boolean list,
			String list_fields, String filter, String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("members").path(memberId).path("cards");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(actions!=null){
			queryParams.add("actions", actions);
		}
		if(attachments!=null){
			queryParams.add("attachments", attachments);
		}
		if(attachment_fields!=null){
			queryParams.add("attachment_fields", attachment_fields);
		}
		if(member!=null){
			queryParams.add("member", String.valueOf(member));
		}
		if(member_fields!=null){
			queryParams.add("member_fields", member_fields);
		}
		if(checkItemStates!=null){
			queryParams.add("checkItemStates", String.valueOf(checkItemStates));
		}
		if(checkLists!=null){
			queryParams.add("checkLists", checkLists);
		}
		if(boards!=null){
			queryParams.add("boards", String.valueOf(boards));
		}
		if(board_fields!=null){
			queryParams.add("board_fields", board_fields);
		}
		if(list!=null){
			queryParams.add("list", String.valueOf(list));
		}
		if(list_fields!=null){
			queryParams.add("list_fields", list_fields);
		}
		if(filter!=null){
			queryParams.add("filter", filter);
		}
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndMembersByIdCardsGetResponse) getData(webResource,
				BoardsByIdAndMembersByIdCardsGetResponse.class);
	}
	public BoardMembersInvitedGetResponse getBoardMembersInvited(
			String boardId, String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("membersInvited");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardMembersInvitedGetResponse) getData(webResource,
				BoardMembersInvitedGetResponse.class);
	}

	public BoardMembersInvitedGetResponse getBoardMembersInvitedWithField(
			String boardId, String field) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("membersInvited").path(field);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = webResource.queryParams(queryParams);
		return (BoardMembersInvitedGetResponse) getData(webResource,
				BoardMembersInvitedGetResponse.class);
	}
	public BoardsMembershipGetResponse getBoardMemberShips(String boardId,String filter,
			Boolean member, String member_fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("memberships");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(filter!=null){
			queryParams.add("filter", filter);
		}
		if(member!=null){
			queryParams.add("member", String.valueOf(member));
		}
		if(member_fields!=null){
			queryParams.add("member_fields", member_fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardsMembershipGetResponse) getData(webResource,
				BoardsMembershipGetResponse.class);
	}
	public BoardsMembershipGetResponse getBoardMemberShipsById(String boardId,
			String membershipId, Boolean member, String member_fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("memberships").path(membershipId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(member!=null){
			queryParams.add("member", String.valueOf(member));
		}
		if(member_fields!=null){
			queryParams.add("member_fields", member_fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardsMembershipGetResponse) getData(webResource,
				BoardsMembershipGetResponse.class);
	}
	public StatusResponse getBoardsWithMyPref(String boardId) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("myPrefs");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = webResource.queryParams(queryParams);
		return (StatusResponse) getData(webResource,StatusResponse.class);
	}
	public BoardssByIdAndOrganizationGetResponse getBoardsByIdAndOrganization(
			String boardId, String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("organization");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardssByIdAndOrganizationGetResponse) getData(webResource,
				BoardssByIdAndOrganizationGetResponse.class);
	}
	public BoardssByIdAndOrganizationGetResponse getBoardsByIdAndOrganizationWithField(
			String boardId, String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("organization").path(fields);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = webResource.queryParams(queryParams);
		return (BoardssByIdAndOrganizationGetResponse) getData(webResource,
				BoardssByIdAndOrganizationGetResponse.class);
	}
/*	public BoardsByIdPutResponse putBoardsByIdAndClosed(String boardId,
			String value) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("closed");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = webResource.queryParams(queryParams);
		if(value!=null){
			queryParams.add("value", value);
		}
		
	}*/
	public BoardsPostResponse postBoards(BoardsPostRequest boardssPostRequest) {
		 WebResource webResource = getApiResource().path("boards");
		    return (BoardsPostResponse) postData(boardssPostRequest, webResource,
		    		BoardsPostResponse.class);
	}
	public StatusResponse postBoardsCalenderkeyGenerate(String boardId,	BoardsCalendekeyGeneratePostRequest boardsCalenderkeyGenPostRequest) {
		 WebResource webResource = getApiResource().path("boards").path(boardId).path("calendarKey").path("generate");
		 return (StatusResponse) postData(boardsCalenderkeyGenPostRequest, webResource,StatusResponse.class);
	}
	public StatusResponse postBoardsChecklists(String boardId, String name,
			BoardsChecklistPostRequest boardsChecklistPostRequest) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("checklists");
		 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		 if(name!=null){
			 queryParams.add("name", name);
		 }
		 webResource = webResource.queryParams(queryParams);
	    return (StatusResponse) postData(boardsChecklistPostRequest, webResource,StatusResponse.class);

	}
	public StatusResponse postBoardsEmailkeyGeneration(String boardId,
			BoardsCalendekeyGeneratePostRequest boardsEmailkeyGenPostRequest) {
		 WebResource webResource = getApiResource().path("boards").path(boardId).path("emailKey").path("generate");
		    return (StatusResponse) postData(boardsEmailkeyGenPostRequest, webResource,StatusResponse.class);
	}
	public StatusResponse postBoardsByAndLabel(String boardId, String name,
			String color, BoardsByIdLabelPostRequest boardsIdLabelPostRequest) {
		 WebResource webResource = getApiResource().path("boards").path(boardId).path("labels");
		 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		 if(name!=null){
			 queryParams.add("name", name);
		 }
		 if(color!=null){
			 queryParams.add("color", color);

		}
		
		
		 webResource = webResource.queryParams(queryParams);
		    return (StatusResponse) postData(boardsIdLabelPostRequest, webResource,StatusResponse.class);
	}
	public StatusResponse postBoardsByAndList(String boardId, String name,
			String pos, BoardsByIdListPostRequest boardsIdListPostRequest) {
		 WebResource webResource = getApiResource().path("boards").path(boardId).path("lists");
		 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(name!=null){
			 queryParams.add("name", name);
		}
		if(pos!=null){
			 queryParams.add("pos", pos);
		}
		
		 webResource = webResource.queryParams(queryParams);
		    return (StatusResponse) postData(boardsIdListPostRequest, webResource,StatusResponse.class);
	}
	public StatusResponse postBoardsMarkAsViewd(String boardId,
			BoardsCalendekeyGeneratePostRequest boardsMarkAsVieedPostReq) {
		 WebResource webResource = getApiResource().path("boards").path(boardId).path("markAsViewed");
		    return (StatusResponse) postData(boardsMarkAsVieedPostReq, webResource,StatusResponse.class);
	}
	public StatusResponse postBoardsPowerUps(String boardId, String value,
			BoardsPoweUpsPostRequest boardsByIdAndPoerUps) {
		 WebResource webResource = getApiResource().path("boards").path(boardId).path("powerUps");
		 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
			if(value!=null){
				 queryParams.add("value", value);
			}
			 webResource = webResource.queryParams(queryParams);
		    return (StatusResponse) postData(boardsByIdAndPoerUps, webResource,StatusResponse.class);
	}
	public StatusResponse deleteMemberUnderBoardById(String boardId,String memberId) {
		 WebResource webResource = getApiResource().path("boards").path(boardId).path("members").path(memberId);
		    return (StatusResponse) deleteData(webResource);
	}
	public StatusResponse deletePowerUpsUnderBoardById(String boardId,String powerUp) {
		 WebResource webResource = getApiResource().path("boards").path(boardId).path("poweUps").path(powerUp);
		    return (StatusResponse) deleteData(webResource);
	}
	
	//Cards Client Methods
	public CardsByIdGetResponse getCardsById(String cardIdOrShortlink, String actions,
			Boolean actions_entities, Boolean actions_display,
			Integer actions_limit, String action_fields,
			String action_memberCreator_fields, String attachments,
			String attachment_fields, Boolean members, String member_fields,
			Boolean membersVoted, String memberVoted_fields,
			Boolean checkItemStates, String checkItemState_fields,
			String checklists, String checklist_fields, Boolean board,
			String board_fields, Boolean list, String list_fields,
			Boolean stickers, String sticker_fields, String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(actions!=null){
			queryParams.add("actions", actions);
		}
		if(actions_entities!=null){
			queryParams.add("actions_entities", String.valueOf(actions_entities));
		}
		if(actions_display!=null){
			queryParams.add("actions_display", String.valueOf(actions_display));
		}
		if(actions_limit!=null){
			queryParams.add("actions_limit", String.valueOf(actions_limit));
		}
		if(action_fields!=null){
			queryParams.add("action_fields", action_fields);
		}
		if(action_memberCreator_fields!=null){
			queryParams.add("action_memberCreator_fields", action_memberCreator_fields);
		}
		if(attachments!=null){
			queryParams.add("attachments", attachments);
		}
		if(attachment_fields!=null){
			queryParams.add("attachment_fields", attachment_fields);
		}
		if(members!=null){
			queryParams.add("members", String.valueOf(members));
		}
		if(member_fields!=null){
			queryParams.add("member_fields", member_fields);
		}
		if(membersVoted!=null){
			queryParams.add("membersVoted", String.valueOf(membersVoted));
		}
		
		if(memberVoted_fields!=null){
			queryParams.add("memberVoted_fields", memberVoted_fields);
		}
		if(checkItemStates!=null){
			queryParams.add("checkItemStates", String.valueOf(checkItemStates));
		}
		if(checkItemState_fields!=null){
			queryParams.add("checkItemState_fields", checkItemState_fields);
		}
		
		if(checklists!=null){
			queryParams.add("checklists", checklists);
		}
		if(checklist_fields!=null){
			queryParams.add("checklist_fields", checklist_fields);
		}
		
		if(board!=null){
			queryParams.add("board", String.valueOf(board));
		}
		if(board_fields!=null){
			queryParams.add("board_fields", board_fields);
		}
		if(list!=null){
			queryParams.add("list", String.valueOf(list));
		}
		
		if(list_fields!=null){
			queryParams.add("list_fields", list_fields);
		}
		if(stickers!=null){
			queryParams.add("stickers", String.valueOf(stickers));
		}
		if(sticker_fields!=null){
			queryParams.add("sticker_fields", sticker_fields);
		}
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (CardsByIdGetResponse) getData(webResource,
				CardsByIdGetResponse.class);
	}

	public CardsByIdWithFieldGetResponse getCardsByIdWithField(
			String cardIdOrShortlink, String field) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path(field);
		return (CardsByIdWithFieldGetResponse) getData(webResource,
				CardsByIdWithFieldGetResponse.class);
	}
	public CardsActionsByIdGetResponse getCardActionsById(
			String cardIdOrShortlink, Boolean entities, Boolean display,
			String filter, String fields, Integer limit, String format,
			String since, String before, String idModels, Boolean member,
			String member_fields, Boolean memberCreator,
			String memberCreator_fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("actions");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(entities!=null){
			queryParams.add("entities", String.valueOf(entities));
		}
		if(display!=null){
			queryParams.add("display", String.valueOf(display));
		}
		if(filter!=null){
			queryParams.add("filter", filter);
		}
		if(fields!=null){
			queryParams.add("fields",fields);
		}
		if(limit!=null){
			queryParams.add("limit", String.valueOf(limit));
		}
		if(since!=null){
			queryParams.add("since", since);
		}
		if(before!=null){
			queryParams.add("before",before);
		}
		if(idModels!=null){
			queryParams.add("idModels",idModels);
		}
		if(member!=null){
			queryParams.add("member", String.valueOf(member));
		}
		
		if(member_fields!=null){
			queryParams.add("member_fields", member_fields);
		}
		if(memberCreator!=null){
			queryParams.add("memberCreator", String.valueOf(memberCreator));
		}
		
		if(memberCreator_fields!=null){
			queryParams.add("memberCreator_fields", memberCreator_fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (CardsActionsByIdGetResponse) getData(webResource,CardsActionsByIdGetResponse.class);
	}
	public StatusResponse getCardsAttachments(String cardIdOrShortlink,	String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("attachments");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("entities", String.valueOf(fields));
		}
		webResource = webResource.queryParams(queryParams);
		return (StatusResponse) getData(webResource,StatusResponse.class);
	}
	public StatusResponse getCardsAttachmentsById(String cardIdOrShortlink,
			String idAttachment, String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("attachments").path(idAttachment);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("entities", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (StatusResponse) getData(webResource,StatusResponse.class);
	}
	public StatusResponse getBoardsUnderCarsById(String cardIdOrShortlink,
			String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("attachments").path("board");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("entities", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (StatusResponse) getData(webResource,StatusResponse.class);
	}
	public StatusResponse getBoardsUnderCarsByIdWithField(
			String cardIdOrShortlink, String fields) {
			WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("attachments").path("board").path(fields);
			return (StatusResponse) getData(webResource,StatusResponse.class);
	}
	public StatusResponse getCardsByIdWithCheckItemStates(
			String cardIdOrShortlink, String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("checkItemStates");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("entities", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (StatusResponse) getData(webResource,StatusResponse.class);
	}
	public StatusResponse getCardsByIdWithCheckLists(String cardIdOrShortlink,
			String cards, String card_fields, String checkItems,
			String checkItem_fields, String filter, String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("checklists");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(cards!=null){
			queryParams.add("cards", cards);
		}
		if(card_fields!=null){
			queryParams.add("card_fields", card_fields);
		}
		if(checkItems!=null){
			queryParams.add("checkItems",checkItems);
		}
		if(checkItem_fields!=null){
			queryParams.add("checkItem_fields", checkItem_fields);
		}
		if(filter!=null){
			queryParams.add("filter",filter);
		}
		if(fields!=null){
			queryParams.add("entities", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (StatusResponse) getData(webResource,StatusResponse.class);
	}
	public StatusResponse getCardsByIdWithList(String cardIdOrShortlink,
			String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("list");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (StatusResponse) getData(webResource,StatusResponse.class);
	}
	public StatusResponse getCardsByIdWithListField(String cardIdOrShortlink,
			String field) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("list").path(field);
		return (StatusResponse) getData(webResource,StatusResponse.class);
	}
	public StatusResponse getCardsMembersById(String cardIdOrShortlink,
			String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("members");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields",fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (StatusResponse) getData(webResource,StatusResponse.class);
	}
	public StatusResponse getCardsMembersVotedById(String cardIdOrShortlink,
			String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("membersVoted");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields",fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (StatusResponse) getData(webResource,StatusResponse.class);
	}
	public StatusResponse getCardsStickers(String cardIdOrShortlink,
			String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("stickers");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields",fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (StatusResponse) getData(webResource,StatusResponse.class);
	}
	public StatusResponse getCardsStickersById(String cardIdOrShortlink,String idSticker, String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("stickers").path(idSticker);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields",fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (StatusResponse) getData(webResource,StatusResponse.class);
	}
	//PUT Methods for Card
	
	public String putCardsById(String cardIdOrShortlink,CardsByIdPutRequest membershipsIdPutRequest) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink);
	    return (String) putData(membershipsIdPutRequest, webResource,CardsByIdPutResponse.class);
	}
	public String putCommentsOnActionsById(String cardIdOrShortlink,String idAction,CardsCommentsByIdPutRequest membershipsIdPutRequest) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("actions").path(idAction).path("comments");
		
	    return (String) putData(membershipsIdPutRequest, webResource,CardsCommentsByIdPutResponse.class);
	}
	public String updatecheckItemNameOnCards(String cardIdOrShortlink,String idChecklist, String idCheckItem,
			CardsCheckListNamePutRequest udatecheckItemNamePostRequest) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("checklist").path(idChecklist).path("checkItem").path(idCheckItem).path("name");
	    return (String) putData(udatecheckItemNamePostRequest, webResource,CardsCheckListNamePutResponse.class);
	} 
	public String updatecheckItePositionOnCards(String cardIdOrShortlink,
			String idChecklist, String idCheckItem,
			CardsCheckListPositionPutRequest udatecheckItemPosPostRequest) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("checklist").path(idChecklist).path("checkItem").path(idCheckItem).path("pos");
	    return (String) putData(udatecheckItemPosPostRequest, webResource,CardsCheckListPositionPutResponse.class);
	}
	public String updatecheckIteStateOnCards(String cardIdOrShortlink,
			String idChecklist, String idCheckItem,	CardsCheckListStatePutRequest udatecheckItemPosPostRequest) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("checklist").path(idChecklist).path("checkItem").path(idCheckItem).path("state");
	    return (String) putData(udatecheckItemPosPostRequest, webResource,CardsCheckListStatePutResponse.class);
	}
	public String updateCurrentcheckListOnCards(
			String cardIdOrShortlink,
			String idChecklistCurrent,
			String idCheckItem,
			CardsCurrentCheckListPutRequest updateCurrentcheckListyIdPosPostRequest) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("checklist").path(idChecklistCurrent).path("checkItem").path(idCheckItem);
	    return (String) putData(updateCurrentcheckListyIdPosPostRequest, webResource,String.class);
	}
	public String updateClosedCardsById(String cardIdOrShortlink,
			CardsClosedPutRequest updateClosedCardsById) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("closed");
	    return (String) putData(updateClosedCardsById, webResource,String.class);
	}
	public String updateCardsDescById(String cardIdOrShortlink,CardsDescriptionPutRequest updateCardsDescById) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("desc");
	    return (String) putData(updateCardsDescById, webResource,String.class);
	}
	public String updateCardsDueById(String cardIdOrShortlink,
			CardsDuePutRequest updateCardsDueById) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("due");
	    return (String) putData(updateCardsDueById, webResource,String.class);
	}
	public String updateCardsIdAttachmentById(String cardIdOrShortlink,
			CardsCardsIdAttachmentPutRequest updateCardsidAttachmentById) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("idAttachmentCover");
	    return (String) putData(updateCardsidAttachmentById, webResource,String.class);
	}
	public String updateCardsBoardIdById(String cardIdOrShortlink,
			CardsCardsBoardIdPutRequest updateCardsBoardIdPutReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("idBoard");
	    return (String) putData(updateCardsBoardIdPutReq, webResource,String.class);
	}
	public String updateCardsListIdById(String cardIdOrShortlink,
			CardsCardsListPutRequest updateCardsListIdPutReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("idList");
	    return (String) putData(updateCardsListIdPutReq, webResource,String.class);
	}
	public String updateCardMemberById(String cardIdOrShortlink,
			CardsMemberPutRequest updateCardMemberPutReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("idMembers");
	    return (String) putData(updateCardMemberPutReq, webResource,String.class);
	}
	public String updateCardNameById(String cardIdOrShortlink,
			CardsNamePutRequest updateCardsNamePutReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("name");
	    return (String) putData(updateCardsNamePutReq, webResource,String.class);
		}
	public String updateCardPosById(String cardIdOrShortlink,
			CardsNamePosRequest updateCardsPosPutReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("pos");
	    return (String) putData(updateCardsPosPutReq, webResource,String.class);
		}
	public String updateCardStickersById(String cardIdOrShortlink,String idSticker,
			CardsStickerPutRequest updateCardsStickerPutReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("stickers").path(idSticker);
	    return (String) putData(updateCardsStickerPutReq, webResource,String.class);
	}
	public String readSubsribedCards(String cardIdOrShortlink,
			CardsSubscribedPutRequest readSubscribedCarsdsPutReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("subscribed");
	    return (String) putData(readSubscribedCarsdsPutReq, webResource,String.class);
		}
	public String postCards(CardsPostRequest cardsPostReq) {
		WebResource webResource = getApiResource().path("cards");
	    return (String) postData(cardsPostReq, webResource,String.class);
	}
	public String postCardsAcionComments(
			CardsAcionCommentsByIdPostRequest cardsActionCommentsPostReq) {
		 WebResource webResource = getApiResource().path("messages");
		    return (String) postData(cardsActionCommentsPostReq,
		      webResource, String.class);
	}
	
	
	
	
	
	
	
	
	
	private Object getData(WebResource webResource, Class<?> returnClass) {

		WebResource.Builder builder = addHeader(webResource);

		ClientResponse clientResponse = builder.get(ClientResponse.class);
		return buildResponseObject(returnClass, clientResponse);
	}

	private Object postData(Object request, WebResource webResource,
			Class<?> returnClass) {
		WebResource.Builder builder = addHeader(webResource);
		builder.type(MediaType.APPLICATION_JSON);
		ObjectMapper mapper = new ObjectMapper();
		String input = convertObjectToString(request, mapper);

		ClientResponse clientResponse = builder.post(ClientResponse.class,
				input);

		return buildResponseObject(returnClass, clientResponse);
	}

	private Object putData(Object request, WebResource webResource,
			Class<?> returnClass) {
		WebResource.Builder builder = addHeader(webResource);
		builder.type(MediaType.APPLICATION_JSON);
		ObjectMapper mapper = new ObjectMapper();
		String input = convertObjectToString(request, mapper);

		ClientResponse clientResponse = builder
				.put(ClientResponse.class, input);

		return buildResponseObject(returnClass, clientResponse);
	}

	private Object deleteData(WebResource webResource) {
		WebResource.Builder builder = addHeader(webResource);
		ClientResponse clientResponse = builder.delete(ClientResponse.class);
		return buildDeleteResponseObject(clientResponse);
	}

	private WebResource.Builder addHeader(WebResource webResource) {
		WebResource.Builder builder = webResource
				.accept(MediaType.APPLICATION_JSON);

		builder.header("Authorization", trelloConnector.getConfig()
				.getAuthorization());
		return builder;
	}

	private Object buildDeleteResponseObject(ClientResponse clientResponse) {
		StatusResponse statusResponse = new StatusResponse();
		statusResponse
				.setStatusCode(String.valueOf(clientResponse.getStatus()));
		return statusResponse;
	}

	private Object buildResponseObject(Class<?> returnClass,
			ClientResponse clientResponse) {

		StatusResponse statusResponse = null;
		if (clientResponse.getStatus() == 200) {
			statusResponse = (StatusResponse) clientResponse
					.getEntity(returnClass);
			statusResponse.setStatusCode("200");
		} else {

			String strResponse = clientResponse.getEntity(String.class);
			try {
				Constructor<?> ctor = returnClass.getConstructor();
				statusResponse = (StatusResponse) ctor.newInstance();
				statusResponse.setStatusCode(String.valueOf(clientResponse
						.getStatus()));
				statusResponse.setStatusMessage(strResponse);
			} catch (Exception ex) {
				log.log(Level.SEVERE, "Error", ex);
			}
		}

		return statusResponse;

	}

	private String convertObjectToString(Object request, ObjectMapper mapper) {
		String input = "";

		try {
			input = mapper.writeValueAsString(request);

		} catch (Exception ex) {
			log.log(Level.SEVERE, "Error", ex);
		}
		log.info("Input String = " + input);
		return input;
	}

	private WebResource getApiResource() {
		return apiResource;
	}



	












	








	



	

	
	




	



















	
	
	


	


	

	



	

	


	

}
