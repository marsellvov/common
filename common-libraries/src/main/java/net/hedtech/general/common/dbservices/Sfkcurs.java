package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkcurs {
		public static void pGetGtvsdax(NString internalCodeIn,NString internalCodeGroupIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKCURS.P_GET_GTVSDAX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INTERNAL_CODE_IN", internalCodeIn);
			cmd.addParameter("@INTERNAL_CODE_GROUP_IN", internalCodeGroupIn);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="DropProblemsRecRow", dataSourceName="DROP_PROBLEMS_REC")
	public static class DropProblemsRecRow
	{
		@DbRecordField(dataSourceName="TERM_CODE")
		public NString TermCode;
		@DbRecordField(dataSourceName="PIDM")
		public NNumber Pidm;
		@DbRecordField(dataSourceName="CRN")
		public NString Crn;
		@DbRecordField(dataSourceName="SUBJ")
		public NString Subj;
		@DbRecordField(dataSourceName="CRSE")
		public NString Crse;
		@DbRecordField(dataSourceName="SEC")
		public NString Sec;
		@DbRecordField(dataSourceName="PTRM_CODE")
		public NString PtrmCode;
		@DbRecordField(dataSourceName="RMSG_CDE")
		public NString RmsgCde;
		@DbRecordField(dataSourceName="MESSAGE")
		public NString Message;
		@DbRecordField(dataSourceName="START_DATE")
		public NDate StartDate;
		@DbRecordField(dataSourceName="COMP_DATE")
		public NDate CompDate;
		@DbRecordField(dataSourceName="RSTS_DATE")
		public NDate RstsDate;
		@DbRecordField(dataSourceName="DUNT_CODE")
		public NString DuntCode;
		@DbRecordField(dataSourceName="DROP_CODE")
		public NString DropCode;
		@DbRecordField(dataSourceName="CONNECTED_CRNS")
		public NString ConnectedCrns;
	}

	
	
}
