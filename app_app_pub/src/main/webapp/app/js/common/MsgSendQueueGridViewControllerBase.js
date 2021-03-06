var MsgSendQueueGridViewControllerBase = GridViewControllerBase.extend({
construct: function(config) {
    if(!config)config={};
    if(!config.appctx)config.appctx='';
    if(!config.containerid)config.containerid='';
    arguments.callee.$.construct.call(this,this.getDefaultCfg(config));
    this.regCodeLists(config);
    this.regUICounters(config);
    this.regUIActions(config);
    this.regUpdatePanels(config);
    this.regControllers(config);
}
,regCodeLists:function(config)
{
     /*消息类型*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_MsgType',datas:[{text:'系统消息',value:'1',realtext:'系统消息'},{text:'电子邮件',value:'2',realtext:'电子邮件'},{text:'手机短信',value:'4',realtext:'手机短信'},{text:'MSN消息',value:'8',realtext:'MSN消息'},{text:'检务通消息',value:'16',realtext:'检务通消息'},{text:'微信',value:'32',realtext:'微信'}]}));
     /*消息模板内容类型*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_MsgContentType',datas:[{text:'纯文本',value:'TEXT',realtext:'纯文本'},{text:'HTML网页',value:'HTML',realtext:'HTML网页'}]}));
     /*是否（蓝、红）*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CodeList50',datas:[{text:'是',value:'1',realtext:'是'},{text:'否',value:'0',realtext:'否'}]}));
}
,regUICounters:function(config)
{
}
,regUpdatePanels:function(config)
{
     var me=this;
}
,regControllers:function(config)
{
  var cid=config.containerid;
    if(cid!='')cid=cid+'_';
}
,regUIActions:function(config)
{
  var uiaction_0 = {"type":"DEUIACTION","tag":"New"
};
    this.regUIAction(uiaction_0);
  var uiaction_1 = {"type":"DEUIACTION","tag":"Edit","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_1);
  var uiaction_2 = {"type":"DEUIACTION","tag":"View","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_2);
  var uiaction_3 = {"type":"DEUIACTION","tag":"Copy","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_3);
  var uiaction_4 = {"type":"DEUIACTION","tag":"ToggleRowEdit"
};
    this.regUIAction(uiaction_4);
  var uiaction_5 = {"type":"DEUIACTION","tag":"NewRow"
};
    this.regUIAction(uiaction_5);
  var uiaction_6 = {"type":"DEUIACTION","tag":"Remove","actiontarget":"MULTIKEY"
};
    this.regUIAction(uiaction_6);
  var uiaction_7 = {"type":"DEUIACTION","tag":"ExportExcel"
};
    this.regUIAction(uiaction_7);
  var uiaction_8 = {"type":"DEUIACTION","tag":"Print","actiontarget":"MULTIKEY"
};
    this.regUIAction(uiaction_8);
  var uiaction_9 = {"type":"DEUIACTION","tag":"ExportModel"
};
    this.regUIAction(uiaction_9);
  var uiaction_10 = {"type":"DEUIACTION","tag":"Import"
};
    this.regUIAction(uiaction_10);
  var uiaction_11 = {"type":"DEUIACTION","tag":"ToggleFilter"
};
    this.regUIAction(uiaction_11);
  var uiaction_12 = {"type":"DEUIACTION","tag":"Help"
};
    this.regUIAction(uiaction_12);
}
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getSearchForm();
 
}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getNewDataView:function(arg){
       if(!arg)arg={};
       var newmode=arg.srfnewmode;
       if(!newmode)newmode='';
      if(true){
	var view={
			title: '消息发送队列实体编辑视图',
			openMode:'',
			 height: 0,
	    	    width: 0,
    	    layout: 'fit',
            maximizable:true,
            viewurl:'/common/msgsendqueueeditview.jsp',
            viewparam:arg
      	};
	return view;
       }
       return null;
    }

,getEditDataView:function(arg){
       if(!arg)arg={};
       var list = [arg.srfeditmode2,arg.srfeditmode];
       for(var i=0;i<2;i++){
          var editmode=list[i];
          if(!editmode)
             continue;
      }
      if(true){
	   return {  title: '消息发送队列实体编辑视图', openMode:'', height: 0, width: 0,
    	              layout: 'fit',   maximizable:true,   viewurl:'/common/msgsendqueueeditview.jsp',   viewparam:arg  	};
       }
       return null;
    }
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/common/MsgSendQueueGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/common/msgsendqueuegridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : $IGM('DEF.LNAME.SUBJECT','消息标题'),"width":196,"data" :'subject',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.CREATEDATE','建立时间'),"width":181,"data" :'createdate',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.DSTADDRESSES','目标地址'),"width":208,"data" :'dstaddresses',"orderable":false}

,{ "title" : $IGM('DEF.LNAME.MSGTYPE','消息类型'),"width":111,"data" :'msgtype',"orderable":true,'render':function(data,type,row){return me.rendergrid_msgtype(data,type,row,me);}}

,{ "title" : $IGM('DEF.LNAME.CONTENTTYPE','内容类型'),"width":100,"data" :'contenttype',"orderable":true,'render':function(data,type,row){return me.rendergrid_contenttype(data,type,row,me);}}

,{ "title" : $IGM('DEF.LNAME.PLANSENDTIME','计划发送时间'),"width":100,"data" :'plansendtime',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.PROCESSTIME','处理时间'),"width":167,"data" :'processtime',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.ISSEND','是否发送'),"width":67,"data" :'issend',"orderable":true,'render':function(data,type,row){return me.rendergrid_issend(data,type,row,me);}}

,{ "title" : $IGM('DEF.LNAME.ISERROR','处理错误'),"width":80,"data" :'iserror',"orderable":true,'render':function(data,type,row){return me.rendergrid_iserror(data,type,row,me);}}
]
},searchForm:{enableAdvanceSearch:false,dename:'MSGSENDQUEUE'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
}
    ,rendergrid_msgtype:function(data,type,row,me){
        return me.renderCodeList_NumOr('uniPSample_MsgType',data,'未定义','、');
    }
    ,rendergrid_contenttype:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_MsgContentType',data,'未定义');
    }
    ,rendergrid_issend:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_CodeList50',data,'未定义');
    }
    ,rendergrid_iserror:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_CodeList50',data,'未定义');
    }
});