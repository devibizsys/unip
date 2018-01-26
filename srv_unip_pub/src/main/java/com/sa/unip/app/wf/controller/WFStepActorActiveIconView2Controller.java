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
 * 视图[WFStepActorActiveIconView2]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/wf/WFStepActorActiveIconView2.do")
public class WFStepActorActiveIconView2Controller extends net.ibizsys.paas.controller.MDCustomViewControllerBase {
    public WFStepActorActiveIconView2Controller() throws Exception {
        super();
        this.setId("f8bac75cb3be69b5778927b9bfeaa97e");
        this.setCaption("工作流步骤操作者");
        this.setTitle("工作流步骤操作者实体多数据自定义视图2");
        this.setAccessUserMode(2);
        //支持快速搜索
        this.setAttribute("UI.ENABLEQUICKSEARCH","TRUE");
        //
        this.setAttribute("UI.CTRL.GRID","TRUE");
        //
        this.setAttribute("UI.CTRL.GRID2","TRUE");

        ViewControllerGlobal.registerViewController("/app/wf/WFStepActorActiveIconView2.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.wf.controller.WFStepActorActiveIconView2Controller",this);
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





    private net.ibizsys.psrt.srv.wf.demodel.WFStepActorDEModel wFStepActorDEModel;

    public  net.ibizsys.psrt.srv.wf.demodel.WFStepActorDEModel getWFStepActorDEModel() {
        if(this.wFStepActorDEModel==null) {
            try {
                this.wFStepActorDEModel = (net.ibizsys.psrt.srv.wf.demodel.WFStepActorDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.wf.demodel.WFStepActorDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wFStepActorDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getWFStepActorDEModel();
    }

    public  net.ibizsys.psrt.srv.wf.service.WFStepActorService getWFStepActorService() {
        try {
            return (net.ibizsys.psrt.srv.wf.service.WFStepActorService)ServiceGlobal.getService("net.ibizsys.psrt.srv.wf.service.WFStepActorService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getWFStepActorService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 grid2
        ICtrlModel grid2=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.wf.ctrlmodel.WFStepDataMain2GridModel");
        grid2.init(this);
        this.registerCtrlModel("grid2",grid2);
        //注册 grid
        ICtrlModel grid=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.wf.ctrlmodel.WFStepActorMain2GridModel");
        grid.init(this);
        this.registerCtrlModel("grid",grid);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 grid2
        ICtrlHandler grid2 = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.wf.ctrlhandler.WFStepActorActiveIconView2Grid2Handler");
        grid2.init(this);
        this.registerCtrlHandler("grid2",grid2);
        //注册 grid
        ICtrlHandler grid = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.wf.ctrlhandler.WFStepActorActiveIconView2GridHandler");
        grid.init(this);
        this.registerCtrlHandler("grid",grid);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}