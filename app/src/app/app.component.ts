import { Component, OnInit } from '@angular/core';
import { ApiService } from './api.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  title = 'app';


  users:any[]=[];
  isLoading:boolean=false;
  errorMSG:string='';

  constructor(private api:ApiService){}

  ngOnInit(): void {
    this.initDATA();
  }

  initDATA(){
    this.isLoading=true;
    this.api.getUsersList().toPromise().then((res:any[])=>{
      this.users=res;
    }).catch((error)=>{
      console.log(error);
      this.errorMSG='Soemthing went wrong :/ ';
      
    }).finally(()=>{
      this.isLoading=false
    })
  }  
}
