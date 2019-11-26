package com.netease.work.mock;

import com.netease.work.mock.service.MockitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description:
 * Date: 2018-09-03 下午8:21<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
@Service("mockService")
public class MockService {
    @Autowired
    MockitoService mockitoService;

    public void show(){
        mockitoService.show();
    }
}
