package net.hedtech.general.common.libraries.Soqolib;


import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.runtime.ITaskObject;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskPart;
import morphis.foundations.core.appsupportlib.runtime.configuration.TaskConfiguration;

	
/// <summary>
/// 
/// </summary>
///<remarks>
///                            PURPOSE OF FORM
///  This form is the Student Referenced Object Library. This will provide
///  for the creation and maintenance of an object in this form while
///  referencing the object in other forms. The modification of the "master"
///  object in this form results in the same modification to forms that
///  reference these objects.
/// AUDIT TRAIL: 2.1 
/// 1. Forms 4.0 conversion.                    RL 12/13/94
/// 2. Added alias to FIND_CLASS_2 cursor in S$_CLASS_CALC
///    procedure.                               RL 01/04/94
/// AUDIT TRAIL: 2.1.5
/// 1. Changed title of STVEPRT_LOV.            RL 04/21/95
/// 2. Added STVPRNT_RG and _LOV.               RL 05/30/95
/// 3. Correct title of STVFATT_LOV.            RL 05/30/95
/// 4. Added STVCMPL_RG and _LOV.               RL 07/18/95
/// 5. Added the S$_CALC_TMST procedure to     MKH 07/25/95
///    calculate the student enrollment time
///    status for use by the National Student
///    Loan Clearinghouse Data Extract
///    Process.
/// 6. Corrected title of STVTMST_LOV.         MKH 09/19/95
/// 7. Added new NSLC_EQUIV_IND column to      MKH 09/19/95
///    STVTMST_RG and STVTMST_LOV.
/// AUDIT TRAIL: 2.1.8
/// 1. Added procedures, record groups, and LOVs. NDM 12/11/95
/// 2. Added SMBPOGN_ID_LOV, SMBPOGN_REQ_LOV,      VB 01/09/96
///    SMBPOGN_ID_RG, SMBPOGN_REQ_RG  for CAPP
///    module.
/// 3. Removed communication plan procedures
///    S$_CREATE_MATERIALS and S$_MATERIAL_MATCHING.
///    They have been replaced by packaged procedure
///    SOKCPLN.
///    Richard Lander  02/22/96
/// 4. Added RG and LOV for STVDPMR - Duplicate Material
///    Code validation.
///    Richard Lander  02/23/96
/// AUDIT TRAIL: 2.1.11
/// 1. Added RG and LOV for STVTERM_CATALOG_##.  NM 04/26/96
/// 2. Converted to Forms 4.5                    VB 08/21/96
/// AUDIT TRAIL END 
///</remarks>
public class SoqolibTaskPart extends TaskPart
{
	public SoqolibTaskPart( String name, TaskConfiguration configuration, ITaskObject container) {
		super(name, configuration, container);
	}

//	public SoqolibTaskPart (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
//		super(taskName, sharedLibraries, parameters);
//	}

	@Override
	public net.hedtech.general.common.libraries.Soqolib.model.SoqolibModel getModel() {
		return (net.hedtech.general.common.libraries.Soqolib.model.SoqolibModel)super.getModel();
	}

	public net.hedtech.general.common.libraries.Soqolib.services.SoqolibServices getServices() {
		return (net.hedtech.general.common.libraries.Soqolib.services.SoqolibServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		
	
		// Attached Libraries
    public net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices getEoqrpls()
    {
		return (net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices)getSupportCodeManager().getLibrary("EOQRPLS");
    }
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
    public net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices getGoqwflw()
    {
		return (net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices)getSupportCodeManager().getLibrary("GOQWFLW");
    }


}
