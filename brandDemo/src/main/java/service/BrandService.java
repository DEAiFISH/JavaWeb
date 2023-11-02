package service;

import bean.Brand;
import mapper.BrandMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

import static util.SqlSessionFactoryUtils.getSqlSessionFactory;

/**
 * @author qingyuan
 */
public class BrandService {
    SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    public List<Brand> selectAll() {

        SqlSession sqlSession = sqlSessionFactory.openSession();

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        List<Brand> brandList = mapper.selectAll();

        sqlSession.close();

        return brandList;
    }

    public void add(Brand brand) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        mapper.add(brand);

        sqlSession.commit();

        sqlSession.close();
    }

    public void update(Brand brand) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        mapper.update(brand);

        sqlSession.commit();

        sqlSession.close();
    }

    public Brand selectById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        Brand brand = mapper.selectById(id);

        sqlSession.close();

        return brand;
    }

    public void deleteById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        mapper.deleteById(id);

        sqlSession.commit();

        sqlSession.close();
    }
}
