package dao.ebean.impl;

import dao.AbstractDao;
import dao.ebean.TestDao;
import io.ebean.Finder;
import models.Test;

import java.util.List;

public class EbeanTestDao extends AbstractDao<Long,Test> implements TestDao {

    public EbeanTestDao() {
        super(new Finder<Long, Test>(Test.class));
    }

    @Override
    public List<Test> findAllRecords() {
        return finder.all();
    }
}
