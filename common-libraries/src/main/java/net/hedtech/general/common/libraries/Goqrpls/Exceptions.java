

package net.hedtech.general.common.libraries.Goqrpls;
	
	///F2N_INFO
	/// This file contains the definition of all the exceptions that were declared in the PLSQL code
	/// of module GOQRPLS. Each exception is defined as class derived from
	/// Exception class.
	///
public class Exceptions{	
	public static class SkipThisItem extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 4173938045233757408L;}

	public static class TimedOut extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 6031803196385197619L;}

	public static class ExtractError extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 6079283616080061539L;}

}