/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.ywsp.ctrlmodel;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.util.GlobalContext;
import net.ibizsys.paas.core.IDEDataSetCond;
import net.ibizsys.paas.core.DEDataSetCond;
import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.util.DataTypeHelper;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.datamodel.DataItemModel;
import net.ibizsys.paas.datamodel.DataItemParamModel;
import net.ibizsys.paas.entity.EntityFieldError;
import net.ibizsys.paas.entity.EntityError;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.demodel.DEModelGlobal;

import net.ibizsys.paas.ctrlmodel.SearchFormItemModel;
import net.ibizsys.paas.control.form.FormError;
import net.ibizsys.paas.control.form.IFormItem;
import net.ibizsys.paas.control.form.FormItemError;

/**
 * 实体[车辆维修]搜索表单[searchform]部件模型
 */
public class  OA_CLWXDefaultSearchFormModel extends net.ibizsys.paas.ctrlmodel.SearchFormModelBase {

    public OA_CLWXDefaultSearchFormModel() {
        super();
        this.setName("searchform");
    }


    private com.sa.unip.srv.ywsp.demodel.OA_CLWXDEModel oA_CLWXDEModel;
    protected  com.sa.unip.srv.ywsp.demodel.OA_CLWXDEModel getOA_CLWXDEModel() {
        if(this.oA_CLWXDEModel==null) {
            try {
                this.oA_CLWXDEModel = (com.sa.unip.srv.ywsp.demodel.OA_CLWXDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_CLWXDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CLWXDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_CLWXDEModel();
    }


    /**
      * 准备表单项模型
      * @throws Exception
      */
    protected void prepareFormItems()throws Exception {
        super.prepareFormItems();
        IFormItem iFormItem = null;
        // n_orgusername_like
        iFormItem = this.createFormItem("n_orgusername_like");
        if(iFormItem==null) {
            SearchFormItemModel formItem = new SearchFormItemModel();
            formItem.setForm(this);
            formItem.setName("n_orgusername_like");
            formItem.setDEFName("ORGUSERNAME");
            formItem.setCaption("申请人名字(%)");
            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("n_orgusername_like");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);

            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // n_orgsectorname_like
        iFormItem = this.createFormItem("n_orgsectorname_like");
        if(iFormItem==null) {
            SearchFormItemModel formItem = new SearchFormItemModel();
            formItem.setForm(this);
            formItem.setName("n_orgsectorname_like");
            formItem.setDEFName("ORGSECTORNAME");
            formItem.setCaption("部门名称(%)");
            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("n_orgsectorname_like");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);

            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // n_oa_clname_like
        iFormItem = this.createFormItem("n_oa_clname_like");
        if(iFormItem==null) {
            SearchFormItemModel formItem = new SearchFormItemModel();
            formItem.setForm(this);
            formItem.setName("n_oa_clname_like");
            formItem.setDEFName("OA_CLNAME");
            formItem.setCaption("车辆名称(%)");
            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("n_oa_clname_like");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);

            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);

    }

    /**
    * 填充表单值
    * @param iDataObject
    * @param bUpdate
    * @param bIgnoreEmpty
    * @param formError
    * @throws Exception
    */
    @Override
    protected void onFillInputValues(IDataObject iDataObject,boolean bUpdate,boolean bIgnoreEmpty,FormError formError)throws Exception {
        super.onFillInputValues(iDataObject,bUpdate,bIgnoreEmpty,formError);
        if(formError.hasError())
            return;


    }

}