package hello.jdbc.connection;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.assertj.core.api.Assertions.*;

@Slf4j
class DBConnectionUtilTest {

    @Test
    public void connection(){
        Connection connection = DBConnectionUtil.getConnection();
        assertThat(connection).isNotNull();

    }
}
