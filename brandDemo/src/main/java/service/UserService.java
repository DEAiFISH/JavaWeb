package service;

import bean.User;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import static util.SqlSessionFactoryUtils.getSqlSessionFactory;


public class UserService {
    SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

    /**
     * 登录方法
     *
     * @param user
     * @return
     */
    public User login(User user) {

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User u = mapper.select(user);

        sqlSession.close();

        return u;
    }

    public boolean register(User user) {

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User u = mapper.selectByUsername(user.getUsername());

        if (u == null) {
            // 用户名不存在，注册
            mapper.add(user);
            sqlSession.commit();
        }

        sqlSession.close();

        return u == null;
    }
}
