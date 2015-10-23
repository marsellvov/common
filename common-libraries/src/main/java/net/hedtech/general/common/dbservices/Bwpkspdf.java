package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkspdf {
//		public static DomnodeRow FaddTextNode(Xmldom.DomdocumentRow doc,Xmldom.DomnodeRow rootNode,NString nodeName,NString nodeText) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPDF.ADD_TEXT_NODE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(DomnodeRow.class));
//			cmd.addParameter(DbTypes.createStructType("DOC", doc, Xmldom.DomdocumentRow.class ));
//			cmd.addParameter(DbTypes.createStructType("ROOT_NODE", rootNode, Xmldom.DomnodeRow.class ));
//			cmd.addParameter("@NODE_NAME", nodeName);
//			cmd.addParameter("@NODE_TEXT", nodeText);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(DomnodeRow.class);
//
//		}
//		
//		public static DomnodeRow FcreateNode(Xmldom.DomdocumentRow doc,Xmldom.DomnodeRow mainNode,NString attrNm,NString attrDesc,NString attrVal) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPDF.CREATE_NODE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(DomnodeRow.class));
//			cmd.addParameter(DbTypes.createStructType("DOC", doc, Xmldom.DomdocumentRow.class ));
//			cmd.addParameter(DbTypes.createStructType("MAIN_NODE", mainNode, Xmldom.DomnodeRow.class ));
//			cmd.addParameter("@ATTR_NM", attrNm);
//			cmd.addParameter("@ATTR_DESC", attrDesc);
//			cmd.addParameter("@ATTR_VAL", attrVal);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(DomnodeRow.class);
//
//		}
		
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPDF.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
	
	
	
}
