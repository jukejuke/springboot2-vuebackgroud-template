package com.springboot2.template.service.impl;

import com.springboot2.template.dao.DemoDao;
import com.springboot2.template.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * @author Yaosh
 * @version 1.0
 * @commpany 星瑞国际
 * @date 2019/8/15 11:34
 * @return
 */
@Service
@Transactional
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;

    @Override
    public Map<String, Object> query() {
        return demoDao.query();
    }
}
