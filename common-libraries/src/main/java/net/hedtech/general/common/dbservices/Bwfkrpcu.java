package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkrpcu {
		public static NBool Fcreatentgroup(NString userid,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPCU.CREATENTGROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@USERID", userid);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fPrintableamt(NNumber amt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPCU.F_PRINTABLEAMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AMT", amt);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	@DbRecordType(id="GettotalaRow", dataSourceName="GETTOTALA")
	public static class GettotalaRow
	{
		@DbRecordField(dataSourceName="USER_SEC")
		public NString UserSec;
		@DbRecordField(dataSourceName="ADOPT_BUD")
		public NNumber AdoptBud;
		@DbRecordField(dataSourceName="BUD_ADJT")
		public NNumber BudAdjt;
		@DbRecordField(dataSourceName="TEMP_BUD")
		public NNumber TempBud;
		@DbRecordField(dataSourceName="ACCTD_BUD")
		public NNumber AcctdBud;
		@DbRecordField(dataSourceName="YTD_ACTV")
		public NNumber YtdActv;
		@DbRecordField(dataSourceName="ENCUMB")
		public NNumber Encumb;
		@DbRecordField(dataSourceName="BUD_RSRV")
		public NNumber BudRsrv;
		@DbRecordField(dataSourceName="ADOPT_BUD2")
		public NNumber AdoptBud2;
		@DbRecordField(dataSourceName="BUD_ADJT2")
		public NNumber BudAdjt2;
		@DbRecordField(dataSourceName="TEMP_BUD2")
		public NNumber TempBud2;
		@DbRecordField(dataSourceName="ACCTD_BUD2")
		public NNumber AcctdBud2;
		@DbRecordField(dataSourceName="YTD_ACTV2")
		public NNumber YtdActv2;
		@DbRecordField(dataSourceName="ENCUMB2")
		public NNumber Encumb2;
		@DbRecordField(dataSourceName="BUD_RSRV2")
		public NNumber BudRsrv2;
	}

	
	@DbRecordType(id="TitlerecordRow", dataSourceName="TITLERECORD")
	public static class TitlerecordRow
	{
		@DbRecordField(dataSourceName="RTITLE")
		public NString Rtitle;
	}

	
	
}
