import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wy.dao.CountryMapper;
import com.wy.model.Country;

import tk.mybatis.mapper.entity.Example;

/**  
* <p>Title: SpringMybatisTest.java</p>  
* <p>Description: </p>  
* <p>Copyright: enso Copyright (c) 2018</p>  
* <p>email: 867986155@qq.com</p>  
* @author Wang&Yang 
* @date 2018-05-01 
* @version 1.0  
*/
@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试  
@ContextConfiguration(locations={"classpath:config/spring/applicationContext.xml"}) //加载配置文件   
public class SpringMybatisTest {
	@Autowired
	CountryMapper mapper;
	
	@Test
	public void testSelect() throws Exception {
		Country country = mapper.selectByPrimaryKey(1);
		System.out.println(JSON.toJSONString(country));
	}
	
	@Test
	public void testMySelect() throws Exception {
		List<Country> countrys = mapper.mySelect("CN");
		System.out.println(JSON.toJSONString(countrys));
	}
	
	@Test
	public void testCri() throws Exception {
		Example example=new Example(Country.class);
		example.createCriteria().andEqualTo("countryname", "中国");
		mapper.selectByExample(example);
	}
	
	@Test
	public void testPageHelper() throws Exception {
	        Example example = new Example(Country.class);
	        //example.createCriteria().andGreaterThan("id",2);
	        PageHelper.startPage(2,1);
	        List<Country> countries = mapper.selectByExample(example);
	        PageInfo<Country> pageInfo = new PageInfo<Country>(countries);
	        System.out.println(pageInfo.getTotal());

	        countries = mapper.selectByExample(example);
	        pageInfo = new PageInfo<Country>(countries);
	        System.out.println(pageInfo.getTotal());
	}
}
