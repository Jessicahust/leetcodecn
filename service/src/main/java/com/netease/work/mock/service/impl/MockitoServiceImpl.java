package com.netease.work.mock.service.impl;

import com.netease.work.mock.dal.MockitoDao;
import com.netease.work.mock.service.MockitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description:
 * Date: 2018-09-03 下午8:20<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
@Service("mockitoService")
public class MockitoServiceImpl implements MockitoService {
    @Autowired
    MockitoDao mockitoDao;

    @Override
    public void show() {
        System.out.println("com.netease.work.mock.service.impl.MockitoServiceImpl.show");
        mockitoDao.show();
    }
}
