package com.limj.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.jws.WebService;

@SpringBootApplication
@ServletComponentScan//扫描servlet
public class SpringbootApplication {
        public static void main(String[] args) {
            SpringApplication.run(SpringbootApplication.class, args);
        }
    public static void sss () throws Exception{
        int a = 0;
        try{
            a = 1+1;
        }catch(Exception e){
            System.out.println(e.getMessage());
            throw e;
        }finally {
            System.out.println(a);
        }
    }
}
