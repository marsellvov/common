package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fpkeprf {
		public static NString fGetEcoAddlRucl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_GET_ECO_ADDL_RUCL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEcoApprRucl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_GET_ECO_APPR_RUCL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEcoDiscRucl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_GET_ECO_DISC_RUCL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEcoTaxRucl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_GET_ECO_TAX_RUCL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEpoAddlRucl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_GET_EPO_ADDL_RUCL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEpoApprRucl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_GET_EPO_APPR_RUCL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEpoDiscRucl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_GET_EPO_DISC_RUCL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEpoTaxRucl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_GET_EPO_TAX_RUCL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEprocBuyrCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_GET_EPROC_BUYR_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEreqAddlRucl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_GET_EREQ_ADDL_RUCL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEreqApprRucl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_GET_EREQ_APPR_RUCL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEreqDiscRucl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_GET_EREQ_DISC_RUCL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEreqTaxRucl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_GET_EREQ_TAX_RUCL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsAcciSyncEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_IS_ACCI_SYNC_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsAcctSyncEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_IS_ACCT_SYNC_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsActvSyncEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_IS_ACTV_SYNC_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsCoasSyncEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_IS_COAS_SYNC_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsCommSyncEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_IS_COMM_SYNC_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsEcoApprOverridable() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_IS_ECO_APPR_OVERRIDABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsEpoApprOverridable() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_IS_EPO_APPR_OVERRIDABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsEposSyncEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_IS_EPOS_SYNC_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsEprocEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_IS_EPROC_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsEreqApprOverridable() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_IS_EREQ_APPR_OVERRIDABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsEreqSyncEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_IS_EREQ_SYNC_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsFundSyncEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_IS_FUND_SYNC_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsLocnSyncEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_IS_LOCN_SYNC_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsOrgnSyncEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_IS_ORGN_SYNC_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsProgSyncEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_IS_PROG_SYNC_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsShipSyncEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_IS_SHIP_SYNC_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsVendSyncEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKEPRF.F_IS_VEND_SYNC_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
