package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider userDataProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(userDataProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServiceDataProvider = new WebServiceDataProvider();
        UserManager userManagerWithWS = new UserManager(webServiceDataProvider);
        System.out.println(webServiceDataProvider.getUserDetails());

        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        UserManager userManagerWithNewDB = new UserManager(newDatabaseProvider);
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
