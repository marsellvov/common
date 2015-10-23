package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eok496r {
		public static void pNbbfiscAdr(NString oldFiscCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK496R.P_NBBFISC_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_FISC_CODE", oldFiscCode);
				
			cmd.execute();


		}
		
		public static void pNbbfiscAir(NString newFiscCode,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK496R.P_NBBFISC_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_FISC_CODE", newFiscCode);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pNbbfiscAur(NString newFiscCode,NString oldFiscCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK496R.P_NBBFISC_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_FISC_CODE", newFiscCode);
			cmd.addParameter("@OLD_FISC_CODE", oldFiscCode);
				
			cmd.execute();


		}
		
		public static void pNbrposhAdr(NString oldNbrposhPosnIn,NString oldNbrposhTitleIn,NDate oldNbrposhChangeDateTimIn,NString oldNbrposhPclsCodeIn,NString oldNbrposhEclsCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK496R.P_NBRPOSH_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_NBRPOSH_POSN_IN", oldNbrposhPosnIn);
			cmd.addParameter("@OLD_NBRPOSH_TITLE_IN", oldNbrposhTitleIn);
			cmd.addParameter("@OLD_NBRPOSH_CHANGE_DATE_TIM_IN", oldNbrposhChangeDateTimIn);
			cmd.addParameter("@OLD_NBRPOSH_PCLS_CODE_IN", oldNbrposhPclsCodeIn);
			cmd.addParameter("@OLD_NBRPOSH_ECLS_CODE_IN", oldNbrposhEclsCodeIn);
				
			cmd.execute();


		}
		
		public static void pNbrposhAir(NString newNbrposhPosnIn,NString newNbrposhTitleIn,NDate newNbrposhChangeDateTimIn,NString newNbrposhPclsCodeIn,NString newNbrposhEclsCodeIn,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK496R.P_NBRPOSH_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_NBRPOSH_POSN_IN", newNbrposhPosnIn);
			cmd.addParameter("@NEW_NBRPOSH_TITLE_IN", newNbrposhTitleIn);
			cmd.addParameter("@NEW_NBRPOSH_CHANGE_DATE_TIM_IN", newNbrposhChangeDateTimIn);
			cmd.addParameter("@NEW_NBRPOSH_PCLS_CODE_IN", newNbrposhPclsCodeIn);
			cmd.addParameter("@NEW_NBRPOSH_ECLS_CODE_IN", newNbrposhEclsCodeIn);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pNbrposhAur(NString newNbrposhPosnIn,NString oldNbrposhPosnIn,NString newNbrposhTitleIn,NString oldNbrposhTitleIn,NDate newNbrposhChangeDateTimIn,NDate oldNbrposhChangeDateTimIn,NString newNbrposhPclsCodeIn,NString oldNbrposhPclsCodeIn,NString newNbrposhEclsCodeIn,NString oldNbrposhEclsCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK496R.P_NBRPOSH_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_NBRPOSH_POSN_IN", newNbrposhPosnIn);
			cmd.addParameter("@OLD_NBRPOSH_POSN_IN", oldNbrposhPosnIn);
			cmd.addParameter("@NEW_NBRPOSH_TITLE_IN", newNbrposhTitleIn);
			cmd.addParameter("@OLD_NBRPOSH_TITLE_IN", oldNbrposhTitleIn);
			cmd.addParameter("@NEW_NBRPOSH_CHANGE_DATE_TIM_IN", newNbrposhChangeDateTimIn);
			cmd.addParameter("@OLD_NBRPOSH_CHANGE_DATE_TIM_IN", oldNbrposhChangeDateTimIn);
			cmd.addParameter("@NEW_NBRPOSH_PCLS_CODE_IN", newNbrposhPclsCodeIn);
			cmd.addParameter("@OLD_NBRPOSH_PCLS_CODE_IN", oldNbrposhPclsCodeIn);
			cmd.addParameter("@NEW_NBRPOSH_ECLS_CODE_IN", newNbrposhEclsCodeIn);
			cmd.addParameter("@OLD_NBRPOSH_ECLS_CODE_IN", oldNbrposhEclsCodeIn);
				
			cmd.execute();


		}
		
		public static void pNtrpclsAdr(NString oldPclsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK496R.P_NTRPCLS_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_PCLS_CODE", oldPclsCode);
				
			cmd.execute();


		}
		
		public static void pNtrpclsAir(NString newPclsCode,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK496R.P_NTRPCLS_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PCLS_CODE", newPclsCode);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pNtrpclsAur(NString newPclsCode,NString oldPclsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK496R.P_NTRPCLS_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PCLS_CODE", newPclsCode);
			cmd.addParameter("@OLD_PCLS_CODE", oldPclsCode);
				
			cmd.execute();


		}
		
		public static void pPtreclsAdr(NString oldEclsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK496R.P_PTRECLS_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_ECLS_CODE", oldEclsCode);
				
			cmd.execute();


		}
		
		public static void pPtreclsAir(NString newEclsCode,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK496R.P_PTRECLS_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ECLS_CODE", newEclsCode);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pPtreclsAur(NString newEclsCode,NString oldEclsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK496R.P_PTRECLS_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ECLS_CODE", newEclsCode);
			cmd.addParameter("@OLD_ECLS_CODE", oldEclsCode);
				
			cmd.execute();


		}
		
	
	
	
}
