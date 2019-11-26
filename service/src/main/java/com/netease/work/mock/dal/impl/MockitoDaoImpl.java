package com.netease.work.mock.dal.impl;

import com.netease.work.mock.dal.MockitoDao;
import org.springframework.stereotype.Repository;

/**
 * description:
 * Date: 2018-09-03 下午8:17<br/>
 *
 * @version 1.0
 * @auther: wuchanming
 */
@Repository("mockitoDao")
public class MockitoDaoImpl implements MockitoDao {
    @Override
    public void show() {
        System.out.println("com.netease.work.mock.dal.impl.MockitoDaoImpl.show");
    }
}
