package com.learnbizlinks.demo.exercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class MongoDbDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[] { 11, 22 , 33, 44, 55, 66};
    }
}
