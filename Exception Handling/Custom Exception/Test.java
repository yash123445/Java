package com.Exception;


public class Test extends InvalidEntries {

    public static void main(String[] args) {
        try {
            Mobile myMobile = new Mobile("Redmi", 10000, 4, 128);
            System.out.println(myMobile);
        } catch (InvalidCostException | InvalidRamException | InvalidStorageException e) {
            System.out.println("Exception: " + e.getMessage());
        }   
    }
}
