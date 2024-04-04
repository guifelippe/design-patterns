package design_patterns.authenticator.factory;

import design_patterns.authenticator.chainofresponsability.Authenticator;
import design_patterns.authenticator.proxy.ProxyAuthenticator;

public class FactoryProxyAuthenticator extends FactoryAuthenticator
{
    @Override
    public Authenticator createAuthenticator()
    {
        return new ProxyAuthenticator();
    }
}
