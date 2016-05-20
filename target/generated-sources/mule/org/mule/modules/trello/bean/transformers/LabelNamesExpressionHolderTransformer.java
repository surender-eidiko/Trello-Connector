
package org.mule.modules.trello.bean.transformers;

import java.lang.reflect.Type;
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
import org.mule.modules.trello.bean.LabelNames;
import org.mule.modules.trello.bean.holders.LabelNamesExpressionHolder;
import org.mule.transformer.types.DataTypeFactory;
import org.mule.transport.NullPayload;
import org.mule.util.TemplateParser;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-20T07:24:31+05:30", comments = "Build 3.7.x.2633.51164b9")
public class LabelNamesExpressionHolderTransformer
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
        return (aClass == LabelNamesExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == LabelNamesExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {LabelNamesExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(LabelNamesExpressionHolder.class)});
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
        return LabelNames.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(LabelNames.class);
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
        LabelNamesExpressionHolder holder = ((LabelNamesExpressionHolder) src);
        LabelNames result = new LabelNames();
        try {
            final String _transformedOrange = ((String) evaluateAndTransform(this.muleContext, event, LabelNamesExpressionHolder.class.getDeclaredField("_orangeType").getGenericType(), null, holder.getOrange()));
            result.setOrange(_transformedOrange);
            final String _transformedSky = ((String) evaluateAndTransform(this.muleContext, event, LabelNamesExpressionHolder.class.getDeclaredField("_skyType").getGenericType(), null, holder.getSky()));
            result.setSky(_transformedSky);
            final String _transformedRed = ((String) evaluateAndTransform(this.muleContext, event, LabelNamesExpressionHolder.class.getDeclaredField("_redType").getGenericType(), null, holder.getRed()));
            result.setRed(_transformedRed);
            final String _transformedPurple = ((String) evaluateAndTransform(this.muleContext, event, LabelNamesExpressionHolder.class.getDeclaredField("_purpleType").getGenericType(), null, holder.getPurple()));
            result.setPurple(_transformedPurple);
            final String _transformedBlue = ((String) evaluateAndTransform(this.muleContext, event, LabelNamesExpressionHolder.class.getDeclaredField("_blueType").getGenericType(), null, holder.getBlue()));
            result.setBlue(_transformedBlue);
            final String _transformedGreen = ((String) evaluateAndTransform(this.muleContext, event, LabelNamesExpressionHolder.class.getDeclaredField("_greenType").getGenericType(), null, holder.getGreen()));
            result.setGreen(_transformedGreen);
            final String _transformedPink = ((String) evaluateAndTransform(this.muleContext, event, LabelNamesExpressionHolder.class.getDeclaredField("_pinkType").getGenericType(), null, holder.getPink()));
            result.setPink(_transformedPink);
            final String _transformedLime = ((String) evaluateAndTransform(this.muleContext, event, LabelNamesExpressionHolder.class.getDeclaredField("_limeType").getGenericType(), null, holder.getLime()));
            result.setLime(_transformedLime);
            final String _transformedYellow = ((String) evaluateAndTransform(this.muleContext, event, LabelNamesExpressionHolder.class.getDeclaredField("_yellowType").getGenericType(), null, holder.getYellow()));
            result.setYellow(_transformedYellow);
            final String _transformedBlack = ((String) evaluateAndTransform(this.muleContext, event, LabelNamesExpressionHolder.class.getDeclaredField("_blackType").getGenericType(), null, holder.getBlack()));
            result.setBlack(_transformedBlack);
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

    private Object evaluateTransformForPayload(MuleContext muleContext, MuleEvent muleEvent, Type objectType, String mimeType, Object object)
        throws TransformerException, TransformerMessagingException
    {
        Object transformedObject;
        try {
            transformedObject = evaluateAndTransform(muleContext, muleEvent, objectType, mimeType, object);
            if (transformedObject instanceof NullPayload) {
                transformedObject = null;
            }
        } catch (TransformerException e) {
            transformedObject = evaluate(TemplateParser.createMuleStyleParser().getStyle(), muleContext.getExpressionManager(), muleEvent.getMessage(), object);
            if (transformedObject instanceof NullPayload) {
                transformedObject = null;
            } else {
                throw e;
            }
        } catch (TransformerMessagingException e) {
            transformedObject = evaluate(TemplateParser.createMuleStyleParser().getStyle(), muleContext.getExpressionManager(), muleEvent.getMessage(), object);
            if (transformedObject instanceof NullPayload) {
                transformedObject = null;
            } else {
                throw e;
            }
        }
        return transformedObject;
    }

}
