package com.example.testserver.constant;


public class AppConfig {

    public final static String BASE_URL_PATH = "http://120.78.181.125:8080";
    public final static String URL_HELLO = BASE_URL_PATH.concat("/hello");
    public final static String DELETE_STUDENT_BY_NAME = BASE_URL_PATH.concat("/delete_by_name");
    public final static String INSERT_STUDENT = BASE_URL_PATH.concat("/insert");
    public final static String ADD_MORE_STUDENTS = BASE_URL_PATH.concat("/add_more_students");
    public final static String SEARCH_STUDENT_BY_NAME = BASE_URL_PATH.concat("/find_by_name");

}
