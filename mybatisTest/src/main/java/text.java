import bean.Department;
import bean.Employee;
import mapper.DepartmentMapper;
import mapper.EmployeeMapper;
import mapper.GoodsMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

import static util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class text {
    SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

    @Test
    public void Test1() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);

        List list = mapper.selectAll();

        list.forEach(System.out::println);
    }

    @Test
    public void Test2() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<Employee> employees = mapper.selectAllOfEmployee();

        employees.forEach(System.out::println);
    }

    @Test
    public void Test3() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        Employee employee = mapper.selectEmployeeByName("令狐冲");

        System.out.println("employee = " + employee);

        System.out.println("employee.getDepartment() = " + employee.getDepartment());
    }

    @Test
    public void Tes4() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);

        Department department = mapper.selectDepartmentByName("华山");

        System.out.println(department.getDeptId());
    }

    @Test
    public void Test5() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<Employee> employeeList = mapper.selectEmployee(new Employee(null, null, null, 1));

        employeeList.forEach(System.out::println);
    }

}
