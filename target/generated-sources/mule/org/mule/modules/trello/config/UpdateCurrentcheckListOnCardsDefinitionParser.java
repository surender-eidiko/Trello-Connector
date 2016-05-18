
package org.mule.modules.trello.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.trello.bean.holders.CardsCurrentCheckListPutRequestExpressionHolder;
import org.mule.modules.trello.processors.UpdateCurrentcheckListOnCardsMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-18T04:08:12+05:30", comments = "Build 3.7.x.2633.51164b9")
public class UpdateCurrentcheckListOnCardsDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(UpdateCurrentcheckListOnCardsDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(UpdateCurrentcheckListOnCardsMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [update-currentcheck-list-on-cards] within the connector [trello] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [update-currentcheck-list-on-cards] within the connector [trello] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("updateCurrentcheckListOnCards");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [update-currentcheck-list-on-cards] within the connector [trello] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "cardIdOrShortlink", "cardIdOrShortlink");
        parseProperty(builder, element, "idChecklistCurrent", "idChecklistCurrent");
        parseProperty(builder, element, "idCheckItem", "idCheckItem");
        if (!parseObjectRef(element, builder, "update-currentcheck-listy-id-pos-post-request", "updateCurrentcheckListyIdPosPostRequest")) {
            BeanDefinitionBuilder updateCurrentcheckListyIdPosPostRequestBuilder = BeanDefinitionBuilder.rootBeanDefinition(CardsCurrentCheckListPutRequestExpressionHolder.class.getName());
            Element updateCurrentcheckListyIdPosPostRequestChildElement = DomUtils.getChildElementByTagName(element, "update-currentcheck-listy-id-pos-post-request");
            if (updateCurrentcheckListyIdPosPostRequestChildElement!= null) {
                parseProperty(updateCurrentcheckListyIdPosPostRequestBuilder, updateCurrentcheckListyIdPosPostRequestChildElement, "idChecklistCurrent", "idChecklistCurrent");
                parseProperty(updateCurrentcheckListyIdPosPostRequestBuilder, updateCurrentcheckListyIdPosPostRequestChildElement, "idCheckItem", "idCheckItem");
                parseProperty(updateCurrentcheckListyIdPosPostRequestBuilder, updateCurrentcheckListyIdPosPostRequestChildElement, "name", "name");
                parseProperty(updateCurrentcheckListyIdPosPostRequestBuilder, updateCurrentcheckListyIdPosPostRequestChildElement, "state", "state");
                parseProperty(updateCurrentcheckListyIdPosPostRequestBuilder, updateCurrentcheckListyIdPosPostRequestChildElement, "idChecklist", "idChecklist");
                parseProperty(updateCurrentcheckListyIdPosPostRequestBuilder, updateCurrentcheckListyIdPosPostRequestChildElement, "pos", "pos");
                builder.addPropertyValue("updateCurrentcheckListyIdPosPostRequest", updateCurrentcheckListyIdPosPostRequestBuilder.getBeanDefinition());
            }
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}