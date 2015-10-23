package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eok497r {
		public static NString fGetCrseTitle(NString subjCode,NString crseNumb,NString termCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK497R.F_GET_CRSE_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SUBJ_CODE", subjCode);
			cmd.addParameter("@CRSE_NUMB", crseNumb);
			cmd.addParameter("@TERM_CODE", termCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pScbcrseAdr(NString oldSubjCode,NString oldCrseNumb,NString oldEffTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK497R.P_SCBCRSE_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_SUBJ_CODE", oldSubjCode);
			cmd.addParameter("@OLD_CRSE_NUMB", oldCrseNumb);
			cmd.addParameter("@OLD_EFF_TERM", oldEffTerm);
				
			cmd.execute();


		}
		
		public static void pScbcrseAir(NString newSubjCode,NString newCrseNumb,NString newTitle,NString newEffTerm,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK497R.P_SCBCRSE_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_SUBJ_CODE", newSubjCode);
			cmd.addParameter("@NEW_CRSE_NUMB", newCrseNumb);
			cmd.addParameter("@NEW_TITLE", newTitle);
			cmd.addParameter("@NEW_EFF_TERM", newEffTerm);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pScbcrseAur(NString newSubjCode,NString oldSubjCode,NString newCrseNumb,NString oldCrseNumb,NString newCrseTitle,NString oldCrseTitle,NString newEffTerm,NString oldEffTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK497R.P_SCBCRSE_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_SUBJ_CODE", newSubjCode);
			cmd.addParameter("@OLD_SUBJ_CODE", oldSubjCode);
			cmd.addParameter("@NEW_CRSE_NUMB", newCrseNumb);
			cmd.addParameter("@OLD_CRSE_NUMB", oldCrseNumb);
			cmd.addParameter("@NEW_CRSE_TITLE", newCrseTitle);
			cmd.addParameter("@OLD_CRSE_TITLE", oldCrseTitle);
			cmd.addParameter("@NEW_EFF_TERM", newEffTerm);
			cmd.addParameter("@OLD_EFF_TERM", oldEffTerm);
				
			cmd.execute();


		}
		
		public static void pSsbsectAdr(NString oldTermCode,NString oldCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK497R.P_SSBSECT_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_TERM_CODE", oldTermCode);
			cmd.addParameter("@OLD_CRN", oldCrn);
				
			cmd.execute();


		}
		
		public static void pSsbsectAir(NString newSubjCode,NString newCrseNumb,NString newCrseTitle,NString newTermCode,NString newSeqNum,NString newCrn,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK497R.P_SSBSECT_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_SUBJ_CODE", newSubjCode);
			cmd.addParameter("@NEW_CRSE_NUMB", newCrseNumb);
			cmd.addParameter("@NEW_CRSE_TITLE", newCrseTitle);
			cmd.addParameter("@NEW_TERM_CODE", newTermCode);
			cmd.addParameter("@NEW_SEQ_NUM", newSeqNum);
			cmd.addParameter("@NEW_CRN", newCrn);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pSsbsectAur(NString newSubjCode,NString oldSubjCode,NString newCrseNumb,NString oldCrseNumb,NString newCrseTitle,NString oldCrseTitle,NString newTermCode,NString oldTermCode,NString newSeqNumb,NString oldSeqNumb,NString newCrn,NString oldCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK497R.P_SSBSECT_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_SUBJ_CODE", newSubjCode);
			cmd.addParameter("@OLD_SUBJ_CODE", oldSubjCode);
			cmd.addParameter("@NEW_CRSE_NUMB", newCrseNumb);
			cmd.addParameter("@OLD_CRSE_NUMB", oldCrseNumb);
			cmd.addParameter("@NEW_CRSE_TITLE", newCrseTitle);
			cmd.addParameter("@OLD_CRSE_TITLE", oldCrseTitle);
			cmd.addParameter("@NEW_TERM_CODE", newTermCode);
			cmd.addParameter("@OLD_TERM_CODE", oldTermCode);
			cmd.addParameter("@NEW_SEQ_NUMB", newSeqNumb);
			cmd.addParameter("@OLD_SEQ_NUMB", oldSeqNumb);
			cmd.addParameter("@NEW_CRN", newCrn);
			cmd.addParameter("@OLD_CRN", oldCrn);
				
			cmd.execute();


		}
		
		public static void pStvsubjAdr(NString oldSubjCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK497R.P_STVSUBJ_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_SUBJ_CODE", oldSubjCode);
				
			cmd.execute();


		}
		
		public static void pStvsubjAir(NString newSubjCode,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK497R.P_STVSUBJ_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_SUBJ_CODE", newSubjCode);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pStvsubjAur(NString newSubjCode,NString oldSubjCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK497R.P_STVSUBJ_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_SUBJ_CODE", newSubjCode);
			cmd.addParameter("@OLD_SUBJ_CODE", oldSubjCode);
				
			cmd.execute();


		}
		
		public static void pStvtermAdr(NString oldTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK497R.P_STVTERM_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_TERM_CODE", oldTermCode);
				
			cmd.execute();


		}
		
		public static void pStvtermAir(NString newTermCode,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK497R.P_STVTERM_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_TERM_CODE", newTermCode);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pStvtermAur(NString newTermCode,NString oldTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOK497R.P_STVTERM_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_TERM_CODE", newTermCode);
			cmd.addParameter("@OLD_TERM_CODE", oldTermCode);
				
			cmd.execute();


		}
		
	
	
	
}
