package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.UserDao;
import kr.re.kitri.hello.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void registUser(User user) {
        userDao.insertUser(user);
    }
}
