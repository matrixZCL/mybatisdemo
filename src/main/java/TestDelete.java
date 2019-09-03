
import com.mysql.cj.Session;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class TestDelete {
    public static void main(String[] args)throws Exception{
        InputStream is= Resources.getResourceAsStream("config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        PersonDao person=sqlSession.getMapper(PersonDao.class);

        person.delete(1111);

        sqlSession.commit();
        sqlSession.close();


    }
}
