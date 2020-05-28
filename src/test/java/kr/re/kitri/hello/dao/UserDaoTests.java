package kr.re.kitri.hello.dao;

import static org.junit.jupiter.api.Assertions.*;
import kr.re.kitri.hello.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserDaoTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void testInsertUser() {
        User user = new User("kwon", "soonja", 50);
        userDao.insertUser(user);
    }

    @Test
    public void testSelectAllusers() {

        /*
            import org.junit.jupiter.api.Assertions;
            import org.junit.jupiter.api.Test;
        */
        List<User> users = userDao.selectAllusers();
        // 이 조건이면 테스트통과
        assertTrue(users.size() > 0); // 통과
        //Assertions.assertTrue(users.size() < 0); // 실패
        //Assertions.assertTrue(users.size() > 0); // 통과
    }

    @Test
    public void testSelectUserByUserId() {
        User user = userDao.selectUserByUserId("jeong");
        assertEquals("Jeong", user.getUserId());
    }

}
