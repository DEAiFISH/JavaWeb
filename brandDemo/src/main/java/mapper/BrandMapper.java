package mapper;

import bean.Brand;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author qingyuan
 */
public interface BrandMapper {

    /**
     * 查询所有数据
     *
     * @return 所有数据信息
     */
    @Select("SELECT * FROM tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();

    @Select("insert into tb_brand(brand_name, company_name, ordered, description, status)\n" +
            "values(#{brandName},#{companyName},#{ordered},#{description},#{status});")
    void add(Brand brand);

    @Update("update tb_brand set " +
            "brand_name = #{brandName},company_name = #{companyName},ordered = #{ordered}," +
            "description = #{description},status = #{status} where id = #{id}")
    void update(Brand brand);


    @Select("select * from tb_brand where id = #{id}")
    @ResultMap("brandResultMap")
    Brand selectById(Integer id);


    @Delete("delete from tb_brand where id = #{id}")
    @ResultMap("brandResultMap")
    void deleteById(Integer id);
}
