package com.cdk.obi.dao;

import java.util.List;

import com.cdk.obi.model.DBUser;

public interface DataMapper {
    List<DBUser> getAll();
} 