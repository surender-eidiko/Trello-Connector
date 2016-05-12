
package org.mule.modules.trello.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.trello.bean.holders.ListsPostRequestExpressionHolder;
import org.mule.modules.trello.processors.PostListsMessageProcessor;
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
public class PostListsDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(PostListsDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(PostListsMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [post-lists] within the connector [trello] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [post-lists] within the connector [trello] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("postLists");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [post-lists] within the connector [trello] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        if (!parseObjectRef(element, builder, "listss-post-req", "listssPostReq")) {
            BeanDefinitionBuilder listssPostReqBuilder = BeanDefinitionBuilder.rootBeanDefinition(ListsPostRequestExpressionHolder.class.getName());
            Element listssPostReqChildElement = DomUtils.getChildElementByTagName(element, "listss-post-req");
            if (listssPostReqChildElement!= null) {
                parseProperty(listssPostReqBuilder, listssPostReqChildElement, "name", "name");
                parseProperty(listssPostReqBuilder, listssPostReqChildElement, "idBoard", "idBoard");
                parseProperty(listssPostReqBuilder, listssPostReqChildElement, "idListSource", "idListSource");
                parseProperty(listssPostReqBuilder, listssPostReqChildElement, "pos", "pos");
                builder.addPropertyValue("listssPostReq", listssPostReqBuilder.getBeanDefinition());
            }
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}