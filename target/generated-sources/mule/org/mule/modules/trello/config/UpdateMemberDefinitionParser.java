
package org.mule.modules.trello.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.trello.bean.holders.PrefsPutRequestExpressionHolder;
import org.mule.modules.trello.bean.holders.UpdateMemberPutRequestExpressionHolder;
import org.mule.modules.trello.processors.UpdateMemberMessageProcessor;
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
public class UpdateMemberDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(UpdateMemberDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(UpdateMemberMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [update-member] within the connector [trello] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [update-member] within the connector [trello] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("updateMember");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [update-member] within the connector [trello] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "memberId", "memberId");
        if (!parseObjectRef(element, builder, "request", "request")) {
            BeanDefinitionBuilder requestBuilder = BeanDefinitionBuilder.rootBeanDefinition(UpdateMemberPutRequestExpressionHolder.class.getName());
            Element requestChildElement = DomUtils.getChildElementByTagName(element, "request");
            if (requestChildElement!= null) {
                parseProperty(requestBuilder, requestChildElement, "fullName", "fullName");
                parseProperty(requestBuilder, requestChildElement, "initials", "initials");
                parseProperty(requestBuilder, requestChildElement, "username", "username");
                parseProperty(requestBuilder, requestChildElement, "bio", "bio");
                parseProperty(requestBuilder, requestChildElement, "avatarSource", "avatarSource");
                if (!parseObjectRef(requestChildElement, requestBuilder, "pref", "pref")) {
                    BeanDefinitionBuilder _prefBuilder = BeanDefinitionBuilder.rootBeanDefinition(PrefsPutRequestExpressionHolder.class.getName());
                    Element _prefChildElement = DomUtils.getChildElementByTagName(requestChildElement, "pref");
                    if (_prefChildElement!= null) {
                        parseProperty(_prefBuilder, _prefChildElement, "colorBlind", "colorBlind");
                        parseProperty(_prefBuilder, _prefChildElement, "locale", "locale");
                        parseProperty(_prefBuilder, _prefChildElement, "minutesBetweenSummaries", "minutesBetweenSummaries");
                        requestBuilder.addPropertyValue("pref", _prefBuilder.getBeanDefinition());
                    }
                }
                builder.addPropertyValue("request", requestBuilder.getBeanDefinition());
            }
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
