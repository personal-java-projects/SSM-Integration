package com.example.service.impl;

import com.example.domain.Account;
import com.example.mapper.AccountMapper;
import com.example.service.AccountService;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void save(Account account) throws IOException {
//        InputStream resource = Resources.getResourceAsStream("sqlMapConfig.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
//
//        accountMapper.save(account);
//        sqlSession.commit();
//        sqlSession.close();
        accountMapper.save(account);
    }

    @Override
    public List<Account> findAll() throws IOException {
//        InputStream resource = Resources.getResourceAsStream("sqlMapConfig.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
//
//        List<Account> accountList = accountMapper.findAll();
//        sqlSession.commit();
//        sqlSession.close();

//        return accountList;
        return accountMapper.findAll();
    }
}
