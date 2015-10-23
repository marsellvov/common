package net.hedtech.general.common.libraries.Foqrpls;



import morphis.foundations.core.appsupportlib.runtime.AbstractLibrary;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.configuration.LibraryConfiguration;
 
import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;

import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;




public class FoqrplsServices extends AbstractLibrary{
		
	public FoqrplsServices (LibraryConfiguration configuration,
			ISupportCodeContainer container, Hashtable sharedLibraries) {
		super(configuration, container, sharedLibraries);
	}
			
		
	// Attached Libraries
	/* package accessor */
	public PacCopyRec getPacCopyRec() 
	{
		return (PacCopyRec)getSupportCodeManager().getPackage("PAC_COPY_REC");
	}
	/* package accessor */
	public FSearchWhere getFSearchWhere() 
	{
		return (FSearchWhere)getSupportCodeManager().getPackage("F$_SEARCH_WHERE");
	}
	/* package accessor */
	public FFormatNumber getFFormatNumber() 
	{
		return (FFormatNumber)getSupportCodeManager().getPackage("F$_FORMAT_NUMBER");
	}
	
	//Original PL/SQL code for Prog Unit FOQRPLS.INSERT_FOBAPPD
	/*
	PROCEDURE INSERT_FOBAPPD (APPD_SEQ_CODE  NUMBER,
                          APPD_DOC_NUM   VARCHAR2,
                          APPD_SEQ_NUM   NUMBER,
                          APPD_BANK_NUM  VARCHAR2
                         )  IS


BEGIN
  
   FOKUTIL.p_insert_fobappd ( APPD_SEQ_CODE, 
                              APPD_DOC_NUM, 
                              APPD_SEQ_NUM,
                              APPD_BANK_NUM ) ;
    
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param appdSeqCode
		* @param appdDocNum
		* @param appdSeqNum
		* @param appdBankNum
		*/
		public void insertFobappd(NNumber appdSeqCode, NString appdDocNum, NNumber appdSeqNum, NString appdBankNum)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			Fokutil.pInsertFobappd(appdSeqCode, appdDocNum, appdSeqNum, appdBankNum);
//
			this.getLogger().trace(this, "F2J : insertFobappd procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit FOQRPLS.GET_ORIG_COMM_DESC
	/*
	FUNCTION GET_ORIG_COMM_DESC(COMMODITY_CODE VARCHAR2,
                            new_comm_desc varchar2,
                            EFFECTIVE_DATE VARCHAR2)
          RETURN VARCHAR2 IS

CURSOR PTI_CURSOR IS
      SELECT ftvcomm_desc
      FROM   FTVCOMM
      WHERE  FTVCOMM_CODE = COMMODITY_CODE
      and   ftvcomm_eff_date <= to_date(EFFECTIVE_DATE,'YYYYMMDDHH24MISS');
ORIG_COMM_DESC VARCHAR2(50) := '';

 

  
   
BEGIN
   if commodity_code is null then
     orig_comm_desc  := '';
  else
  

   OPEN PTI_CURSOR ;
   FETCH PTI_CURSOR INTO orig_comm_desc;
    IF PTI_CURSOR%NOTFOUND THEN
      orig_comm_desc := '';
   ELSE
     if  new_comm_desc = orig_comm_desc then
      orig_comm_desc := '';
        
     end if;
  end if;
end if;
      
  return orig_comm_desc;

RETURN NULL; exception
  when others then
    return '';

end;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param commodityCode
		* @param newCommDesc
		* @param effectiveDate
		*/
		public NString getOrigCommDesc(NString commodityCode, NString newCommDesc, NString effectiveDate)
		{
			int rowCount = 0;
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			String sqlptiCursor = "SELECT ftvcomm_desc " +
//	" FROM FTVCOMM " +
//	" WHERE FTVCOMM_CODE = :P_COMMODITY_CODE AND ftvcomm_eff_date <= to_date(:P_EFFECTIVE_DATE, 'YYYYMMDDHH24MISS') ";
//			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
//			NString origCommDesc = toStr("");
//			try {
//				try
//				{
//					if ( commodityCode.isNull() )
//					{
//						origCommDesc = toStr("");
//					}
//					else {
//						//Setting query parameters
//						ptiCursor.addParameter("P_COMMODITY_CODE", commodityCode);
//						ptiCursor.addParameter("P_EFFECTIVE_DATE", effectiveDate);
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
//						ptiCursor.open();
//						ResultSet ptiCursorResults = ptiCursor.fetchInto();
//						if ( ptiCursorResults != null ) {
//							origCommDesc = ptiCursorResults.getStr(0);
//						}
//						if ( ptiCursor.notFound() )
//						{
//							origCommDesc = toStr("");
//						}
//						else {
//							if ( newCommDesc.equals(origCommDesc) )
//							{
//								origCommDesc = toStr("");
//							}
//						}
//					}
//					return origCommDesc;
//					return NString.getNull();
//				}
//				catch(Exception  e)
//				{
//					return  toStr("");
//				}
//				}finally{
//					ptiCursor.close();
//				}
//
			this.getLogger().trace(this, "F2J : getOrigCommDesc function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}

	//Original PL/SQL code for Prog Unit FOQRPLS.GET_HORIZ_SCROLL_AMOUNT
	/*
	FUNCTION GET_HORIZ_SCROLL_AMOUNT(CURRENT_CANVAS IN VARCHAR2) 
         RETURN NUMBER IS
   O1 NUMBER;
   O2 NUMBER;
   O3 NUMBER;
BEGIN
   O1 := to_number(GET_CANVAS_PROPERTY(CURRENT_CANVAS,WIDTH));
   O2 := to_number(GET_VIEW_PROPERTY(CURRENT_CANVAS,WIDTH));
   O3 := O1 - O2;
   RETURN O3;
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param currentCanvas
		*/
		public NNumber getHorizScrollAmount(NString currentCanvas)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NNumber o1= NNumber.getNull();
//			NNumber o2= NNumber.getNull();
//			NNumber o3= NNumber.getNull();
//			// F2J_NOT_SUPPORTED : The property "CANVAS's WIDTH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\FOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//			//			o1 = toNumber(SupportClasses.FORMS4W.GetCanvasProperty(currentCanvas, SupportClasses.Property.WIDTH));
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'CANVAS's WIDTH' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\FOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//			
//			// F2J_NOT_SUPPORTED : The property "VIEW's WIDTH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\FOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
//			//			o2 = toNumber(SupportClasses.FORMS4W.GetViewProperty(currentCanvas, SupportClasses.Property.WIDTH));
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'VIEW's WIDTH' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\FOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
//			
//			o3 = o1.subtract(o2);
//			return o3;
//
			this.getLogger().trace(this, "F2J : getHorizScrollAmount function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}

	//Original PL/SQL code for Prog Unit FOQRPLS.GET_ENCUMB_COMMIT_TYPE
	/*
	PROCEDURE GET_ENCUMB_COMMIT_TYPE (ENCUMBRANCE_NUMBER   VARCHAR2,
                                  ENCUMBRANCE_ITEM     NUMBER,
                                  ENCUMBRANCE_SEQ_NUM  NUMBER,
                                  ENCUMB_CMT_TYPE   IN OUT VARCHAR2
                                 ) IS
BEGIN
   
    SELECT NVL(FGBENCD_CMT_TYPE,'U')
    INTO  ENCUMB_CMT_TYPE
    FROM FGBENCD
    WHERE FGBENCD_NUM = ENCUMBRANCE_NUMBER
    AND   FGBENCD_ITEM = ENCUMBRANCE_ITEM
    AND   FGBENCD_SEQ_NUM = ENCUMBRANCE_SEQ_NUM;

    EXCEPTION
      WHEN OTHERS THEN
        IF SQL%NOTFOUND THEN
           ENCUMB_CMT_TYPE := 'U';
        END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param encumbranceNumber
		* @param encumbranceItem
		* @param encumbranceSeqNum
		* @param encumbCmtType
		*/
		public void getEncumbCommitType(NString encumbranceNumber, NNumber encumbranceItem, NNumber encumbranceSeqNum, Ref<NString> encumbCmtType)
		{
			int rowCount = 0;
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				String sql1 = "SELECT NVL(FGBENCD_CMT_TYPE, 'U') " +
//	" FROM FGBENCD " +
//	" WHERE FGBENCD_NUM = :P_ENCUMBRANCE_NUMBER AND FGBENCD_ITEM = :P_ENCUMBRANCE_ITEM AND FGBENCD_SEQ_NUM = :P_ENCUMBRANCE_SEQ_NUM ";
//				DataCommand command1 = new DataCommand(sql1);
//				//Setting query parameters
//				command1.addParameter("P_ENCUMBRANCE_NUMBER", encumbranceNumber);
//				command1.addParameter("P_ENCUMBRANCE_ITEM", encumbranceItem);
//				command1.addParameter("P_ENCUMBRANCE_SEQ_NUM", encumbranceSeqNum);
//				ResultSet results1 = command1.executeQuery();
//				rowCount = command1.getRowCount();
//				if ( results1.hasData() ) {
//					encumbCmtType = results1.getStr(0);
//				}
//				results1.close();
//			}
//			catch(Exception  e)
//			{
//				if ( rowCount == 0 )
//				{
//					encumbCmtType.val = toStr("U");
//				}
//			}
//
			this.getLogger().trace(this, "F2J : getEncumbCommitType procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit FOQRPLS.CONVERT_DATE_TO_DATETIME
	/*
	PROCEDURE CONVERT_DATE_TO_DATETIME (USER_DATE   DATE,
                                    CONVERTED_DATE in oUT VARCHAR2
                                   ) IS

BEGIN

  CONVERTED_DATE := FOKUTIL.f_convert_date_to_datetime(to_char(USER_DATE, G$_DATE.GET_NLS_DATE_FORMAT), G$_DATE.GET_NLS_DATE_FORMAT); --added G$_DATE.GET_NLS_DATE_FORMAT to fix 1-5EL4JN (ISC)
 
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param userDate
		* @param convertedDate
		*/
		public void convertDateToDatetime(NDate userDate, Ref<NString> convertedDate)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			convertedDate.val = toStr(Fokutil.fConvertDateToDatetime(toChar(userDate, GDate.getNlsDateFormat()), GDate.getNlsDateFormat()));
//
			this.getLogger().trace(this, "F2J : convertDateToDatetime procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit FOQRPLS.AUDIT_TRAIL_MSGKEY_UPDATE
	/*
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : FOQRPLS
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Tue May 12 13:00:22 2009
-- MSGSIGN : #69218cbac16dc8f4
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrailMsgkeyUpdate procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit FOQRPLS.AUDIT_TRAIL_8_3
	/*
	PROCEDURE AUDIT_TRAIL_8_3 IS
<multilinecomment>
AUDIT TRAIL: 8.3                                
1. Lan Nguyen 04/03/2009
   RPE# 1-4US9HN - Expose I8N Fields.
   Program unit PAC_COPY_REC is modified to include fpbreqh_ctry_code_phone, 
   fpbreqh_ctry_code_fax in the INSERT INTO FPBREQH clause and 
   fpbpohd_ctry_code_phone, fpbpohd_ctry_code_fax in the INSERT INTO FPBPOHD 
   clause. 
2. Defect......1-58M375(same as 1-570XEV in 7x)
   Signoff.....Wei Zhang 21-APR-2009
   Problem.....PO Copy function on FPAPURR will not copy PO that includes a Change Order. 
   Fix.........Modify the PAC_COPY_REC.COPY_POHD_REC procedure to add change order indicator
               condition in the where clause of the query to get the lv_origin.
2. Defect......1-5EL4JN (ISC)
   Signoff.....Ravikumar Beli 08-MAY-2009
   Problem.....I18N bug - Missing G$_DATE
   Fix.........Modified CONVERT_DATE_TO_DATETIME procedure, that is replaced DD_MON_YYYY with 
   						 G$_DATE.GET_NLS_DATE_FORMAT.
                   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail83()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail83 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit FOQRPLS.AUDIT_TRAIL_8_2_0_1
	/*
	PROCEDURE AUDIT_TRAIL_8_2_0_1 IS
<multilinecomment>

Audit trail: 8.2.0.1
1. Defect......1-4JDQYP (the same as 1-4H9E63 in 7x)
   Signoff.....Wei Zhang 21-JAN-2009
   Problem.....Users created a requisition with attached text in Higher Market software, then created a PO for this
               requisition. The text attached to the requisition was also copied to this PO. This PO header
               has fpbpohd_text_ind = 'Y'. Then Banner messaging system copied this PO into Banner PO.
               However, when the users tried to create a new PO by copying this PO, the newly copied PO could
               not display in the fpapurr form, although all the PO records had been copied faithfully in the.
               database. The reason is there was no corresponding Banner requisition record with the same text 
               existed(the corresponding requistion record withe the same text existed in Higher Market system). 
   Fix.........Modify the PAC_COPY_REC.COPY_POHD_REC procedure so that 'Y' value is not copied into the new
               PO's fpbpohd_text_ind column if the PO to be copied was created from EPROCUREMENT.

Audit Trail end;
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8201()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail8201 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit FOQRPLS.AUDIT_TRAIL_8_0
	/*
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>

Audit trail: 8.0
1. Signoff.......Bgourlie 02-JUL-2007
   Modification..For expansion of currency fields, modify F$_FORMAT_NUMBER body to accomodate
                 the 4 separators of NUMBER(17,2).
                 Added g$_nls.get wrapper when setting text of F$_OK_BTN for 1-1ADD3J.
Audit Trail end;
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail80 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit FOQRPLS.AUDIT_TRAIL_7_2
	/*
	PROCEDURE AUDIT_TRAIL_7_2 IS
<multilinecomment>

AUdit trail: 7.2

1. Signoff.....Lakshmi Radhakrishnan 21-jul-2005
   Modifications....1. Replace code in convert_to_datetime with calls to fokutil.f_convert_date_to_datetime.
                    2. Replace copy to requisition tax and purchase order tax tables with calls to API.
                    
Audit Trail end;
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail72()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail72 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit FOQRPLS.AUDIT_TRAIL_7_0_FOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_7_0_FOQRPLS IS
<multilinecomment>
 Audit Trail: 7.0
1. TGKinderman  11/20/2003
   Converted to Forms9i
 AUDIT TRAIL END;
</multilinecomment>  
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Foqrpls()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail70Foqrpls procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit FOQRPLS.AUDIT_TRAIL_7_0
	/*
	PROCEDURE AUDIT_TRAIL_7_0 IS

<multilinecomment>
Audit Trail: 7.0
Signoff........Lakshmi Radhakrishnan 9-feb-2004
1. Rewrote insert_fobappd program unit to call the p_insert_fobappd procedure from FOKUTIL.
2. Changed the format masks of the numbers in the F$_FORMAT_NUMBER program unit.

Audit Trail end;
</multilinecomment>

BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail70 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit FOQRPLS.AUDIT_TRAIL_5_0_FOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_5_0_FOQRPLS IS
<multilinecomment>
 Audit Trail: 5.0
1. TGKinderman 06/14/2000
   Dev6.0 Upgrade.
 AUDIT TRAIL END;
</multilinecomment>  
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50Foqrpls()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail50Foqrpls procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit FOQRPLS.AUDIT_TRAIL_4_0
	/*
	PROCEDURE AUDIT_TRAIL_4_0 IS

<multilinecomment>

  Audit Trail: 4.0
  
  1. Signoff...Lakshmi Radhakrishnan 20-MAY-1998
     Enhancements....
      1.   Added taxes, discounts and additional charges to the copy
           function for the req. as part of the 4.0 purchasing enhancements.
           PAC_COPY_REC package body was changed so that the new columns added to the 
           requisition tables will be copied.

      2.  Added new columns in the purchase order copy statements so the the new columns added
         to the purchase order tables will be copied during the COPY process.

  2. Signoff.....Lakshmi Radhakrishnan 20-JUL-1998
     Defect#.....9844
     Problem.....When copying from an old purchase order, the printed date was also getting copied.
     Fix.........Insert null in the FPBPOHD_PO_PRINTED_DATE column when copying old purchase order
           to a new one.

  3. Signoff..........Bill Bishop 05-AUG-1998
     Enhancements.....Add function Get_Horiz_Scroll_Amount which calculates the correct distance 
                      to scroll on a stacked canvas when approaching the last field in the scroll.
 AUDIT TRAIL END;
</multilinecomment>  

BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail40 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit FOQRPLS.AUDIT_TRAIL_3_1
	/*
	PROCEDURE AUDIT_TRAIL_3_1 IS
<multilinecomment>
  Audit Trail: 3.1
  
  1. Signoff...Lakshmi Radhakrishnan 20-oct-1997
     Changes...ABAL rewrite enhancement. 
             1.Removed all the program units related to ABAL processing.
             2. Created a new program unit GET_ENCUMB_COMMIT_TYPE to get the commitment
                type of a encumbrance.

  2. Signoff...William Bishop 03-Dec-1997
     Changes...Add package PAC_copy_rec which copies requisitions or purchase orders.
               Code written by Stan M.

  2. Signoff...William Bishop 04-Dec-1997
     Changes...Set fprpohd_reqd_date (delivery date) to null in copied Purchase Order. 
  Audit Trail end;
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail31()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail31 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit FOQRPLS.AUDIT_TRAIL_3_0
	/*
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment>
AUDIT TRAIL: 3.0
1. DEFECT.....NONE
   SIGNOFF....TGKINDERMAN 25-MAR-1997
   PROBLEM....Erroneous behavior within procedure UPDATE_FGRBAKC_14 in conjunction
              with year 2000 modifications.
   FIX........Form modules using this library procudure were modified to use local
              logic.  Procedure was renamed in this library to X_UPDATE_FGRBAKC_14
              to ensure that it was not being used.
AUDIT TRAIL END;
</multilinecomment>
BEGIN
   NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail30 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

}
