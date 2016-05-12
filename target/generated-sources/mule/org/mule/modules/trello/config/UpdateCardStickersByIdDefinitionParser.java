
package org.mule.modules.trello.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.trello.bean.holders.CardsStickerPutRequestExpressionHolder;
import org.mule.modules.trello.processors.UpdateCardStickersByIdMessageProcessor;
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
public class UpdateCardStickersByIdDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(UpdateCardStickersByIdDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(UpdateCardStickersByIdMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [update-card-stickers-by-id] within the connector [trello] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [update-card-stickers-by-id] within the connector [trello] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("updateCardStickersById");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [update-card-stickers-by-id] within the connector [trello] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "cardIdOrShortlink", "cardIdOrShortlink");
        parseProperty(builder, element, "idSticker", "idSticker");
        if (!parseObjectRef(element, builder, "update-cards-sticker-put-req", "updateCardsStickerPutReq")) {
            BeanDefinitionBuilder updateCardsStickerPutReqBuilder = BeanDefinitionBuilder.rootBeanDefinition(CardsStickerPutRequestExpressionHolder.class.getName());
            Element updateCardsStickerPutReqChildElement = DomUtils.getChildElementByTagName(element, "update-cards-sticker-put-req");
            if (updateCardsStickerPutReqChildElement!= null) {
                parseProperty(updateCardsStickerPutReqBuilder, updateCardsStickerPutReqChildElement, "idSticker", "idSticker");
                parseProperty(updateCardsStickerPutReqBuilder, updateCardsStickerPutReqChildElement, "top", "top");
                parseProperty(updateCardsStickerPutReqBuilder, updateCardsStickerPutReqChildElement, "left", "left");
                parseProperty(updateCardsStickerPutReqBuilder, updateCardsStickerPutReqChildElement, "zIndex", "zIndex");
                parseProperty(updateCardsStickerPutReqBuilder, updateCardsStickerPutReqChildElement, "rotate", "rotate");
                builder.addPropertyValue("updateCardsStickerPutReq", updateCardsStickerPutReqBuilder.getBeanDefinition());
            }
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
