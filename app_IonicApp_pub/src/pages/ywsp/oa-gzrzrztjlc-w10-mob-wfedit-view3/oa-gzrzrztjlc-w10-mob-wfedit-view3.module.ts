import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_GZRZRZTJLC_W10_MobWFEditView3 } from './oa-gzrzrztjlc-w10-mob-wfedit-view3';



import { WFStepDataMobMDView9Module } from '../../ywsp/wfstep-data-mob-mdview9/wfstep-data-mob-mdview9.module';

@NgModule({
  declarations: [
    OA_GZRZRZTJLC_W10_MobWFEditView3,
  ],
  imports: [
    IonicPageModule.forChild(OA_GZRZRZTJLC_W10_MobWFEditView3),
    IBizSysModule,
    UserModule,
    WFStepDataMobMDView9Module,
  ],
})
export class OA_GZRZRZTJLC_W10_MobWFEditView3Module {}