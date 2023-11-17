package util;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources({"classpath:${env}.properties"})
public interface Env extends Config
{
    Env config = ConfigFactory.create(Env.class,System.getenv(),System.getProperties());

    @Key("url")
    String url();

    @Key("username")
    String username();

    @Key("password")
    String passowrd();
    @Key("vname")
    String vname();
   @Key("ipass")
    String ipass();
   @Key("iname")
    String name();
    @Key("vpass1")
    String pass1();
    @Key("url1")
    String url1();
    @Key("emailid1")
    String emailid1();
}
