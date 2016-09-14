/**
 *
 */
package org.mule.modules.trello;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.mule.modules.trello.bean.BoardsByChecklistsIdGetResponse;
import org.mule.modules.trello.bean.BoardsByIdGetResponse;
import org.mule.modules.trello.bean.BoardsByIdPutRequest;
import org.mule.modules.trello.bean.BoardsByIdPutResponse;
import org.mule.modules.trello.bean.BoardsPostRequest;
import org.mule.modules.trello.bean.BoardsPostResponse;
import org.mule.modules.trello.bean.CardsByIdGetResponse;
import org.mule.modules.trello.bean.CardsByIdPutRequest;
import org.mule.modules.trello.bean.CardsPostRequest;
import org.mule.modules.trello.bean.CheckListsByIdGetResponse;
import org.mule.modules.trello.bean.ListPostResponse;
import org.mule.modules.trello.bean.ListsByIdGetResponse;
import org.mule.modules.trello.bean.ListsByIdPutRequest;
import org.mule.modules.trello.bean.ListsPostRequest;
import org.mule.modules.trello.bean.ListsUnderBoardsGetResponse;
import org.mule.modules.trello.bean.MemberByIdGetresponse;
import org.mule.modules.trello.bean.MembersBoardsGetResponse;
import org.mule.modules.trello.bean.StatusResponse;
import org.mule.modules.trello.bean.WebhooksByIdPutRequest;
import org.mule.modules.trello.bean.WebhooksPostResponse;
import org.mule.modules.trello.bean.WebhooksPutRequest;

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

	
	public BoardsByIdGetResponse getBoardById(String boardId,String token) {

		WebResource webResource = getApiResource().path("boards").path(boardId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = addKeyAndTokenToQueryParams(webResource,token);
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdGetResponse) getData(webResource,BoardsByIdGetResponse.class);
	}
	
	public List<ListsUnderBoardsGetResponse> getAllListsUnderBoard(String boardId,String token) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("lists");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		
		webResource = addKeyAndTokenToQueryParams(webResource,token);
		webResource = webResource.queryParams(queryParams);
		List<ListsUnderBoardsGetResponse>  list = new ArrayList<ListsUnderBoardsGetResponse>();
		return (List<ListsUnderBoardsGetResponse>) getListData(webResource,
				list.getClass());
	}
//Boards PUT method requests
	public BoardsByIdPutResponse putBoardsById(String boardId,BoardsByIdPutRequest boardsByIdPutReq,String token) {
		WebResource webResource = getApiResource().path("boards").path(boardId);
		webResource = addKeyAndTokenToQueryParams(webResource,token);
		return (BoardsByIdPutResponse) putData(boardsByIdPutReq,webResource, BoardsByIdPutResponse.class);
	}
	//Boards POST methods
	public BoardsPostResponse postBoard(BoardsPostRequest boardssPostRequest,String token) {
		 WebResource webResource = getApiResource().path("boards");
		 webResource = addKeyAndTokenToQueryParams(webResource,token);
		    return (BoardsPostResponse) postData(boardssPostRequest, webResource,
		    		BoardsPostResponse.class);
	}
	//Delete boards
	public StatusResponse deleteMemberUnderBoardById(String boardId,String memberId,String token) {
		 WebResource webResource = getApiResource().path("boards").path(boardId).path("members").path(memberId);
			webResource = addKeyAndTokenToQueryParams(webResource,token);
		    return (StatusResponse) deleteData(webResource);
	}
	//Cards Client Methods
	public CardsByIdGetResponse getCardById(String cardIdOrShortlink, String actions,
			Boolean actions_entities, Boolean actions_display,
			Integer actions_limit, String action_fields,
			String action_memberCreator_fields, String attachments,
			String attachment_fields, Boolean members, String member_fields,
			Boolean membersVoted, String memberVoted_fields,
			Boolean checkItemStates, String checkItemState_fields,
			String checklists, String checklist_fields, Boolean board,
			String board_fields, Boolean list, String list_fields,
			Boolean stickers, String sticker_fields, String fields,String token) {
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
		webResource =  addKeyAndTokenToQueryParams(webResource,token);
		webResource = webResource.queryParams(queryParams);
		return (CardsByIdGetResponse) getData(webResource,
				CardsByIdGetResponse.class);
	}
	//PUT Methods for Card
	public CardsByIdGetResponse updateCardById(String cardIdOrShortlink,CardsByIdPutRequest membershipsIdPutRequest,String token) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink);
			webResource = addKeyAndTokenToQueryParams(webResource,token);
	    return (CardsByIdGetResponse) putData(membershipsIdPutRequest, webResource,CardsByIdGetResponse.class);
	}
	
	//Cards POST methods
	public CardsByIdGetResponse createCard(CardsPostRequest cardsPostReq,String token) {
		WebResource webResource = getApiResource().path("cards");
		webResource = addKeyAndTokenToQueryParams(webResource,token);
	    return (CardsByIdGetResponse) postData(cardsPostReq, webResource,CardsByIdGetResponse.class);
	}
	//delete cards
	public StatusResponse deleteCardById(String cardIdOrShortLink,String token) {
		 WebResource webResource = getApiResource().path("cards").path(cardIdOrShortLink);
		 webResource = addKeyAndTokenToQueryParams(webResource,token);
			    return (StatusResponse) deleteData(webResource);
	}
