/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_compte_bancaire;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    void debiter(int x)throws RemoteException;
    void crediter(double y)throws RemoteException;
    int lireSolde()throws RemoteException;
}