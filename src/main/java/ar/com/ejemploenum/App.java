package ar.com.ejemploenum;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(UserStatus.ACTIVE.getStatusCode());
        System.out.println(UserStatus.DELETED.getStatusCode());
        System.out.println(UserStatus.INACTIVE.getStatusCode());
    }
}
