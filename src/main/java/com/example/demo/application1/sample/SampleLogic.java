package com.example.demo.application1.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.library.sample.SampleLibrary;

@Component
public class SampleLogic {

    @Autowired
    SampleLibrary sampleLibrary;

    public String sampleLogic1() {
        return sampleLibrary.sampleMethod();
    }

}
