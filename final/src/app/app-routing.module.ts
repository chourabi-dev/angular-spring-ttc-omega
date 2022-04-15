import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


const routes: Routes = [
  { path:'', redirectTo:'clients', pathMatch:'full' },
  { path: 'clients', loadChildren: () => import('./clients/clients.module').then(m => m.ClientsModule) },
  { path: 'vehicules', loadChildren: () => import('./vehicules/vehicules.module').then(m => m.VehiculesModule) }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
