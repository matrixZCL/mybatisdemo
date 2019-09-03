import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Testupdate {
    public static void main(String[] args)throws Exception{
        InputStream is=Resources.getResourceAsStream("config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        PersonDao personDao=session.getMapper(PersonDao.class);

        Person p=new Person(1111,"pig",1,11,"diiqu","asda");
        personDao.update(p);
        session.commit();
        session.close();
        is.close();


    }
}
