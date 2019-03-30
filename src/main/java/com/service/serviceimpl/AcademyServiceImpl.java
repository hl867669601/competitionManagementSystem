package com.service.serviceimpl;

import com.dao.AcademyDao;
import com.service.AcademyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zeng
 * @date 2019/3/30 - 11:10
 */
@Service
public class AcademyServiceImpl implements AcademyService{
    private AcademyDao academyDao;

    @Autowired
    public AcademyServiceImpl(AcademyDao academyDao){
        this.academyDao = academyDao;
    }
    @Override
    public List findAll(){
        return academyDao.findAll();
    }


}
