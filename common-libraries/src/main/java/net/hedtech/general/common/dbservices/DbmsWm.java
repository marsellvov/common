package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsWm {
		public static void addTopoGeometryLayer() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.ADD_TOPO_GEOMETRY_LAYER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void addasparentworkspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.ADDASPARENTWORKSPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void adduserdefinedhint() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.ADDUSERDEFINEDHINT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void altersavepoint() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.ALTERSAVEPOINT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void alterversionedtable() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.ALTERVERSIONEDTABLE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void alterworkspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.ALTERWORKSPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void beginbulkloading() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.BEGINBULKLOADING", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void beginddl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.BEGINDDL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void beginresolve() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.BEGINRESOLVE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void changeworkspacetype() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.CHANGEWORKSPACETYPE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void commitbulkloading() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.COMMITBULKLOADING", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void commitddl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.COMMITDDL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void commitresolve() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.COMMITRESOLVE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void compressworkspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.COMPRESSWORKSPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void compressworkspace() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.COMPRESSWORKSPACE", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
		public static void compressworkspacetree() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.COMPRESSWORKSPACETREE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void copyforupdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.COPYFORUPDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createsavepoint() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.CREATESAVEPOINT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createworkspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.CREATEWORKSPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void createworkspace() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.CREATEWORKSPACE", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
		public static void deleteTopoGeometryLayer() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.DELETE_TOPO_GEOMETRY_LAYER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void deletesavepoint() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.DELETESAVEPOINT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void disablereplicationsupport() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.DISABLEREPLICATIONSUPPORT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void disableversioning() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.DISABLEVERSIONING", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void disableversioningRepln() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.DISABLEVERSIONING_REPLN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void dropreplicationsupport() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.DROPREPLICATIONSUPPORT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void enablereplicationsupport() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.ENABLEREPLICATIONSUPPORT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void enableversioning() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.ENABLEVERSIONING", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void enableversioningRepln() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.ENABLEVERSIONING_REPLN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void export() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.EXPORT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void findricset() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.FINDRICSET", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void freezeworkspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.FREEZEWORKSPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void freezeworkspace() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.FREEZEWORKSPACE", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
		public static void generatereplicationsupport() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GENERATEREPLICATIONSUPPORT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getbulkloadversion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GETBULKLOADVERSION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getconflictworkspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GETCONFLICTWORKSPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getdiffversions() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GETDIFFVERSIONS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getlockmode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GETLOCKMODE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getltlockstr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GETLTLOCKSTR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getmultiworkspaces() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GETMULTIWORKSPACES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getopcontext() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GETOPCONTEXT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getphysicaltablename() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GETPHYSICALTABLENAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getprivs() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GETPRIVS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getsessioninfo() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GETSESSIONINFO", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getsystemparameter() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GETSYSTEMPARAMETER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getvalidfrom() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GETVALIDFROM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getvalidtill() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GETVALIDTILL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getversion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GETVERSION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getwmmetadataspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GETWMMETADATASPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getworkspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GETWORKSPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void gotodate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GOTODATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void gotodate() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GOTODATE", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
		public static void gotosavepoint() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GOTOSAVEPOINT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void gotoworkspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GOTOWORKSPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void grantgraphpriv() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GRANTGRAPHPRIV", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void grantprivsonpolicy() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GRANTPRIVSONPOLICY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void grantprivstorepadminonsyspkgs() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GRANTPRIVSTOREPADMINONSYSPKGS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void grantsystempriv() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GRANTSYSTEMPRIV", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void grantworkspacepriv() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.GRANTWORKSPACEPRIV", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pimport() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.IMPORT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void isworkspaceoccupied() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.ISWORKSPACEOCCUPIED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void lockrows() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.LOCKROWS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void maxTime() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.MAX_TIME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void mergetable() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.MERGETABLE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void mergeworkspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.MERGEWORKSPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void minTime() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.MIN_TIME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void moveProc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.MOVE_PROC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void recoverallmigratingtables() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.RECOVERALLMIGRATINGTABLES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void recoverfromdroppeduser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.RECOVERFROMDROPPEDUSER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void recovermigratingtable() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.RECOVERMIGRATINGTABLE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void refreshtable() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.REFRESHTABLE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void refreshworkspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.REFRESHWORKSPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void relocatewritersite() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.RELOCATEWRITERSITE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void removeasparentworkspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.REMOVEASPARENTWORKSPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void removeuserdefinedhint() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.REMOVEUSERDEFINEDHINT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void removeworkspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.REMOVEWORKSPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void removeworkspacetree() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.REMOVEWORKSPACETREE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resolveconflicts() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.RESOLVECONFLICTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void revokegraphpriv() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.REVOKEGRAPHPRIV", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void revokesystempriv() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.REVOKESYSTEMPRIV", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void revokeworkspacepriv() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.REVOKEWORKSPACEPRIV", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void rollbackbulkloading() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.ROLLBACKBULKLOADING", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void rollbackddl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.ROLLBACKDDL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void rollbackresolve() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.ROLLBACKRESOLVE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void rollbacktable() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.ROLLBACKTABLE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void rollbacktosp() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.ROLLBACKTOSP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void rollbackworkspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.ROLLBACKWORKSPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setcaptureevent() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETCAPTUREEVENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setcompressworkspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETCOMPRESSWORKSPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setconflictworkspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETCONFLICTWORKSPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setdiffversions() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETDIFFVERSIONS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void setdiffversions() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETDIFFVERSIONS", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
		public static void setlockingoff() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETLOCKINGOFF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setlockingon() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETLOCKINGON", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setmultiworkspaces() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETMULTIWORKSPACES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setsystemparameter() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETSYSTEMPARAMETER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void settriggerevents() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETTRIGGEREVENTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setvalidtime() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETVALIDTIME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setvalidtimefilteroff() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETVALIDTIMEFILTEROFF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setvalidtimefilteron() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETVALIDTIMEFILTERON", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setwmvalidupdatemodeoff() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETWMVALIDUPDATEMODEOFF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setwmvalidupdatemodeon() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETWMVALIDUPDATEMODEON", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setwooverwriteoff() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETWOOVERWRITEOFF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setwooverwriteon() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETWOOVERWRITEON", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setworkspacelockmodeoff() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETWORKSPACELOCKMODEOFF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setworkspacelockmodeon() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SETWORKSPACELOCKMODEON", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void synchronizesite() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.SYNCHRONIZESITE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void unfreezeworkspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.UNFREEZEWORKSPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void unlockrows() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.UNLOCKROWS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void untilChanged() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.UNTIL_CHANGED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void usedefaultvaluesfornulls() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_WM.USEDEFAULTVALUESFORNULLS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
