package design_patterns.authenticator;

import design_patterns.authenticator.chainofresponsability.Authenticator;
import design_patterns.authenticator.chainofresponsability.SimpleAuthenticator;
import design_patterns.authenticator.factory.FactoryAuthenticator;
import design_patterns.authenticator.factory.FactoryProxyAuthenticator;
import design_patterns.authenticator.proxy.ProxyAuthenticator;

public class Main
{
    public static void main(String[] args) {
        FactoryAuthenticator factory = new FactoryProxyAuthenticator();

        Authenticator authenticator = factory.createAuthenticator();

        SimpleAuthenticator simpleAuthenticator = new SimpleAuthenticator();
        SimpleAuthenticator simpleAuthenticatorWithToken = new SimpleAuthenticator();
        simpleAuthenticator.setNext(simpleAuthenticatorWithToken);

        authenticator.authenticate("user", "user123");
        authenticator.authenticate("adm", "adm123");
    }
}
