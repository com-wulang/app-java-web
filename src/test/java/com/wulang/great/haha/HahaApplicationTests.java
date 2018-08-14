package com.wulang.great.haha;

import com.wulang.great.haha.dao.CountryMapper;
import com.wulang.great.haha.entity.Country;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HahaApplicationTests {

    @Autowired
    private CountryMapper countryMapper;

    @Test
    public void contextLoads() {
        Country country=new Country();
        country.setCountryCode("1152");
        country.setCountryName("langge");
        countryMapper.insert(country);
    }

}
