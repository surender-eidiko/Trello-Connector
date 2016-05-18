
package org.mule.modules.trello.processors;

import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.config.ConfigurationException;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.registry.RegistrationException;
import org.mule.common.DefaultResult;
import org.mule.common.FailureType;
import org.mule.common.Result;
import org.mule.common.metadata.ConnectorMetaDataEnabled;
import org.mule.common.metadata.DefaultMetaData;
import org.mule.common.metadata.DefaultMetaDataKey;
import org.mule.common.metadata.DefaultPojoMetaDataModel;
import org.mule.common.metadata.DefaultSimpleMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataKey;
import org.mule.common.metadata.MetaDataModel;
import org.mule.common.metadata.OperationMetaDataEnabled;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.metadata.datatype.DataTypeFactory;
import org.mule.devkit.internal.metadata.fixes.STUDIO7157;
import org.mule.devkit.processor.DevkitBasedMessageProcessor;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.bean.MemberIdGetResponse;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * GetMemberByIdOrUsernameMessageProcessor invokes the {@link org.mule.modules.trello.TrelloConnector#getMemberByIdOrUsername(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link TrelloConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-18T04:08:12+05:30", comments = "Build 3.7.x.2633.51164b9")
public class GetMemberByIdOrUsernameMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object id;
    protected String _idType;
    protected Object actions;
    protected String _actionsType;
    protected Object actions_entities;
    protected Boolean _actions_entitiesType;
    protected Object actions_display;
    protected Boolean _actions_displayType;
    protected Object actions_limit;
    protected String _actions_limitType;
    protected Object action_fields;
    protected String _action_fieldsType;
    protected Object action_since;
    protected String _action_sinceType;
    protected Object action_before;
    protected String _action_beforeType;
    protected Object cards;
    protected String _cardsType;
    protected Object card_fields;
    protected String _card_fieldsType;
    protected Object card_members;
    protected Boolean _card_membersType;
    protected Object card_member_fields;
    protected String _card_member_fieldsType;
    protected Object card_attachments;
    protected String _card_attachmentsType;
    protected Object card_attachment_fields;
    protected String _card_attachment_fieldsType;
    protected Object card_stickers;
    protected Boolean _card_stickersType;
    protected Object boards;
    protected String _boardsType;
    protected Object board_fields;
    protected String _board_fieldsType;
    protected Object board_actions;
    protected String _board_actionsType;
    protected Object board_actions_entities;
    protected Boolean _board_actions_entitiesType;
    protected Object board_actions_display;
    protected Boolean _board_actions_displayType;
    protected Object board_actions_format;
    protected String _board_actions_formatType;
    protected Object board_actions_since;
    protected String _board_actions_sinceType;
    protected Object board_actions_limit;
    protected String _board_actions_limitType;
    protected Object board_action_fields;
    protected String _board_action_fieldsType;
    protected Object board_lists;
    protected String _board_listsType;
    protected Object board_memberships;
    protected String _board_membershipsType;
    protected Object board_organization;
    protected Boolean _board_organizationType;
    protected Object board_organization_fields;
    protected String _board_organization_fieldsType;
    protected Object boardsInvited;
    protected String _boardsInvitedType;
    protected Object boardsInvited_fields;
    protected String _boardsInvited_fieldsType;
    protected Object boardStars;
    protected Boolean _boardStarsType;
    protected Object savedSearches;
    protected Boolean _savedSearchesType;
    protected Object organizations;
    protected String _organizationsType;
    protected Object organization_fields;
    protected String _organization_fieldsType;
    protected Object organization_paid_account;
    protected Boolean _organization_paid_accountType;
    protected Object organizationsInvited;
    protected String _organizationsInvitedType;
    protected Object organizationsInvited_fields;
    protected String _organizationsInvited_fieldsType;
    protected Object notifications;
    protected String _notificationsType;
    protected Object notifications_entities;
    protected Boolean _notifications_entitiesType;
    protected Object notifications_display;
    protected Boolean _notifications_displayType;
    protected Object notifications_limit;
    protected String _notifications_limitType;
    protected Object notification_fields;
    protected String _notification_fieldsType;
    protected Object notification_memberCreator;
    protected Boolean _notification_memberCreatorType;
    protected Object notification_memberCreator_fields;
    protected String _notification_memberCreator_fieldsType;
    protected Object notification_before;
    protected String _notification_beforeType;
    protected Object notification_since;
    protected String _notification_sinceType;
    protected Object tokens;
    protected String _tokensType;
    protected Object paid_account;
    protected Boolean _paid_accountType;
    protected Object boardBackgrounds;
    protected String _boardBackgroundsType;
    protected Object customBoardBackgrounds;
    protected String _customBoardBackgroundsType;
    protected Object customStickers;
    protected String _customStickersType;
    protected Object customEmoji;
    protected String _customEmojiType;
    protected Object fields;
    protected String _fieldsType;

    public GetMemberByIdOrUsernameMessageProcessor(String operationName) {
        super(operationName);
    }

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    @Override
    public void start()
        throws MuleException
    {
        super.start();
    }

    @Override
    public void stop()
        throws MuleException
    {
        super.stop();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    /**
     * Sets card_members
     * 
     * @param value Value to set
     */
    public void setCard_members(Object value) {
        this.card_members = value;
    }

    /**
     * Sets card_attachment_fields
     * 
     * @param value Value to set
     */
    public void setCard_attachment_fields(Object value) {
        this.card_attachment_fields = value;
    }

    /**
     * Sets card_stickers
     * 
     * @param value Value to set
     */
    public void setCard_stickers(Object value) {
        this.card_stickers = value;
    }

    /**
     * Sets notification_fields
     * 
     * @param value Value to set
     */
    public void setNotification_fields(Object value) {
        this.notification_fields = value;
    }

    /**
     * Sets card_fields
     * 
     * @param value Value to set
     */
    public void setCard_fields(Object value) {
        this.card_fields = value;
    }

    /**
     * Sets customEmoji
     * 
     * @param value Value to set
     */
    public void setCustomEmoji(Object value) {
        this.customEmoji = value;
    }

    /**
     * Sets action_fields
     * 
     * @param value Value to set
     */
    public void setAction_fields(Object value) {
        this.action_fields = value;
    }

    /**
     * Sets tokens
     * 
     * @param value Value to set
     */
    public void setTokens(Object value) {
        this.tokens = value;
    }

    /**
     * Sets customStickers
     * 
     * @param value Value to set
     */
    public void setCustomStickers(Object value) {
        this.customStickers = value;
    }

    /**
     * Sets cards
     * 
     * @param value Value to set
     */
    public void setCards(Object value) {
        this.cards = value;
    }

    /**
     * Sets fields
     * 
     * @param value Value to set
     */
    public void setFields(Object value) {
        this.fields = value;
    }

    /**
     * Sets board_organization
     * 
     * @param value Value to set
     */
    public void setBoard_organization(Object value) {
        this.board_organization = value;
    }

    /**
     * Sets notification_memberCreator
     * 
     * @param value Value to set
     */
    public void setNotification_memberCreator(Object value) {
        this.notification_memberCreator = value;
    }

    /**
     * Sets board_actions_entities
     * 
     * @param value Value to set
     */
    public void setBoard_actions_entities(Object value) {
        this.board_actions_entities = value;
    }

    /**
     * Sets notifications_entities
     * 
     * @param value Value to set
     */
    public void setNotifications_entities(Object value) {
        this.notifications_entities = value;
    }

    /**
     * Sets customBoardBackgrounds
     * 
     * @param value Value to set
     */
    public void setCustomBoardBackgrounds(Object value) {
        this.customBoardBackgrounds = value;
    }

    /**
     * Sets board_memberships
     * 
     * @param value Value to set
     */
    public void setBoard_memberships(Object value) {
        this.board_memberships = value;
    }

    /**
     * Sets board_organization_fields
     * 
     * @param value Value to set
     */
    public void setBoard_organization_fields(Object value) {
        this.board_organization_fields = value;
    }

    /**
     * Sets board_fields
     * 
     * @param value Value to set
     */
    public void setBoard_fields(Object value) {
        this.board_fields = value;
    }

    /**
     * Sets boardsInvited
     * 
     * @param value Value to set
     */
    public void setBoardsInvited(Object value) {
        this.boardsInvited = value;
    }

    /**
     * Sets actions_limit
     * 
     * @param value Value to set
     */
    public void setActions_limit(Object value) {
        this.actions_limit = value;
    }

    /**
     * Sets action_before
     * 
     * @param value Value to set
     */
    public void setAction_before(Object value) {
        this.action_before = value;
    }

    /**
     * Sets notifications
     * 
     * @param value Value to set
     */
    public void setNotifications(Object value) {
        this.notifications = value;
    }

    /**
     * Sets boardBackgrounds
     * 
     * @param value Value to set
     */
    public void setBoardBackgrounds(Object value) {
        this.boardBackgrounds = value;
    }

    /**
     * Sets board_actions_limit
     * 
     * @param value Value to set
     */
    public void setBoard_actions_limit(Object value) {
        this.board_actions_limit = value;
    }

    /**
     * Sets organizationsInvited
     * 
     * @param value Value to set
     */
    public void setOrganizationsInvited(Object value) {
        this.organizationsInvited = value;
    }

    /**
     * Sets board_actions_display
     * 
     * @param value Value to set
     */
    public void setBoard_actions_display(Object value) {
        this.board_actions_display = value;
    }

    /**
     * Sets card_member_fields
     * 
     * @param value Value to set
     */
    public void setCard_member_fields(Object value) {
        this.card_member_fields = value;
    }

    /**
     * Sets notifications_limit
     * 
     * @param value Value to set
     */
    public void setNotifications_limit(Object value) {
        this.notifications_limit = value;
    }

    /**
     * Sets notification_before
     * 
     * @param value Value to set
     */
    public void setNotification_before(Object value) {
        this.notification_before = value;
    }

    /**
     * Sets board_actions
     * 
     * @param value Value to set
     */
    public void setBoard_actions(Object value) {
        this.board_actions = value;
    }

    /**
     * Sets organization_paid_account
     * 
     * @param value Value to set
     */
    public void setOrganization_paid_account(Object value) {
        this.organization_paid_account = value;
    }

    /**
     * Sets savedSearches
     * 
     * @param value Value to set
     */
    public void setSavedSearches(Object value) {
        this.savedSearches = value;
    }

    /**
     * Sets board_actions_since
     * 
     * @param value Value to set
     */
    public void setBoard_actions_since(Object value) {
        this.board_actions_since = value;
    }

    /**
     * Sets boardStars
     * 
     * @param value Value to set
     */
    public void setBoardStars(Object value) {
        this.boardStars = value;
    }

    /**
     * Sets id
     * 
     * @param value Value to set
     */
    public void setId(Object value) {
        this.id = value;
    }

    /**
     * Sets action_since
     * 
     * @param value Value to set
     */
    public void setAction_since(Object value) {
        this.action_since = value;
    }

    /**
     * Sets paid_account
     * 
     * @param value Value to set
     */
    public void setPaid_account(Object value) {
        this.paid_account = value;
    }

    /**
     * Sets organization_fields
     * 
     * @param value Value to set
     */
    public void setOrganization_fields(Object value) {
        this.organization_fields = value;
    }

    /**
     * Sets board_actions_format
     * 
     * @param value Value to set
     */
    public void setBoard_actions_format(Object value) {
        this.board_actions_format = value;
    }

    /**
     * Sets organizationsInvited_fields
     * 
     * @param value Value to set
     */
    public void setOrganizationsInvited_fields(Object value) {
        this.organizationsInvited_fields = value;
    }

    /**
     * Sets notifications_display
     * 
     * @param value Value to set
     */
    public void setNotifications_display(Object value) {
        this.notifications_display = value;
    }

    /**
     * Sets board_action_fields
     * 
     * @param value Value to set
     */
    public void setBoard_action_fields(Object value) {
        this.board_action_fields = value;
    }

    /**
     * Sets organizations
     * 
     * @param value Value to set
     */
    public void setOrganizations(Object value) {
        this.organizations = value;
    }

    /**
     * Sets actions_display
     * 
     * @param value Value to set
     */
    public void setActions_display(Object value) {
        this.actions_display = value;
    }

    /**
     * Sets notification_memberCreator_fields
     * 
     * @param value Value to set
     */
    public void setNotification_memberCreator_fields(Object value) {
        this.notification_memberCreator_fields = value;
    }

    /**
     * Sets actions_entities
     * 
     * @param value Value to set
     */
    public void setActions_entities(Object value) {
        this.actions_entities = value;
    }

    /**
     * Sets boards
     * 
     * @param value Value to set
     */
    public void setBoards(Object value) {
        this.boards = value;
    }

    /**
     * Sets card_attachments
     * 
     * @param value Value to set
     */
    public void setCard_attachments(Object value) {
        this.card_attachments = value;
    }

    /**
     * Sets boardsInvited_fields
     * 
     * @param value Value to set
     */
    public void setBoardsInvited_fields(Object value) {
        this.boardsInvited_fields = value;
    }

    /**
     * Sets board_lists
     * 
     * @param value Value to set
     */
    public void setBoard_lists(Object value) {
        this.board_lists = value;
    }

    /**
     * Sets actions
     * 
     * @param value Value to set
     */
    public void setActions(Object value) {
        this.actions = value;
    }

    /**
     * Sets notification_since
     * 
     * @param value Value to set
     */
    public void setNotification_since(Object value) {
        this.notification_since = value;
    }

    /**
     * Invokes the MessageProcessor.
     * 
     * @param event MuleEvent to be processed
     * @throws Exception
     */
    public MuleEvent doProcess(final MuleEvent event)
        throws Exception
    {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(null, false, event);
            final String _transformedId = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_idType").getGenericType(), null, id));
            final String _transformedActions = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_actionsType").getGenericType(), null, actions));
            final Boolean _transformedActions_entities = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_actions_entitiesType").getGenericType(), null, actions_entities));
            final Boolean _transformedActions_display = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_actions_displayType").getGenericType(), null, actions_display));
            final String _transformedActions_limit = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_actions_limitType").getGenericType(), null, actions_limit));
            final String _transformedAction_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_action_fieldsType").getGenericType(), null, action_fields));
            final String _transformedAction_since = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_action_sinceType").getGenericType(), null, action_since));
            final String _transformedAction_before = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_action_beforeType").getGenericType(), null, action_before));
            final String _transformedCards = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_cardsType").getGenericType(), null, cards));
            final String _transformedCard_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_card_fieldsType").getGenericType(), null, card_fields));
            final Boolean _transformedCard_members = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_card_membersType").getGenericType(), null, card_members));
            final String _transformedCard_member_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_card_member_fieldsType").getGenericType(), null, card_member_fields));
            final String _transformedCard_attachments = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_card_attachmentsType").getGenericType(), null, card_attachments));
            final String _transformedCard_attachment_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_card_attachment_fieldsType").getGenericType(), null, card_attachment_fields));
            final Boolean _transformedCard_stickers = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_card_stickersType").getGenericType(), null, card_stickers));
            final String _transformedBoards = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_boardsType").getGenericType(), null, boards));
            final String _transformedBoard_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_board_fieldsType").getGenericType(), null, board_fields));
            final String _transformedBoard_actions = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_board_actionsType").getGenericType(), null, board_actions));
            final Boolean _transformedBoard_actions_entities = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_board_actions_entitiesType").getGenericType(), null, board_actions_entities));
            final Boolean _transformedBoard_actions_display = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_board_actions_displayType").getGenericType(), null, board_actions_display));
            final String _transformedBoard_actions_format = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_board_actions_formatType").getGenericType(), null, board_actions_format));
            final String _transformedBoard_actions_since = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_board_actions_sinceType").getGenericType(), null, board_actions_since));
            final String _transformedBoard_actions_limit = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_board_actions_limitType").getGenericType(), null, board_actions_limit));
            final String _transformedBoard_action_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_board_action_fieldsType").getGenericType(), null, board_action_fields));
            final String _transformedBoard_lists = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_board_listsType").getGenericType(), null, board_lists));
            final String _transformedBoard_memberships = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_board_membershipsType").getGenericType(), null, board_memberships));
            final Boolean _transformedBoard_organization = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_board_organizationType").getGenericType(), null, board_organization));
            final String _transformedBoard_organization_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_board_organization_fieldsType").getGenericType(), null, board_organization_fields));
            final String _transformedBoardsInvited = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_boardsInvitedType").getGenericType(), null, boardsInvited));
            final String _transformedBoardsInvited_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_boardsInvited_fieldsType").getGenericType(), null, boardsInvited_fields));
            final Boolean _transformedBoardStars = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_boardStarsType").getGenericType(), null, boardStars));
            final Boolean _transformedSavedSearches = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_savedSearchesType").getGenericType(), null, savedSearches));
            final String _transformedOrganizations = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_organizationsType").getGenericType(), null, organizations));
            final String _transformedOrganization_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_organization_fieldsType").getGenericType(), null, organization_fields));
            final Boolean _transformedOrganization_paid_account = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_organization_paid_accountType").getGenericType(), null, organization_paid_account));
            final String _transformedOrganizationsInvited = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_organizationsInvitedType").getGenericType(), null, organizationsInvited));
            final String _transformedOrganizationsInvited_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_organizationsInvited_fieldsType").getGenericType(), null, organizationsInvited_fields));
            final String _transformedNotifications = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_notificationsType").getGenericType(), null, notifications));
            final Boolean _transformedNotifications_entities = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_notifications_entitiesType").getGenericType(), null, notifications_entities));
            final Boolean _transformedNotifications_display = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_notifications_displayType").getGenericType(), null, notifications_display));
            final String _transformedNotifications_limit = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_notifications_limitType").getGenericType(), null, notifications_limit));
            final String _transformedNotification_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_notification_fieldsType").getGenericType(), null, notification_fields));
            final Boolean _transformedNotification_memberCreator = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_notification_memberCreatorType").getGenericType(), null, notification_memberCreator));
            final String _transformedNotification_memberCreator_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_notification_memberCreator_fieldsType").getGenericType(), null, notification_memberCreator_fields));
            final String _transformedNotification_before = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_notification_beforeType").getGenericType(), null, notification_before));
            final String _transformedNotification_since = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_notification_sinceType").getGenericType(), null, notification_since));
            final String _transformedTokens = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_tokensType").getGenericType(), null, tokens));
            final Boolean _transformedPaid_account = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_paid_accountType").getGenericType(), null, paid_account));
            final String _transformedBoardBackgrounds = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_boardBackgroundsType").getGenericType(), null, boardBackgrounds));
            final String _transformedCustomBoardBackgrounds = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_customBoardBackgroundsType").getGenericType(), null, customBoardBackgrounds));
            final String _transformedCustomStickers = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_customStickersType").getGenericType(), null, customStickers));
            final String _transformedCustomEmoji = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_customEmojiType").getGenericType(), null, customEmoji));
            final String _transformedFields = ((String) evaluateAndTransform(getMuleContext(), event, GetMemberByIdOrUsernameMessageProcessor.class.getDeclaredField("_fieldsType").getGenericType(), null, fields));
            Object resultPayload;
            final ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            resultPayload = processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class<? extends Exception>> getManagedExceptions() {
                    return null;
                }

                public boolean isProtected() {
                    return false;
                }

                public Object process(Object object)
                    throws Exception
                {
                    return ((TrelloConnector) object).getMemberByIdOrUsername(_transformedId, _transformedActions, _transformedActions_entities, _transformedActions_display, _transformedActions_limit, _transformedAction_fields, _transformedAction_since, _transformedAction_before, _transformedCards, _transformedCard_fields, _transformedCard_members, _transformedCard_member_fields, _transformedCard_attachments, _transformedCard_attachment_fields, _transformedCard_stickers, _transformedBoards, _transformedBoard_fields, _transformedBoard_actions, _transformedBoard_actions_entities, _transformedBoard_actions_display, _transformedBoard_actions_format, _transformedBoard_actions_since, _transformedBoard_actions_limit, _transformedBoard_action_fields, _transformedBoard_lists, _transformedBoard_memberships, _transformedBoard_organization, _transformedBoard_organization_fields, _transformedBoardsInvited, _transformedBoardsInvited_fields, _transformedBoardStars, _transformedSavedSearches, _transformedOrganizations, _transformedOrganization_fields, _transformedOrganization_paid_account, _transformedOrganizationsInvited, _transformedOrganizationsInvited_fields, _transformedNotifications, _transformedNotifications_entities, _transformedNotifications_display, _transformedNotifications_limit, _transformedNotification_fields, _transformedNotification_memberCreator, _transformedNotification_memberCreator_fields, _transformedNotification_before, _transformedNotification_since, _transformedTokens, _transformedPaid_account, _transformedBoardBackgrounds, _transformedCustomBoardBackgrounds, _transformedCustomStickers, _transformedCustomEmoji, _transformedFields);
                }

            }
            , this, event);
            event.getMessage().setPayload(resultPayload);
            return event;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Result<MetaData> getInputMetaData() {
        return new DefaultResult<MetaData>(null, (Result.Status.SUCCESS));
    }

    @Override
    public Result<MetaData> getOutputMetaData(MetaData inputMetadata) {
        MetaDataModel metaDataPayload = getPojoOrSimpleModel(MemberIdGetResponse.class);
        DefaultMetaDataKey keyForStudio = new DefaultMetaDataKey("OUTPUT_METADATA", null);
        keyForStudio.setCategory("DataSenseResolver");
        metaDataPayload.addProperty(STUDIO7157 .getStructureIdentifierMetaDataModelProperty(keyForStudio, false, false));
        return new DefaultResult<MetaData>(new DefaultMetaData(metaDataPayload));
    }

    private MetaDataModel getPojoOrSimpleModel(Class clazz) {
        DataType dataType = DataTypeFactory.getInstance().getDataType(clazz);
        if (DataType.POJO.equals(dataType)) {
            return new DefaultPojoMetaDataModel(clazz);
        } else {
            return new DefaultSimpleMetaDataModel(dataType);
        }
    }

    public Result<MetaData> getGenericMetaData(MetaDataKey metaDataKey) {
        ConnectorMetaDataEnabled connector;
        try {
            connector = ((ConnectorMetaDataEnabled) findOrCreate(null, false, null));
            try {
                Result<MetaData> metadata = connector.getMetaData(metaDataKey);
                if ((Result.Status.FAILURE).equals(metadata.getStatus())) {
                    return metadata;
                }
                if (metadata.get() == null) {
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at TrelloConnector at getMemberByIdOrUsername retrieving was successful but result is null");
                }
                return metadata;
            } catch (Exception e) {
                return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
            }
        } catch (ClassCastException cast) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error getting metadata, there was no connection manager available. Maybe you're trying to use metadata from an Oauth connector");
        } catch (ConfigurationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (RegistrationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (IllegalAccessException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (InstantiationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (Exception e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        }
    }

}
