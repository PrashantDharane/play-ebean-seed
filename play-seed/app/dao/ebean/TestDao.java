package dao.ebean;

import dao.Dao;
import models.Test;

import java.util.List;

public interface TestDao extends Dao<Long, Test> {
    List<Test> findAllRecords();
}
