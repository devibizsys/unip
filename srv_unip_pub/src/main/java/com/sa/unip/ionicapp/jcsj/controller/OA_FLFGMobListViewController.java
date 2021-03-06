/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.jcsj.controller;

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
import com.sa.unip.ionicapp.IonicAppAppModel;


/**
 * 视图[OA_FLFGMobListView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/IonicApp/jcsj/OA_FLFGMobListView.do")
public class OA_FLFGMobListViewController extends net.ibizsys.paas.controller.MobListViewControllerBase {
    public OA_FLFGMobListViewController() throws Exception {
        super();
        this.setId("2ad16f25bd42fc51a3ffdf27934abe65");
        this.setCaption("法律法规");
        this.setTitle("法律法规");
        this.setCapLanResTag("DE.LNAME.OA_FLFG");
        this.setAccessUserMode(2);
        //支持快速搜索
        this.setAttribute("UI.ENABLEQUICKSEARCH","TRUE");
        //
        this.setAttribute("UI.CTRL.RIGHTTOOLBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.SEARCHFORM","TRUE");
        //
        this.setAttribute("UI.CTRL.MDCTRL","TRUE");
        //支持搜常规索
        this.setAttribute("UI.ENABLESEARCH","TRUE");

        ViewControllerGlobal.registerViewController("/IonicApp/jcsj/OA_FLFGMobListView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.ionicapp.jcsj.controller.OA_FLFGMobListViewController",this);
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


    private IonicAppAppModel ionicAppAppModel;
    public  IonicAppAppModel getIonicAppAppModel() {
        if(this.ionicAppAppModel==null) {
            try {
                this.ionicAppAppModel = (IonicAppAppModel)AppModelGlobal.getApplication("com.sa.unip.ionicapp.IonicAppAppModel");
            } catch(Exception ex) {
            }
        }
        return this.ionicAppAppModel;
    }

    @Override
    public  IApplicationModel  getAppModel() {
        return this.getIonicAppAppModel();
    }





    private com.sa.unip.srv.jcsj.demodel.OA_FLFGDEModel oA_FLFGDEModel;

    public  com.sa.unip.srv.jcsj.demodel.OA_FLFGDEModel getOA_FLFGDEModel() {
        if(this.oA_FLFGDEModel==null) {
            try {
                this.oA_FLFGDEModel = (com.sa.unip.srv.jcsj.demodel.OA_FLFGDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.jcsj.demodel.OA_FLFGDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_FLFGDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_FLFGDEModel();
    }

    public  com.sa.unip.srv.jcsj.service.OA_FLFGService getOA_FLFGService() {
        try {
            return (com.sa.unip.srv.jcsj.service.OA_FLFGService)ServiceGlobal.getService("com.sa.unip.srv.jcsj.service.OA_FLFGService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_FLFGService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 mdctrl
        ICtrlModel mdctrl=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.jcsj.ctrlmodel.OA_FLFGMobMOBMDCTRLModel");
        mdctrl.init(this);
        this.registerCtrlModel("mdctrl",mdctrl);
        //注册 searchform
        ICtrlModel searchForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.jcsj.ctrlmodel.OA_FLFGMobSearchFormSearchFormModel");
        searchForm.init(this);
        this.registerCtrlModel("searchform",searchForm);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 mdctrl
        ICtrlHandler mdctrl = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.jcsj.ctrlhandler.OA_FLFGMobListViewMdctrlHandler");
        mdctrl.init(this);
        this.registerCtrlHandler("mdctrl",mdctrl);
        //注册 searchform
        ICtrlHandler searchForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.jcsj.ctrlhandler.OA_FLFGMobListViewSearchFormHandler");
        searchForm.init(this);
        this.registerCtrlHandler("searchform",searchForm);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}