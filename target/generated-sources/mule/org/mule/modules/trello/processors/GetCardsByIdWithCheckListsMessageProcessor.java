
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
import org.mule.modules.trello.bean.StatusResponse;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * GetCardsByIdWithCheckListsMessageProcessor invokes the {@link org.mule.modules.trello.TrelloConnector#getCardsByIdWithCheckLists(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link TrelloConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T12:43:23+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class GetCardsByIdWithCheckListsMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object cardIdOrShortlink;
    protected String _cardIdOrShortlinkType;
    protected Object cards;
    protected String _cardsType;
    protected Object card_fields;
    protected String _card_fieldsType;
    protected Object checkItems;
    protected String _checkItemsType;
    protected Object checkItem_fields;
    protected String _checkItem_fieldsType;
    protected Object filter;
    protected String _filterType;
    protected Object fields;
    protected String _fieldsType;

    public GetCardsByIdWithCheckListsMessageProcessor(String operationName) {
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
     * Sets checkItems
     * 
     * @param value Value to set
     */
    public void setCheckItems(Object value) {
        this.checkItems = value;
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
     * Sets checkItem_fields
     * 
     * @param value Value to set
     */
    public void setCheckItem_fields(Object value) {
        this.checkItem_fields = value;
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
     * Sets cardIdOrShortlink
     * 
     * @param value Value to set
     */
    public void setCardIdOrShortlink(Object value) {
        this.cardIdOrShortlink = value;
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
            final String _transformedCardIdOrShortlink = ((String) evaluateAndTransform(getMuleContext(), event, GetCardsByIdWithCheckListsMessageProcessor.class.getDeclaredField("_cardIdOrShortlinkType").getGenericType(), null, cardIdOrShortlink));
            final String _transformedCards = ((String) evaluateAndTransform(getMuleContext(), event, GetCardsByIdWithCheckListsMessageProcessor.class.getDeclaredField("_cardsType").getGenericType(), null, cards));
            final String _transformedCard_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetCardsByIdWithCheckListsMessageProcessor.class.getDeclaredField("_card_fieldsType").getGenericType(), null, card_fields));
            final String _transformedCheckItems = ((String) evaluateAndTransform(getMuleContext(), event, GetCardsByIdWithCheckListsMessageProcessor.class.getDeclaredField("_checkItemsType").getGenericType(), null, checkItems));
            final String _transformedCheckItem_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetCardsByIdWithCheckListsMessageProcessor.class.getDeclaredField("_checkItem_fieldsType").getGenericType(), null, checkItem_fields));
            final String _transformedFilter = ((String) evaluateAndTransform(getMuleContext(), event, GetCardsByIdWithCheckListsMessageProcessor.class.getDeclaredField("_filterType").getGenericType(), null, filter));
            final String _transformedFields = ((String) evaluateAndTransform(getMuleContext(), event, GetCardsByIdWithCheckListsMessageProcessor.class.getDeclaredField("_fieldsType").getGenericType(), null, fields));
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
                    return ((TrelloConnector) object).getCardsByIdWithCheckLists(_transformedCardIdOrShortlink, _transformedCards, _transformedCard_fields, _transformedCheckItems, _transformedCheckItem_fields, _transformedFilter, _transformedFields);
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
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(StatusResponse.class)));
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at TrelloConnector at getCardsByIdWithCheckLists retrieving was successful but result is null");
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
