package com.Exception;

public class Mobile extends InvalidEntries{
    private String name;
    private float cost;
    private int ram;
    private int storage;

    public Mobile(String name, float cost, int ram, int storage) throws InvalidCostException, InvalidRamException, InvalidStorageException {
        this.name = name;
        this.cost = cost;
        this.ram = ram;
        this.storage = storage;

        if (cost <= 0.0f) {
            throw new InvalidCostException();
        }

        if (ram <= 0) {
            throw new InvalidRamException();
        }

        if (storage <= 0) {
            throw new InvalidStorageException();
        }
    }

    // Getters and setters for the fields (name, cost, ram, storage) go here

    @Override
    public String toString() {
        return "Mobile [name=" + name + ", cost=" + cost + ", ram=" + ram + ", storage=" + storage + "]";
    }
}
