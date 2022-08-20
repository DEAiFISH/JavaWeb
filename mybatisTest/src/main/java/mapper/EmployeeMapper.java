package mapper;

import bean.Employee;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface EmployeeMapper {
    @Select("select * from t_emp")
//    @ResultMap("groupWithEmployee")

    @Results(id = "groupWithEmployee", value = {
            @Result(column = "empno", property = "id"),
    })
    List<Employee> selectAllOfEmployee();

    @Results(id = "employeeMap", value = {
            @Result(column = "empno", property = "id"),
            @Result(column = "deptId", property = "department", one = @One(select = "mapper.DepartmentMapper.selectDepartmentById", fetchType = FetchType.LAZY))
    })
    @Select("select * from t_emp where name = #{name}")
    Employee selectEmployeeByName(String name);

    @ResultMap("groupWithEmployee")
    @Select("select empno,name,age,deptId from t_emp where deptId = #{deptId}")
    List<Employee> selectEmpByDeptId(Integer deptId);


    // 动态SQL


    @Select("<script> SELECT * FROM t_emp " +
            "<where>" +
            "<if test= \"id != null and id != ''\"> empno = #{id} </if>" +
            "<if test= \"name != null and name != ''\"> and name = #{name} </if>" +
            "<if test= \"age != null and name != ''\"> and age = #{age} </if>" +
            "<if test= \"deptId != null and name != ''\"> and deptId = #{deptId} </if>" +
            "</where>" +
            "</script>")
    List<Employee> selectEmployee(Employee employee);
}
