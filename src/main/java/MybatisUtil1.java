import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil1 {
    private static SqlSessionFactory sqlSessionFactory=null;
    static {
        InputStream is=null;
        try {
            is=Resources.getResourceAsStream("config.xml");
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static SqlSession getSqlSession()throws Exception{

        SqlSession sqlSession=sqlSessionFactory.openSession();
        return sqlSession;
    }
}
