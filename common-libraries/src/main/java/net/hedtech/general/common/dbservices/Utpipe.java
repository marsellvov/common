package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utpipe {
//		public static void receiveAndUnpack(NString pipeIn,Ref<List<MsgTbltypeRow>> msgTblOut,Ref<NInteger> pipeStatusOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPIPE.RECEIVE_AND_UNPACK", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIPE_IN", pipeIn);
//			// cmd.addParameter(DbTypes.getTableType("MSG_TBL_OUT", "", object.class));
//			cmd.addParameter("@PIPE_STATUS_OUT", pipeStatusOut, true);
//				
//			cmd.execute();
//			// msgTblOut.val = cmd.getTableParameterValue("@MSG_TBL_OUT", object.class);
//			pipeStatusOut.val = cmd.getParameterValue("@PIPE_STATUS_OUT", NInteger.class);
//
//
//		}
		
	
	
	@DbRecordType(id="MsgRectypeRow", dataSourceName="MSG_RECTYPE")
	public static class MsgRectypeRow
	{
		@DbRecordField(dataSourceName="ITEM_TYPE")
		public NNumber ItemType;
		@DbRecordField(dataSourceName="MVC2")
		public NString Mvc2;
		@DbRecordField(dataSourceName="MDT")
		public NDate Mdt;
		@DbRecordField(dataSourceName="MNUM")
		public NNumber Mnum;
		@DbRecordField(dataSourceName="MRID")
		public UnknownTypes.Rowid Mrid;
		@DbRecordField(dataSourceName="MRAW")
		public byte[] Mraw;
	}

	
	
}
