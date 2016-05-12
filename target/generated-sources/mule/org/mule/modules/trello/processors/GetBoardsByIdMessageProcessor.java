
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
import org.mule.common.metadata.DefaultPojoMetaDataModel;
import org.mule.common.metadata.DefaultSimpleMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataKey;
import org.mule.common.metadata.MetaDataModel;
import org.mule.common.metadata.OperationMetaDataEnabled;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.metadata.datatype.DataTypeFactory;
import org.mule.devkit.processor.DevkitBasedMessageProcessor;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.bean.BoardsByIdGetResponse;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * GetBoardsByIdMessageProcessor invokes the {@link org.mule.modules.trello.TrelloConnector#getBoardsById(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String)} method in {@link TrelloConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T12:43:23+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class GetBoardsByIdMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object boardId;
    protected String _boardIdType;
    protected Object actions;
    protected String _actionsType;
    protected Object actions_entities;
    protected Boolean _actions_entitiesType;
    protected Object actions_display;
    protected Boolean _actions_displayType;
    protected Object actions_format;
    protected String _actions_formatType;
    protected Object actions_since;
    protected String _actions_sinceType;
    protected Object actions_limit;
    protected Integer _actions_limitType;
    protected Object action_fields;
    protected String _action_fieldsType;
    protected Object action_member;
    protected Boolean _action_memberType;
    protected Object action_member_fields;
    protected String _action_member_fieldsType;
    protected Object action_memberCreator;
    protected Boolean _action_memberCreatorType;
    protected Object action_memberCreator_fields;
    protected String _action_memberCreator_fieldsType;
    protected Object cards;
    protected String _cardsType;
    protected Object card_fields;
    protected String _card_fieldsType;
    protected Object card_attachments;
    protected String _card_attachmentsType;
    protected Object card_attachment_fields;
    protected String _card_attachment_fieldsType;
    protected Object card_checklists;
    protected String _card_checklistsType;
    protected Object card_stickers;
    protected Boolean _card_stickersType;
    protected Object boardStars;
    protected String _boardStarsType;
    protected Object labels;
    protected String _labelsType;
    protected Object label_fields;
    protected String _label_fieldsType;
    protected Object labels_limit;
    protected Integer _labels_limitType;
    protected Object lists;
    protected String _listsType;
    protected Object list_fields;
    protected String _list_fieldsType;
    protected Object memberships;
    protected String _membershipsType;
    protected Object memberships_member;
    protected Boolean _memberships_memberType;
    protected Object memberships_member_fields;
    protected String _memberships_member_fieldsType;
    protected Object members;
    protected String _membersType;
    protected Object member_fields;
    protected String _member_fieldsType;
    protected Object membersInvited;
    protected String _membersInvitedType;
    protected Object membersInvited_fields;
    protected String _membersInvited_fieldsType;
    protected Object checklists;
    protected String _checklistsType;
    protected Object checklist_fields;
    protected String _checklist_fieldsType;
    protected Object organization;
    protected Boolean _organizationType;
    protected Object organization_fields;
    protected String _organization_fieldsType;
    protected Object organization_memberships;
    protected String _organization_membershipsType;
    protected Object myPrefs;
    protected Boolean _myPrefsType;
    protected Object tags;
    protected Boolean _tagsType;
    protected Object fields;
    protected String _fieldsType;

    public GetBoardsByIdMessageProcessor(String operationName) {
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
     * Sets memberships_member_fields
     * 
     * @param value Value to set
     */
    public void setMemberships_member_fields(Object value) {
        this.memberships_member_fields = value;
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
     * Sets action_member_fields
     * 
     * @param value Value to set
     */
    public void setAction_member_fields(Object value) {
        this.action_member_fields = value;
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
     * Sets boardStars
     * 
     * @param value Value to set
     */
    public void setBoardStars(Object value) {
        this.boardStars = value;
    }

    /**
     * Sets action_memberCreator
     * 
     * @param value Value to set
     */
    public void setAction_memberCreator(Object value) {
        this.action_memberCreator = value;
    }

    /**
     * Sets membersInvited_fields
     * 
     * @param value Value to set
     */
    public void setMembersInvited_fields(Object value) {
        this.membersInvited_fields = value;
    }

    /**
     * Sets organization
     * 
     * @param value Value to set
     */
    public void setOrganization(Object value) {
        this.organization = value;
    }

    /**
     * Sets card_checklists
     * 
     * @param value Value to set
     */
    public void setCard_checklists(Object value) {
        this.card_checklists = value;
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
     * Sets myPrefs
     * 
     * @param value Value to set
     */
    public void setMyPrefs(Object value) {
        this.myPrefs = value;
    }

    /**
     * Sets organization_memberships
     * 
     * @param value Value to set
     */
    public void setOrganization_memberships(Object value) {
        this.organization_memberships = value;
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
     * Sets checklist_fields
     * 
     * @param value Value to set
     */
    public void setChecklist_fields(Object value) {
        this.checklist_fields = value;
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
     * Sets member_fields
     * 
     * @param value Value to set
     */
    public void setMember_fields(Object value) {
        this.member_fields = value;
    }

    /**
     * Sets members
     * 
     * @param value Value to set
     */
    public void setMembers(Object value) {
        this.members = value;
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
     * Sets lists
     * 
     * @param value Value to set
     */
    public void setLists(Object value) {
        this.lists = value;
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
     * Sets tags
     * 
     * @param value Value to set
     */
    public void setTags(Object value) {
        this.tags = value;
    }

    /**
     * Sets boardId
     * 
     * @param value Value to set
     */
    public void setBoardId(Object value) {
        this.boardId = value;
    }

    /**
     * Sets label_fields
     * 
     * @param value Value to set
     */
    public void setLabel_fields(Object value) {
        this.label_fields = value;
    }

    /**
     * Sets membersInvited
     * 
     * @param value Value to set
     */
    public void setMembersInvited(Object value) {
        this.membersInvited = value;
    }

    /**
     * Sets labels
     * 
     * @param value Value to set
     */
    public void setLabels(Object value) {
        this.labels = value;
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
     * Sets actions_since
     * 
     * @param value Value to set
     */
    public void setActions_since(Object value) {
        this.actions_since = value;
    }

    /**
     * Sets actions_format
     * 
     * @param value Value to set
     */
    public void setActions_format(Object value) {
        this.actions_format = value;
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
     * Sets checklists
     * 
     * @param value Value to set
     */
    public void setChecklists(Object value) {
        this.checklists = value;
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
     * Sets action_memberCreator_fields
     * 
     * @param value Value to set
     */
    public void setAction_memberCreator_fields(Object value) {
        this.action_memberCreator_fields = value;
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
     * Sets list_fields
     * 
     * @param value Value to set
     */
    public void setList_fields(Object value) {
        this.list_fields = value;
    }

    /**
     * Sets memberships_member
     * 
     * @param value Value to set
     */
    public void setMemberships_member(Object value) {
        this.memberships_member = value;
    }

    /**
     * Sets memberships
     * 
     * @param value Value to set
     */
    public void setMemberships(Object value) {
        this.memberships = value;
    }

    /**
     * Sets labels_limit
     * 
     * @param value Value to set
     */
    public void setLabels_limit(Object value) {
        this.labels_limit = value;
    }

    /**
     * Sets action_member
     * 
     * @param value Value to set
     */
    public void setAction_member(Object value) {
        this.action_member = value;
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
            final String _transformedBoardId = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_boardIdType").getGenericType(), null, boardId));
            final String _transformedActions = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_actionsType").getGenericType(), null, actions));
            final Boolean _transformedActions_entities = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_actions_entitiesType").getGenericType(), null, actions_entities));
            final Boolean _transformedActions_display = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_actions_displayType").getGenericType(), null, actions_display));
            final String _transformedActions_format = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_actions_formatType").getGenericType(), null, actions_format));
            final String _transformedActions_since = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_actions_sinceType").getGenericType(), null, actions_since));
            final Integer _transformedActions_limit = ((Integer) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_actions_limitType").getGenericType(), null, actions_limit));
            final String _transformedAction_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_action_fieldsType").getGenericType(), null, action_fields));
            final Boolean _transformedAction_member = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_action_memberType").getGenericType(), null, action_member));
            final String _transformedAction_member_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_action_member_fieldsType").getGenericType(), null, action_member_fields));
            final Boolean _transformedAction_memberCreator = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_action_memberCreatorType").getGenericType(), null, action_memberCreator));
            final String _transformedAction_memberCreator_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_action_memberCreator_fieldsType").getGenericType(), null, action_memberCreator_fields));
            final String _transformedCards = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_cardsType").getGenericType(), null, cards));
            final String _transformedCard_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_card_fieldsType").getGenericType(), null, card_fields));
            final String _transformedCard_attachments = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_card_attachmentsType").getGenericType(), null, card_attachments));
            final String _transformedCard_attachment_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_card_attachment_fieldsType").getGenericType(), null, card_attachment_fields));
            final String _transformedCard_checklists = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_card_checklistsType").getGenericType(), null, card_checklists));
            final Boolean _transformedCard_stickers = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_card_stickersType").getGenericType(), null, card_stickers));
            final String _transformedBoardStars = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_boardStarsType").getGenericType(), null, boardStars));
            final String _transformedLabels = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_labelsType").getGenericType(), null, labels));
            final String _transformedLabel_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_label_fieldsType").getGenericType(), null, label_fields));
            final Integer _transformedLabels_limit = ((Integer) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_labels_limitType").getGenericType(), null, labels_limit));
            final String _transformedLists = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_listsType").getGenericType(), null, lists));
            final String _transformedList_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_list_fieldsType").getGenericType(), null, list_fields));
            final String _transformedMemberships = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_membershipsType").getGenericType(), null, memberships));
            final Boolean _transformedMemberships_member = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_memberships_memberType").getGenericType(), null, memberships_member));
            final String _transformedMemberships_member_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_memberships_member_fieldsType").getGenericType(), null, memberships_member_fields));
            final String _transformedMembers = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_membersType").getGenericType(), null, members));
            final String _transformedMember_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_member_fieldsType").getGenericType(), null, member_fields));
            final String _transformedMembersInvited = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_membersInvitedType").getGenericType(), null, membersInvited));
            final String _transformedMembersInvited_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_membersInvited_fieldsType").getGenericType(), null, membersInvited_fields));
            final String _transformedChecklists = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_checklistsType").getGenericType(), null, checklists));
            final String _transformedChecklist_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_checklist_fieldsType").getGenericType(), null, checklist_fields));
            final Boolean _transformedOrganization = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_organizationType").getGenericType(), null, organization));
            final String _transformedOrganization_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_organization_fieldsType").getGenericType(), null, organization_fields));
            final String _transformedOrganization_memberships = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_organization_membershipsType").getGenericType(), null, organization_memberships));
            final Boolean _transformedMyPrefs = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_myPrefsType").getGenericType(), null, myPrefs));
            final Boolean _transformedTags = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_tagsType").getGenericType(), null, tags));
            final String _transformedFields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdMessageProcessor.class.getDeclaredField("_fieldsType").getGenericType(), null, fields));
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
                    return ((TrelloConnector) object).getBoardsById(_transformedBoardId, _transformedActions, _transformedActions_entities, _transformedActions_display, _transformedActions_format, _transformedActions_since, _transformedActions_limit, _transformedAction_fields, _transformedAction_member, _transformedAction_member_fields, _transformedAction_memberCreator, _transformedAction_memberCreator_fields, _transformedCards, _transformedCard_fields, _transformedCard_attachments, _transformedCard_attachment_fields, _transformedCard_checklists, _transformedCard_stickers, _transformedBoardStars, _transformedLabels, _transformedLabel_fields, _transformedLabels_limit, _transformedLists, _transformedList_fields, _transformedMemberships, _transformedMemberships_member, _transformedMemberships_member_fields, _transformedMembers, _transformedMember_fields, _transformedMembersInvited, _transformedMembersInvited_fields, _transformedChecklists, _transformedChecklist_fields, _transformedOrganization, _transformedOrganization_fields, _transformedOrganization_memberships, _transformedMyPrefs, _transformedTags, _transformedFields);
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
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(BoardsByIdGetResponse.class)));
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at TrelloConnector at getBoardsById retrieving was successful but result is null");
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
