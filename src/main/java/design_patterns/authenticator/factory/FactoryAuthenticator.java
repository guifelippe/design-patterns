package design_patterns.authenticator.factory;

import design_patterns.authenticator.chainofresponsability.Authenticator;

public abstract class FactoryAuthenticator
{
    public abstract Authenticator createAuthenticator();
}
