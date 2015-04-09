package com.itsoft.slt.service;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface IServiceRemote<T> {

	List<T> findAll();

}