package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider userDataProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(userDataProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServiceDataProvider = new UserDatabaseProvider();
        UserManager userManagerWithWS = new UserManager(webServiceDataProvider);
        System.out.println(webServiceDataProvider.getUserDetails());

    }
}
