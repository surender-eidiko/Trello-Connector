
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
import org.mule.modules.trello.bean.MembersBoardsGetResponse;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * GetBoardsMessageProcessor invokes the {@link org.mule.modules.trello.TrelloConnector#getBoards(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String)} method in {@link TrelloConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-18T04:08:12+05:30", comments = "Build 3.7.x.2633.51164b9")
public class GetBoardsMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object id;
    protected String _idType;
    protected Object filter;
    protected String _filterType;
    protected Object fields;
    protected String _fieldsType;
    protected Object actions;
    protected String _actionsType;
    protected Object actions_entities;
    protected Boolean _actions_entitiesType;
    protected Object actions_limit;
    protected String _actions_limitType;
    protected Object actions_format;
    protected String _actions_formatType;
    protected Object actions_since;
    protected String _actions_sinceType;
    protected Object action_fields;
    protected String _action_fieldsType;
    protected Object memberships;
    protected String _membershipsType;
    protected Object organization;
    protected Boolean _organizationType;
    protected Object organization_fields;
    protected String _organization_fieldsType;
    protected Object lists;
    protected String _listsType;

    public GetBoardsMessageProcessor(String operationName) {
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
     * Sets actions_format
     * 
     * @param value Value to set
     */
    public void setActions_format(Object value) {
        this.actions_format = value;
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
     * Sets actions_entities
     * 
     * @param value Value to set
     */
    public void setActions_entities(Object value) {
        this.actions_entities = value;
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
     * Sets actions_limit
     * 
     * @param value Value to set
     */
    public void setActions_limit(Object value) {
        this.actions_limit = value;
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
     * Sets memberships
     * 
     * @param value Value to set
     */
    public void setMemberships(Object value) {
        this.memberships = value;
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
     * Sets organization_fields
     * 
     * @param value Value to set
     */
    public void setOrganization_fields(Object value) {
        this.organization_fields = value;
    }

    /**
     * Sets filter
     * 
     * @param value Value to set
     */
    public void setFilter(Object value) {
        this.filter = value;
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
            final String _transformedId = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsMessageProcessor.class.getDeclaredField("_idType").getGenericType(), null, id));
            final String _transformedFilter = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsMessageProcessor.class.getDeclaredField("_filterType").getGenericType(), null, filter));
            final String _transformedFields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsMessageProcessor.class.getDeclaredField("_fieldsType").getGenericType(), null, fields));
            final String _transformedActions = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsMessageProcessor.class.getDeclaredField("_actionsType").getGenericType(), null, actions));
            final Boolean _transformedActions_entities = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsMessageProcessor.class.getDeclaredField("_actions_entitiesType").getGenericType(), null, actions_entities));
            final String _transformedActions_limit = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsMessageProcessor.class.getDeclaredField("_actions_limitType").getGenericType(), null, actions_limit));
            final String _transformedActions_format = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsMessageProcessor.class.getDeclaredField("_actions_formatType").getGenericType(), null, actions_format));
            final String _transformedActions_since = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsMessageProcessor.class.getDeclaredField("_actions_sinceType").getGenericType(), null, actions_since));
            final String _transformedAction_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsMessageProcessor.class.getDeclaredField("_action_fieldsType").getGenericType(), null, action_fields));
            final String _transformedMemberships = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsMessageProcessor.class.getDeclaredField("_membershipsType").getGenericType(), null, memberships));
            final Boolean _transformedOrganization = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsMessageProcessor.class.getDeclaredField("_organizationType").getGenericType(), null, organization));
            final String _transformedOrganization_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsMessageProcessor.class.getDeclaredField("_organization_fieldsType").getGenericType(), null, organization_fields));
            final String _transformedLists = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsMessageProcessor.class.getDeclaredField("_listsType").getGenericType(), null, lists));
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
                    return ((TrelloConnector) object).getBoards(_transformedId, _transformedFilter, _transformedFields, _transformedActions, _transformedActions_entities, _transformedActions_limit, _transformedActions_format, _transformedActions_since, _transformedAction_fields, _transformedMemberships, _transformedOrganization, _transformedOrganization_fields, _transformedLists);
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
        MetaDataModel metaDataPayload = getPojoOrSimpleModel(MembersBoardsGetResponse.class);
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at TrelloConnector at getBoards retrieving was successful but result is null");
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
