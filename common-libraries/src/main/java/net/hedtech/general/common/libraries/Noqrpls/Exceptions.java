

package net.hedtech.general.common.libraries.Noqrpls;
	
	///F2N_INFO
	/// This file contains the definition of all the exceptions that were declared in the PLSQL code
	/// of module NOQRPLS. Each exception is defined as class derived from
	/// Exception class.
	///
public class Exceptions{	
	public static class SkipThisItem extends Exception {}

	public static class TimedOut extends Exception {}

	public static class ExtractError extends Exception {}

}