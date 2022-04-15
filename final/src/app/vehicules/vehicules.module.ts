import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { VehiculesRoutingModule } from './vehicules-routing.module';
import { VehiculesComponent } from './vehicules.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AddComponent } from './add/add.component';
import { ListComponent } from './list/list.component';
import { DetailsComponent } from './details/details.component';
import { InterventionComponent } from './intervention/intervention.component';


@NgModule({
  declarations: [VehiculesComponent, AddComponent, ListComponent, DetailsComponent, InterventionComponent],
  imports: [
    CommonModule,
    VehiculesRoutingModule,
    FormsModule,ReactiveFormsModule
  ]
})
export class VehiculesModule { }
