package com.Exception;

public class InvalidEntries extends Exception{

	public class InvalidCostException extends Exception {
	    public InvalidCostException() {
	        super("Enter Valid Cost");
	    }
	}

	public class InvalidRamException extends Exception {
	    public InvalidRamException() {
	        super("Enter Valid RAM");
	    }
	}
	public class InvalidStorageException extends Exception{
		public InvalidStorageException() {
			super ("Enter Valid Storage");
		}
	}
}
