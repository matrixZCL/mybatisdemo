import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test {
    public static void main(String[] args)throws Exception{
        InputStream is=Resources.getResourceAsStream("config1.xml");

        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();

        PersonDao personDao=session.getMapper(PersonDao.class);
        personDao.insert(new Person(1111,"dog",1,22,"sh","china"));//????自增

        session.commit();
        session.close();


    }
}
