package view;

import com.view.utils.ADFUtils;
import com.view.utils.JSFUtils;
import javax.faces.event.ActionEvent;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;

public class AddEditApprisalHis {
    private RichPopup showPopup;

    public AddEditApprisalHis() {
    }

    public void onClickCancel(ActionEvent actionEvent) {
        ViewObject HdrVO = ADFUtils.findIterator("ApprisalHisHdr_VOIterator").getViewObject();
        HdrVO.applyViewCriteria(null);
        HdrVO.executeQuery();
        OperationBinding binding = (OperationBinding) ADFUtils.findOperation("Rollback").execute();
        HdrVO.executeQuery();
    }

    public void onClickShowpopup(ActionEvent actionEvent) {
        ViewObject HdrVO = ADFUtils.findIterator("ApprisalHisLine_VOIterator").getViewObject();
        ViewCriteria viewCriteria = HdrVO.createViewCriteria();
        ViewCriteriaRow viewCriteriaRow = viewCriteria.createViewCriteriaRow();
        Row hdrRow = HdrVO.getCurrentRow();
        Object hdrId = hdrRow.getAttribute("AppraisalHistLineId");
        viewCriteriaRow.setAttribute("AppraisalHistLineId", hdrId);
        viewCriteria.addRow(viewCriteriaRow);
        HdrVO.applyViewCriteria(viewCriteria);
        HdrVO.executeQuery();
//        RichPopup.PopupHints hints = new RichPopup.PopupHints();
//        this.getShowPopup().show(hints);
    }


    public void setShowPopup(RichPopup showPopup) {
        this.showPopup = showPopup;
    }

    public RichPopup getShowPopup() {
        return showPopup;
    }

    public void popUpCancel(ActionEvent actionEvent) {
        JSFUtils.hidePopup(showPopup);
        ViewObject HdrVO = ADFUtils.findIterator("ApprisalHisLine_VOIterator").getViewObject();
        HdrVO.applyViewCriteria(null);
        HdrVO.executeQuery();
        AdfFacesContext.getCurrentInstance().addPartialTarget(showPopup);
        
        
    }
}
