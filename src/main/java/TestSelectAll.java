import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class TestSelectAll {
    public static void main(String[] args)throws Exception{
//        InputStream is=Resources.getResourceAsStream("config.xml");
//        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=MybatisUtil1.getSqlSession();
        PersonDao personDao=sqlSession.getMapper(PersonDao.class);

        List<Person> list=personDao.selectAll();
        for(Person p:list){
            System.out.println(p);
        }


    }
}
