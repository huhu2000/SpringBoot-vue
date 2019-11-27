package com.boylegu.springboot_vue;

import net.minidev.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.boylegu.springboot_vue.controller.MainController;
import com.boylegu.springboot_vue.entities.Persons;
import com.boylegu.springboot_vue.dao.PersonsRepository;
import org.springframework.web.context.WebApplicationContext;


/**
 * @author Boyle Gu
 * @version 0.0.1
 * @GitHub https://github.com/boylegu
 */

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:application.properties")
@SpringBootTest(classes = { App.class })
@WebAppConfiguration
public class SpringbootVueApplicationTests {

    private MockMvc mvc;

    @Autowired
    PersonsRepository personsRepository;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

   /*     Persons persons = new Persons();
        persons.setZone("t1 zone");
        persons.setPhone("11111");
        persons.setEmail("t1@qq.com");
        persons.setUsername("t1");
        personsRepository.save(persons);*/

    }


    @Test
    public void testUserController() throws Exception {
//  	Test MainController
        RequestBuilder request = null;

        //测试修改
         JSONObject jsonObject = new JSONObject();
        jsonObject.put("phone", "111111");
        jsonObject.put("email", "test@qq.com");

        mvc.perform(MockMvcRequestBuilders.put("/api/persons/detail/49")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonObject.toJSONString())
        ).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());


       //测试查询
     /*   request = get("/api/persons/")
                .param("page","1")
                .param("sex","1")
                .param("email","test@163.com");

        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("{\"data\":{\"count\":7,\"page\":1,\"results\":[],\"total\":0}}")));
*/

   /*  request = put("/api/persons/detail/1")
                .param("phone", "111111")
                .param("email", "test@qq.com");
     mvc.perform(request);*/
        //mvc.perform(request).andExpect(content().string(equalTo("success")));

     /*   request = get("/api/persons/sex");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));

        request = get("/api/persons/");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));

        request = get("/api/persons/detail/1");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[{\"id\":1,\"username\":\"test\",\"zone\":20}]")));
*/


     /*   request = get("/api/persons");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));*/

    }

}



        /*
        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);
        /*
        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                /*
        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                /*
        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                /*
        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                /*
        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                /*
        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

                Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);



        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);


        Persons persons2 = new Persons();
        persons2.setZone("t1 zone");
        persons2.setPhone("11111");
        persons2.setEmail("t1@qq.com");
        persons2.setUsername("t1");
        personsRepository.save(persons2);

        */
