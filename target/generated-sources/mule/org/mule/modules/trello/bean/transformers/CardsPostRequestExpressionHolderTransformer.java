
package org.mule.modules.trello.bean.transformers;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.endpoint.ImmutableEndpoint;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.transformer.DataType;
import org.mule.api.transformer.DiscoverableTransformer;
import org.mule.api.transformer.MessageTransformer;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transformer.TransformerMessagingException;
import org.mule.config.i18n.CoreMessages;
import org.mule.devkit.processor.ExpressionEvaluatorSupport;
import org.mule.modules.trello.bean.CardsPostRequest;
import org.mule.modules.trello.bean.holders.CardsPostRequestExpressionHolder;
import org.mule.transformer.types.DataTypeFactory;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T12:43:23+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class CardsPostRequestExpressionHolderTransformer
    extends ExpressionEvaluatorSupport
    implements DiscoverableTransformer, MessageTransformer
{

    private int weighting = DiscoverableTransformer.DEFAULT_PRIORITY_WEIGHTING;
    private ImmutableEndpoint endpoint;
    private MuleContext muleContext;
    private String name;

    public int getPriorityWeighting() {
        return weighting;
    }

    public void setPriorityWeighting(int weighting) {
        this.weighting = weighting;
    }

    public boolean isSourceTypeSupported(Class<?> aClass) {
        return (aClass == CardsPostRequestExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == CardsPostRequestExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {CardsPostRequestExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(CardsPostRequestExpressionHolder.class)});
    }

    public boolean isAcceptNull() {
        return false;
    }

    public boolean isIgnoreBadInput() {
        return false;
    }

    public Object transform(Object src)
        throws TransformerException
    {
        throw new UnsupportedOperationException();
    }

    public Object transform(Object src, String encoding)
        throws TransformerException
    {
        throw new UnsupportedOperationException();
    }

    public void setReturnClass(Class<?> theClass) {
        throw new UnsupportedOperationException();
    }

    public Class<?> getReturnClass() {
        return CardsPostRequest.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(CardsPostRequest.class);
    }

    public void setEndpoint(ImmutableEndpoint ep) {
        endpoint = ep;
    }

    public ImmutableEndpoint getEndpoint() {
        return endpoint;
    }

    public void dispose() {
    }

    public void initialise()
        throws InitialisationException
    {
    }

    public void setMuleContext(MuleContext context) {
        muleContext = context;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public Object transform(Object src, MuleEvent event)
        throws TransformerMessagingException
    {
        return transform(src, null, event);
    }

    public Object transform(Object src, String encoding, MuleEvent event)
        throws TransformerMessagingException
    {
        if (src == null) {
            return null;
        }
        CardsPostRequestExpressionHolder holder = ((CardsPostRequestExpressionHolder) src);
        CardsPostRequest result = new CardsPostRequest();
        try {
            final String _transformedName = ((String) evaluateAndTransform(this.muleContext, event, CardsPostRequestExpressionHolder.class.getDeclaredField("_nameType").getGenericType(), null, holder.getName()));
            result.setName(_transformedName);
            final String _transformedDesc = ((String) evaluateAndTransform(this.muleContext, event, CardsPostRequestExpressionHolder.class.getDeclaredField("_descType").getGenericType(), null, holder.getDesc()));
            result.setDesc(_transformedDesc);
            final String _transformedPos = ((String) evaluateAndTransform(this.muleContext, event, CardsPostRequestExpressionHolder.class.getDeclaredField("_posType").getGenericType(), null, holder.getPos()));
            result.setPos(_transformedPos);
            final String _transformedDue = ((String) evaluateAndTransform(this.muleContext, event, CardsPostRequestExpressionHolder.class.getDeclaredField("_dueType").getGenericType(), null, holder.getDue()));
            result.setDue(_transformedDue);
            final String _transformedIdList = ((String) evaluateAndTransform(this.muleContext, event, CardsPostRequestExpressionHolder.class.getDeclaredField("_idListType").getGenericType(), null, holder.getIdList()));
            result.setIdList(_transformedIdList);
            final String _transformedIdMembers = ((String) evaluateAndTransform(this.muleContext, event, CardsPostRequestExpressionHolder.class.getDeclaredField("_idMembersType").getGenericType(), null, holder.getIdMembers()));
            result.setIdMembers(_transformedIdMembers);
            final String _transformedIdLabels = ((String) evaluateAndTransform(this.muleContext, event, CardsPostRequestExpressionHolder.class.getDeclaredField("_idLabelsType").getGenericType(), null, holder.getIdLabels()));
            result.setIdLabels(_transformedIdLabels);
            final String _transformedUrlSource = ((String) evaluateAndTransform(this.muleContext, event, CardsPostRequestExpressionHolder.class.getDeclaredField("_urlSourceType").getGenericType(), null, holder.getUrlSource()));
            result.setUrlSource(_transformedUrlSource);
            final String _transformedFileSource = ((String) evaluateAndTransform(this.muleContext, event, CardsPostRequestExpressionHolder.class.getDeclaredField("_fileSourceType").getGenericType(), null, holder.getFileSource()));
            result.setFileSource(_transformedFileSource);
            final String _transformedIdCardSource = ((String) evaluateAndTransform(this.muleContext, event, CardsPostRequestExpressionHolder.class.getDeclaredField("_idCardSourceType").getGenericType(), null, holder.getIdCardSource()));
            result.setIdCardSource(_transformedIdCardSource);
            final String _transformedKeepFromSource = ((String) evaluateAndTransform(this.muleContext, event, CardsPostRequestExpressionHolder.class.getDeclaredField("_keepFromSourceType").getGenericType(), null, holder.getKeepFromSource()));
            result.setKeepFromSource(_transformedKeepFromSource);
        } catch (NoSuchFieldException e) {
            throw new TransformerMessagingException(CoreMessages.createStaticMessage("internal error"), event, this, e);
        } catch (TransformerException e) {
            throw new TransformerMessagingException(e.getI18nMessage(), event, this, e);
        }
        return result;
    }

    public MuleEvent process(MuleEvent event) {
        return null;
    }

    public String getMimeType() {
        return null;
    }

    public String getEncoding() {
        return null;
    }

    public MuleContext getMuleContext() {
        return muleContext;
    }

}