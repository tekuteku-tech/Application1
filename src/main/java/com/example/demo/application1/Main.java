package com.example.demo.application1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.application1.sample.SampleLogic;

@Component
public class Main implements ApplicationRunner {

    @Autowired
    SampleLogic sampleLogic;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Application1.Main.run");
        System.out.println(sampleLogic.sampleLogic1());
    }

}
