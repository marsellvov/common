package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Xchafrmt {
		public static NString fBannerdataXml(NString nameIn,NString valueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("XCHAFRMT.F_BANNERDATA_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@VALUE_IN", valueIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCallinkXml(NString valueIn,NString typeIn,NString labelIn,NString imgIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("XCHAFRMT.F_CALLINK_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@VALUE_IN", valueIn);
			cmd.addParameter("@TYPE_IN", typeIn);
			cmd.addParameter("@LABEL_IN", labelIn);
			cmd.addParameter("@IMG_IN", imgIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fErrorXml(NString nameIn,NString valueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("XCHAFRMT.F_ERROR_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@VALUE_IN", valueIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFooterXml() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("XCHAFRMT.F_FOOTER_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fHeaderXml(NString titleIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("XCHAFRMT.F_HEADER_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TITLE_IN", titleIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fImageXml(NString imagepathIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("XCHAFRMT.F_IMAGE_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IMAGEPATH_IN", imagepathIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMessageXml(NString nameIn,NString valueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("XCHAFRMT.F_MESSAGE_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@VALUE_IN", valueIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
