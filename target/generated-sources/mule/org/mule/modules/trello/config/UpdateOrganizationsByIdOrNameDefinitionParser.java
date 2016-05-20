
package org.mule.modules.trello.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.trello.bean.holders.BoardVisibilityRestrictExpressionHolder;
import org.mule.modules.trello.bean.holders.OrganizationPrefExpressionHolder;
import org.mule.modules.trello.bean.holders.OrganizationPutRequestExpressionHolder;
import org.mule.modules.trello.processors.UpdateOrganizationsByIdOrNameMessageProcessor;
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
public class UpdateOrganizationsByIdOrNameDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(UpdateOrganizationsByIdOrNameDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(UpdateOrganizationsByIdOrNameMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [update-organizations-by-id-or-name] within the connector [trello] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [update-organizations-by-id-or-name] within the connector [trello] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("updateOrganizationsByIdOrName");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [update-organizations-by-id-or-name] within the connector [trello] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "organizationId", "organizationId");
        if (!parseObjectRef(element, builder, "organization-put-req", "organizationPutReq")) {
            BeanDefinitionBuilder organizationPutReqBuilder = BeanDefinitionBuilder.rootBeanDefinition(OrganizationPutRequestExpressionHolder.class.getName());
            Element organizationPutReqChildElement = DomUtils.getChildElementByTagName(element, "organization-put-req");
            if (organizationPutReqChildElement!= null) {
                parseProperty(organizationPutReqBuilder, organizationPutReqChildElement, "name", "name");
                parseProperty(organizationPutReqBuilder, organizationPutReqChildElement, "displayName", "displayName");
                parseProperty(organizationPutReqBuilder, organizationPutReqChildElement, "desc", "desc");
                parseProperty(organizationPutReqBuilder, organizationPutReqChildElement, "website", "website");
                if (!parseObjectRef(organizationPutReqChildElement, organizationPutReqBuilder, "pref", "pref")) {
                    BeanDefinitionBuilder _prefBuilder = BeanDefinitionBuilder.rootBeanDefinition(OrganizationPrefExpressionHolder.class.getName());
                    Element _prefChildElement = DomUtils.getChildElementByTagName(organizationPutReqChildElement, "pref");
                    if (_prefChildElement!= null) {
                        parseProperty(_prefBuilder, _prefChildElement, "orgInviteRestrict", "orgInviteRestrict");
                        parseProperty(_prefBuilder, _prefChildElement, "externalMembersDisabled", "externalMembersDisabled");
                        parseProperty(_prefBuilder, _prefChildElement, "associatedDomain", "associatedDomain");
                        parseProperty(_prefBuilder, _prefChildElement, "googleAppsVersion", "googleAppsVersion");
                        if (!parseObjectRef(_prefChildElement, _prefBuilder, "board-visibility-restrict", "boardVisibilityRestrict")) {
                            BeanDefinitionBuilder __boardVisibilityRestrictBuilder = BeanDefinitionBuilder.rootBeanDefinition(BoardVisibilityRestrictExpressionHolder.class.getName());
                            Element __boardVisibilityRestrictChildElement = DomUtils.getChildElementByTagName(_prefChildElement, "board-visibility-restrict");
                            if (__boardVisibilityRestrictChildElement!= null) {
                                parseProperty(__boardVisibilityRestrictBuilder, __boardVisibilityRestrictChildElement, "privateValue", "privateValue");
                                parseProperty(__boardVisibilityRestrictBuilder, __boardVisibilityRestrictChildElement, "org", "org");
                                parseProperty(__boardVisibilityRestrictBuilder, __boardVisibilityRestrictChildElement, "publicValue", "publicValue");
                                _prefBuilder.addPropertyValue("boardVisibilityRestrict", __boardVisibilityRestrictBuilder.getBeanDefinition());
                            }
                        }
                        parseProperty(_prefBuilder, _prefChildElement, "permissionLevel", "permissionLevel");
                        organizationPutReqBuilder.addPropertyValue("pref", _prefBuilder.getBeanDefinition());
                    }
                }
                builder.addPropertyValue("organizationPutReq", organizationPutReqBuilder.getBeanDefinition());
            }
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
