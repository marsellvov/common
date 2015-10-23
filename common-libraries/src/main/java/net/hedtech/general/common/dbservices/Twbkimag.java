package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkimag {
		public static void pModifypgimage(NString returnCode,NString returnMsg,NString transType,NString nameIn,NString imageUrlIn,NString imageWidthIn,NString imageHeightIn,NString imageOnUrlIn,NString altIn,NString statusBarIn,NString commentIn,NString alignIn,NString borderIn,NString vspaceIn,NString hspaceIn,NString descIn,NString origNameIn,NString srchName,NString srchDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKIMAG.P_MODIFYPGIMAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
			cmd.addParameter("@RETURN_MSG", returnMsg);
			cmd.addParameter("@TRANS_TYPE", transType);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@IMAGE_URL_IN", imageUrlIn);
			cmd.addParameter("@IMAGE_WIDTH_IN", imageWidthIn);
			cmd.addParameter("@IMAGE_HEIGHT_IN", imageHeightIn);
			cmd.addParameter("@IMAGE_ON_URL_IN", imageOnUrlIn);
			cmd.addParameter("@ALT_IN", altIn);
			cmd.addParameter("@STATUS_BAR_IN", statusBarIn);
			cmd.addParameter("@COMMENT_IN", commentIn);
			cmd.addParameter("@ALIGN_IN", alignIn);
			cmd.addParameter("@BORDER_IN", borderIn);
			cmd.addParameter("@VSPACE_IN", vspaceIn);
			cmd.addParameter("@HSPACE_IN", hspaceIn);
			cmd.addParameter("@DESC_IN", descIn);
			cmd.addParameter("@ORIG_NAME_IN", origNameIn);
			cmd.addParameter("@SRCH_NAME", srchName);
			cmd.addParameter("@SRCH_DESC", srchDesc);
				
			cmd.execute();


		}
		
		public static void pOptionpgimage(NString returnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKIMAG.P_OPTIONPGIMAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
				
			cmd.execute();


		}
		
		public static void pSaveimage(NString transType,NString nameIn,NString imageUrlIn,NString imageWidthIn,NString imageHeightIn,NString imageOnUrlIn,NString altIn,NString statusBarIn,NString commentIn,NString alignIn,NString borderIn,NString vspaceIn,NString hspaceIn,NString descIn,NString origNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKIMAG.P_SAVEIMAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_TYPE", transType);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@IMAGE_URL_IN", imageUrlIn);
			cmd.addParameter("@IMAGE_WIDTH_IN", imageWidthIn);
			cmd.addParameter("@IMAGE_HEIGHT_IN", imageHeightIn);
			cmd.addParameter("@IMAGE_ON_URL_IN", imageOnUrlIn);
			cmd.addParameter("@ALT_IN", altIn);
			cmd.addParameter("@STATUS_BAR_IN", statusBarIn);
			cmd.addParameter("@COMMENT_IN", commentIn);
			cmd.addParameter("@ALIGN_IN", alignIn);
			cmd.addParameter("@BORDER_IN", borderIn);
			cmd.addParameter("@VSPACE_IN", vspaceIn);
			cmd.addParameter("@HSPACE_IN", hspaceIn);
			cmd.addParameter("@DESC_IN", descIn);
			cmd.addParameter("@ORIG_NAME_IN", origNameIn);
				
			cmd.execute();


		}
		
	
	
	
}
