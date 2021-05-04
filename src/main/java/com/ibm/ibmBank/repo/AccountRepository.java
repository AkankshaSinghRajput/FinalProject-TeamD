package com.ibm.ibmBank.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.ibmBank.entity.Account;

public interface AccountRepository extends MongoRepository<Account, String> {

}
