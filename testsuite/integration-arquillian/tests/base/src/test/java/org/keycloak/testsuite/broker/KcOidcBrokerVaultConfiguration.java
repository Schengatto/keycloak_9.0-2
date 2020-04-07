package org.keycloak.testsuite.broker;

import org.keycloak.representations.idm.IdentityProviderRepresentation;
import org.keycloak.testsuite.arquillian.SuiteContext;

import static org.keycloak.testsuite.broker.BrokerTestConstants.VAULT_CLIENT_SECRET;

/**
 * @author Martin Kanis <mkanis@redhat.com>
 */
public class KcOidcBrokerVaultConfiguration extends KcOidcBrokerConfiguration {

    public static final KcOidcBrokerVaultConfiguration INSTANCE = new KcOidcBrokerVaultConfiguration();

    @Override
    public IdentityProviderRepresentation setUpIdentityProvider(SuiteContext suiteContext) {
        IdentityProviderRepresentation idpRep = super.setUpIdentityProvider(suiteContext);

        idpRep.getConfig().put("clientSecret", VAULT_CLIENT_SECRET);

        return idpRep;
    }
}
