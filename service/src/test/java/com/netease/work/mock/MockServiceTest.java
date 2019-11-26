package com.netease.work.mock;

import com.netease.work.mock.dal.MockitoDao;
import com.netease.work.mock.service.impl.MockitoServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * description:
 * Date: 2018-09-03 下午8:22<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MockServiceTest extends BaseTest{
    @InjectMocks
    @Autowired
    MockService mockService;

    @InjectMocks
    @Autowired
    MockitoServiceImpl mockitoService;

    @Spy
    MockitoDao mockitoDao;
    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void show() {
        Mockito.doNothing().when(mockitoDao).show();
        mockService.show();
    }
}