package com.boylegu.springboot_vue.controller;

import com.boylegu.springboot_vue.entities.Persons;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.PageRequest;

import com.boylegu.springboot_vue.dao.PersonsRepository;
import com.boylegu.springboot_vue.controller.pagination.PaginationMultiTypeValuesHelper;
import com.boylegu.springboot_vue.controller.pagination.PaginationFormatting;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;


@RestController
@RequestMapping("/api/persons")
public class MainController {

    @Autowired
    private PersonsRepository personsRepository;

    @Value(("${com.boylegu.paginatio.max-per-page}"))
    Integer maxPerPage;

    @RequestMapping(value = "/sex", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getSexAll() {

        /*
         * @api {GET} /api/persons/sex Get all sexList
         * @apiName GetAllSexList
         * @apiGroup Info Manage
         * @apiVersion 1.0.0
         * @apiExample {httpie} Example usage:
         *
         *     http /api/persons/sex
         *
         * @apiSuccess {String} label
         * @apiSuccess {String} value
         */

        ArrayList<Map<String, String>> results = new ArrayList<>();

        for (Object value : personsRepository.findSex()) {

            Map<String, String> sex = new HashMap<>();

            sex.put("label", value.toString());

            sex.put("value", value.toString());

            results.add(sex);
        }

        ResponseEntity<ArrayList<Map<String, String>>> responseEntity = new ResponseEntity<>(results,
                HttpStatus.OK);

        return responseEntity;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, PaginationMultiTypeValuesHelper> getPersonsAll(
            @RequestParam(value = "page", required = false) Integer pages,
            @RequestParam("sex") String sex,
            @RequestParam("email") String email
    ) {

        /*
         *   @api {GET} /api/persons   Get all or a part of person info
         *   @apiName GetAllInfoList
         *   @apiGroup Info Manage
         *   @apiVersion 1.0.0
         *
         *   @apiExample {httpie} Example usage: (support combinatorial search)
         *
         *       All person：
         *       http /api/persons
         *
         *       You can according to 'sex | email' or 'sex & email'
         *       http /api/persons?sex=xxx&email=xx
         *       http /api/persons?sex=xxx
         *       http /api/persons?email=xx
         *
         *   @apiParam {String} sex
         *   @apiParam {String} email
         *
         *   @apiSuccess {String} create_datetime
         *   @apiSuccess {String} email
         *   @apiSuccess {String} id
         *   @apiSuccess {String} phone
         *   @apiSuccess {String} sex
         *   @apiSuccess {String} username
         *   @apiSuccess {String} zone
         */

        if (pages == null) {

            pages = 1;

        }

        Sort sort = new Sort(Direction.ASC, "id");

        Pageable pageable = new PageRequest(pages - 1, maxPerPage, sort);

        PaginationFormatting paginInstance = new PaginationFormatting();

        return paginInstance.filterQuery(sex, email, pageable);
    }

    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Persons> getUserDetail(@PathVariable Long id) {

        /*
        *    @api {GET} /api/persons/detail/:id  details info
        *    @apiName GetPersonDetails
        *    @apiGroup Info Manage
        *    @apiVersion 1.0.0
        *
        *    @apiExample {httpie} Example usage:
        *
        *        http GET http://127.0.0.1:8000/api/persons/detail/1
        *
        *    @apiSuccess {String} email
        *    @apiSuccess {String} id
        *    @apiSuccess {String} phone
        *    @apiSuccess {String} sex
        *    @apiSuccess {String} username
        *    @apiSuccess {String} zone
        */

        Persons user = personsRepository.findById(id);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/detail/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Persons updateUser(@PathVariable Long id, @RequestBody Persons data) {

        /*
         *  @api {PUT} /api/persons/detail/:id  update person info
         *  @apiName PutPersonDetails
         *  @apiGroup Info Manage
         *  @apiVersion 1.0.0
         *
         *  @apiParam {String} phone
         *  @apiParam {String} zone
         *
         *  @apiSuccess {String} create_datetime
         *  @apiSuccess {String} email
         *  @apiSuccess {String} id
         *  @apiSuccess {String} phone
         *  @apiSuccess {String} sex
         *  @apiSuccess {String} username
         *  @apiSuccess {String} zone

        */

        Persons user = personsRepository.findById(id);

        user.setPhone(data.getPhone());
        user.setZone(data.getZone());

        Persons resultPersons = personsRepository.save(user);
        return resultPersons;
    }


    @RequestMapping(value = "/remove/{id}",  method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Persons>  removeUser(@PathVariable Long id) {

         personsRepository.delete(id);
        /*Persons user = personsRepository.findById(id);

        user.setPhone(data.getPhone());

        user.setZone(data.getZone());*/
        return new ResponseEntity<>((Persons) null, HttpStatus.OK);

    }


    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public List<Map<String,Object>> getMenu() {

        List<Map<String, Object>> list = new ArrayList<>();
        Map<String,Object> bean = new HashMap<>();
        bean.put("msg","测试1");
        list.add(bean);
        bean = new HashMap<>();
        bean.put("msg","测试2");
        list.add(bean);
        bean = new HashMap<>();
        bean.put("msg","测试3");
        list.add(bean);
        return list;

    }


    @RequestMapping(value = "/save", method = RequestMethod.POST ,consumes = "multipart/*", headers = "content-type=multipart/form-data" )
    @ResponseBody
    public String   studentInfoSave(@RequestParam("face") MultipartFile file)  {

   /*     String filename = URLEncoder.encode(file.getOriginalFilename(), "utf-8");

        InputStream inputStream = file.getInputStream();*/


        return "上传成功";


    }

}