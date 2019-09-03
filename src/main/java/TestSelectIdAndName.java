import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class TestSelectIdAndName {
    public static void main(String[] args)throws Exception{
        InputStream is=Resources.getResourceAsStream("config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        PersonDao personDao=sqlSession.getMapper(PersonDao.class);

        Person person=personDao.selectIdAndName(100,"tom");
        System.out.println(person);

        Person person1=personDao.selectIdAndNameUseSeq(100,"tom");
        System.out.println(person1);


    }
}
