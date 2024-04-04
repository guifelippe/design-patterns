package design_patterns.authenticator.proxy;

import design_patterns.authenticator.chainofresponsability.Authenticator;
import design_patterns.authenticator.chainofresponsability.SimpleAuthenticator;

public class ProxyAuthenticator extends Authenticator
{
    private SimpleAuthenticator simpleAuthenticator;

    @Override
    public boolean authenticate(String user, String password)
    {
        if(simpleAuthenticator == null)
        {
            simpleAuthenticator = new SimpleAuthenticator();
        }

        return simpleAuthenticator.authenticate(user, password);
    }

    public void setSimpleAuthenticator(SimpleAuthenticator simpleAuthenticator)
    {
        this.simpleAuthenticator = simpleAuthenticator;
    }
}
