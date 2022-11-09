package readProperties;

import org.junit.Test;

import java.io.IOException;

public class PropertiesTest {


  @Test
  public void readFromConf(){
    String urlFromConfig = ConfigProvider.URL;
    System.out.println(urlFromConfig);
    Boolean isDemoAdmin = ConfigProvider.IS_DEMO_ADMIN;
    System.out.println(isDemoAdmin);
    if (ConfigProvider.readConfig().getBoolean("usersParams.admin.isAdmin")){
      System.out.println("Admin really admin");
    }
    else {
      System.out.println("On ne admin");
    }
  }
}
