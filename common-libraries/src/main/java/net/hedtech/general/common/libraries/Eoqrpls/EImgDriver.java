package net.hedtech.general.common.libraries.Eoqrpls;

import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
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
import net.hedtech.general.common.dbservices.Eokwtow.TParampairRow;
import net.hedtech.general.common.dbservices.dbtypes.*;


public class EImgDriver extends AbstractSupportCodeObject {
	

	public EImgDriver(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public EoqrplsServices getContainer() {
		return (EoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) E$_IMG_DRIVER
	/*
	PACKAGE E$_IMG_DRIVER IS
-- 5000-01 new code
-- 8000-01 Changed references of XtenderSolutions™ to Document Management Suite
<multilinecomment>--------------------------------------------------------------*\
  The package E$_IMG_DRIVER provides the second level of interfacing
  between Banner and Banner Document Management Suite
  beyond the G$_IMG_DRIVER (found in GOQRPLS.pll). This package
  will be delivered as a "stub" with the installation of Banner
  General 4.3 (i.e., a "stub" version of EOQRPLS.pll will be delivered).
  Banner Document Management Suite sites must have 
  Banner General 4.3 installed before Banner Document Management Suite can
  be installed.  At the point
  of installation of Banner Document Management Suite, the (General 4.3)
  stub version of EOQRPLS will be overwritten with a "real" version
  of this library code as distributed with the Banner Document Management Suite
  product (initial release number is 4.0).  For Banner sites that never
  install the latter product, no further updating or modification of
  EOQRPLS.pll will ever be necessary.
  
  Banner Document Management Suite first appeared in Banner with release
  5.0 of Banner, where it was simply a part of the toolbar UI (but
  with no real integrated functionality). Banner General 4.3 --
  together with Banner Document Management Suite -- is the
  initial fully-functional release of Banner Document Management Suite.
--
\*--------------------------------------------------------------</multilinecomment>
--
--*
--* Declare public subprogram specifications
--*
--    
-- 5000-01
--         Procedure p_call_extend_solut is invoked dynamically
--         from within GOQRPLS.G$_IMG_DRIVER.  The dynamic invocation
--         is to compensate for the fact that the Banner Document Management
--         Suite product may or may not be installed at a given Banner site.
--
--         To be at this point, Banner Document Management Suite must already
--         be installed at this site.  If however Banner Document Management
--         Suite is not enabled at a client site, or if the
--         current user is not a valid Banner Document Management Suite
--         user, the current package procedure
--         will provide text for relevant display(s) to
--         indicate this.  In such cases, no further
--         processing will take place other than the
--         informational UI.
--
--         Dependencies:
--                      Needs the following objects:
--                         Database Package Spec EOKRSLT
--
--         Inputs:
--
--         Processing:
--
--         Output:
--
   PROCEDURE p_call_extend_solut
      (
         Current_Form_In          IN     VARCHAR2,
         Current_Block_In         IN     VARCHAR2,
         Current_Item_In          IN     VARCHAR2,
         Username_In              IN     VARCHAR2,
         Imaging_User_Ind_In_Out  IN OUT VARCHAR2,
         Message2_In_Out          IN OUT VARCHAR2,
         Message3_In_Out          IN OUT VARCHAR2,
         Message4_In_Out          IN OUT VARCHAR2,
         Message5_In_Out          IN OUT VARCHAR2,
         Message6_In_Out          IN OUT VARCHAR2,
         Message7_In_Out          IN OUT VARCHAR2,
         Message8_In_Out          IN OUT VARCHAR2,
         InquiryOnly_Ind          IN     INTEGER,
         Quant_Results_In_Out     IN OUT INTEGER,
         Doc_Type_In_Out          IN OUT VARCHAR2,
         AX_Application_In_Out    IN OUT VARCHAR2,
         Push_Flag_In             IN     INTEGER DEFAULT 0
      ) ;
      
   PROCEDURE p_get_bnr_context
      (
         Current_Form_In             IN     VARCHAR2,
         Current_Block_In            IN     VARCHAR2,
         Current_Item_In             IN     VARCHAR2,
         AX_Application_In_Out       IN OUT VARCHAR2,
         Doc_Type_In_Out             IN OUT VARCHAR2,
         Called_Queryname_In_Out     IN OUT VARCHAR2,  -- 5.2.0.0-3
         Rule_Block_Name_tmp         IN OUT VARCHAR2,
         Rule_Item_Name_tmp          IN OUT VARCHAR2,
         Rule_Item_Value_tmp         IN OUT VARCHAR2,
         Message4_In_Out             IN OUT VARCHAR2,
         Message6_In_Out             IN OUT VARCHAR2
      ) ;

   PROCEDURE p_make_params_web
      (
         Current_Form_In             IN     VARCHAR2,
         Current_Block_In            IN     VARCHAR2,
         Current_Item_In             IN     VARCHAR2,
         Current_Item_Value_In       IN     VARCHAR2,
         AX_Application_In           IN     VARCHAR2,
         Doc_Type_In                 IN     VARCHAR2,
         ParamTable                  IN OUT EOKWTOW.ParamTab,
         Message5_In_Out             IN OUT VARCHAR2,
         Message6_In_Out             IN OUT VARCHAR2
      ) ;

END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) E$_IMG_DRIVER
		/*
		PACKAGE BODY E$_IMG_DRIVER IS

   push_flag INTEGER;
   
-- The width of database field EXRBCXT_BNR_ITEM_VALUE. This is a limitation on the amount of a form item's
-- value that can be compared with that database rule:
   Item_Value_Compar_Max_Lgth_con  CONSTANT NUMBER ( 3 ) := 50 ; 

   
	 
-- 5000-01 new code
--         No dynamic SQL utilized;  this package
--         assumes that the test for existence
--         of the Banner Document Management Suite
--         product has already been done (and has
--         been affirmative).
--
--*
--* Declare private variables
--*
   PROCEDURE p_aex_initiate
      (
         Current_Form_In          IN     VARCHAR2,
         Current_Block_In         IN     VARCHAR2,
         Current_Item_In          IN     VARCHAR2,
         Username_In              IN     VARCHAR2,
         AX_Application_In_Out    IN OUT VARCHAR2,
         Doc_Type_In_Out          IN OUT VARCHAR2,
         InquiryOnly_Ind          IN     INTEGER,
         Quant_Results_In_Out     IN OUT INTEGER,
         Message4_In_Out          IN OUT VARCHAR2,
         Message5_In_Out          IN OUT VARCHAR2,
         Message6_In_Out          IN OUT VARCHAR2,
         Message7_In_Out          IN OUT VARCHAR2
      ) ;
--
   PROCEDURE p_aex_initiate_web
      (
         Current_Form_In          IN     VARCHAR2,
         Current_Block_In         IN     VARCHAR2,
         Current_Item_In          IN     VARCHAR2,
         Username_In              IN     VARCHAR2,
         AX_Application_In_Out    IN OUT VARCHAR2,
         Doc_Type_In_Out          IN OUT VARCHAR2,
         InquiryOnly_Ind          IN     INTEGER,
         Quant_Results_In_Out     IN OUT INTEGER,
         Message4_In_Out          IN OUT VARCHAR2,
         Message5_In_Out          IN OUT VARCHAR2,
         Message6_In_Out          IN OUT VARCHAR2,
         Message7_In_Out          IN OUT VARCHAR2
      ) ;

   PROCEDURE p_get_source_value
      (
         Parm_Source_In              IN     VARCHAR2,
         Parm_Value_In_Out           IN OUT VARCHAR2,
         Message6_In_Out             IN OUT VARCHAR2
      ) ;
   
   
   
--
--
--* Define public subprogram bodies
--

--       
--
--*
   PROCEDURE p_call_extend_solut
      (
         Current_Form_In          IN     VARCHAR2,
         Current_Block_In         IN     VARCHAR2,
         Current_Item_In          IN     VARCHAR2,
         Username_In              IN     VARCHAR2,
         Imaging_User_Ind_In_Out  IN OUT VARCHAR2,
         Message2_In_Out          IN OUT VARCHAR2,
         Message3_In_Out          IN OUT VARCHAR2,
         Message4_In_Out          IN OUT VARCHAR2,
         Message5_In_Out          IN OUT VARCHAR2,
         Message6_In_Out          IN OUT VARCHAR2,
         Message7_In_Out          IN OUT VARCHAR2,
         Message8_In_Out          IN OUT VARCHAR2,
         InquiryOnly_Ind          IN     INTEGER,
         Quant_Results_In_Out     IN OUT INTEGER,
         Doc_Type_In_Out          IN OUT VARCHAR2,
         AX_Application_In_Out    IN OUT VARCHAR2,
         Push_Flag_In             IN     INTEGER DEFAULT 0
      ) IS
--
--
--
         Enabled_Ind_In_Out              VARCHAR2 ( 1 ) ;
         Installed_AX_Version_tmp        VARCHAR2 (50 ) ;
         Schema_Name_tmp                 VARCHAR2 (50 ) ;
         Current_Form_tmp                VARCHAR2 (30 ) ;
         Current_Block_tmp               VARCHAR2 (30 ) ;
         Current_Item_tmp                VARCHAR2 (50 ) ;
         Username_tmp                    VARCHAR2 (30 ) ;
         InquiryOnly_Ind_tmp             INTEGER        ;
         Installed_AX_Version_In_Out     VARCHAR2(50);
         Schema_Name_In_Out              VARCHAR2(30) := 'NULL SCHEMA';
         
      BEGIN

         Current_Form_tmp    := Current_Form_In ;
         Current_Block_tmp   := Current_Block_In ;
         Current_Item_tmp    := Current_Item_In ;
         Username_tmp        := Username_In ;
         Schema_Name_tmp     := Schema_Name_In_Out ;
         InquiryOnly_Ind_tmp := InquiryOnly_Ind;
--
--
<multilinecomment>       ----------------------------------------------------------------
         A matrix depicting platform/product navigational issues
         follows:
         
         Web Environment:  (requires widget on Web server)

            InquiryOnly_Ind = 1 (informational query only):
               Use widget method CountResultsWX to return the
                     quantity of hits.

            InquiryOnly_Ind <> 1:
               Invoke browser, run query, display results in WX
         
         Client-Server Environment:  (requires widget on client PC)

            InquiryOnly_Ind = 1 (informational query only):
               Use widget method CountResultsWX
                     to return the quantity of hits.

            InquiryOnly_Ind <> 1:
               If AX is installed and user doesn't want
                     WX specifically preferred over AX, then
                     AX will be invoked to run the query,
               
               Otherwise,
                     WX will be invoked via the widget.
</multilinecomment>       ----------------------------------------------------------------

         push_flag := Push_Flag_In;
         
         -- Document Push when C/S Banner calls AX
         IF (Push_Flag_In > 0 and NOT e$_env_is_web() AND e$_img_util.f_get_invokes()='AX') THEN 
         	  e$_img_driver2.push_csb_ax(Push_Flag_In, Message2_In_Out); 
         -- C/S Banner calls AX or C/S Banner calls WX but not a query count	  
         ELSIF (NOT e$_env_is_web() AND e$_img_util.f_get_invokes() = 'AX') OR
         	     (NOT e$_env_is_web() AND e$_img_util.f_get_invokes() = 'WX' AND InquiryOnly_Ind_tmp <> 1) THEN
         	  
            p_aex_initiate
               (
                  Current_Form_tmp,
                  Current_Block_tmp,
                  Current_Item_tmp,
                  Username_tmp,
                  AX_Application_In_Out,
                  Doc_Type_In_Out,
                  InquiryOnly_Ind_tmp,
                  Quant_Results_In_Out,
                  Message4_In_Out,
                  Message5_In_Out,
                  Message6_In_Out,
                  Message7_In_Out
               ) ;
         ELSE
         -- All other situations	
            p_aex_initiate_web
               (
                  Current_Form_tmp,
                  Current_Block_tmp,
                  Current_Item_tmp,
                  Username_tmp,
                  AX_Application_In_Out,
                  Doc_Type_In_Out,
                  InquiryOnly_Ind_tmp,
                  Quant_Results_In_Out,
                  Message4_In_Out,
                  Message5_In_Out,
                  Message6_In_Out,
                  Message7_In_Out
               ) ;
         END IF ;
--
      EXCEPTION
--
         WHEN OTHERS THEN
--
--
--          Debugging the actual error returned...
            Message2_In_Out :=
                  '***ERROR*** '                        ||
                  ' e$_img_driver.p_call_extend_solut ' ||
                  TO_CHAR ( SQLCODE )                   ||
                  '  '                                  ||
                  SUBSTR ( SQLERRM, 1, 200 )            || '.' ;
--
--          Store the problem in the error / results table:
            eokrslt.p_insert_exrrslt
                  (
                     'PACKAGE',
                     'EOQRPLS.E$_IMG_DRIVER.P_CALL_EXTEND_SOLUT',
                     'CONTEXT',
                     SUBSTR ( Message2_In_Out, 1, 200 ),
                     USER,
                     SYSDATE
                  ) ;
--
            RETURN ;
--
      END p_call_extend_solut ;
--
--
   PROCEDURE p_aex_initiate_web
      (
         Current_Form_In          IN     VARCHAR2,
         Current_Block_In         IN     VARCHAR2,
         Current_Item_In          IN     VARCHAR2,
         Username_In              IN     VARCHAR2,
         AX_Application_In_Out    IN OUT VARCHAR2,
         Doc_Type_In_Out          IN OUT VARCHAR2,
         InquiryOnly_Ind          IN     INTEGER,
         Quant_Results_In_Out     IN OUT INTEGER,
         Message4_In_Out          IN OUT VARCHAR2,
         Message5_In_Out          IN OUT VARCHAR2,
         Message6_In_Out          IN OUT VARCHAR2,
         Message7_In_Out          IN OUT VARCHAR2
      ) IS
--
--       LOCAL VARIABLES:
--
         WX_Root_URL              VARCHAR2 ( 100 ) ;
         Rule_Block_Name_In_Out   VARCHAR2 ( 30 ) ;
         Rule_Item_Name_In_Out    VARCHAR2 ( 50 ) ;
         Rule_Item_Value_In_Out   VARCHAR2 ( 120 ) ;
--
         ParamTable               EOKWTOW.ParamTab ;
         WX_URL_str               VARCHAR2 ( 2048 ) ;
         credentials              VARCHAR2 ( 2048 );
--
--5.2.0.0-3
         Called_Queryname_In_Out  exrbcxt.exrbcxt_called_queryname%TYPE ;
         TabIdx                   BINARY_INTEGER := 0 ;
--
--       Used for debugging:
         Table_Idx                INTEGER ;
         Debug_str                VARCHAR2 ( 2000 ) ;
--
      BEGIN
      	
      	 -- Checks whether root URL is valid. If not, displays error and return.
         IF (e$_img_util.f_get_invokes() = 'WX') THEN
            WX_Root_URL := e$_img_util.f_get_wx_root_url();
            IF (WX_Root_URL IS NULL) THEN
            	 e$_img_util.p_show_msg(e$_img_util.NO_WX_ROOT_URL_con);
            	 RETURN;
            END IF;
         ELSE	
            WX_Root_URL := e$_img_util.f_get_ax_root_url();
            IF (WX_Root_URL IS NULL) THEN
            	 e$_img_util.p_show_msg(e$_img_util.NO_AX_ROOT_URL_con);
            	 RETURN;
            END IF;
         END IF;

        

--       Begin to build the field/value pairs:
--
--       Start with an empty PL/SQL table:
         ParamTable.DELETE ;
--
--       Pair #1:  Name of the AX Data Source:
         TabIdx := TabIdx + 1 ;
         ParamTable ( TabIdx ).   ParamName := 'DSN' ;
         ParamTable ( TabIdx ).   ParamValue := e$_img_util.f_get_data_source();
--
--       Pair #2:  Name of the AX Application:
         p_get_bnr_context
            (
               Current_Form_In,
               Current_Block_In,
               Current_Item_In,
               AX_Application_In_Out,
               Doc_Type_In_Out,
               Called_Queryname_In_Out,  -- 5.2.0.0-3
               Rule_Block_Name_In_Out,
               Rule_Item_Name_In_Out,
               Rule_Item_Value_In_Out,
               Message4_In_Out,
               Message6_In_Out
            ) ;
--
         TabIdx := TabIdx + 1 ;
         ParamTable ( TabIdx ).   ParamName := 'AppName' ;
--
         IF (AX_Application_In_Out IS NULL) THEN
         	  IF (InquiryOnly_Ind = 1) THEN
         	     Quant_Results_In_Out := e$_img_util.DOC_COUNT_NO_CONTEXT_RULES;
         	     RETURN;
         	  END IF;   
--
--5000-02
--          Case 1:  No Context exists.  Pad the AppName value with
--             generic (and universally available) AX Application
--             B-G-ID, and create an impossible value for the query
--             that will result in no records being found in the
--             formulated query.
--
            ParamTable ( TabIdx ).   ParamValue := 'B-G-ID' ;
            TabIdx := TabIdx + 1 ;
            ParamTable ( TabIdx ).   ParamName := 'ID' ;
            ParamTable ( TabIdx).   ParamValue := '[[[[[]]]]' ;
--
         ELSE
--
--          Case 2:  Context does exist:
            ParamTable ( TabIdx ).   ParamValue := AX_Application_In_Out ;
--
--          Next Pair:  Document Type (if not null)
	          IF Doc_Type_In_Out IS NOT NULL THEN
--
               TabIdx := TabIdx + 1 ;
               ParamTable ( TabIdx ).ParamName  := 'DOCUMENT TYPE' ;
               ParamTable ( TabIdx ).ParamValue := Doc_Type_In_Out ;
--
	          END IF ;
--
-- 5.2.0.0-3
--          Next Pair:  Called Queryname (if not null)
	          IF Called_Queryname_In_Out IS NOT NULL THEN
--
--             The name of the query:
               TabIdx := TabIdx + 1 ;
               ParamTable ( TabIdx ).ParamName  := 'SavedQuery' ;
               ParamTable ( TabIdx ).ParamValue := Called_Queryname_In_Out ;

               TabIdx := TabIdx + 1 ;
               ParamTable(TabIdx).ParamName  := 'QueryType';
               ParamTable(TabIdx).ParamValue := '1' ;
               
--
-- 5.2.0.0-3
--             This next parameter implements a precedence algorithm when
--                a collision occurs between a field/value search criterion
--                that is brought over from the Banner side and a field/value
--                pair that is stored on the Legato side as part of the
--                query definition itself.  Setting this field to true
--                means that, on a field-by-field basis, values coming in
--                from the URL will be preferred over values as stored in
--                table OTGMGR.AE_QSEG.
               TabIdx := TabIdx + 1 ;
               ParamTable ( TabIdx ).ParamName  := 'UpdateAvlFieldsOnly' ;
               ParamTable ( TabIdx ).ParamValue := 'true' ;
--
	          END IF ;
--
--          The remaining pairs:  Parameters (if any) from EXRAXPA based on
--             Banner context:
            p_make_params_web
               (
                  Current_Form_In,
                  Rule_Block_Name_In_Out,
                  Rule_Item_Name_In_Out,
                  Rule_Item_Value_In_Out,
                  AX_Application_In_Out,
                  Doc_Type_In_Out,
                  ParamTable,
                  Message5_In_Out,
                  Message6_In_Out
               ) ;
--
         END IF ;
--


        WX_URL_str := WX_Root_URL || '?' || eokwtow.F_GetQueryStr(ParamTable);
            
	      -- For push, remove doc type field info if it is a list or an expression
	      IF (push_flag > 0) THEN
           IF (INSTR(WX_URL_str, '&DOCUMENT%20TYPE=LIST%3A') > 0 ) OR
           	  (INSTR(WX_URL_str, '&DOCUMENT%20TYPE=EXPRESSION%3A') > 0 ) THEN
           	  NULL; -- TO BE DONE IN FUTURE RELEASE
           END IF;	   
	      END IF;


        IF (e$_img_util.f_get_invokes() = 'AX') THEN
           credentials := e$_img_util.f_get_credentials_url('BASE64');
        ELSE
           credentials := e$_img_util.f_get_credentials_url();
        END IF;	
        
        IF (NOT credentials IS NULL) THEN   
 		       WX_URL_str := WX_URL_str || '&' || credentials;
 		    END IF;

        IF (e$_img_util.f_get_invokes() = 'AX') THEN
           credentials := e$_img_util.f_get_credentials_url('BASE64', FALSE);
        	 IF NOT credentials IS NULL THEN   
 		          WX_URL_str := WX_URL_str || '&' ||credentials;
 		       END IF;   
 		    END IF;
	
	      
				IF (InquiryOnly_Ind = 1) THEN   --Document Count
           IF (e$_img_util.f_get_invokes() = 'WX') THEN
              IF (NOT e$_img_util.f_is_wx_dotnet) THEN
                 WX_URL_str := WX_URL_str || '&submitAction=SubmitQuery';
              END IF;	  	
			        Quant_Results_In_Out := eokwtow.f_get_doc_count_from_wx(WX_URL_str);							
			        RETURN;
			     ELSE  -- INB to AX count   	
         	    Quant_Results_In_Out := e$_img_util.DOC_COUNT_INB_TO_AX;
         	  	WX_URL_str := WX_URL_str || '&__COUNT=TRUE';
         	 END IF;	 
			  ELSIF (push_flag > 0) THEN           --Document Push       	
           IF (e$_img_util.f_get_invokes() = 'WX') THEN
           	  IF (e$_img_util.f_is_wx_dotnet) THEN
                 WX_URL_str := e$_img_util.f_replace_string(WX_URL_str, 'ISubmitQuery.aspx', 'IDocImport.aspx');
           	  ELSE
                 WX_URL_str := WX_URL_str || '&submitAction=DocImport';
           	  END IF;	
           ELSE
            	WX_URL_str := WX_URL_str || '&__PUSH=' || TO_CHAR(push_flag);
           END IF;	
        ELSE     --Document Query
           IF (e$_img_util.f_get_invokes() = 'WX') THEN
              IF (NOT e$_img_util.f_is_wx_dotnet) THEN
                 WX_URL_str := WX_URL_str || '&submitAction=SubmitQuery';
              END IF;	  	
           END IF;   
				END IF;
				
        WEB.SHOW_DOCUMENT(WX_URL_str, '_BLANK');
--
--
--
      EXCEPTION
--
         WHEN OTHERS THEN
--          Debugging the actual error returned...
            Message7_In_Out :=
                  '***ERROR*** '                       ||
                  ' e$_img_driver.p_aex_initiate_web ' ||
                  TO_CHAR ( SQLCODE )                  ||
                  '  '                                 ||
                  SUBSTR ( SQLERRM, 1, 200 )           || '.' ;
--
--          Store the problem in the error / results table:
            eokrslt.p_insert_exrrslt
                  (
                     'PACKAGE',
                     'EOQRPLS.E$_IMG_DRIVER.P_AEX_INITIATE_WEB',
                     'CONTEXT',
                     SUBSTR ( Message7_In_Out, 1, 200 ),
                     USER,
                     SYSDATE
                  ) ;  
--
            RETURN ;
--
      END p_aex_initiate_web ;
--

--
--
   PROCEDURE p_get_bnr_context
      (
         Current_Form_In             IN     VARCHAR2,
         Current_Block_In            IN     VARCHAR2,
         Current_Item_In             IN     VARCHAR2,
         AX_Application_In_Out       IN OUT VARCHAR2,
         Doc_Type_In_Out             IN OUT VARCHAR2,
         Called_Queryname_In_Out     IN OUT VARCHAR2,  -- 5.2.0.0-3
         Rule_Block_Name_tmp         IN OUT VARCHAR2,
         Rule_Item_Name_tmp          IN OUT VARCHAR2,
         Rule_Item_Value_tmp         IN OUT VARCHAR2,
         Message4_In_Out             IN OUT VARCHAR2,
         Message6_In_Out             IN OUT VARCHAR2
      ) IS
--
      CURSOR Get_Context_c
         (
            Current_Form_c_in        IN     VARCHAR2,
            Current_Block_c_in       IN     VARCHAR2,
            Current_Item_c_in        IN     VARCHAR2,
            Current_Item_Value_c_in  IN     VARCHAR2
         )
         IS
            SELECT
               exrbcxt_axap_code,
               exrbcxt_dtyp_code,
               exrbcxt_called_queryname,  -- 5.2.0.0-3
               '4' order_txt,
               exrbcxt_bnr_block_name,
               exrbcxt_bnr_item_name,
               exrbcxt_bnr_item_value
            FROM exrbcxt
            WHERE
                   exrbcxt_bnr_form_name  = Current_Form_c_in
               AND exrbcxt_bnr_block_name IS NULL
               AND exrbcxt_bnr_item_name  IS NULL
            UNION
            SELECT
               exrbcxt_axap_code,
               exrbcxt_dtyp_code,
               exrbcxt_called_queryname,  -- 5.2.0.0-3
               '3',
               exrbcxt_bnr_block_name,
               exrbcxt_bnr_item_name,
               exrbcxt_bnr_item_value
            FROM exrbcxt
            WHERE
                   exrbcxt_bnr_form_name  = Current_Form_c_in
               AND exrbcxt_bnr_block_name = Current_Block_c_in
               AND exrbcxt_bnr_item_name  IS NULL
            UNION
            SELECT
               exrbcxt_axap_code,
               exrbcxt_dtyp_code,
               exrbcxt_called_queryname,  -- 5.2.0.0-3
               '2',
               exrbcxt_bnr_block_name,
               exrbcxt_bnr_item_name,
               exrbcxt_bnr_item_value
            FROM exrbcxt
            WHERE
                   exrbcxt_bnr_form_name  = Current_Form_c_in
               AND exrbcxt_bnr_block_name = Current_Block_c_in
               AND exrbcxt_bnr_item_name  = Current_Item_c_in
               AND exrbcxt_bnr_item_value IS NULL
            UNION
            SELECT
               exrbcxt_axap_code,
               exrbcxt_dtyp_code,
               exrbcxt_called_queryname,  -- 5.2.0.0-3
               '1',
               exrbcxt_bnr_block_name,
               exrbcxt_bnr_item_name,
               exrbcxt_bnr_item_value
            FROM exrbcxt
            WHERE
                   exrbcxt_bnr_form_name  = Current_Form_c_in
               AND exrbcxt_bnr_block_name = Current_Block_c_in
               AND exrbcxt_bnr_item_name  = Current_Item_c_in
               AND exrbcxt_bnr_item_value = Current_Item_Value_c_in
          ORDER BY 4 ;  -- 5.2.0.0-3
--
      Order_Txt_tmp                         VARCHAR2(  1 ) ;
      Current_Item_Value_tmp_in_out         VARCHAR2( 120 ) ;
      Block_Item_Name_tmp                   VARCHAR2(120 ) ;
--
      BEGIN
--
--       At certain times, we must do NAME_IN operations against
--          a given field in the form.  If the argument for
--          NAME_IN contains fieldname ambiguity, then we must
--          compensate for this by creating a string that contains
--          format 'NAME_OF_BLOCK.NAME_OF_ITEM':
         IF INSTR ( Current_Item_In, '.' ) = 0 THEN
--
            Block_Item_Name_tmp := Current_Block_In || '.' || Current_Item_In ;
--
         ELSE
--
            Block_Item_Name_tmp := Current_Item_In ;
--
         END IF ;
--
--       To facilitate value-based rules testing, we need
--          to know the value of :SYSTEM.CURRENT_ITEM itself.
--          We can use an existing procedure to load this
--          value into Current_Item_Value_tmp_in.  We will need
--          to truncate its length to the length of the
--          database field EXRBCXT_BNR_ITEM_VALUE.
         p_get_source_value
               (
                  Block_Item_Name_tmp,
                  Current_Item_Value_tmp_in_out,
                  Message6_In_Out
               ) ;
--
         IF NVL ( LENGTH ( Current_Item_Value_tmp_in_out ), 0 )
               > Item_Value_Compar_Max_Lgth_con THEN
            Current_Item_Value_tmp_in_out :=
                  SUBSTR ( Current_Item_Value_tmp_in_out,
                        1, Item_Value_Compar_Max_Lgth_con ) ;
         END IF ;
--
--       Determine the Banner context:
         OPEN Get_Context_c
               (
                  Current_Form_In,
                  Current_Block_In,
                  Current_Item_In,
                  Current_Item_Value_tmp_in_out
               ) ;
--
            FETCH Get_Context_c INTO
                  AX_Application_In_Out,
                  Doc_Type_In_Out,
                  Called_Queryname_In_Out,  -- 5.2.0.0-3
                  Order_Txt_tmp,
                  Rule_Block_Name_tmp,
                  Rule_Item_Name_tmp,
                  Rule_Item_Value_tmp ;
--
         CLOSE Get_Context_c ;
--
      EXCEPTION
--
         WHEN OTHERS THEN
--          Debugging the actual error returned...
            Message4_In_Out :=
                  '***ERROR*** '                   ||
                  ' e$_img_driver.p_get_bnr_context ' ||
                  TO_CHAR ( SQLCODE )              ||
                  '  '                             ||
                  SUBSTR ( SQLERRM, 1, 200 )       || '.' ;
--
--          Store the problem in the error / results table:
            eokrslt.p_insert_exrrslt
                  (
                     'PACKAGE',
                     'EOQRPLS.E$_IMG_DRIVER.P_GET_BNR_CONTEXT',
                     'CONTEXT',
                     SUBSTR ( Message4_In_Out, 1, 200 ),
                     USER,
                     SYSDATE
                  ) ;
--
            RETURN ;
--
      END p_get_bnr_context ;

	  
   PROCEDURE p_make_params_web
      (
         Current_Form_In             IN     VARCHAR2,
         Current_Block_In            IN     VARCHAR2,
         Current_Item_In             IN     VARCHAR2,
         Current_Item_Value_In       IN     VARCHAR2,
         AX_Application_In           IN     VARCHAR2,
         Doc_Type_In                 IN     VARCHAR2,
         ParamTable                  IN OUT EOKWTOW.ParamTab,
         Message5_In_Out             IN OUT VARCHAR2,
         Message6_In_Out             IN OUT VARCHAR2
      ) IS
--
      CURSOR Get_Params_c
         (
            Current_Form_c_in        IN     VARCHAR2,
            Current_Block_c_in       IN     VARCHAR2,
            Current_Item_c_in        IN     VARCHAR2,
            Current_Item_Value_c_in  IN     VARCHAR2
         )
         IS
            SELECT
               exraxpa_parm_source_name,
               exraxpa_parm_target_name
            FROM exraxpa
            WHERE
                   exraxpa_bnr_form_name  = Current_Form_c_in
               AND NVL ( exraxpa_bnr_block_name, 'XXXXXXBLOCKXXXXXX' )
                     = NVL ( Current_Block_c_in, 'XXXXXXBLOCKXXXXXX' )
               AND NVL ( exraxpa_bnr_item_name, 'XXXXXXITEMXXXXXX' )
                     = NVL ( Current_Item_c_in, 'XXXXXXITEMXXXXXX' )
               AND NVL ( exraxpa_bnr_item_value, 'XXXXXXVALUEXXXXXX' )
                     = NVL ( Current_Item_Value_c_in, 'XXXXXXVALUEXXXXXX' ) ;
--
      Parm_Source_tmp                 VARCHAR2 ( 50 ) ;
      Parm_Target_tmp                 VARCHAR2 ( 50 ) ;
      Parm_Source_Value_tmp           VARCHAR2 ( 140 ) ;
      Error_Context                   VARCHAR2 (200 ) ;
--
-- 5.2.0.0-3
--    This next integer serves as the first record
--       of the PL/SQL table that will be loaded here:
      Tbl_Idx                         BINARY_INTEGER := ParamTable.count;
--
      BEGIN
--
--       The parameter table may or may not contain an index-3
--          record at this point.  We will need to set the beginning
--          index value based on the current state of Doc_Type_In.
--
--       Formulate additional, Banner form context-based
--          parameters into user-defined PL/SQL table.
--
         OPEN Get_Params_c
               (
                  Current_Form_In,
                  Current_Block_In,
                  Current_Item_In,
                  Current_Item_Value_In
               ) ;
--
            LOOP
--
               FETCH Get_Params_c INTO Parm_Source_tmp, Parm_Target_tmp ;
--
               EXIT WHEN Get_Params_c%NOTFOUND ;
--
--             Re-initialize the value of Parm_Source_Value_tmp to null:
               Parm_Source_Value_tmp := '' ;
--
--
               Error_Context :=
                     ' Next call:  Calling of p_get_source_value. ' ;
--
--             Using NAME_IN, get the value in the Banner field:
               p_get_source_value
                  (
                     Parm_Source_tmp,
                     Parm_Source_Value_tmp,
                     Message6_In_Out
                  ) ;
--
--             We must limit the length of the value string:
               IF NVL ( LENGTH ( Parm_Source_Value_tmp ), 0 )
                     > Item_Value_Compar_Max_Lgth_con THEN
                  Parm_Source_Value_tmp :=
                        SUBSTR ( Parm_Source_Value_tmp,
                              1, Item_Value_Compar_Max_Lgth_con ) ;
               END IF ;
--
--             If there is a value within the Banner field,
--                then formulate a field/value pair to load
--                into the PL/SQL table:
               IF Parm_Source_Value_tmp IS NOT NULL THEN
--
                  Error_Context :=
                        ' Next call:  Adding parameter AX fieldname ''' ||
                        Parm_Target_tmp                                 ||
                        '''.' ;
--
-- 5.2.0.0-3
                  Tbl_Idx := Tbl_Idx + 1 ;
                  ParamTable ( Tbl_Idx ) . ParamName   := Parm_Target_tmp ;
                  ParamTable ( Tbl_Idx ) . ParamValue  := Parm_Source_Value_tmp ;
--
               END IF ;
--
            END LOOP ;
--
         CLOSE Get_Params_c ;
--
      EXCEPTION
--
         WHEN OTHERS THEN
--          Debugging the actual error returned...
            Message5_In_Out :=
                  '***ERROR*** '                      ||
                  ' e$_img_driver.p_make_params_web ' ||
                  Error_Context                       ||
                  TO_CHAR ( SQLCODE )                 ||
                  '  '                                ||
                  SUBSTR ( SQLERRM, 1, 200 )          || '.' ;
--
--          Store the problem in the error / results table:
            eokrslt.p_insert_exrrslt
                  (
                     'PACKAGE',
                     'EOQRPLS.E$_IMG_DRIVER.P_MAKE_PARAMS_WEB',
                     'CONTEXT',
                     SUBSTR ( Message5_In_Out, 1, 200 ),
                     USER,
                     SYSDATE
                  ) ;
--
            RETURN ;
--
      END p_make_params_web ;
--
--
   PROCEDURE p_get_source_value
      (
         Parm_Source_In              IN     VARCHAR2,
         Parm_Value_In_Out           IN OUT VARCHAR2,
         Message6_In_Out             IN OUT VARCHAR2
      ) IS
--
         Datatype_tmp                VARCHAR2 ( 40 ) := '' ;
         Item_Type_tmp               VARCHAR2 ( 40 ) := '' ;
--
      BEGIN
--
--       Initialize the output variable:
         Parm_Value_In_Out := NULL ;
-- If this form has been MIFed, then pull the current value since it does not exist on
-- the actual form.
--
         IF Parm_Source_In = 'VPDI_CODE' THEN
           Parm_Value_In_Out := G$_VPDI_SECURITY.G$_VPDI_GET_PROC_CONTEXT_FNC;
           RETURN;
         END IF;
--

         Item_Type_tmp := GET_ITEM_PROPERTY ( Parm_Source_In, ITEM_TYPE) ;
-- 5.1.0.1-1
         IF Item_Type_tmp IN
               (
                  'TEXT ITEM',
                  'CHECKBOX',
                  'DISPLAY ITEM',
                  'LIST',
                  'RADIO GROUP'
               ) THEN
--
            Datatype_tmp := GET_ITEM_PROPERTY ( Parm_Source_In, DATATYPE ) ;
--
-- 5.1.0.1-1
            IF Datatype_tmp IN
               (
                  'ALPHA', 'CHAR',
                  'NUMBER', 'RNUMBER', 'INT', 'RINT',
                  'MONEY', 'RMONEY',
                  'TIME',
                  'DATE', 'JDATE', 'EDATE'
               ) THEN
--
               Parm_Value_In_Out :=
                     NAME_IN ( Parm_Source_In ) ;
--
            ELSIF Datatype_tmp = 'DATETIME' THEN
--
               Parm_Value_In_Out :=
                     SUBSTR ( NAME_IN ( Parm_Source_In ), 1, 11 ) ;
--
            ELSE
--
               Parm_Value_In_Out := '' ;
--
-- 5.1.0.1 Report any impossible parameter extractions through EXRRSLT
               Message6_In_Out :=
                     '***ERROR*** '                       ||
                     ' e$_img_driver.p_get_source_value ' ||
                     ' Cannot extract parameter value'    ||
                     ' for field: '                       ||
                     Parm_Source_In                       ||
                     '; Item Type/Datatype = '            ||
                     Item_Type_tmp                        ||
                     '/'                                  ||
                     Datatype_tmp                         ||
                     '.' ;
               eokrslt.p_insert_exrrslt
                     (
                        'PACKAGE',
                        'EOQRPLS.E$_IMG_DRIVER.P_GET_SOURCE_VALUE',
                        'CONTEXT',
                        SUBSTR ( Message6_In_Out, 1, 200 ),
                        USER,
                        SYSDATE
                     ) ;
--
            END IF ;
--
         ELSE
--
            IF Item_Type_tmp = 'HIERARCHICAL TREE' THEN
--
               Parm_Value_In_Out :=
                     NAME_IN ( Parm_Source_In ) ;
--
            END IF ;
--
         END IF ;
--
      EXCEPTION
--
         WHEN OTHERS THEN
--          Debugging the actual error returned...
            Message6_In_Out :=
                  '***ERROR*** '                       ||
                  ' e$_img_driver.p_get_source_value ' ||
                  TO_CHAR ( SQLCODE )                  ||
                  '  '                                 ||
                  SUBSTR ( SQLERRM, 1, 200 )           || '.' ;
--
--          Store the problem in the error / results table:
            eokrslt.p_insert_exrrslt
                  (
                     'PACKAGE',
                     'EOQRPLS.E$_IMG_DRIVER.P_GET_SOURCE_VALUE',
                     'CONTEXT',
                     SUBSTR ( Message6_In_Out, 1, 200 ),
                     USER,
                     SYSDATE
                  ) ;
--

            RETURN ;
--
      END p_get_source_value ;
--
   
END;
		*/
				private NInteger pushFlag= NInteger.getNull();
		//  The width of database field EXRBCXT_BNR_ITEM_VALUE. This is a limitation on the amount of a form item's
		//  value that can be compared with that database rule:
		public final NNumber ITEM_VALUE_COMPAR_MAX_LGTH_CON = toNumber(50);
/* <p>
		* 
		* 
		* * Define public subprogram bodies
		* 
		*        
		* 
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param currentFormIn
		* @param currentBlockIn
		* @param currentItemIn
		* @param usernameIn
		* @param imagingUserIndInOut
		* @param message2InOut
		* @param message3InOut
		* @param message4InOut
		* @param message5InOut
		* @param message6InOut
		* @param message7InOut
		* @param message8InOut
		* @param inquiryonlyInd
		* @param quantResultsInOut
		* @param docTypeInOut
		* @param axApplicationInOut
		*/
		public void pCallExtendSolut(NString currentFormIn, NString currentBlockIn, NString currentItemIn, NString usernameIn, Ref<NString> imagingUserIndInOut, Ref<NString> message2InOut, Ref<NString> message3InOut, Ref<NString> message4InOut, Ref<NString> message5InOut, Ref<NString> message6InOut, Ref<NString> message7InOut, Ref<NString> message8InOut, NInteger inquiryonlyInd, Ref<NInteger> quantResultsInOut, Ref<NString> docTypeInOut, Ref<NString> axApplicationInOut) {
			pCallExtendSolut(currentFormIn, currentBlockIn, currentItemIn, usernameIn, imagingUserIndInOut, message2InOut, message3InOut, message4InOut, message5InOut, message6InOut, message7InOut, message8InOut, inquiryonlyInd, quantResultsInOut, docTypeInOut, axApplicationInOut, toInt(0));
		}

/* <p>
		* 
		* 
		* * Define public subprogram bodies
		* 
		*        
		* 
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param currentFormIn
		* @param currentBlockIn
		* @param currentItemIn
		* @param usernameIn
		* @param imagingUserIndInOut
		* @param message2InOut
		* @param message3InOut
		* @param message4InOut
		* @param message5InOut
		* @param message6InOut
		* @param message7InOut
		* @param message8InOut
		* @param inquiryonlyInd
		* @param quantResultsInOut
		* @param docTypeInOut
		* @param axApplicationInOut
		* @param pushFlagIn
		*/
		public void pCallExtendSolut(NString currentFormIn, NString currentBlockIn, NString currentItemIn, NString usernameIn, Ref<NString> imagingUserIndInOut, Ref<NString> message2InOut, Ref<NString> message3InOut, Ref<NString> message4InOut, Ref<NString> message5InOut, Ref<NString> message6InOut, Ref<NString> message7InOut, Ref<NString> message8InOut, NInteger inquiryonlyInd, Ref<NInteger> quantResultsInOut, Ref<NString> docTypeInOut, Ref<NString> axApplicationInOut, NInteger pushFlagIn)
		{
			// 
			// 
			// 
			NString enabledIndInOut= NString.getNull();
			NString installedAxVersionTmp= NString.getNull();
			NString schemaNameTmp= NString.getNull();
			NString currentFormTmp= NString.getNull();
			NString currentBlockTmp= NString.getNull();
			NString currentItemTmp= NString.getNull();
			NString usernameTmp= NString.getNull();
			NInteger inquiryonlyIndTmp= NInteger.getNull();
			NString installedAxVersionInOut= NString.getNull();
			NString schemaNameInOut = toStr("NULL SCHEMA");
			try
			{
				currentFormTmp = currentFormIn;
				currentBlockTmp = currentBlockIn;
				currentItemTmp = currentItemIn;
				usernameTmp = usernameIn;
				schemaNameTmp = schemaNameInOut;
				inquiryonlyIndTmp = inquiryonlyInd;
				// 
				// 
				//        ----------------------------------------------------------------
				// A matrix depicting platform/product navigational issues
				// follows:
				// Web Environment:  (requires widget on Web server)
				// InquiryOnly_Ind = 1 (informational query only):
				// Use widget method CountResultsWX to return the
				// quantity of hits.
				// InquiryOnly_Ind <> 1:
				// Invoke browser, run query, display results in WX
				// Client-Server Environment:  (requires widget on client PC)
				// InquiryOnly_Ind = 1 (informational query only):
				// Use widget method CountResultsWX
				// to return the quantity of hits.
				// InquiryOnly_Ind <> 1:
				// If AX is installed and user doesn't want
				// WX specifically preferred over AX, then
				// AX will be invoked to run the query,
				// Otherwise,
				// WX will be invoked via the widget.
				// --------------------------------------------------------------
				pushFlag = pushFlagIn;
				//  Document Push when C/S Banner calls AX
				//  All other situations	
				pAexInitiateWeb(currentFormTmp, currentBlockTmp, currentItemTmp, usernameTmp, axApplicationInOut, docTypeInOut, inquiryonlyIndTmp, quantResultsInOut, message4InOut, message5InOut, message6InOut, message7InOut);
			}
			catch(Exception  e)
			{
				// 
				// 
				//           Debugging the actual error returned...
				message2InOut.val = toStr("***ERROR*** ").append(" e$_img_driver.p_call_extend_solut ").append(toChar(errorCode())).append("  ").append(substring(errorMessage(), toInt(1), toInt(200))).append(".");
				// 
				//           Store the problem in the error / results table:
				Eokrslt.pInsertExrrslt(toStr("PACKAGE"), toStr("EOQRPLS.E$_IMG_DRIVER.P_CALL_EXTEND_SOLUT"), toStr("CONTEXT"), substring(message2InOut.val, toInt(1), toInt(200)), getUser(), NDate.getNow());
				// 
				return ;
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param currentFormIn
		* @param currentBlockIn
		* @param currentItemIn
		* @param usernameIn
		* @param axApplicationInOut
		* @param docTypeInOut
		* @param inquiryonlyInd
		* @param quantResultsInOut
		* @param message4InOut
		* @param message5InOut
		* @param message6InOut
		* @param message7InOut
		*/
		public void pAexInitiateWeb(NString currentFormIn, NString currentBlockIn, NString currentItemIn, NString usernameIn, Ref<NString> axApplicationInOut, Ref<NString> docTypeInOut, NInteger inquiryonlyInd, Ref<NInteger> quantResultsInOut, Ref<NString> message4InOut, Ref<NString> message5InOut, Ref<NString> message6InOut, Ref<NString> message7InOut)
		{
			// 
			//        LOCAL VARIABLES:
			// 
			NString wxRootUrl= NString.getNull();
			NString ruleBlockNameInOut= NString.getNull();
			NString ruleItemNameInOut= NString.getNull();
			NString ruleItemValueInOut= NString.getNull();
			// 
			Eokwtow.Paramtab paramtable= new Eokwtow.Paramtab();
			NString wxUrlStr= NString.getNull();
			NString credentials= NString.getNull();
			// 
			// 5.2.0.0-3
			NString calledQuerynameInOut= NString.getNull();
			NInteger tabidx = toInt(0);
			// 
			//        Used for debugging:
			NInteger tableIdx= NInteger.getNull();
			NString debugStr= NString.getNull();
			try
			{
				//  Checks whether root URL is valid. If not, displays error and return.
				if ((getContainer().getEImgUtil().fGetInvokes().equals("WX")))
				{
					wxRootUrl = getContainer().getEImgUtil().fGetWxRootUrl();
					if ((wxRootUrl.isNull()))
					{
						getContainer().getEImgUtil().pShowMsg(EImgUtil.NO_WX_ROOT_URL_CON);
						return ;
					}
				}
				else {
					wxRootUrl = getContainer().getEImgUtil().fGetAxRootUrl();
					if ((wxRootUrl.isNull()))
					{
						getContainer().getEImgUtil().pShowMsg(EImgUtil.NO_AX_ROOT_URL_CON);
						return ;
					}
				}
				//        Begin to build the field/value pairs:
				// 
				//        Start with an empty PL/SQL table:
				paramtable.clear();
				// 
				//        Pair #1:  Name of the AX Data Source:
				tabidx = tabidx.add(1);
				paramtable.get(tabidx, true).Paramname = toStr("DSN");
				paramtable.get(tabidx, true).Paramvalue = getContainer().getEImgUtil().fGetDataSource();
				// 
				//        Pair #2:  Name of the AX Application:
				Ref<NString> calledQuerynameInOut_ref = new Ref<NString>(calledQuerynameInOut);
				Ref<NString> ruleBlockNameTmp_ref = new Ref<NString>(ruleBlockNameInOut);
				Ref<NString> ruleItemNameTmp_ref = new Ref<NString>(ruleItemNameInOut);
				Ref<NString> ruleItemValueTmp_ref = new Ref<NString>(ruleItemValueInOut);
				pGetBnrContext(currentFormIn, currentBlockIn, currentItemIn, axApplicationInOut, docTypeInOut, calledQuerynameInOut_ref, ruleBlockNameTmp_ref, ruleItemNameTmp_ref, ruleItemValueTmp_ref, message4InOut, message6InOut);
				calledQuerynameInOut = calledQuerynameInOut_ref.val;
				ruleBlockNameInOut = ruleBlockNameTmp_ref.val;
				ruleItemNameInOut = ruleItemNameTmp_ref.val;
				ruleItemValueInOut = ruleItemValueTmp_ref.val;
				// 
				tabidx = tabidx.add(1);
				paramtable.get(tabidx, true).Paramname = toStr("AppName");
				// 
				if ((axApplicationInOut.val.isNull()))
				{
					if ((inquiryonlyInd.equals(1)))
					{
						quantResultsInOut.val = EImgUtil.DOC_COUNT_NO_CONTEXT_RULES;
						return ;
					}
					// 
					// 5000-02
					//           Case 1:  No Context exists.  Pad the AppName value with
					//              generic (and universally available) AX Application
					//              B-G-ID, and create an impossible value for the query
					//              that will result in no records being found in the
					//              formulated query.
					// 
					paramtable.get(tabidx, true).Paramvalue = toStr("B-G-ID");
					tabidx = tabidx.add(1);
					paramtable.get(tabidx, true).Paramname = toStr("ID");
					paramtable.get(tabidx, true).Paramvalue = toStr("[[[[[]]]]");
				}
				else {
					// 
					//           Case 2:  Context does exist:
					paramtable.get(tabidx, true).Paramvalue = axApplicationInOut.val;
					// 
					//           Next Pair:  Document Type (if not null)
					if ( !docTypeInOut.val.isNull() )
					{
						// 
						tabidx = tabidx.add(1);
						paramtable.get(tabidx, true).Paramname = toStr("DOCUMENT TYPE");
						paramtable.get(tabidx, true).Paramvalue = docTypeInOut.val;
					}
					// 
					//  5.2.0.0-3
					//           Next Pair:  Called Queryname (if not null)
					if ( !calledQuerynameInOut.isNull() )
					{
						// 
						//              The name of the query:
						tabidx = tabidx.add(1);
						paramtable.get(tabidx, true).Paramname = toStr("SavedQuery");
						paramtable.get(tabidx, true).Paramvalue = calledQuerynameInOut;
						tabidx = tabidx.add(1);
						paramtable.get(tabidx, true).Paramname = toStr("QueryType");
						paramtable.get(tabidx, true).Paramvalue = toStr("1");
						// 
						//  5.2.0.0-3
						//              This next parameter implements a precedence algorithm when
						//                 a collision occurs between a field/value search criterion
						//                 that is brought over from the Banner side and a field/value
						//                 pair that is stored on the Legato side as part of the
						//                 query definition itself.  Setting this field to true
						//                 means that, on a field-by-field basis, values coming in
						//                 from the URL will be preferred over values as stored in
						//                 table OTGMGR.AE_QSEG.
						tabidx = tabidx.add(1);
						paramtable.get(tabidx, true).Paramname = toStr("UpdateAvlFieldsOnly");
						paramtable.get(tabidx, true).Paramvalue = toStr("true");
					}
					// 
					//           The remaining pairs:  Parameters (if any) from EXRAXPA based on
					//              Banner context:
					Ref<Eokwtow.Paramtab> paramtable_ref = new Ref<Eokwtow.Paramtab>(paramtable);
					pMakeParamsWeb(currentFormIn, ruleBlockNameInOut, ruleItemNameInOut, ruleItemValueInOut, axApplicationInOut.val, docTypeInOut.val, paramtable_ref, message5InOut, message6InOut);
					paramtable = paramtable_ref.val;
				}
				// 
				//wxUrlStr = wxRootUrl.append("?").append(Eokwtow.fGetquerystr(paramtable));
				wxUrlStr = (getContainer().getEImgUtil().fAppendUrlParam(wxRootUrl,Eokwtow.fGetquerystr(paramtable)));
				//  For push, remove doc type field info if it is a list or an expression
				if ((pushFlag.greater(0)))
				{
					if ( (inStr(wxUrlStr, toStr("&DOCUMENT%20TYPE=LIST%3A")).greater(0)) || (inStr(wxUrlStr, toStr("&DOCUMENT%20TYPE=EXPRESSION%3A")).greater(0)) )
					{
					}
				}
				if ((getContainer().getEImgUtil().fGetInvokes().equals("AX")))
				{
					credentials = getContainer().getEImgUtil().fGetCredentialsUrl(toStr("BASE64"));
				}
				else if (getContainer().getEImgUtil().fGetInvokes().equals("WX")){
		           if(inStr(lower(wxUrlStr), "sso=true").equals(0)) {	
		              credentials = getContainer().getEImgUtil().fGetCredentialsUrl();		           
		           }
				}
				else {
					credentials = getContainer().getEImgUtil().fGetCredentialsUrl();
				}
				if ((! (credentials.isNull())))
				{
					wxUrlStr = wxUrlStr.append("&").append(credentials);
				}
				if ((getContainer().getEImgUtil().fGetInvokes().equals("AX")))
				{
					credentials = getContainer().getEImgUtil().fGetCredentialsUrl(toStr("BASE64"), NBool.False);
					if ( ! (credentials.isNull()) )
					{
						wxUrlStr = wxUrlStr.append("&").append(credentials);
					}
				}
				if ((inquiryonlyInd.equals(1)))
				{
					// Document Count
					if ((getContainer().getEImgUtil().fGetInvokes().equals("WX")))
					{
						if ((getContainer().getEImgUtil().fIsWxDotnet().not()))
						{
							wxUrlStr = wxUrlStr.append("&submitAction=SubmitQuery");
						}
						quantResultsInOut.val = toInt(Eokwtow.fGetDocCountFromWx(wxUrlStr));
						return ;
					}
					else {
						//  INB to AX count   	
						quantResultsInOut.val = EImgUtil.DOC_COUNT_INB_TO_AX;
						wxUrlStr = wxUrlStr.append("&__COUNT=TRUE");
					}
				}
				else if ((pushFlag.greater(0))) {
					// Document Push       	
					if ((getContainer().getEImgUtil().fGetInvokes().equals("WX")))
					{
						if ((getContainer().getEImgUtil().fIsWxDotnet().isTrue()))
						{
							wxUrlStr = getContainer().getEImgUtil().fReplaceString(wxUrlStr, toStr("ISubmitQuery.aspx"), toStr("IDocImport.aspx"));
						}
						else {
							wxUrlStr = wxUrlStr.append("&submitAction=DocImport");
						}
					}
					else {
						wxUrlStr = wxUrlStr.append("&__PUSH=").append(toChar(pushFlag));
					}
				}
				else {
					// Document Query
					if ((getContainer().getEImgUtil().fGetInvokes().equals("WX")))
					{
						if ((getContainer().getEImgUtil().fIsWxDotnet().not()))
						{
							wxUrlStr = wxUrlStr.append("&submitAction=SubmitQuery");
						}
					}
				}
				showDocument(wxUrlStr, "_BLANK");
			}
			catch(Exception  e)
			{
				//           Debugging the actual error returned...
				message7InOut.val = toStr("***ERROR*** ").append(" e$_img_driver.p_aex_initiate_web ").append(toChar(errorCode())).append("  ").append(substring(errorMessage(), toInt(1), toInt(200))).append(".");
				// 
				//           Store the problem in the error / results table:
				Eokrslt.pInsertExrrslt(toStr("PACKAGE"), toStr("EOQRPLS.E$_IMG_DRIVER.P_AEX_INITIATE_WEB"), toStr("CONTEXT"), substring(message7InOut.val, toInt(1), toInt(200)), getUser(), NDate.getNow());
				// 
				return ;
			}
		}
/* <p>
		* 
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param currentFormIn
		* @param currentBlockIn
		* @param currentItemIn
		* @param axApplicationInOut
		* @param docTypeInOut
		* @param calledQuerynameInOut
		* @param ruleBlockNameTmp
		* @param ruleItemNameTmp
		* @param ruleItemValueTmp
		* @param message4InOut
		* @param message6InOut
		*/
		public void pGetBnrContext(NString currentFormIn, NString currentBlockIn, NString currentItemIn, Ref<NString> axApplicationInOut, Ref<NString> docTypeInOut, Ref<NString> calledQuerynameInOut, Ref<NString> ruleBlockNameTmp, Ref<NString> ruleItemNameTmp, Ref<NString> ruleItemValueTmp, Ref<NString> message4InOut, Ref<NString> message6InOut)
		{
			int rowCount = 0;
			String sqlgetContextC = "SELECT exrbcxt_axap_code, exrbcxt_dtyp_code, exrbcxt_called_queryname, '4' order_txt, exrbcxt_bnr_block_name, exrbcxt_bnr_item_name, exrbcxt_bnr_item_value " +
	" FROM exrbcxt " +
	" WHERE exrbcxt_bnr_form_name = :P_CURRENT_FORM_C_IN AND exrbcxt_bnr_block_name IS NULL AND exrbcxt_bnr_item_name IS NULL " +
	"UNION SELECT exrbcxt_axap_code, exrbcxt_dtyp_code, exrbcxt_called_queryname, '3', exrbcxt_bnr_block_name, exrbcxt_bnr_item_name, exrbcxt_bnr_item_value " +
	" FROM exrbcxt " +
	" WHERE exrbcxt_bnr_form_name = :P_CURRENT_FORM_C_IN AND exrbcxt_bnr_block_name = :P_CURRENT_BLOCK_C_IN AND exrbcxt_bnr_item_name IS NULL " +
	"UNION SELECT exrbcxt_axap_code, exrbcxt_dtyp_code, exrbcxt_called_queryname, '2', exrbcxt_bnr_block_name, exrbcxt_bnr_item_name, exrbcxt_bnr_item_value " +
	" FROM exrbcxt " +
	" WHERE exrbcxt_bnr_form_name = :P_CURRENT_FORM_C_IN AND exrbcxt_bnr_block_name = :P_CURRENT_BLOCK_C_IN AND exrbcxt_bnr_item_name = :P_CURRENT_ITEM_C_IN AND exrbcxt_bnr_item_value IS NULL " +
	"UNION SELECT exrbcxt_axap_code, exrbcxt_dtyp_code, exrbcxt_called_queryname, '1', exrbcxt_bnr_block_name, exrbcxt_bnr_item_name, exrbcxt_bnr_item_value " +
	" FROM exrbcxt " +
	" WHERE exrbcxt_bnr_form_name = :P_CURRENT_FORM_C_IN AND exrbcxt_bnr_block_name = :P_CURRENT_BLOCK_C_IN AND exrbcxt_bnr_item_name = :P_CURRENT_ITEM_C_IN AND exrbcxt_bnr_item_value = :P_CURRENT_ITEM_VALUE_C_IN " +
	" ORDER BY 4";
			DataCursor getContextC = new DataCursor(sqlgetContextC);
			NString currentFormCIn = NString.getNull();
			NString currentBlockCIn = NString.getNull();
			NString currentItemCIn = NString.getNull();
			NString currentItemValueCIn = NString.getNull();
			//  5.2.0.0-3
			// 
			NString orderTxtTmp= NString.getNull();
			NString currentItemValueTmpInOut= NString.getNull();
			NString blockItemNameTmp= NString.getNull();
			try {
				try
				{
					// 
					//        At certain times, we must do NAME_IN operations against
					//           a given field in the form.  If the argument for
					//           NAME_IN contains fieldname ambiguity, then we must
					//           compensate for this by creating a string that contains
					//           format 'NAME_OF_BLOCK.NAME_OF_ITEM':
					if ( inStr(currentItemIn, toStr(".")).equals(0) )
					{
						// 
						blockItemNameTmp = currentBlockIn.append(".").append(currentItemIn);
					}
					else {
						// 
						blockItemNameTmp = currentItemIn;
					}
					// 
					//        To facilitate value-based rules testing, we need
					//           to know the value of :SYSTEM.CURRENT_ITEM itself.
					//           We can use an existing procedure to load this
					//           value into Current_Item_Value_tmp_in.  We will need
					//           to truncate its length to the length of the
					//           database field EXRBCXT_BNR_ITEM_VALUE.
					Ref<NString> parmValueInOut_ref = new Ref<NString>(currentItemValueTmpInOut);
					pGetSourceValue(blockItemNameTmp, parmValueInOut_ref, message6InOut);
					currentItemValueTmpInOut = parmValueInOut_ref.val;
					// 
					if ( isNull(length(currentItemValueTmpInOut), 0).greater(ITEM_VALUE_COMPAR_MAX_LGTH_CON) )
					{
						currentItemValueTmpInOut = substring(currentItemValueTmpInOut, toInt(1), toInt(ITEM_VALUE_COMPAR_MAX_LGTH_CON));
					}
					// 
					//        Determine the Banner context:
					currentFormCIn=currentFormIn;
					currentBlockCIn=currentBlockIn;
					currentItemCIn=currentItemIn;
					currentItemValueCIn=currentItemValueTmpInOut;
					//Setting query parameters
					getContextC.addParameter("P_CURRENT_FORM_C_IN", currentFormCIn);
					getContextC.addParameter("P_CURRENT_BLOCK_C_IN", currentBlockCIn);
					getContextC.addParameter("P_CURRENT_ITEM_C_IN", currentItemCIn);
					getContextC.addParameter("P_CURRENT_ITEM_VALUE_C_IN", currentItemValueCIn);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable getContextC.
					getContextC.open();
					// 
					ResultSet getContextCResults = getContextC.fetchInto();
					if ( getContextCResults != null ) {
						axApplicationInOut.val = getContextCResults.getStr(0);
						docTypeInOut.val = getContextCResults.getStr(1);
						calledQuerynameInOut.val = getContextCResults.getStr(2);
						orderTxtTmp = getContextCResults.getStr(3);
						ruleBlockNameTmp.val = getContextCResults.getStr(4);
						ruleItemNameTmp.val = getContextCResults.getStr(5);
						ruleItemValueTmp.val = getContextCResults.getStr(6);
					}
					// 
					getContextC.close();
				}
				catch(Exception  e)
				{
					//           Debugging the actual error returned...
					message4InOut.val = toStr("***ERROR*** ").append(" e$_img_driver.p_get_bnr_context ").append(toChar(errorCode())).append("  ").append(substring(errorMessage(), toInt(1), toInt(200))).append(".");
					// 
					//           Store the problem in the error / results table:
					Eokrslt.pInsertExrrslt(toStr("PACKAGE"), toStr("EOQRPLS.E$_IMG_DRIVER.P_GET_BNR_CONTEXT"), toStr("CONTEXT"), substring(message4InOut.val, toInt(1), toInt(200)), getUser(), NDate.getNow());
					// 
					return ;
				}
				}finally{
					getContextC.close();
				}
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param currentFormIn
		* @param currentBlockIn
		* @param currentItemIn
		* @param currentItemValueIn
		* @param axApplicationIn
		* @param docTypeIn
		* @param paramtable
		* @param message5InOut
		* @param message6InOut
		*/
		public void pMakeParamsWeb(NString currentFormIn, NString currentBlockIn, NString currentItemIn, NString currentItemValueIn, NString axApplicationIn, NString docTypeIn,
				Ref<Eokwtow.Paramtab> paramtable, Ref<NString> message5InOut, Ref<NString> message6InOut)
		{
			int rowCount = 0;
			String sqlgetParamsC = "SELECT exraxpa_parm_source_name, exraxpa_parm_target_name " +
	" FROM exraxpa " +
	" WHERE exraxpa_bnr_form_name = :P_CURRENT_FORM_C_IN AND NVL(exraxpa_bnr_block_name, 'XXXXXXBLOCKXXXXXX') = NVL(:P_CURRENT_BLOCK_C_IN, 'XXXXXXBLOCKXXXXXX') AND NVL(exraxpa_bnr_item_name, 'XXXXXXITEMXXXXXX') = NVL(:P_CURRENT_ITEM_C_IN, 'XXXXXXITEMXXXXXX') AND NVL(exraxpa_bnr_item_value, 'XXXXXXVALUEXXXXXX') = NVL(:P_CURRENT_ITEM_VALUE_C_IN, 'XXXXXXVALUEXXXXXX') ";
			DataCursor getParamsC = new DataCursor(sqlgetParamsC);
			NString currentFormCIn = NString.getNull();
			NString currentBlockCIn = NString.getNull();
			NString currentItemCIn = NString.getNull();
			NString currentItemValueCIn = NString.getNull();
			// 
			NString parmSourceTmp= NString.getNull();
			NString parmTargetTmp= NString.getNull();
			NString parmSourceValueTmp= NString.getNull();
			NString errorContext= NString.getNull();
			// 
			//  5.2.0.0-3
			//     This next integer serves as the first record
			//        of the PL/SQL table that will be loaded here:
			NInteger tblIdx = toInt(paramtable.val.size());
			try {
				try
				{
					// 
					//        The parameter table may or may not contain an index-3
					//           record at this point.  We will need to set the beginning
					//           index value based on the current state of Doc_Type_In.
					// 
					//        Formulate additional, Banner form context-based
					//           parameters into user-defined PL/SQL table.
					// 
					currentFormCIn=currentFormIn;
					currentBlockCIn=currentBlockIn;
					currentItemCIn=currentItemIn;
					currentItemValueCIn=currentItemValueIn;
					//Setting query parameters
					getParamsC.addParameter("P_CURRENT_FORM_C_IN", currentFormCIn);
					getParamsC.addParameter("P_CURRENT_BLOCK_C_IN", currentBlockCIn);
					getParamsC.addParameter("P_CURRENT_ITEM_C_IN", currentItemCIn);
					getParamsC.addParameter("P_CURRENT_ITEM_VALUE_C_IN", currentItemValueCIn);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable getParamsC.
					getParamsC.open();
					// 
					while (true) {
						// 
						ResultSet getParamsCResults = getParamsC.fetchInto();
						if ( getParamsCResults != null ) {
							parmSourceTmp = getParamsCResults.getStr(0);
							parmTargetTmp = getParamsCResults.getStr(1);
						}
						// 
						if ( getParamsC.notFound() ) 
							break;
						// 
						//              Re-initialize the value of Parm_Source_Value_tmp to null:
						parmSourceValueTmp = toStr("");
						// 
						// 
						errorContext = toStr(" Next call:  Calling of p_get_source_value. ");
						// 
						//              Using NAME_IN, get the value in the Banner field:
						Ref<NString> parmValueInOut_ref = new Ref<NString>(parmSourceValueTmp);
						pGetSourceValue(parmSourceTmp, parmValueInOut_ref, message6InOut);
						parmSourceValueTmp = parmValueInOut_ref.val;
						// 
						//              We must limit the length of the value string:
						if ( isNull(length(parmSourceValueTmp), 0).greater(ITEM_VALUE_COMPAR_MAX_LGTH_CON) )
						{
							parmSourceValueTmp = substring(parmSourceValueTmp, toInt(1), toInt(ITEM_VALUE_COMPAR_MAX_LGTH_CON));
						}
						// 
						//              If there is a value within the Banner field,
						//                 then formulate a field/value pair to load
						//                 into the PL/SQL table:
						if ( !parmSourceValueTmp.isNull() )
						{
							// 
							errorContext = toStr(" Next call:  Adding parameter AX fieldname '").append(parmTargetTmp).append("'.");
							// 
							//  5.2.0.0-3
							tblIdx = tblIdx.add(1);
							paramtable.val.get(tblIdx, true).Paramname = parmTargetTmp;
							paramtable.val.get(tblIdx, true).Paramvalue = parmSourceValueTmp;
						}
					}
					// 
					getParamsC.close();
				}
				catch(Exception  e)
				{
					//           Debugging the actual error returned...
					message5InOut.val = toStr("***ERROR*** ").append(" e$_img_driver.p_make_params_web ").append(errorContext).append(toChar(errorCode())).append("  ").append(substring(errorMessage(), toInt(1), toInt(200))).append(".");
					// 
					//           Store the problem in the error / results table:
					Eokrslt.pInsertExrrslt(toStr("PACKAGE"), toStr("EOQRPLS.E$_IMG_DRIVER.P_MAKE_PARAMS_WEB"), toStr("CONTEXT"), substring(message5InOut.val, toInt(1), toInt(200)), getUser(), NDate.getNow());
					// 
					return ;
				}
				}finally{
					getParamsC.close();
				}
		}
/* <p>
		* 
		* 
/* </p>
		* @param parmSourceIn
		* @param parmValueInOut
		* @param message6InOut
		*/
		public void pGetSourceValue(NString parmSourceIn, Ref<NString> parmValueInOut, Ref<NString> message6InOut)
		{
			// 
			NString datatypeTmp = toStr("");
			NString itemTypeTmp = toStr("");
			try
			{
				// 
				//        Initialize the output variable:
				parmValueInOut.val = toStr(null);
				//  If this form has been MIFed, then pull the current value since it does not exist on
				//  the actual form.
				// 
				if ( parmSourceIn.equals("VPDI_CODE") )
				{
					parmValueInOut.val = GVpdiSecurity.FgVpdiGetProcContextFnc();
					return ;
				}
				// 
				itemTypeTmp = getItemType(parmSourceIn);
				//  5.1.0.1-1
				//if ( in(itemTypeTmp, "TEXT ITEM", "CHECKBOX", "DISPLAY ITEM", "LIST", "RADIO GROUP","").getValue() )
				//MORPHIS: Workaround to accept TEXTITEM:
				if ( in(itemTypeTmp, "TEXT ITEM", "CHECKBOX", "DISPLAY ITEM", "LIST", "RADIO GROUP","TEXTITEM","DISPLAYITEM").getValue() )
				{
					// 
					datatypeTmp = getItemDataType(parmSourceIn);
					// 
					//  5.1.0.1-1
					if ( !NString.isNullOrEmpty(datatypeTmp) && !datatypeTmp.equals("DATE"))
					{
						// 
						parmValueInOut.val = getNameIn(parmSourceIn);
					}
					else if ( datatypeTmp.equals("DATE") ) {
						// MORPHIS TODO: Reimplement this code
						//NDate dateValue = ((NDate)getCurrentTask().getModel().getValue(parmSourceIn, parmSourceIn)); 
						
						parmValueInOut.val = toStr("");
							
						//substring(getNameIn(parmSourceIn), toInt(1), toInt(11));
						
					}
					else {
						// 
						parmValueInOut.val = toStr("");
						// 
						//  5.1.0.1 Report any impossible parameter extractions through EXRRSLT
						message6InOut.val = toStr("***ERROR*** ").append(" e$_img_driver.p_get_source_value ").append(" Cannot extract parameter value").append(" for field: ").append(parmSourceIn).append("; Item Type/Datatype = ").append(itemTypeTmp).append("/").append(datatypeTmp).append(".");
						Eokrslt.pInsertExrrslt(toStr("PACKAGE"), toStr("EOQRPLS.E$_IMG_DRIVER.P_GET_SOURCE_VALUE"), toStr("CONTEXT"), substring(message6InOut.val, toInt(1), toInt(200)), getUser(), NDate.getNow());
					}
				}
				else {
					// 
					if ( itemTypeTmp.equals("HIERARCHICAL TREE") )
					{
						// 
						parmValueInOut.val = getNameIn(parmSourceIn);
					}
				}
			}
			catch(Exception  e)
			{
				//           Debugging the actual error returned...
				message6InOut.val = toStr("***ERROR*** ").append(" e$_img_driver.p_get_source_value ").append(toChar(errorCode())).append("  ").append(substring(errorMessage(), toInt(1), toInt(200))).append(".");
				// 
				//           Store the problem in the error / results table:
				Eokrslt.pInsertExrrslt(toStr("PACKAGE"), toStr("EOQRPLS.E$_IMG_DRIVER.P_GET_SOURCE_VALUE"), toStr("CONTEXT"), substring(message6InOut.val, toInt(1), toInt(200)), getUser(), NDate.getNow());
				// 
				return ;
			}
		}
		
	
	
}
