import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmailPipe } from './email.pipe';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NavbarComponent } from './componenets/navbar/navbar.component';
import { SidemenuComponent } from './componenets/sidemenu/sidemenu.component';
import { MenuItemComponent } from './componenets/menu-item/menu-item.component';
import { ArticleComponent } from './componenets/article/article.component';
import { HomePageComponent } from './pages/home-page/home-page.component';
import { AboutPageComponent } from './pages/about-page/about-page.component';
import { TeamPageComponent } from './pages/team-page/team-page.component';
import { ProjectsPageComponent } from './pages/projects-page/projects-page.component';

@NgModule({
  declarations: [
    AppComponent,
    EmailPipe,
    NavbarComponent,
    SidemenuComponent,
    MenuItemComponent,
    ArticleComponent,
    HomePageComponent,
    AboutPageComponent,
    TeamPageComponent,
    ProjectsPageComponent
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
