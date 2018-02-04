package com.wrox.provider.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BookInfo extends Remote{

	float getBookPrice(String isbn) throws RemoteException;
}
