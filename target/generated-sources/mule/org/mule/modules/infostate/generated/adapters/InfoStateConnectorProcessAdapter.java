
package org.mule.modules.infostate.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.infostate.InfoStateConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>InfoStateConnectorProcessAdapter</code> is a wrapper around {@link InfoStateConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-11-17T02:27:07+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public abstract class InfoStateConnectorProcessAdapter
    extends InfoStateConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<InfoStateConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, InfoStateConnectorCapabilitiesAdapter> getProcessTemplate() {
        final InfoStateConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,InfoStateConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, InfoStateConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, InfoStateConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
