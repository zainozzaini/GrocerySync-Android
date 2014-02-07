package com.couchbase.grocerysync;

import com.couchbase.lite.Manager;

public class GrocerySyncApplication extends CouchbaseLiteApplication {

    private Manager manager;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
