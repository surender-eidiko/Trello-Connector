
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
import org.mule.modules.trello.bean.OrganizationGetResponse;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * GetOrganizationByIdMessageProcessor invokes the {@link org.mule.modules.trello.TrelloConnector#getOrganizationById(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link TrelloConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-18T04:08:12+05:30", comments = "Build 3.7.x.2633.51164b9")
public class GetOrganizationByIdMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object OrganizationId;
    protected String _OrganizationIdType;
    protected Object actions;
    protected String _actionsType;
    protected Object actions_entities;
    protected Boolean _actions_entitiesType;
    protected Object actions_display;
    protected Boolean _actions_displayType;
    protected Object actions_limit;
    protected Integer _actions_limitType;
    protected Object action_fields;
    protected String _action_fieldsType;
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
    protected Object member_activity;
    protected Boolean _member_activityType;
    protected Object membersInvited;
    protected String _membersInvitedType;
    protected Object membersInvited_fields;
    protected String _membersInvited_fieldsType;
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
    protected Integer _board_actions_limitType;
    protected Object board_action_fields;
    protected String _board_action_fieldsType;
    protected Object board_lists;
    protected String _board_listsType;
    protected Object paid_account;
    protected String _paid_accountType;
    protected Object fields;
    protected String _fieldsType;

    public GetOrganizationByIdMessageProcessor(String operationName) {
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
     * Sets board_actions
     * 
     * @param value Value to set
     */
    public void setBoard_actions(Object value) {
        this.board_actions = value;
    }

    /**
     * Sets member_activity
     * 
     * @param value Value to set
     */
    public void setMember_activity(Object value) {
        this.member_activity = value;
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
     * Sets membersInvited_fields
     * 
     * @param value Value to set
     */
    public void setMembersInvited_fields(Object value) {
        this.membersInvited_fields = value;
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
     * Sets action_fields
     * 
     * @param value Value to set
     */
    public void setAction_fields(Object value) {
        this.action_fields = value;
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
     * Sets fields
     * 
     * @param value Value to set
     */
    public void setFields(Object value) {
        this.fields = value;
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
     * Sets board_actions_entities
     * 
     * @param value Value to set
     */
    public void setBoard_actions_entities(Object value) {
        this.board_actions_entities = value;
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
     * Sets actions_display
     * 
     * @param value Value to set
     */
    public void setActions_display(Object value) {
        this.actions_display = value;
    }

    /**
     * Sets OrganizationId
     * 
     * @param value Value to set
     */
    public void setOrganizationId(Object value) {
        this.OrganizationId = value;
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
     * Sets board_fields
     * 
     * @param value Value to set
     */
    public void setBoard_fields(Object value) {
        this.board_fields = value;
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
     * Sets actions_limit
     * 
     * @param value Value to set
     */
    public void setActions_limit(Object value) {
        this.actions_limit = value;
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
     * Sets board_actions_display
     * 
     * @param value Value to set
     */
    public void setBoard_actions_display(Object value) {
        this.board_actions_display = value;
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
     * Sets board_lists
     * 
     * @param value Value to set
     */
    public void setBoard_lists(Object value) {
        this.board_lists = value;
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
            final String _transformedOrganizationId = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_OrganizationIdType").getGenericType(), null, OrganizationId));
            final String _transformedActions = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_actionsType").getGenericType(), null, actions));
            final Boolean _transformedActions_entities = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_actions_entitiesType").getGenericType(), null, actions_entities));
            final Boolean _transformedActions_display = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_actions_displayType").getGenericType(), null, actions_display));
            final Integer _transformedActions_limit = ((Integer) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_actions_limitType").getGenericType(), null, actions_limit));
            final String _transformedAction_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_action_fieldsType").getGenericType(), null, action_fields));
            final String _transformedMemberships = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_membershipsType").getGenericType(), null, memberships));
            final Boolean _transformedMemberships_member = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_memberships_memberType").getGenericType(), null, memberships_member));
            final String _transformedMemberships_member_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_memberships_member_fieldsType").getGenericType(), null, memberships_member_fields));
            final String _transformedMembers = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_membersType").getGenericType(), null, members));
            final String _transformedMember_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_member_fieldsType").getGenericType(), null, member_fields));
            final Boolean _transformedMember_activity = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_member_activityType").getGenericType(), null, member_activity));
            final String _transformedMembersInvited = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_membersInvitedType").getGenericType(), null, membersInvited));
            final String _transformedMembersInvited_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_membersInvited_fieldsType").getGenericType(), null, membersInvited_fields));
            final String _transformedBoards = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_boardsType").getGenericType(), null, boards));
            final String _transformedBoard_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_board_fieldsType").getGenericType(), null, board_fields));
            final String _transformedBoard_actions = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_board_actionsType").getGenericType(), null, board_actions));
            final Boolean _transformedBoard_actions_entities = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_board_actions_entitiesType").getGenericType(), null, board_actions_entities));
            final Boolean _transformedBoard_actions_display = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_board_actions_displayType").getGenericType(), null, board_actions_display));
            final String _transformedBoard_actions_format = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_board_actions_formatType").getGenericType(), null, board_actions_format));
            final String _transformedBoard_actions_since = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_board_actions_sinceType").getGenericType(), null, board_actions_since));
            final Integer _transformedBoard_actions_limit = ((Integer) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_board_actions_limitType").getGenericType(), null, board_actions_limit));
            final String _transformedBoard_action_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_board_action_fieldsType").getGenericType(), null, board_action_fields));
            final String _transformedBoard_lists = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_board_listsType").getGenericType(), null, board_lists));
            final String _transformedPaid_account = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_paid_accountType").getGenericType(), null, paid_account));
            final String _transformedFields = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationByIdMessageProcessor.class.getDeclaredField("_fieldsType").getGenericType(), null, fields));
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
                    return ((TrelloConnector) object).getOrganizationById(_transformedOrganizationId, _transformedActions, _transformedActions_entities, _transformedActions_display, _transformedActions_limit, _transformedAction_fields, _transformedMemberships, _transformedMemberships_member, _transformedMemberships_member_fields, _transformedMembers, _transformedMember_fields, _transformedMember_activity, _transformedMembersInvited, _transformedMembersInvited_fields, _transformedBoards, _transformedBoard_fields, _transformedBoard_actions, _transformedBoard_actions_entities, _transformedBoard_actions_display, _transformedBoard_actions_format, _transformedBoard_actions_since, _transformedBoard_actions_limit, _transformedBoard_action_fields, _transformedBoard_lists, _transformedPaid_account, _transformedFields);
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
        MetaDataModel metaDataPayload = getPojoOrSimpleModel(OrganizationGetResponse.class);
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at TrelloConnector at getOrganizationById retrieving was successful but result is null");
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
