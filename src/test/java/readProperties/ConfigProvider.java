package readProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class ConfigProvider {

    Config config = readConfig();

    static Config readConfig(){
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");
    }

    public static String URL = readConfig().getString("url");
    Integer AGE = readConfig().getInt("age");

    String ADMIN_LOGIN = readConfig().getString("usersParams.admin.login");
    String ADMIN_PASSWORD = readConfig().getString("usersParams.admin.password");
    static boolean IS_ADMIN_ADMIN = readConfig().getBoolean("usersParams.admin.isAdmin");

    public static String DEMO_PASSWORD = readConfig().getString("usersParams.demo.password");
    public static String DEMO_LOGIN = readConfig().getString("usersParams.demo.login");
    static boolean IS_DEMO_ADMIN = readConfig().getBoolean("usersParams.demo.isAdmin");


}
