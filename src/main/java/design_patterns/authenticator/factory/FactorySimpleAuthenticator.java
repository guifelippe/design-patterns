package design_patterns.authenticator.factory;

import design_patterns.authenticator.chainofresponsability.Authenticator;
import design_patterns.authenticator.chainofresponsability.SimpleAuthenticator;

public class FactorySimpleAuthenticator extends FactoryAuthenticator
{
    @Override
    public Authenticator createAuthenticator()
    {
        return new SimpleAuthenticator();
    }
}
