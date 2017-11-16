
package org.mule.modules.infostate.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.infostate.InfoStateConnector;


/**
 * A <code>InfoStateConnectorCapabilitiesAdapter</code> is a wrapper around {@link InfoStateConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-11-17T02:27:07+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public abstract class InfoStateConnectorCapabilitiesAdapter
    extends InfoStateConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
