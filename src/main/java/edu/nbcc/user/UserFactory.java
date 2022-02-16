package edu.nbcc.user;

public abstract class UserFactory {
	  public static IUser createInstance(String firstName, String lastName, String emailAddress) {
	    return new User(firstName, lastName, emailAddress);
	  }
	}
