import bean.Emp;
import mapper.EmpMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import static util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class test {
    SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

    @Test
    public void Test1() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        Emp emp = mapper.selectByPrimaryKey(1);

        System.out.println(emp);
    }
}
