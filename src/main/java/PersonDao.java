import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonDao {

    void insert(Person person);
    void update(Person person);
    void delete(@Param("id") Integer id);//mapper绑定限定id名
    Person selectById(Integer id);
    List<Person> selectAll();

    Person selectIdAndName(@Param("id") Integer id,@Param("name") String name);//两个参数的查询可以用@param
    Person selectIdAndNameUseSeq(Integer id,String name);//两个参数的查询利用序号

    List<Person> selectByStartEnd(Integer start,Integer end);
}
