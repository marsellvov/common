package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoPridx {
		public static NNumber FgenRidRange(NString tsname,NString tname,NString rgtab,NNumber edop) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_PRIDX.GEN_RID_RANGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TSNAME", tsname);
			cmd.addParameter("@TNAME", tname);
			cmd.addParameter("@RGTAB", rgtab);
			cmd.addParameter("@EDOP", edop);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgenRidRangeByArea(NString tsname,NString tname,NString ptname,NString colname,NString rgtab,NString artab,NString tblSpace,NNumber funcidx,NNumber edop) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_PRIDX.GEN_RID_RANGE_BY_AREA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TSNAME", tsname);
			cmd.addParameter("@TNAME", tname);
			cmd.addParameter("@PTNAME", ptname);
			cmd.addParameter("@COLNAME", colname);
			cmd.addParameter("@RGTAB", rgtab);
			cmd.addParameter("@ARTAB", artab);
			cmd.addParameter("@TBL_SPACE", tblSpace);
			cmd.addParameter("@FUNCIDX", funcidx);
			cmd.addParameter("@EDOP", edop);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static List<SdoNumtabRow> Findexload(DataCursor rc, ia,NString ttab,NString _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_PRIDX.INDEXLOAD", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumtabRow>.class);
//			cmd.addParameter("@RC", DataCursor.class);
//			cmd.addParameter("@IA", ia);
//			cmd.addParameter("@TTAB", ttab);
//			cmd.addParameter("@PARAMS", _params);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumtabRow>.class);
//
//		}
		
//		public static void mdprcluster( ia,NString idxTab,NString _params,NNumber tbl,NNumber num,NNumber ptbl,NNumber lvl,NString oidstr,Ref<NNumber> nc,Ref<NNumber> area,Ref<NNumber> nn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_PRIDX.MDPRCLUSTER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@IA", ia);
//			cmd.addParameter("@IDX_TAB", idxTab);
//			cmd.addParameter("@PARAMS", _params);
//			cmd.addParameter("@TBL", tbl);
//			cmd.addParameter("@NUM", num);
//			cmd.addParameter("@PTBL", ptbl);
//			cmd.addParameter("@LVL", lvl);
//			cmd.addParameter("@OIDSTR", oidstr);
//			cmd.addParameter("@NC", NNumber.class);
//			cmd.addParameter("@AREA", NNumber.class);
//			cmd.addParameter("@NN", NNumber.class);
//				
//			cmd.execute();
//			nc.val = cmd.getParameterValue("@NC", NNumber.class);
//			area.val = cmd.getParameterValue("@AREA", NNumber.class);
//			nn.val = cmd.getParameterValue("@NN", NNumber.class);
//
//
//		}
//		
//		public static NNumber Fmdprtessellate( ia,NString idxtab,NString _params,NString rid1,NString rid2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_PRIDX.MDPRTESSELLATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@IA", ia);
//			cmd.addParameter("@IDXTAB", idxtab);
//			cmd.addParameter("@PARAMS", _params);
//			cmd.addParameter("@RID1", rid1);
//			cmd.addParameter("@RID2", rid2);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber Fmdprtxfergm( ia,NString ttab,NString _params,NString rid1,NString rid2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_PRIDX.MDPRTXFERGM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@IA", ia);
//			cmd.addParameter("@TTAB", ttab);
//			cmd.addParameter("@PARAMS", _params);
//			cmd.addParameter("@RID1", rid1);
//			cmd.addParameter("@RID2", rid2);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static List<SdoStattabRow> Frtcluster(DataCursor rc, ia,NString idxTab,NString _params,NNumber lvl,NString oidstr) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_PRIDX.RTCLUSTER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoStattabRow>.class);
//			cmd.addParameter("@RC", DataCursor.class);
//			cmd.addParameter("@IA", ia);
//			cmd.addParameter("@IDX_TAB", idxTab);
//			cmd.addParameter("@PARAMS", _params);
//			cmd.addParameter("@LVL", lvl);
//			cmd.addParameter("@OIDSTR", oidstr);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoStattabRow>.class);
//
//		}
		
//		public static List<SdoNumtabRow> Ftessellate(DataCursor rc, ia,NString idxtab,NString _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_PRIDX.TESSELLATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumtabRow>.class);
//			cmd.addParameter("@RC", DataCursor.class);
//			cmd.addParameter("@IA", ia);
//			cmd.addParameter("@IDXTAB", idxtab);
//			cmd.addParameter("@PARAMS", _params);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumtabRow>.class);
//
//		}
		
	
	
	
}
