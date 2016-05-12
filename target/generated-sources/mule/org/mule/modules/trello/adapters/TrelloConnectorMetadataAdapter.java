
package org.mule.modules.trello.adapters;

import javax.annotation.Generated;
import org.mule.api.MetadataAware;
import org.mule.modules.trello.TrelloConnector;


/**
 * A <code>TrelloConnectorMetadataAdapter</code> is a wrapper around {@link TrelloConnector } that adds support for querying metadata about the extension.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T12:43:23+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class TrelloConnectorMetadataAdapter
    extends TrelloConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "Trello";
    private final static String MODULE_VERSION = "1.0.0-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.7.0";
    private final static String DEVKIT_BUILD = "mule-devkit-3.7.0.2589.361fd9f";
    private final static String MIN_MULE_VERSION = "3.7.0";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

    public String getMinMuleVersion() {
        return MIN_MULE_VERSION;
    }

}
