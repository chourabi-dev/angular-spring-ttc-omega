import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuthGuard } from './auth.guard';
import { AboutPageComponent } from './pages/about-page/about-page.component';
import { CartPageComponent } from './pages/cart-page/cart-page.component';
import { HomePageComponent } from './pages/home-page/home-page.component';
import { NotFoundPageComponent } from './pages/not-found-page/not-found-page.component';
import { ProductsPageComponent } from './pages/products-page/products-page.component';
import { SigninPageComponent } from './pages/signin-page/signin-page.component';
import { UserPageComponent } from './pages/user-page/user-page.component';
import { UserParametersPageComponent } from './pages/user-parameters-page/user-parameters-page.component';


const routes: Routes = [


  { path:'products' , component:ProductsPageComponent },
  { path:'cart' , component:CartPageComponent },
  

 /* { path:'', component:HomePageComponent  ,canActivate : [ AuthGuard ]  },
  
  { path:'about', component:AboutPageComponent  ,canActivate : [ AuthGuard ]  },
  { path:'user/:id', component:UserPageComponent  ,canActivate : [ AuthGuard ]},
  { path:'user/details/params', component:UserParametersPageComponent  ,canActivate : [ AuthGuard ] },
  
  { path:'auth', component:SigninPageComponent    },*/

  

  // wild card
  { path:'**', component:NotFoundPageComponent }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
