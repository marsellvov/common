package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkbdqs {
//		public static void pGetorghiertotal(NString fund,NString orgn,NString acct,NString prog,NString actv,NString locn,NString budgetid,NString budgetphase,NString budgetid2,NString budgetphase2,NString userCode,NString coasCode,NDate asofdate,NString atyp,NString ftyp,NString includerev,NString includelabor,NString includeexp,NString includetran,NString includedel,NString durationcode,Ref<GettotalaRow> infototal) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDQS.P_GETORGHIERTOTAL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@FUND", fund);
//			cmd.addParameter("@ORGN", orgn);
//			cmd.addParameter("@ACCT", acct);
//			cmd.addParameter("@PROG", prog);
//			cmd.addParameter("@ACTV", actv);
//			cmd.addParameter("@LOCN", locn);
//			cmd.addParameter("@BUDGETID", budgetid);
//			cmd.addParameter("@BUDGETPHASE", budgetphase);
//			cmd.addParameter("@BUDGETID2", budgetid2);
//			cmd.addParameter("@BUDGETPHASE2", budgetphase2);
//			cmd.addParameter("@USER_CODE", userCode);
//			cmd.addParameter("@COAS_CODE", coasCode);
//			cmd.addParameter("@ASOFDATE", asofdate);
//			cmd.addParameter("@ATYP", atyp);
//			cmd.addParameter("@FTYP", ftyp);
//			cmd.addParameter("@INCLUDEREV", includerev);
//			cmd.addParameter("@INCLUDELABOR", includelabor);
//			cmd.addParameter("@INCLUDEEXP", includeexp);
//			cmd.addParameter("@INCLUDETRAN", includetran);
//			cmd.addParameter("@INCLUDEDEL", includedel);
//			cmd.addParameter("@DURATIONCODE", durationcode);
//			cmd.addParameter(DbTypes.createStructType("INFOTOTAL", GettotalaRow.class));
//				
//			cmd.execute();
//			infototal.val = cmd.getParameterValue("@INFOTOTAL", GettotalaRow.class);
//
//
//		}
//		
	
	
	@DbRecordType(id="GettotalaRow", dataSourceName="GETTOTALA")
	public static class GettotalaRow
	{
		@DbRecordField(dataSourceName="ADOPT_BUD")
		public NNumber AdoptBud;
		@DbRecordField(dataSourceName="BUD_ADJT")
		public NNumber BudAdjt;
		@DbRecordField(dataSourceName="TEMP_ADOPT")
		public NNumber TempAdopt;
		@DbRecordField(dataSourceName="TEMP_ADJUST")
		public NNumber TempAdjust;
		@DbRecordField(dataSourceName="BASE_BUD")
		public NNumber BaseBud;
		@DbRecordField(dataSourceName="PROPOSED")
		public NNumber Proposed;
		@DbRecordField(dataSourceName="ADOPT_BUD2")
		public NNumber AdoptBud2;
		@DbRecordField(dataSourceName="BUD_ADJT2")
		public NNumber BudAdjt2;
		@DbRecordField(dataSourceName="TEMP_ADOPT2")
		public NNumber TempAdopt2;
		@DbRecordField(dataSourceName="TEMP_ADJUST2")
		public NNumber TempAdjust2;
		@DbRecordField(dataSourceName="BASE_BUD2")
		public NNumber BaseBud2;
		@DbRecordField(dataSourceName="PROPOSED2")
		public NNumber Proposed2;
	}

	
	
}