//GET Lists
	public ListsByIdGetResponse getListById(String listId, String board, String token) {
		WebResource webResource = getApiResource().path("lists").path(listId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		
		if(board!=null){
			queryParams.add("board", board);
		}
		
		webResource =  addKeyAndTokenToQueryParams(webResource,token);
		webResource = webResource.queryParams(queryParams);
		return (ListsByIdGetResponse) getData(webResource, ListsByIdGetResponse.class);
	}
	
	//PUT methods for Lists
		public ListsByIdGetResponse updateListById(String listId,ListsByIdPutRequest listsPutReq,String token) {
			WebResource webResource = getApiResource().path("lists").path(listId);
			webResource=	addKeyAndTokenToQueryParams(webResource,token);
		    return (ListsByIdGetResponse) putData(listsPutReq, webResource, ListsByIdGetResponse.class);
		}
	//POST Lists
public ListPostResponse createList(ListsPostRequest listssPostReq, String token) {
	WebResource webResource = getApiResource().path("lists");
	webResource = addKeyAndTokenToQueryParams(webResource,token);
	return (ListPostResponse) postData(listssPostReq, webResource, ListPostResponse.class);
	}

//Checklists GET methods
	public CheckListsByIdGetResponse getChecklistsById(String checklistId,String cards, String card_fields, String checkItems,String checkItem_fields, String fields,String token) {
		WebResource webResource = getApiResource().path("checklists").path(checklistId);
	    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    if (cards != null) {
	      queryParams.add("cards", cards);
	    }
	    if (card_fields != null) {
	      queryParams.add("card_fields", card_fields);
	    }
	    if (checkItems != null) {
		      queryParams.add("max", checkItems);
		    }
	    if (checkItem_fields != null) {
		      queryParams.add("max", checkItem_fields);
		    }
	    if (fields != null) {
		      queryParams.add("fields", fields);
		    }
	    webResource = addKeyAndTokenToQueryParams(webResource,token);
	    webResource = webResource.queryParams(queryParams);
	    return (CheckListsByIdGetResponse) getData(webResource,CheckListsByIdGetResponse.class);
	}
	
	
	
	//GET Webhooks
	public WebhooksPostResponse getWebhooksById(String idWebhook,String token) {
		WebResource webResource = getApiResource().path("webhooks").path(idWebhook);
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		return (WebhooksPostResponse) getData(webResource,WebhooksPostResponse.class);
	}
	//PUT webhooks
	public WebhooksPostResponse updateWebhookById(String idWebhook,WebhooksByIdPutRequest webhookPutReq,String token) {
		WebResource webResource = getApiResource().path("webhooks").path(idWebhook);
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		return (WebhooksPostResponse) putData(webhookPutReq, webResource, WebhooksPostResponse.class);
	}
	public WebhooksPostResponse updateWebhook(WebhooksPutRequest webhookPutReq,String token) {
		WebResource webResource = getApiResource().path("webhooks");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		System.out.println("Hitting.."+webResource.toString());
		return (WebhooksPostResponse) putData(webhookPutReq, webResource, WebhooksPostResponse.class);
	}
	//POST webhooks
	public WebhooksPostResponse postWebhook(WebhooksPutRequest webhooksPostReq, String token) {
		WebResource webResource = getApiResource().path("webhooks");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		System.out.println("Hitting.."+webResource.toString());
		return (WebhooksPostResponse) postData(webhooksPostReq, webResource, WebhooksPostResponse.class);
	}
	//DELETE Webhooks 
	public StatusResponse deleteWebhookById(String idWebhook,String token) {
		WebResource webResource = getApiResource().path("webhooks").path(idWebhook);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		System.out.println("Hitting.."+webResource.toString());
		return (StatusResponse) deleteData(webResource);
	}

	//members API
	public MemberByIdGetresponse getMemberByIdOrUsername(String id,String fields, String boards, String organizations, String organization_fields, String token){
		WebResource webResource =null;
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(id.equals("me")){
			 webResource = getApiResource().path("members").path("me");
		}else{
			 webResource = getApiResource().path("members").path(id);
		}
		
		 queryParams.add("fields", "username,fullName,url,email");
		 queryParams.add("boards", boards);
		 queryParams.add("organizations", organizations);
		 queryParams.add("organization_fields", "displayName");
		
		webResource = addKeyAndTokenToQueryParams(webResource,token);
		webResource = webResource.queryParams(queryParams);
		return (MemberByIdGetresponse) getData(webResource, MemberByIdGetresponse.class);
		
	}
	
	public List<MembersBoardsGetResponse>  getBoards(String id, String filter, String fields,  String actions, Boolean actions_entities, String actions_limit, 
			String actions_format,  String actions_since, String action_fields,  String memberships, Boolean organization,  String organization_fields,  String lists,String token){
		WebResource webResource = getApiResource().path("members").path(id).path("boards");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		
		if(filter != null)	queryParams.add("filter", filter);
		if(fields != null)	queryParams.add("fields", fields);
		if(actions != null)	queryParams.add("actions", actions);
		if(actions_entities != null)	queryParams.add("actions_entities", String.valueOf(actions_entities));
		if(actions_limit != null)	queryParams.add("actions_limit", actions_limit);
		if(actions_format != null)	queryParams.add("actions_format", actions_format);
		if(actions_since != null)	queryParams.add("actions_since", actions_since);
		if(action_fields != null)	queryParams.add("action_fields", action_fields);
		if(memberships != null)	queryParams.add("memberships", memberships);
		if(organization != null)	queryParams.add("organization", String.valueOf(organization));
		if(organization_fields != null)	queryParams.add("organization_fields", organization_fields);
		if(lists != null)	queryParams.add("lists", lists);
		
		webResource = addKeyAndTokenToQueryParams(webResource,token);
		webResource = webResource.queryParams(queryParams);		
		System.out.println("Hitting URL :"+webResource.toString());
		List<MembersBoardsGetResponse> list = new ArrayList<MembersBoardsGetResponse>();
		return (List<MembersBoardsGetResponse>) getAllBoardsData(webResource, list.getClass());
	}
	
	public List<MembersBoardsGetResponse> getAllBoards(String token){
		WebResource webResource = getApiResource().path("members").path("me").path("boards");
		webResource = addKeyAndTokenToQueryParams(webResource,token);
		List<MembersBoardsGetResponse> list = new ArrayList<MembersBoardsGetResponse>();
		return  (List<MembersBoardsGetResponse>) getAllBoardsData(webResource, list.getClass());
	}
	private Object getAllBoardsData(WebResource webResource, Class<?> returnClass) {
		WebResource.Builder builder = addHeader(webResource);
		ClientResponse clientResponse = builder.get(ClientResponse.class);
		return buildAllBoardsResponseObject(returnClass, clientResponse);
	}
	
	private Object getData(WebResource webResource, Class<?> returnClass) {
		WebResource.Builder builder = addHeader(webResource);
		ClientResponse clientResponse = builder.get(ClientResponse.class);
		return buildResponseObject(returnClass, clientResponse);
	}
	private Object getListData(WebResource webResource, Class<?> returnClass) {
		WebResource.Builder builder = addHeader(webResource);
		ClientResponse clientResponse = builder.get(ClientResponse.class);
		return buildListResponseObject(returnClass, clientResponse);
	}
	private String getResponseAsString(WebResource webResource, Class<String> class1) {
	      WebResource.Builder builder = addHeader(webResource);  
	      ClientResponse clientResponse = builder.get(ClientResponse.class);
	      String strResponse = clientResponse.getEntity(String.class);
	      System.out.println("Response: "+strResponse);
	      System.out.println("Client Response: "+clientResponse.toString());
	      //String obj = (String)buildResponseObject(class1, clientResponse).toString();
	      return clientResponse.toString();
	 }
	private Object postData(Object request, WebResource webResource,Class<?> returnClass) {
		WebResource.Builder builder = addHeader(webResource);
		builder.type(MediaType.APPLICATION_JSON);
		ObjectMapper mapper = new ObjectMapper();
		
		String input = convertObjectToString(request, mapper);
		ClientResponse clientResponse = builder.post(ClientResponse.class,input);
		return buildResponseObject(returnClass, clientResponse);
	}
	/*private Object postCardData(Object request, WebResource webResource,Class<?> returnClass) {
		WebResource.Builder builder = addHeader(webResource);
		builder.type(MediaType.APPLICATION_JSON);
		ObjectMapper mapper = new ObjectMapper();
		
		String input = convertObjectToString(request, mapper);
		ClientResponse clientResponse = builder.post(ClientResponse.class,input);
		return buildPostCardResponseObject(returnClass, clientResponse);
	}*/


	
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
		WebResource.Builder builder = webResource.accept(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_OCTET_STREAM);
		//builder.header("Authorization", trelloConnector.getConfig().getAuthorization());
		return builder;
	}
	
	/*private WebResource.Builder addHeader(WebResource webResource, String token){
		WebResource.Builder builder = webResource.accept(MediaType.APPLICATION_JSON);
		//builder.header("Authorization", token);
		return builder;
	}
	*/
	private Object buildDeleteResponseObject(ClientResponse clientResponse) {
		StatusResponse statusResponse = new StatusResponse();
		statusResponse.setStatusCode(String.valueOf(clientResponse.getStatus()));
		return statusResponse;
	}
	private Object buildResponseObject(Class<?> returnClass,
			ClientResponse clientResponse) {

		StatusResponse statusResponse = null;
		if (clientResponse.getStatus() == 200) {
			statusResponse = (StatusResponse) clientResponse.getEntity(returnClass);
			statusResponse.setStatusCode("200");
		} else {
			String strResponse = clientResponse.getEntity(String.class);
			//System.out.println("Status: "+clientResponse.getStatus());
			//System.out.println("response as string... "+strResponse);
			try {
				Constructor<?> ctor = returnClass.getConstructor();
				statusResponse = (StatusResponse) ctor.newInstance();
				statusResponse.setStatusCode(String.valueOf(clientResponse.getStatus()));
				statusResponse.setStatusMessage(strResponse);
			} catch (Exception ex) {
				log.log(Level.SEVERE, "Error", ex);
			}
		}
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("Response: "+convertObjectToString(statusResponse, mapper));
		
		return statusResponse;

	}
	/*private Object buildPostCardResponseObject(Class<?> returnClass,
			ClientResponse clientResponse) {

		StatusResponse statusResponse = null;
		if (clientResponse.getStatus() == 200) {
			//statusResponse = (StatusResponse) clientResponse.getEntity(returnClass);
			String strResponse = clientResponse.getEntity(String.class);
			//statusResponse.setStatusCode("200");
			JSONObject obj = new JSONObject(strResponse);
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(Feature.FAIL_ON_EMPTY_BEANS, true);
			try {
				CardsByIdGetResponse res = mapper.readValue(obj.toString(), CardsByIdGetResponse.class);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else {

			String strResponse = clientResponse.getEntity(String.class);
			System.out.println("Status: "+clientResponse.getStatus());
			System.out.println("response as string... "+strResponse);
			try {
				Constructor<?> ctor = returnClass.getConstructor();
				statusResponse = (StatusResponse) ctor.newInstance();
				statusResponse.setStatusCode(String.valueOf(clientResponse.getStatus()));
				statusResponse.setStatusMessage(strResponse);
			} catch (Exception ex) {
				log.log(Level.SEVERE, "Error", ex);
			}
		}
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("Response: "+convertObjectToString(statusResponse, mapper));
		
		return statusResponse;

	}*/

	private Object buildListResponseObject(Class<?> returnClass,
			ClientResponse clientResponse) {
		StatusResponse statusResponse = null;
		if (clientResponse.getStatus() == 200) {
			String strResponse = clientResponse.getEntity(String.class);
			//System.out.println("response as string... "+strResponse);
			JSONArray json = new JSONArray(strResponse);
			List<ListsUnderBoardsGetResponse>  list = new ArrayList<ListsUnderBoardsGetResponse>();
			for(int i=0;i<json.length();i++){                        
			    JSONObject jsonObj = json.getJSONObject(i);
         		
         		try {
         			ObjectMapper mapper = new ObjectMapper();
         			ListsUnderBoardsGetResponse res = mapper.readValue(jsonObj.toString(), ListsUnderBoardsGetResponse.class);      
         		    list.add(res);
				} catch (JsonParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (JsonMappingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		
			//statusResponse = (StatusResponse) clientResponse.getEntity(returnClass);
			//statusResponse.setStatusCode("200");
			return list;
		} else {
			String strResponse = clientResponse.getEntity(String.class);
			//System.out.println("Status: "+clientResponse.getStatus());
			//System.out.println("response as string... "+strResponse);
			try {
				Constructor<?> ctor = returnClass.getConstructor();
				statusResponse = (StatusResponse) ctor.newInstance();
				statusResponse.setStatusCode(String.valueOf(clientResponse.getStatus()));
				statusResponse.setStatusMessage(strResponse);
			} catch (Exception ex) {
				log.log(Level.SEVERE, "Error", ex);
			}
		}
		ObjectMapper mapper = new ObjectMapper();
		//System.out.println("Response: "+convertObjectToString(statusResponse, mapper));
		return statusResponse;
	}
	private Object buildAllBoardsResponseObject(Class<?> returnClass,ClientResponse clientResponse) {
		StatusResponse statusResponse = null;
		if (clientResponse.getStatus() == 200) {
			String strResponse = clientResponse.getEntity(String.class);
			//System.out.println("response as string... "+strResponse);
			JSONArray json = new JSONArray(strResponse);
			List<MembersBoardsGetResponse>  list = new ArrayList<MembersBoardsGetResponse>();
			for(int i=0;i<json.length();i++){                        
			    JSONObject jsonObj = json.getJSONObject(i);
         		try {
         			ObjectMapper mapper = new ObjectMapper();
         			MembersBoardsGetResponse res = mapper.readValue(jsonObj.toString(), MembersBoardsGetResponse.class);      
         		    list.add(res);
				} catch (JsonParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (JsonMappingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		
			//statusResponse = (StatusResponse) clientResponse.getEntity(returnClass);
			//statusResponse.setStatusCode("200");
			return list;
		} else {
			String strResponse = clientResponse.getEntity(String.class);
			//System.out.println("Status: "+clientResponse.getStatus());
			//System.out.println("response as string... "+strResponse);
			try {
				Constructor<?> ctor = returnClass.getConstructor();
				statusResponse = (StatusResponse) ctor.newInstance();
				statusResponse.setStatusCode(String.valueOf(clientResponse.getStatus()));
				statusResponse.setStatusMessage(strResponse);
			} catch (Exception ex) {
				log.log(Level.SEVERE, "Error", ex);
			}
		}
		ObjectMapper mapper = new ObjectMapper();
		//System.out.println("Response: "+convertObjectToString(statusResponse, mapper));
		return statusResponse;
	}
	private String convertObjectToString(Object request, ObjectMapper mapper) {
		String output = "";

		try {
			output = mapper.writeValueAsString(request);
		} catch (Exception ex) {
			log.log(Level.SEVERE, "Error", ex);
		}
		log.info("Output String = " + output);
		return output;
	}
	private WebResource getApiResource() {
		return apiResource;
	}
	
	private WebResource addKeyAndTokenToQueryParams(WebResource webResource, String token){
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		String key = getTrelloConnector().getConfig().getApiKey();
		if(token==null){
		token = getTrelloConnector().getConfig().getApiToken();
		}
		queryParams.add("key",key);
		queryParams.add("token", token);
		webResource = webResource.queryParams(queryParams);
		return webResource;
	}

	

}
