package design_patterns.authenticator.chainofresponsability;

public class SimpleAuthenticator extends Authenticator
{
    @Override
    public boolean authenticate(String user, String password)
    {
        if(user.equals("adm") && password.equals("adm123"))
        {
            System.out.println("Successful authentication");
            return true;
        }
        else if(next != null)
        {
            return next.authenticate(user, password);
        }
        else
        {
            System.out.println("Failed authentication");
            return false;
        }
    }
}
