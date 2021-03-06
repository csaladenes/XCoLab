package com.ext.portlet.service.impl;

import java.util.List;

import com.ext.portlet.model.FocusArea;
import com.ext.portlet.model.FocusAreaOntologyTerm;
import com.ext.portlet.model.OntologyTerm;
import com.ext.portlet.service.FocusAreaLocalServiceUtil;
import com.ext.portlet.service.FocusAreaOntologyTermLocalServiceUtil;
import com.ext.portlet.service.OntologyTermLocalServiceUtil;
import com.ext.portlet.service.base.FocusAreaOntologyTermLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the focus area ontology term local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ext.portlet.service.FocusAreaOntologyTermLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.ext.portlet.service.base.FocusAreaOntologyTermLocalServiceBaseImpl
 * @see com.ext.portlet.service.FocusAreaOntologyTermLocalServiceUtil
 */
public class FocusAreaOntologyTermLocalServiceImpl
    extends FocusAreaOntologyTermLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.ext.portlet.service.FocusAreaOntologyTermLocalServiceUtil} to access the focus area ontology term local service.
     */

    public List<FocusAreaOntologyTerm> findTermsByFocusArea(Long focusAreaId) throws SystemException {
        return focusAreaOntologyTermPersistence.findByFocusAreaId(focusAreaId);
    }
    
    public void addAreaTerm(Long focusAreaId, Long termId) throws PortalException, SystemException {
        FocusArea fa = FocusAreaLocalServiceUtil.getFocusArea(focusAreaId);
        FocusAreaLocalServiceUtil.addTerm(fa, termId);
    }
    
    public void removeAreaTerm(Long focusAreaId, Long termId) throws PortalException, SystemException {
        FocusArea fa = FocusAreaLocalServiceUtil.getFocusArea(focusAreaId);
        FocusAreaLocalServiceUtil.removeTerm(fa, termId);
        
    }
    
    
    public void store(FocusAreaOntologyTerm faot) throws SystemException {
        if (faot.isNew()) {
            FocusAreaOntologyTermLocalServiceUtil.addFocusAreaOntologyTerm(faot);
        }
        else {
            FocusAreaOntologyTermLocalServiceUtil.updateFocusAreaOntologyTerm(faot);
        }
    }
    
    public OntologyTerm getTerm(FocusAreaOntologyTerm faot) throws PortalException, SystemException {
        return OntologyTermLocalServiceUtil.getOntologyTerm(faot.getOntologyTermId());
    }
    
    public FocusArea getArea(FocusAreaOntologyTerm faot) throws PortalException, SystemException {
        return FocusAreaLocalServiceUtil.getFocusArea(faot.getFocusAreaId());
    }
}
