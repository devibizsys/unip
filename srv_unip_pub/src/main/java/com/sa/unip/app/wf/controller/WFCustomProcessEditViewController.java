/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.wf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import net.ibizsys.paas.appmodel.AppModelGlobal;
import net.ibizsys.paas.appmodel.IApplicationModel;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.sysmodel.ISystemModel;
import net.ibizsys.paas.sysmodel.SysModelGlobal;
import net.ibizsys.paas.controller.ViewControllerGlobal;
import net.ibizsys.paas.ctrlmodel.ICtrlModel;
import net.ibizsys.paas.ctrlhandler.ICtrlHandler;


import com.sa.unip.srv.UniPSampleSysModel;
import com.sa.unip.app.appAppModel;


/**
 * 视图[WFCustomProcessEditView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/wf/WFCustomProcessEditView.do")
public class WFCustomProcessEditViewController extends net.ibizsys.paas.controller.EditViewControllerBase {
    public WFCustomProcessEditViewController() throws Exception {
        super();
        this.setId("0cb323de8dbaa896ae838948ca368d0b");
        this.setCaption("工作流预定义处理");
        this.setTitle("工作流预定义处理实体编辑视图");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.FORM","TRUE");
        //显示数据信息栏
        this.setAttribute("UI.SHOWDATAINFOBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.TOOLBAR","TRUE");

        ViewControllerGlobal.registerViewController("/app/wf/WFCustomProcessEditView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.wf.controller.WFCustomProcessEditViewController",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();


    }

    private UniPSampleSysModel uniPSampleSysModel;

    public  UniPSampleSysModel getUniPSampleSysModel() {
        if(this.uniPSampleSysModel==null) {
            try {
                this.uniPSampleSysModel = (UniPSampleSysModel)SysModelGlobal.getSystem("com.sa.unip.srv.UniPSampleSysModel");
            } catch(Exception ex) {
            }
        }
        return this.uniPSampleSysModel;
    }

    @Override
    public  ISystemModel getSystemModel() {
        return this.getUniPSampleSysModel();
    }


    private appAppModel appAppModel;
    public  appAppModel getappAppModel() {
        if(this.appAppModel==null) {
            try {
                this.appAppModel = (appAppModel)AppModelGlobal.getApplication("com.sa.unip.app.appAppModel");
            } catch(Exception ex) {
            }
        }
        return this.appAppModel;
    }

    @Override
    public  IApplicationModel  getAppModel() {
        return this.getappAppModel();
    }





    private net.ibizsys.psrt.srv.wf.demodel.WFCustomProcessDEModel wFCustomProcessDEModel;

    public  net.ibizsys.psrt.srv.wf.demodel.WFCustomProcessDEModel getWFCustomProcessDEModel() {
        if(this.wFCustomProcessDEModel==null) {
            try {
                this.wFCustomProcessDEModel = (net.ibizsys.psrt.srv.wf.demodel.WFCustomProcessDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.wf.demodel.WFCustomProcessDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wFCustomProcessDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getWFCustomProcessDEModel();
    }

    public  net.ibizsys.psrt.srv.wf.service.WFCustomProcessService getWFCustomProcessService() {
        try {
            return (net.ibizsys.psrt.srv.wf.service.WFCustomProcessService)ServiceGlobal.getService("net.ibizsys.psrt.srv.wf.service.WFCustomProcessService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getWFCustomProcessService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 form
        ICtrlModel editForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.wf.ctrlmodel.WFCustomProcessMainEditFormModel");
        editForm.init(this);
        this.registerCtrlModel("form",editForm);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 form
        ICtrlHandler editForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.wf.ctrlhandler.WFCustomProcessEditViewEditFormHandler");
        editForm.init(this);
        this.registerCtrlHandler("form",editForm);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}