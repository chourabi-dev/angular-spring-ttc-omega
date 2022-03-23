import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomePageComponent } from './pages/home-page/home-page.component';
import { AboutPageComponent } from './pages/about-page/about-page.component';
import { UserPageComponent } from './pages/user-page/user-page.component';
import { UserParametersPageComponent } from './pages/user-parameters-page/user-parameters-page.component';
import { NotFoundPageComponent } from './pages/not-found-page/not-found-page.component';
import { SigninPageComponent } from './pages/signin-page/signin-page.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ProductsPageComponent } from './pages/products-page/products-page.component';
import { CartPageComponent } from './pages/cart-page/cart-page.component';
import { NewTypesComponent } from './new-types/new-types.component';

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    AboutPageComponent,
    UserPageComponent,
    UserParametersPageComponent,
    NotFoundPageComponent,
    SigninPageComponent,
    ProductsPageComponent,
    CartPageComponent,
    NewTypesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
