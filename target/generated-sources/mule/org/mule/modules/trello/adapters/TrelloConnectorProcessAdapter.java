
package org.mule.modules.trello.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.devkit.internal.lic.LicenseValidatorFactory;
import org.mule.devkit.internal.lic.validator.LicenseValidator;
import org.mule.modules.trello.TrelloConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>TrelloConnectorProcessAdapter</code> is a wrapper around {@link TrelloConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-20T07:24:31+05:30", comments = "Build 3.7.x.2633.51164b9")
public class TrelloConnectorProcessAdapter
    extends TrelloConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<TrelloConnectorCapabilitiesAdapter> , Initialisable
{


    public<P >ProcessTemplate<P, TrelloConnectorCapabilitiesAdapter> getProcessTemplate() {
        final TrelloConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,TrelloConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, TrelloConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, TrelloConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

    @Override
    public void initialise()
        throws InitialisationException
    {
        super.initialise();
        checkMuleLicense();
    }

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    private void checkMuleLicense() {
        LicenseValidator licenseValidator = LicenseValidatorFactory.getValidator("Trello");
        licenseValidator.checkEnterpriseLicense(false);
    }

}
