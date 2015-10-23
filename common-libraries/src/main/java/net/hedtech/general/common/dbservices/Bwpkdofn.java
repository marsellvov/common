package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkdofn {
		public static void pOpenenrollmentedits(NString activatingOe) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTEDITS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ACTIVATING_OE", activatingOe);
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncactivate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCACTIVATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncaddbded() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCADDBDED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncadddedn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCADDDEDN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncadddhis() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCADDDHIS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncbackout() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCBACKOUT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncclear() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCCLEAR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfunccleargrp() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCCLEARGRP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncdelbded() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCDELBDED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncdeldedn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCDELDEDN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncdeldhis(NString openInd,NString delDcde,NDate delEfdt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCDELDHIS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OPEN_IND", openInd);
			cmd.addParameter("@DEL_DCDE", delDcde);
			cmd.addParameter("@DEL_EFDT", delEfdt);
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncdele() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCDELE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncinit() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCINIT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncinitgrp() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCINITGRP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncreac() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCREAC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncterm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCTERM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncupdbded() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCUPDBDED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncupddedn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCUPDDEDN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncupddhis() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOFN.P_OPENENROLLMENTFUNCUPDDHIS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
