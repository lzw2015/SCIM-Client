package gluu.scim2.client;

import org.xdi.oxauth.model.util.SecurityProviderUtility;

/**
 * Created by eugeniuparvan on 2/20/17.
 */
public class ScimClientFactory {
    public static ScimClient getClient(String domain, String umaMetaDataUrl, String umaAatClientId, String umaAatClientJksPath, String umaAatClientJksPassword, String umaAatClientKeyId) {
        SecurityProviderUtility.installBCProvider();
        return new UmaScimClient(domain, umaMetaDataUrl, umaAatClientId, umaAatClientJksPath, umaAatClientJksPassword, umaAatClientKeyId);
    }
}
