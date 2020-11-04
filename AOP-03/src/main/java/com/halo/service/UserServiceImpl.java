package com.halo.service;

/**
 * @author lanqilu
 * @date Created in 2020/11/04  16:22
 * @description
 */
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("[实例方法]:增加了用户");
    }

    @Override
    public void delete() {
        System.out.println("[实例方法]:删除了用户");
    }

    @Override
    public void update() {
        System.out.println("[实例方法]:更新了用户");
    }

    @Override
    public void select() {
        System.out.println("[实例方法]:查询了用户");
    }
}
