/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.common.controller;

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
 * 视图[TSSDGroupMPickupView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/common/TSSDGroupMPickupView.do")
public class TSSDGroupMPickupViewController extends net.ibizsys.paas.controller.MPickupViewControllerBase {
    public TSSDGroupMPickupViewController() throws Exception {
        super();
        this.setId("a59de57e8759bd33a01af5ebc0712c5a");
        this.setCaption("任务时刻策略组");
        this.setTitle("任务时刻策略组实体数据多项选择视图");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.PICKUPVIEWPANEL","TRUE");

        ViewControllerGlobal.registerViewController("/app/common/TSSDGroupMPickupView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.common.controller.TSSDGroupMPickupViewController",this);
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





    private net.ibizsys.psrt.srv.common.demodel.TSSDGroupDEModel tSSDGroupDEModel;

    public  net.ibizsys.psrt.srv.common.demodel.TSSDGroupDEModel getTSSDGroupDEModel() {
        if(this.tSSDGroupDEModel==null) {
            try {
                this.tSSDGroupDEModel = (net.ibizsys.psrt.srv.common.demodel.TSSDGroupDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.TSSDGroupDEModel");
            } catch(Exception ex) {
            }
        }
        return this.tSSDGroupDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getTSSDGroupDEModel();
    }

    public  net.ibizsys.psrt.srv.common.service.TSSDGroupService getTSSDGroupService() {
        try {
            return (net.ibizsys.psrt.srv.common.service.TSSDGroupService)ServiceGlobal.getService("net.ibizsys.psrt.srv.common.service.TSSDGroupService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getTSSDGroupService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}