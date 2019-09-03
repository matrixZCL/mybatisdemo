import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class TestSelect {
    public static void main(String[] args)throws Exception{
        InputStream is=Resources.getResourceAsStream("config1.xml");
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sessionFactory.openSession();
        PersonDao personDao=sqlSession.getMapper(PersonDao.class);

        Person person=personDao.selectById(100);
        System.out.println(person);
    }
}
