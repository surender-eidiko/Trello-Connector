
package org.mule.modules.trello.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.trello.bean.holders.CardsMembersVotedPostRequestExpressionHolder;
import org.mule.modules.trello.processors.PostCardsMembersVotedByIdMessageProcessor;
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
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-20T07:24:31+05:30", comments = "Build 3.7.x.2633.51164b9")
public class PostCardsMembersVotedByIdDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(PostCardsMembersVotedByIdDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(PostCardsMembersVotedByIdMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [post-cards-members-voted-by-id] within the connector [trello] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [post-cards-members-voted-by-id] within the connector [trello] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("postCardsMembersVotedById");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [post-cards-members-voted-by-id] within the connector [trello] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "cardIdOrShortlink", "cardIdOrShortlink");
        if (!parseObjectRef(element, builder, "post-cards-membedrs-voted-post-req", "postCardsMembedrsVotedPostReq")) {
            BeanDefinitionBuilder postCardsMembedrsVotedPostReqBuilder = BeanDefinitionBuilder.rootBeanDefinition(CardsMembersVotedPostRequestExpressionHolder.class.getName());
            Element postCardsMembedrsVotedPostReqChildElement = DomUtils.getChildElementByTagName(element, "post-cards-membedrs-voted-post-req");
            if (postCardsMembedrsVotedPostReqChildElement!= null) {
                parseProperty(postCardsMembedrsVotedPostReqBuilder, postCardsMembedrsVotedPostReqChildElement, "value", "value");
                builder.addPropertyValue("postCardsMembedrsVotedPostReq", postCardsMembedrsVotedPostReqBuilder.getBeanDefinition());
            }
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
