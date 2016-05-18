
package org.mule.modules.trello.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.trello.bean.holders.CardsCheckListsByIdPostRequestExpressionHolder;
import org.mule.modules.trello.processors.PostCardsCheckListsByIdMessageProcessor;
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
public class PostCardsCheckListsByIdDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(PostCardsCheckListsByIdDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(PostCardsCheckListsByIdMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [post-cards-check-lists-by-id] within the connector [trello] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [post-cards-check-lists-by-id] within the connector [trello] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("postCardsCheckListsById");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [post-cards-check-lists-by-id] within the connector [trello] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "cardIdOrShortlink", "cardIdOrShortlink");
        parseProperty(builder, element, "idCheckList", "idCheckList");
        if (!parseObjectRef(element, builder, "post-card-checklists-by-id-post-req", "postCardChecklistsByIdPostReq")) {
            BeanDefinitionBuilder postCardChecklistsByIdPostReqBuilder = BeanDefinitionBuilder.rootBeanDefinition(CardsCheckListsByIdPostRequestExpressionHolder.class.getName());
            Element postCardChecklistsByIdPostReqChildElement = DomUtils.getChildElementByTagName(element, "post-card-checklists-by-id-post-req");
            if (postCardChecklistsByIdPostReqChildElement!= null) {
                parseProperty(postCardChecklistsByIdPostReqBuilder, postCardChecklistsByIdPostReqChildElement, "idChecklist", "idChecklist");
                parseProperty(postCardChecklistsByIdPostReqBuilder, postCardChecklistsByIdPostReqChildElement, "name", "name");
                parseProperty(postCardChecklistsByIdPostReqBuilder, postCardChecklistsByIdPostReqChildElement, "pos", "pos");
                builder.addPropertyValue("postCardChecklistsByIdPostReq", postCardChecklistsByIdPostReqBuilder.getBeanDefinition());
            }
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
