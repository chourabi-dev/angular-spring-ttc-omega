import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutPageComponent } from './pages/about-page/about-page.component';
import { HomePageComponent } from './pages/home-page/home-page.component';
import { ProjectsPageComponent } from './pages/projects-page/projects-page.component';
import { TeamPageComponent } from './pages/team-page/team-page.component';


const routes: Routes = [
  //{ path:'', redirectTo:'home', pathMatch:'full' },
  { path:'', component:HomePageComponent },
  { path:'home' , component: HomePageComponent },
  { path:'about' , component: AboutPageComponent , children: [
    { path:'team', component: TeamPageComponent   },
    { path:'projects', component: ProjectsPageComponent }, 

  ] },
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
