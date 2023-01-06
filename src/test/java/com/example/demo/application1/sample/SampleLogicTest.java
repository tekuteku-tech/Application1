package com.example.demo.application1.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.library.sample.SampleLibrary;

@ExtendWith(MockitoExtension.class)
class SampleLogicTest {

    @InjectMocks
    SampleLogic injectTarget;

    @Mock
    SampleLibrary mockSampleLibrary;

    @Test
    void sampleLogic1Test() {
        Mockito.when(mockSampleLibrary.sampleMethod()).thenReturn("This is mock method.");
        assertEquals("This is mock method.", injectTarget.sampleLogic1());
    }

}
