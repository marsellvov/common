

package net.hedtech.general.common.libraries.Aoqolib.services;
	
	///F2N_INFO
	/// This file contains the definition of all the exceptions that were declared in the PLSQL code
	/// of module AOQOLIB. Each exception is defined as class derived from
	/// Exception class.
	///
public class Exceptions{	
	public static class NoObject extends Exception {}

	public static class NoInst extends Exception {}

	public static class NoAccess extends Exception {}

	public static class NoPassword extends Exception {}

	public static class InvalidVersion extends Exception {}

	public static class InvalidAccess extends Exception {}

	public static class NameMismatch extends Exception {}

}