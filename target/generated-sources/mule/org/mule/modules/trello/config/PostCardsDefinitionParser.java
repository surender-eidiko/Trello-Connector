
package org.mule.modules.trello.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.trello.bean.holders.CardsPostRequestExpressionHolder;
import org.mule.modules.trello.processors.PostCardsMessageProcessor;
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
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T12:43:23+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class PostCardsDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(PostCardsDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(PostCardsMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [post-cards] within the connector [trello] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [post-cards] within the connector [trello] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("postCards");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [post-cards] within the connector [trello] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        if (!parseObjectRef(element, builder, "cards-posr-req", "cardsPosrReq")) {
            BeanDefinitionBuilder cardsPosrReqBuilder = BeanDefinitionBuilder.rootBeanDefinition(CardsPostRequestExpressionHolder.class.getName());
            Element cardsPosrReqChildElement = DomUtils.getChildElementByTagName(element, "cards-posr-req");
            if (cardsPosrReqChildElement!= null) {
                parseProperty(cardsPosrReqBuilder, cardsPosrReqChildElement, "name", "name");
                parseProperty(cardsPosrReqBuilder, cardsPosrReqChildElement, "desc", "desc");
                parseProperty(cardsPosrReqBuilder, cardsPosrReqChildElement, "pos", "pos");
                parseProperty(cardsPosrReqBuilder, cardsPosrReqChildElement, "due", "due");
                parseProperty(cardsPosrReqBuilder, cardsPosrReqChildElement, "idList", "idList");
                parseProperty(cardsPosrReqBuilder, cardsPosrReqChildElement, "idMembers", "idMembers");
                parseProperty(cardsPosrReqBuilder, cardsPosrReqChildElement, "idLabels", "idLabels");
                parseProperty(cardsPosrReqBuilder, cardsPosrReqChildElement, "urlSource", "urlSource");
                parseProperty(cardsPosrReqBuilder, cardsPosrReqChildElement, "fileSource", "fileSource");
                parseProperty(cardsPosrReqBuilder, cardsPosrReqChildElement, "idCardSource", "idCardSource");
                parseProperty(cardsPosrReqBuilder, cardsPosrReqChildElement, "keepFromSource", "keepFromSource");
                builder.addPropertyValue("cardsPosrReq", cardsPosrReqBuilder.getBeanDefinition());
            }
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
