import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddComponent } from './add/add.component';
import { DetailsComponent } from './details/details.component';
import { InterventionComponent } from './intervention/intervention.component';
import { ListComponent } from './list/list.component';

import { VehiculesComponent } from './vehicules.component';

const routes: Routes = [
  { path: '', component: ListComponent },
  { path: 'add', component: AddComponent },
  { path: 'details/:id', component: DetailsComponent },
  { path: 'details/add-intervention/:id', component: InterventionComponent },
  
  
  

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class VehiculesRoutingModule { }
