import com.chen.utils.DruidUntils;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;

/**
 * @author chenyam
 * @title: test1
 * @projectName javaweb
 * @description: TODO
 * @date 2019/6/26 19:32
 */
public class test1 {
    @Test
    public void test1() throws IOException {
        Connection connection = DruidUntils.getConnection();
        System.out.println(connection);

    }
}
