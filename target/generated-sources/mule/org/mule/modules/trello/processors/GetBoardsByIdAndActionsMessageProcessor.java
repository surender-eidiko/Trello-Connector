
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
import org.mule.modules.trello.bean.BoardsByIdAndActionsGetResponse;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * GetBoardsByIdAndActionsMessageProcessor invokes the {@link org.mule.modules.trello.TrelloConnector#getBoardsByIdAndActions(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String)} method in {@link TrelloConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T12:43:23+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class GetBoardsByIdAndActionsMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object boardId;
    protected String _boardIdType;
    protected Object entities;
    protected String _entitiesType;
    protected Object display;
    protected Boolean _displayType;
    protected Object filter;
    protected String _filterType;
    protected Object fields;
    protected String _fieldsType;
    protected Object limit;
    protected Integer _limitType;
    protected Object format;
    protected String _formatType;
    protected Object since;
    protected String _sinceType;
    protected Object before;
    protected String _beforeType;
    protected Object page;
    protected Integer _pageType;
    protected Object idModels;
    protected String _idModelsType;
    protected Object member;
    protected Boolean _memberType;
    protected Object member_fields;
    protected String _member_fieldsType;
    protected Object memberCreator;
    protected Boolean _memberCreatorType;
    protected Object memberCreator_fields;
    protected String _memberCreator_fieldsType;

    public GetBoardsByIdAndActionsMessageProcessor(String operationName) {
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
     * Sets limit
     * 
     * @param value Value to set
     */
    public void setLimit(Object value) {
        this.limit = value;
    }

    /**
     * Sets member
     * 
     * @param value Value to set
     */
    public void setMember(Object value) {
        this.member = value;
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
     * Sets before
     * 
     * @param value Value to set
     */
    public void setBefore(Object value) {
        this.before = value;
    }

    /**
     * Sets idModels
     * 
     * @param value Value to set
     */
    public void setIdModels(Object value) {
        this.idModels = value;
    }

    /**
     * Sets display
     * 
     * @param value Value to set
     */
    public void setDisplay(Object value) {
        this.display = value;
    }

    /**
     * Sets format
     * 
     * @param value Value to set
     */
    public void setFormat(Object value) {
        this.format = value;
    }

    /**
     * Sets since
     * 
     * @param value Value to set
     */
    public void setSince(Object value) {
        this.since = value;
    }

    /**
     * Sets entities
     * 
     * @param value Value to set
     */
    public void setEntities(Object value) {
        this.entities = value;
    }

    /**
     * Sets memberCreator_fields
     * 
     * @param value Value to set
     */
    public void setMemberCreator_fields(Object value) {
        this.memberCreator_fields = value;
    }

    /**
     * Sets page
     * 
     * @param value Value to set
     */
    public void setPage(Object value) {
        this.page = value;
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
     * Sets memberCreator
     * 
     * @param value Value to set
     */
    public void setMemberCreator(Object value) {
        this.memberCreator = value;
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
            final String _transformedBoardId = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndActionsMessageProcessor.class.getDeclaredField("_boardIdType").getGenericType(), null, boardId));
            final String _transformedEntities = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndActionsMessageProcessor.class.getDeclaredField("_entitiesType").getGenericType(), null, entities));
            final Boolean _transformedDisplay = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndActionsMessageProcessor.class.getDeclaredField("_displayType").getGenericType(), null, display));
            final String _transformedFilter = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndActionsMessageProcessor.class.getDeclaredField("_filterType").getGenericType(), null, filter));
            final String _transformedFields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndActionsMessageProcessor.class.getDeclaredField("_fieldsType").getGenericType(), null, fields));
            final Integer _transformedLimit = ((Integer) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndActionsMessageProcessor.class.getDeclaredField("_limitType").getGenericType(), null, limit));
            final String _transformedFormat = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndActionsMessageProcessor.class.getDeclaredField("_formatType").getGenericType(), null, format));
            final String _transformedSince = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndActionsMessageProcessor.class.getDeclaredField("_sinceType").getGenericType(), null, since));
            final String _transformedBefore = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndActionsMessageProcessor.class.getDeclaredField("_beforeType").getGenericType(), null, before));
            final Integer _transformedPage = ((Integer) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndActionsMessageProcessor.class.getDeclaredField("_pageType").getGenericType(), null, page));
            final String _transformedIdModels = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndActionsMessageProcessor.class.getDeclaredField("_idModelsType").getGenericType(), null, idModels));
            final Boolean _transformedMember = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndActionsMessageProcessor.class.getDeclaredField("_memberType").getGenericType(), null, member));
            final String _transformedMember_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndActionsMessageProcessor.class.getDeclaredField("_member_fieldsType").getGenericType(), null, member_fields));
            final Boolean _transformedMemberCreator = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndActionsMessageProcessor.class.getDeclaredField("_memberCreatorType").getGenericType(), null, memberCreator));
            final String _transformedMemberCreator_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndActionsMessageProcessor.class.getDeclaredField("_memberCreator_fieldsType").getGenericType(), null, memberCreator_fields));
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
                    return ((TrelloConnector) object).getBoardsByIdAndActions(_transformedBoardId, _transformedEntities, _transformedDisplay, _transformedFilter, _transformedFields, _transformedLimit, _transformedFormat, _transformedSince, _transformedBefore, _transformedPage, _transformedIdModels, _transformedMember, _transformedMember_fields, _transformedMemberCreator, _transformedMemberCreator_fields);
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
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(BoardsByIdAndActionsGetResponse.class)));
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at TrelloConnector at getBoardsByIdAndActions retrieving was successful but result is null");
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
