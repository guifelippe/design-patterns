package design_patterns.authenticator.chainofresponsability;

public abstract class Authenticator
{
    protected Authenticator next;

    public void setNext(Authenticator next)
    {
        this.next = next;
    }

    public abstract boolean authenticate(String user, String password);
}
