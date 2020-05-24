package anno;

import org.springframework.stereotype.Component;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/11/8
 * @Version 1.0
 */
@Component
public class ImplUserDao implements UserDao {

    public String getUser() {
        return "cb";
    }
}
