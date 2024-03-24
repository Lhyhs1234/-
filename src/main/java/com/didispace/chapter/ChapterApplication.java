package com.didispace.chapter;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSwagger2Doc
@SpringBootApplication
@MapperScan("com.didispace.chapter.Mapper")
public class ChapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChapterApplication.class, args);
    }

}
